package Week3.Sort;

import java.util.Arrays;

public class quickSort {

    public static void main(String[] args) {

        int[] ans = {10,9,8,7,653,4,65534,24};

        check(ans,0,ans.length);

        System.out.println(Arrays.toString(ans));
    }

    public static void check(int[] nums, int start , int end){

        if(end-start<2){

            return;
        }

        int mid = findPivot(nums,start,end);

        check(nums,start,mid);

        check(nums,mid+1,end);
    }

    public static int findPivot(int[] nums, int start, int end){

        int i = start;

        int j = end;

        int pivot = nums[start];

        while(i<j){

            while(i<j&&nums[--j]>=pivot);

            if(i<j){

                nums[i] = nums[j];
            }

            while(i<j&&nums[++i]<=pivot);

            if(i<j){

                nums[j] = nums[i];
            }
        }

        nums[i] = pivot;

        return i;
    }


}
