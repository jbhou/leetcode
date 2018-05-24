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
 * ClassName:SoluationReverseInteger <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年5月24日 下午7:47:54 <br/>
 * 
 * @author lenovo
 * @version 1.0.0
 * @see
 */
public class SoluationReverseInteger {
    public int reverse(int x) {
        String str = String.valueOf(x);
        String newStr = "";
        int start = str.length() - 1;
        int end = x < 0 ? 1 : 0;
        for (int i = start; i >= end; i--) {
            newStr += str.charAt(i);
        }
        Long val = Long.parseLong(newStr);
        val = x < 0 ? val * -1 : val;
        if(val > Integer.MAX_VALUE || val < Integer.MIN_VALUE){
            return 0;
        }
        return val.intValue();
    }

    public static void main(String[] args) {
        int v = new SoluationReverseInteger().reverse(1534236469);
        System.err.println(v);
    }
}
