package arrays;

public class questions {
    // Maximum and Minimum number of an array
    // public static int num(int arr[]) {
        // int min = Integer.MAX_VALUE;
        // for(int i=0;i<arr.length;i++){
        // if (arr[i] < min) {
        // min = arr[i];
        // }
        // }
        // System.out.println("The min value from the array is " + min);

        // Using Sorting
    //     for (int i = 0; i < arr.length - 1; i++) {
    //         int minPos = i;
    //         for (int j = i + 1; j < arr.length; j++) {
    //             if (arr[minPos] > arr[j]) {
    //                 minPos = j;
    //             }
    //         }
    //         // swap
    //         int temp = arr[minPos];
    //         arr[minPos] = arr[i];
    //         arr[i] = temp;
    //     }
    //     int min = arr[0];
    //     int max = arr[arr.length - 1];
    //     System.out.println(min+" "+max);
    //     return min+max;
    // }

    // Finding three largest elements in array
    // public static void largestThree(int arr[]){
    //     int first = Integer.MIN_VALUE; 
    //     int second = Integer.MIN_VALUE; 
    //     int third = Integer.MIN_VALUE;
    //     for(int i = 0;i < arr.length;i++){
    //         if (arr[i] > first) {
    //             third = second;
    //             second = first;
    //             first = arr[i];
    //         }
    //         else if(arr[i] > second && arr[i]!= first) {
    //             third = second;
    //             second = arr[i];
    //         }
    //         else if(arr[i] > third && arr[i]!= second){
    //             third = arr[i];
    //         }
    //     }
    //     System.out.println("The three largest elements of array are "+first+" "+second+" "+third);
    // }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Moving all zeros to end of the array
    // public static void moveZero(int arr[]){
    //     for(int i = 0;i < arr.length;i++){
    //         for(int j = i+1;j < arr.length;j++){
    //             if (arr[j] != 0) {
    //                 int temp = arr[j];
    //                 arr[j] = arr[i+1];
    //                 arr[i+1] = temp;
    //             }
    //         }
    //     }
        
    // }

    
    public static void main(String[] args) {
        int arr[] = { 3,5,0,0,4 };
        // largestThree(arr);
        // num(arr);
        // moveZero(arr);
        print(arr);
        
    }

}
