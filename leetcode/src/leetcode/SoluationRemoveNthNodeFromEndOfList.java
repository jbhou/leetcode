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
 * ClassName:SoluationRemoveNthNodeFromEndOfList <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年5月26日 上午10:12:04 <br/>
 * 
 * @author lenovo
 * @version 1.0.0
 * @see
 */
public class SoluationRemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode reHead = reverseList(head);
        ListNode pre = null;
        ListNode target = reHead;
        for(int i=1;i<n;i++){
            pre =target;
            target=target.next;
        }
        if(pre == null){
            return reverseList(reHead.next);
        }
            
        pre.next=pre.next.next;
        
        
        return reverseList(reHead);
    }
    
    /**
     * 
     *  先逆转
     * @author lenovo
     * @param head
     * @return
     */

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = newHead;
            newHead = cur;
            cur = next;
        }
        return newHead;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ListNode newHead = new SoluationRemoveNthNodeFromEndOfList().removeNthFromEnd(head, 4);
        while (newHead != null) {
            System.err.println(newHead.val);
            newHead = newHead.next;
        }
    }
}
