/**
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE
 * file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package leetcode;

import java.util.Arrays;

/**
 * ClassName:SoluationSearchForARange <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年6月4日 下午9:07:14 <br/>
 *
 * @author lenovo
 * @version 1.0.0
 * @see
 */
public class SoluationSearchForARange34 {


    public int[] searchRange2(int[] nums, int target) {

        if (nums == null || nums.length == 0 || nums[0] > target || nums[nums.length - 1] < target) {
            return new int[]{-1, -1};
        }

        int[] result = new int[]{-1, -1};

        result[0] = findLeft(nums, target);
        result[1] = findRight(nums, target);

        return result;


    }

    private int findRight(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + ((r - l) >> 1);
            if (nums[mid] == target && (mid == nums.length - 1 || nums[mid + 1] > target)) {
                return mid;
            } else {
                if (nums[mid] <= target) l = mid + 1;
                else r = mid - 1;
            }
        }
        return -1;
    }


    private int findLeft(int[] nums, int target) {


        int l = 0, r = nums.length - 1;
        while (l <= r) {


            int mid = l + ((r - l) >> 1);
            if (nums[mid] == target && (mid == 0 || nums[mid - 1] < target)) {
                return mid;
            } else if (nums[mid] >= target) r = mid - 1;
            else l = mid + 1;
        }
        return -1;


    }


    public int[] searchRange(int[] nums, int target) {
        int[] a = new int[2];
        int index = Arrays.binarySearch(nums, target);
        if (index < 0) {
            a[0] = -1;
            a[1] = -1;
            return a;
        }
        int min = index;
        int max = index;
        while (min >= 0 && nums[min] == target) {
            min--;
        }
        while (max <= nums.length - 1 && nums[max] == target) {
            max++;
        }
        a[0] = min + 1;
        a[1] = max - 1;
        return a;
    }

    public static void main(String[] args) {
        int[] a = new int[]{5, 7, 7, 8, 8, 10};
        int[] r = new SoluationSearchForARange34().searchRange2(a, 8);
        System.err.println(r[0]);
        System.err.println(r[1]);
    }
}
