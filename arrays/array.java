package arrays;

public class array {
    // public static int linearSearch(String fruits[],String fruit){
    // for(int i=0;i<fruits.length;){
    // if (fruits[i]==fruit) {
    // return i;
    // }
    // }
    // return -1;
    // }

    // public static int binarySearch(int arr[],int key){
    // int start = 0;
    // int end = arr.length-1;
    // while(start <= end){
    // int mid = start + end / 2;
    // if (arr[mid] == key) {
    // return mid;
    // }
    // else if(arr[mid] > key){
    // end = mid -1;
    // }
    // else if(arr[mid] < key){
    // start = mid + 1;
    // }
    // }
    // return -1;
    // }

    // public static void reverse(int arr[]){
    // int first = 0,last = arr.length-1;
    // while(first < last){
    // int temp = arr[last];
    // arr[last] = arr[first];
    // arr[first] = temp;
    // first++;
    // last--;
    // }
    // }

    // public static void pair(int arr[]){
    // for(int i=0;i<arr.length;i++){
    // int curr = arr[i];
    // for(int j=i+1;j<arr.length;j++){
    // System.out.print(curr+","+arr[j]);
    // }
    // }
    // System.out.println();
    // }

    // public static void subarr(int arr[]){
    // for(int i=0;i<arr.length;i++){
    // int start = i;
    // for(int j = i+1;j<arr.length;j++){
    // int end = j;
    // for(int k = start;k<=end;k++){
    // sum+=arr[k];
    // }
    // }
    // System.out.println();
    // }
    // System.out.println();
    // }

    // public static void maxSum(int arr[]){
    // int currSum;
    // int maxSum = Integer.MIN_VALUE;
    // for(int i=0;i<arr.length;i++){
    // int start = i;
    // for(int j = i;j<arr.length;j++){
    // int end = j;
    // currSum = 0;
    // for(int k = start;k<=end;k++){
    // currSum += arr[k];
    // System.out.print(arr[k]+",");
    // }
    // System.out.println(")"+currSum);
    // if (currSum > maxSum) {
    // maxSum = currSum;
    // }
    // }
    // }
    // System.out.println("Maximum subarray sum is " + maxSum);
    // }

    // public static void prefixSum(int arr[]){
    // int prefix[] = new int[arr.length];
    // prefix[0] = arr[0];
    // for(int i=0;i<arr.length;i++){
    // prefix[i] = prefix[i-1] + arr[i];
    // }

    // int maxSum1 = Integer.MIN_VALUE;
    // int currSum1 = 0;

    // for (int j = 0; j < prefix.length; j++) {
    // int start1 = j;
    // for(int k = j ; k < prefix.length;k++){
    // int end1 = k;
    // currSum1 = 0;
    // currSum1 = start1 == 0 ? prefix[end1] : prefix[end1] + prefix[start1-1];
    // if (currSum1 > maxSum1) {
    // maxSum1 = currSum1;
    // }
    // }
    // }
    // System.out.println("Max Sum "+maxSum1);
    // }

    // public static void kadanes(int arr[]){
    //     int maxSum2 = Integer.MIN_VALUE;
    //     int currSum2 = 0;

    //     for (int i = 0; i < arr.length; i++) {
    //         currSum2 = currSum2 + arr[i];
    //         if (currSum2 < 0) {
    //             currSum2 = 0;
    //         }
    //         maxSum2 = Math.max(maxSum2, currSum2);
    //     }
    //     System.out.println("Our max subarray sum is :"+maxSum2);
    // }

    public static int trapped(int height[]){ 
        // left max boundry
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i=1;i<height.length;i++) {
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }
        // right max boundry
        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int j = height.length-2;j >= 0 ;j--){
            rightMax[j] = Math.max(height[j],rightMax[j+1]);
        }
        
        int trappedWater= 0;
        for(int k = 0;k < height.length;k++){
            // waterLevel = min(left max boundry, right max boundry)
            int waterLevel = Math.min(leftMax[k],rightMax[k]);
            // trapped water = waterLevel - heightOfBar
            trappedWater += waterLevel - height[k];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        // int key = 5;
        // System.out.println("The key is at index"+binarySearch(arr, key));
        // reverse(arr);
        // System.out.println("The reverse array is :");
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        // pair(arr);
        // subarr(arr);
        // maxSum(arr);
        // kadanes(arr);
        System.out.println(trapped(arr));

    }
}