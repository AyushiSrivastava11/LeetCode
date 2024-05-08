class Solution {
    public int numUniqueEmails(String[] emails) 
    {
        HashSet<String> ans=new HashSet<>();
        for(int index=0;index<emails.length;index++)
        {
            //Call a function that will simply modify the current index of the string emails by filtering it till @
            String filteredEmail=modifyMailId(emails,index);
            ans.add(filteredEmail);
        }
        //After all the mails have been filtered we will call a method that will count the distinct email ids.
        return ans.size();
    }

    public String modifyMailId(String[] emails, int position)
    {
        String element=emails[position];
        String findDomain=findDomain(element);
        StringBuilder str=new StringBuilder();
        int index=0;
        while( element.charAt(index) != '@')
        {
            if(element.charAt(index) == '.')
            {
                index++;
                // continue;
            }
            else if(element.charAt(index) == '+')
            {
                break;
            }
            else
            {
                str.append(element.charAt(index));
                index++;
            }
        }
        str.append(findDomain);
        return str.toString();
    }

    public String findDomain(String element)
    {
       int domainIndex=element.indexOf('@');
       String domain=element.substring(domainIndex,element.length());
       return domain;
    }
}