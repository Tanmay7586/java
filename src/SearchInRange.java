public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 8, 10};
        System.out.println(search(arr, 1, 1, 4));
    }

    static boolean search(int[] arr, int target, int start, int end) {
        if(arr.length == 0) {
            return false;
        }
        for (int i = start; i < end; i++) {
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
}
