// class Solution {
//     public double averageWaitingTime(int[][] customers) {
//         int size=customers.length;
//         int initial=customers[0][0],last=0;

//         for(int index=0;index<size;index++)
//         {
//             initial+=customers[index][1];
//             last+=(initial < customers[index][0])?customers[index][1]:initial-customers[index][0];
//         }
//         return (double)(last/size);
//     }
// }

class Solution
{
    public double averageWaitingTime(int[][] customers)
    {
        double total_waiting_time = 0;
        int current_time = 0;

        for (int[] customer : customers) {
            int arrival = customer[0];
            int service = customer[1];
            if (current_time < arrival) {
                current_time = arrival;
            }
            int waiting_time = current_time - arrival + service;
            total_waiting_time += waiting_time;
            current_time += service;
        }

        return total_waiting_time / customers.length;
    }
}