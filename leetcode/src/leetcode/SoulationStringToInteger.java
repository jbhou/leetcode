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
 * ClassName:SoulationStringToInteger <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年5月25日 上午9:10:11 <br/>
 * 
 * @author lenovo
 * @version 1.0.0
 * @see https://leetcode.com/problems/string-to-integer-atoi/description/
 */
public class SoulationStringToInteger {
    
    
    
    
    
    /**
     * 要注意区分负数
     *
     */
    public int myAtoi(String str) {
        str = str.trim();
        try {
            int n = Integer.parseInt(str);
            return n;
        } catch (Exception e) {
            if (str.length() <= 1) {
                return 0;
            }
        }
        long number = 0;
        boolean negative = false;
        char firstChar = str.charAt(0);
        if (firstChar <= '9' && firstChar >= '0') {
            number = firstChar - '0';
        } else if (firstChar == '-') {
            negative = true;
        } else if (firstChar != '+') {
            return 0;
        }
        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                number = (str.charAt(i) - '0') + number * 10;
                if (number > Integer.MAX_VALUE) {
                    if (negative) {
                        return Integer.MIN_VALUE;
                    }
                    return Integer.MAX_VALUE;
                }
            } else {
                break;
            }
        }
        if (negative) {
            return -1 * (int) number;
        }
        return (int) number;
    }

    public static void main(String[] args) {
        int i = new SoulationStringToInteger().myAtoi("1222s");
        System.err.println(i);
    }
}
