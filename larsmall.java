//program to find largest and smallest element of an array
class Main {
    public static void main(String[] args) {
        int arr[]={8,5,11,3,6};
        int largest=arr[0];
        int smallest=arr[0];
        for(int i=0;i<5;i++){
            if(arr[i]>largest) largest=arr[i];
            if(arr[i]<smallest) smallest=arr[i];
        }
        System.out.println(largest +" "+smallest);
        
    }
}
