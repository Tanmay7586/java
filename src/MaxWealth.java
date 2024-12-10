public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 2, 1},
                {1, 2, 4},
                {1, 6}
        };
        System.out.println(maxWeatlhOfPerson(arr));
    }

    static int maxWeatlhOfPerson(int[][] arr) {
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum +=arr[i][j];
            }
    if(sum>maxVal){
        maxVal= sum;
    }
        }
        return maxVal;
    }
}
