package DividenConquer;

public class Sort{
    public static void print(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Merge Sort
    // public static void mergeSort(int arr[],int Si,int Ei){
    //     if (Si >= Ei){
    //         return;
    //     }
    //     int mid = Si + (Ei-Si)/2;          // *******************
    //     mergeSort(arr, Si, mid);
    //     mergeSort(arr, mid+1, Ei);

    //     merge(arr, Si, mid, Ei);
    // }

    // public static void merge(int arr[],int Si,int mid,int Ei){
    //     int temp[] = new int[Ei-Si+1];    // ***************************
    //     int i = Si;
    //     int j = mid+1;
    //     int k = 0;

    //     while (i <= mid && j <= Ei){ 
    //         if (arr[i] < arr[j]) {
    //             temp[k] = arr[i];
    //             i++;
    //         }
    //         else{
    //             temp[k] = arr[j];
    //             j++;
    //         }
    //         k++;
    //     }
    //     // for leftover elements of first sorted part
    //     while (i <= mid) {
    //         temp[k++] = arr[i++];
    //     }
    //     // for leftover elements of second sorted part
    //     while (j <= Ei){
    //         temp[k++] = arr[j++];
    //     }

    //     // Copy the elements of temp to original array
    //     for(k=0,i=Si;k<temp.length;k++,i++){
    //         arr[i] = temp[k];
    //     }
    // }

    // Quick Sort
    public static void quickSort(int arr[],int si,int ei){
        if (si >= ei) {
            return;
        }
        // pivot index
        int pidx = partition(arr,si,ei);
        quickSort(arr,si,pidx-1);
        quickSort(arr,pidx+1,ei);
    }

    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1;

        for(int j=si;j<ei;j++){
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // for pivot
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        // mergeSort(arr, 0, arr.length-1);
        quickSort(arr, 0, arr.length-1);
        print(arr);
        
    }
}