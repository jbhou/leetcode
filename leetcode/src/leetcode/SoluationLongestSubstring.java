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

import java.util.HashSet;
import java.util.Set;

/**
 * ClassName:LongestSubstring <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年5月24日 上午10:58:02 <br/>
 * 
 * @author lenovo
 * @version 1.0.0
 * @see
 */
public class SoluationLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int l = new SoluationLongestSubstring().lengthOfLongestSubstring("abcdbcdsaa");
        System.err.println(l);
    }
    /**
     * 超时
     */
    // public int lengthOfLongestSubstring(String s) {
    // int maxLength = s.length() > 0 ? 1 : 0;
    // for (int i = 0; i < s.length(); i++) {
    // boolean find = false;
    // for (int j = i + 1; j < s.length(); j++) {
    // // 子串 i > j
    // for (int p = i; p < j; p++) {
    // if (s.charAt(j) == s.charAt(p)) {
    // find = true;
    // break;
    // }
    // }
    // if (find)
    // break;
    // else {
    // if (maxLength < j - i + 1) {
    // System.err.println(j + "-" + i + "+" + 1);
    // maxLength = j - i + 1;
    // }
    // }
    // }
    // }
    // return maxLength;
    // }
}
