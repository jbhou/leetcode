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

import java.time.Period;

/**
 * ClassName:SoluationLongestCommonPrefix <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年5月26日 下午1:43:16 <br/>
 * 
 * @author lenovo
 * @version 1.0.0
 * @see
 */
public class SoluationLongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int minLength = Integer.MAX_VALUE;
        String minStr = "";
        for (String str : strs) {
            if (str.length() < minLength) {
                minStr = str;
                minLength = str.length();
            }
        }
        if (minLength == 0 || strs.length == 0) {
            return "";
        }
        for (int i = 0; i < minLength; i++) {
            char c = minStr.charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != c) {
                    return minStr.substring(0, i);
                }
            }
        }
        return minStr;
    }

    public static void main(String[] args) {
        String s = new SoluationLongestCommonPrefix().longestCommonPrefix(new String[] { "" });
        System.err.println(s);
    }
}
