package Arrays;

import java.util.Arrays;

public class _10MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeros(nums);
    }

    public static void moveZeros(int[] nums){
        int insertposition = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums[insertposition] = nums[i];
                i++;
            }
            while(insertposition< nums.length){
                nums[insertposition] = 0;
                insertposition++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
