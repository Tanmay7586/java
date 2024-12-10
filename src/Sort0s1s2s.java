import java.util.Arrays;

public class Sort0s1s2s {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 2, 0, 2};
        sort0s1ss2(arr);
    }

    static void sort0s1ss2(int[] arr){
        int start = 0;
         int end = arr.length-1;
         int current = 0;
         int temp ;
         while(current<= end){
             if(arr[current] == 0){
                 temp  = arr[start];
                 arr[start] = arr[current];
                 arr[current]  = temp;
                 start++;
                 current++;
             }else if(arr[current]==2){
                 temp = arr[current];
                 arr[current] = arr[end];
                 arr[end] = temp;
                 end--;
             }else {
                 current++;
             }
         }
        System.out.println(Arrays.toString((arr)));
    }
}
