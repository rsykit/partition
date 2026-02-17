public class Lomoto {

    public static int lomoto(int[] arr, int low, int high)
    {
        //pivot is the last element of the array
        int pivot = arr[high];
        //i is the index of the smaller element
        int i = low - 1;
        
        //j is the index of the current element being compared to the pivot
        for (int j = low; j < high; j++) {
            //if the current element is smaller than the pivot
            if (arr[j] <= pivot) {
                //increment the index of the smaller element
                i++;
                //swap the elements at index i and j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap the elements at index i + 1 and high (the pivot)
        int temp = arr[i + 1];
        //arr[i + 1] is the first element that is greater than the pivot
        arr[i + 1] = arr[high];
        //arr[high] is the pivot
        arr[high] = temp;
        //return the index of the pivot
        return i + 1;
    }

}
