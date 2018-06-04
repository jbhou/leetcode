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
 * ClassName:SoluationSearchForARange <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年6月4日 下午9:07:14 <br/>
 * 
 * @author lenovo
 * @version 1.0.0
 * @see
 */
public class SoluationSearchForARange {
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
        while (min >=0 && nums[min] == target) {
            min--;
        }
        while (max <= nums.length-1 && nums[max] == target) {
            max++;
        }
        a[0] = min+1;
        a[1] = max-1;
        return a;
    }
    public static void main(String[] args) {
        int [] a=new int[]{5,7,7,8,8,10};
    int[] r=    new SoluationSearchForARange().searchRange(a, 8);
    System.err.println(r[0]);
    System.err.println(r[1]);
    }
}
