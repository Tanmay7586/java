package BinarySearch;

public class _12FindingSqrtOfaNumber {
    public static void main(String[] args) {
        int num = 35;
        System.out.println(findSqrtOfNum(num));
    }

    static int findSqrtOfNum(int num) {
        int high = num;
        int low = 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid * mid <= num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
}
