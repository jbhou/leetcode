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
 * ClassName:Soluation3Sum <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年5月26日 下午12:21:51 <br/>
 * 
 * @author lenovo
 * @version 1.0.0
 * @see
 */
public class SolutionThreeSum15 {




    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<String> set = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Arrays.binarySearch(nums, j + 1, nums.length, 0 - nums[i] - nums[j]) > 0) {
                    String str = nums[i] + "," + nums[j];
                    if (!set.contains(str)) {
                        set.add(str);
                        list.add(Arrays.asList(nums[i], nums[j], 0 - nums[i] - nums[j]));
                    }
                }
            }
        }
        return list;
    }

    /**
     * 超时 main:(这里用一句话描述这个方法的作用). <br/>
     * TODO(这里描述这个方法适用条件 – 可选).<br/>
     *
     * @author lenovo
     * @param args
     */
    // public List<List<Integer>> threeSum(int[] nums) {
    //
    //
    // Set<String> set = new HashSet<>();
    // int[] sub = new int[3];
    // List<List<Integer>> res = new ArrayList<>();
    // for (int i = 0; i < nums.length; i++) {
    // for (int j = i + 1; j < nums.length; j++) {
    // for (int k = j + 1; k < nums.length; k++) {
    // if (nums[i] + nums[j] + nums[k] == 0) {
    // sub[0] = nums[i];
    // sub[1] = nums[j];
    // sub[2] = nums[k];
    // Arrays.sort(sub);
    // String str = sub[0] + "," + sub[1] + "," + sub[2];
    // if (!set.contains(str)) {
    // List<Integer> list = new ArrayList<>();
    // list.add(nums[i]);
    // list.add(nums[j]);
    // list.add(nums[k]);
    // res.add(list);
    // set.add(str);
    // }
    // }
    // }
    // }
    // }
    // return res;
    // }
    public static void main(String[] args) {
        List<List<Integer>> r = new SolutionThreeSum15().threeSum(new int[] { -1, 0, 1, 2, -1, -4 });
        System.err.println(r);
    }
}
