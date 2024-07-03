import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5,6,1,8,2,3,10,11};
        Search(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Search(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i ; j++) {
                if (arr[j-1] > arr[j]){
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                }

            }

        }
    }
}

