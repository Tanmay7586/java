import java.util.Arrays;

public class Sort0and1 {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,0,1,0,1};
        sort0and1(arr);
    }

    public static void sort0and1(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] == 1 && arr[end] == 0) {
                arr[start] = 0;
                arr[end] = 1;
                start++;
                end--;
            } else if (arr[start] == arr[end]) {
                end--;
            } else {
                start++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

