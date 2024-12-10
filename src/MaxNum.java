public class MaxNum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,11,4,21};
        System.out.println(maxNumInArray(arr));
    }
    static int maxNumInArray(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
}
