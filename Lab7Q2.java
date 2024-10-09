class Lab7Q2{
    public static void mergeSort(int[] array, int si, int ei) {
        if (si >= ei) {
         return;
        }
        int middle = si+(ei - si) / 2;
            //divide the array in to single
            mergeSort(array, si, middle);
            mergeSort(array, middle + 1, ei);

            // Merge the sorted halves
            merge(array, si, middle, ei);
        
    }

    public static void merge(int[] array, int si, int middle, int ei) {
        // Sizes of the two subarray
        int conquer[]=new int[ei-si+1];
        int idx1=si;
        int idx2=middle+1;
        int x=0;

        while (idx1<=middle && idx2<=ei) {
            if (array[idx1]<=array[idx2]) {
                conquer[x]=array[idx1];
                x++ ; idx1++;
            }
            else{
                conquer[x++]=array[idx2++];
            }
            
        }
        while (idx1<=middle) {
            conquer[x++]=array[idx1++];
        }
        while (idx2<=ei) {
            conquer[x++]=array[idx2++];
        }

        //copy in to original array
        for(int i=0,j=si; i<conquer.length;i++,j++){
            array[j]=conquer[i];
        }
} 
    
public static void main(String[] args){
    int[] array = {38, 27, 43, 3, 9, 82, 10};
    int n=array.length;
    mergeSort(array, 0, n-1);

    // Print the sorted array
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
    }
    System.out.println();
}
}