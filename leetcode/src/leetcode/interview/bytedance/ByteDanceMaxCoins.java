package leetcode.interview.bytedance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ByteDanceMaxCoins {



    private int ans=0;
    public int maxCoins(int[] nums) {


        List<Integer> list =new ArrayList<>(nums.length);
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }

        recursion(list,0);
        return ans;

    }

    /**
     * 回溯剪枝
     * @param nums
     * @param coins
     */

    public void recursion(List<Integer> nums, int coins){

        if(nums.size()==0){
            ans=Math.max(ans,coins);
            return;
        }

        for(int i=0;i<nums.size();i++){

            int tmp=nums.get(i);
            int cs=(i-1<0?1:nums.get(i-1))*tmp*(i+1>nums.size()-1?1:nums.get(i+1));
            nums.remove(i);
            recursion(nums,coins+cs);
            nums.add(i,tmp);
        }



    }













}
