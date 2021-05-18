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
 * ClassName:Soluation3SumCloest <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年5月28日 下午6:57:03 <br/>
 *
 * @author lenovo
 * @version 1.0.0
 * @see
 */
public class Soluation3SumCloest {
    public int threeSumClosest(int[] nums, int target) {
        // Arrays.sort(nums);
        int dValue = Integer.MAX_VALUE;

        int res = dValue;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum == target) {
                        return target;
                    } else {

                        int dv = 0;
                        if ((target < 0 && sum < 0) || (target > 0 && sum > 0)) {
                            dv = Math.abs(target - sum);
                        } else {
                            dv = Math.abs(target) + Math.abs(sum);
                        }

                        if (dValue > dv) {
                            dValue = dv;
                            res = sum;
                        }
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int n = new Soluation3SumCloest().threeSumClosest(new int[]{}, 5);

    }
}
