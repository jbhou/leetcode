/**
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE
 * file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package leetcode;

import java.util.Arrays;

/**
 * ClassName:SoluationRemoveDuplicatesFromSortedArray <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年5月28日 下午10:37:50 <br/>
 * 
 * @author lenovo
 * @version 1.0.0
 * @see
 */
public class SoluationRemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int pre = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (pre == nums[i]) {
                nums[i] = Integer.MAX_VALUE;
            } else {
                count++;
                pre = nums[i];
            }
        }
        Arrays.sort(nums);
        return count;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 2, 2, 3, 4, 5, 6, 7, 7, 7, 7, 7 };
        int count = new SoluationRemoveDuplicatesFromSortedArray().removeDuplicates(nums);
        System.err.println("count:" + count);
        for (int i = 0; i < count; i++) {
            System.err.println(nums[i]);
        }
    }
}
