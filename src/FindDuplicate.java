import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {0, 3, 1, 5, 4, 2, 3, 2};

        System.out.println(duplicateInArray(arr));
        System.out.println(optimizedDuplicateInArray(arr));
    }

    static int duplicateInArray(int[] arr) {
        int ans = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    ans = arr[i];
                }
            }
        }
        return ans;
    }

    static int optimizedDuplicateInArray(int[] arr) {
        int dup = -1;
        ;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                dup = arr[i];
                break;
            }
        }
        return dup;
    }
}
