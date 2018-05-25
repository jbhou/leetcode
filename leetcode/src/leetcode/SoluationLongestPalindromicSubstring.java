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

/**
 * ClassName:SoluationLongestPalindromicSubstring <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年5月25日 下午1:42:39 <br/>
 * 
 * @author lenovo
 * @version 1.0.0
 * @see
 */
public class SoluationLongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        String pailndrome = "";
        for (int i = 0; i < s.length(); i++) {
            
            for (int j = i + pailndrome.length(); j < s.length()+1; j++) {
                // for (int j = i + 1; j <= s.length(); j++) {
                String subString = s.substring(i, j);
                if (subString.length() > pailndrome.length() && isParlindrome(subString)) {
                    pailndrome = subString;
                }
            }
        }
        return pailndrome;
    }

    public boolean isParlindrome(String str) {
        int length = str.length();
        int j = length % 2 == 0 ? length / 2 : length / 2 + 1;
        for (int i = length / 2 - 1; i >= 0 && j < length; j++, i--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = new SoluationLongestPalindromicSubstring().longestPalindrome("aaa2");
        System.err.println(str);
    }
}
