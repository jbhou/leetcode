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
 * ClassName:SoluationAddTwoNumbers <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年5月23日 下午7:41:22 <br/>
 * 
 * https://leetcode.com/problems/add-two-numbers/description/
 * 
 * @author lenovo
 * @version 1.0.0
 * @see
 */
public class SoluationAddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultNode = new ListNode(0);
        recursionAdd(l1, l2, resultNode);
        ListNode node = resultNode;
        do {
            if (node.next != null && node.next.next == null && node.next.val == 0) {
                node.next = null;
                break;
            }
            node = node.next;
        } while (node != null);
        return resultNode;
    }

    /**
     * 
     * recursionAdd:(这里用一句话描述这个方法的作用). <br/>
     * TODO(这里描述这个方法适用条件 – 可选).<br/>
     *
     * @author lenovo
     * @param l1
     * @param l2
     * @param resultNode
     * @return
     */
    private ListNode recursionAdd(ListNode l1, ListNode l2, ListNode resultNode) {
        // TODO Auto-generated method stub
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 != null && l2 != null) {
            int newVal = resultNode.val + l1.val + l2.val;
            if (newVal >= 10) {
                resultNode.val = newVal % 10;
                resultNode.next = new ListNode(newVal / 10);
            } else {
                resultNode.val = newVal;
                resultNode.next = new ListNode(0);
            }
            recursionAdd(l1.next, l2.next, resultNode.next);
        } else {
            if (l1 != null) {
                int newVal = resultNode.val + l1.val;
                if (newVal >= 10) {
                    resultNode.val = newVal % 10;
                    resultNode.next = new ListNode(newVal / 10);
                } else {
                    resultNode.val = newVal;
                    resultNode.next = new ListNode(0);
                }
                recursionAdd(l1.next, null, resultNode.next);
            } else {
                int newVal = resultNode.val + l2.val;
                if (newVal >= 10) {
                    resultNode.val = newVal % 10;
                    resultNode.next = new ListNode(newVal / 10);
                } else {
                    resultNode.val = newVal;
                    resultNode.next = new ListNode(0);
                }
                recursionAdd(null, l2.next, resultNode.next);
            }
        }
        return resultNode;
    }

    public static void main(String[] args) {
        ListNode root1 = new ListNode(1);
        root1.next = new ListNode(2);
        root1.next.next = new ListNode(3);
        root1.next.next.next = new ListNode(4);
        root1.next.next.next.next = new ListNode(9);
        root1.next.next.next.next.next = new ListNode(9);
        root1.next.next.next.next.next.next = new ListNode(9);
        root1.next.next.next.next.next.next.next = new ListNode(9);
        ListNode root2 = new ListNode(0);
        root2.next = new ListNode(2);
        root2.next.next = new ListNode(3);
        root2.next.next.next = new ListNode(4);
        root2.next.next.next.next = new ListNode(1);
        ListNode r = new SoluationAddTwoNumbers().addTwoNumbers(root1, root2);
        while (r != null) {
            System.err.println(r.val);
            r = r.next;
        }
    }
}
