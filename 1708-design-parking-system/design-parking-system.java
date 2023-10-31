class ParkingSystem {
    private int big;
    private int medium;
    private int small;
    private int[] arr;
    public ParkingSystem(int big, int medium, int small) {
        arr= new int[3];
        arr[0] = big;
        arr[1] = medium;
        arr[2] = small;
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        if(arr[carType-1]==0) return false;
        arr[carType-1]=arr[carType-1]-1;
        return true;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */