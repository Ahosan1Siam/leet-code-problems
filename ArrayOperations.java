public class ArrayOperations {
    public static void insert(int[] arr, int pos, int element) {
        if (pos < 0 || pos > arr.length) {
            throw new IndexOutOfBoundsException("Invalid position");
        }

        // Shift elements to the right
        for (int i = arr.length - 1; i > pos; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert the new element
        arr[pos] = element;
    }

    public static void main(String args[]){
            int arr[] ={1,2,3,4,5};
            insert(arr,2,5);
            System.out.printf("Array =>",arr[3]);
        }

}
