import java.util.Arrays;

class BubbleSort {
    static void bs(int arr[]) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }
        }
    }

    public static void main(String args[]) {
        int[] data = { -2, 45, 0, 11, -9 };
        BubbleSort.bs(data);
        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(data));

    }
}
