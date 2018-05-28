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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName:SoluationLetterCombinationsFfPhoneNumber <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年5月28日 下午7:33:31 <br/>
 * 
 * @author lenovo
 * @version 1.0.0
 * @see
 */
public class SoluationLetterCombinationsFfPhoneNumber {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> dict = new HashMap<>();
        dict.put('1', "");
        dict.put('2', "abc");
        dict.put('3', "def");
        dict.put('4', "ghi");
        dict.put('5', "jkl");
        dict.put('6', "mno");
        dict.put('7', "pqrs");
        dict.put('8', "tuv");
        dict.put('9', "wxyz");
        String tmpStr = "";
        for (int i = 0; i < digits.length(); i++) {
            tmpStr += dict.get(digits.charAt(i));
        }
        System.err.println(tmpStr);
        return null;
    }
    
    
    public static void main(String[] args) {
        new SoluationLetterCombinationsFfPhoneNumber().letterCombinations("123");
    }
}
