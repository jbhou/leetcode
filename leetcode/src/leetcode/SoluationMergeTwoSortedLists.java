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
 * ClassName:SoluationMergeTwoSortedLists <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年5月28日 下午8:27:59 <br/>
 * 
 * @author lenovo
 * @version 1.0.0
 * @see
 */
public class SoluationMergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newHead = null;
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val >= l2.val) {
            newHead = l2;
            l2 = l2.next;
        } else {
            newHead = l1;
            l1 = l1.next;
        }
        ListNode newList = newHead;
        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                newList.next = l2;
                l2 = l2.next;
            } else {
                if (l1.val < l2.val) {
                    newList.next = l1;
                    l1 = l1.next;
                }
            }
            newList = newList.next;
        }
        if (l1 != null) {
            newList.next = l1;
        }
        if (l2 != null) {
            newList.next = l2;
        }
        return newHead;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);
        l1.next.next.next = new ListNode(7);
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);
        l2.next.next.next = new ListNode(8);
        ListNode l = new SoluationMergeTwoSortedLists().mergeTwoLists(l1, l2);
        while (l != null) {
            System.err.println(l.val);
            l = l.next;
        }
    }
}
