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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ClassName:Soluation4Sum <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年5月28日 下午10:14:16 <br/>
 * 
 * @author lenovo
 * @version 1.0.0
 * @see
 */
public class Soluation4Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int[] tmp = new int[4];
        List<List<Integer>> list = new ArrayList<>();
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < nums.length-3; i++) {
            for (int j = 1 + i; j < nums.length-2; j++) {
                for (int k = j + 1; k < nums.length-1; k++) {
                    int d = target - nums[i] - nums[j] - nums[k];
                    if (Arrays.binarySearch(nums, k + 1, nums.length, d) > 0) {
                        tmp[0] = nums[i];
                        tmp[1] = nums[k];
                        tmp[2] = nums[j];
                        tmp[3] = d;
                        Arrays.sort(tmp);
                        String str = tmp[0] + "," + tmp[1] + "," + tmp[2] + "," + tmp[3];
                        if (!set.contains(str)) {
                            set.add(str);
                            list.add(Arrays.asList(nums[i], nums[j], nums[k], d));
                        }
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        
        new Soluation4Sum().fourSum(new int[]{1,0,-1,0,-2,2},0 );
    }
}
