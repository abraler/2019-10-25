//给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
public class Exercise1 {
      public class ListNode {
     int val;
     ListNode next;
         ListNode(int x) { val = x; }
          class Solution {
              public ListNode removeNthFromEnd(ListNode head, int n) {
                  ListNode node=new ListNode(0);
                  node.next=head;
                  int  q=0;
                  ListNode cur=head;
                  while(cur!=null){
                      q++;
                      cur=cur.next;
                  }
                  cur=node;
                  q=q-n;
                  while(q>0){
                      q--;
                      cur=cur.next;
                  }
                  cur.next=cur.next.next;
                  return node.next;
              }
          }
}
}
