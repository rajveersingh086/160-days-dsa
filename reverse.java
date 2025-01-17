class reverse{
    static void reversearray(int[] arr){
        int n = arr.length;
        int [] temp = new int[n];
        // temp arr to store the element.
        for (int i =0;i<n;i++){
            temp[i] = arr[n-i-1];
        }
        for (int i =0;i<n;i++){
            arr[i]=temp[i];
        }
    }
        public static void main (String []args){
            int []arr = {1 ,4 ,5,0,3,6,0,5,0};
            reversearray(arr);
            for (int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
            }
    }
}