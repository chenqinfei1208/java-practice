public class RemoveAllKey {
    //删除所有值为key的节点
    public void removeAllKey{
        ListNode cur = this.head;
        while (cur != null) {
            if(cur.data == key) {
                //删除的是不是头结点
                if(cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                }else {
                    cur.prev.next = cur.next;
                    if(cur.next != null) {
                        //删除的不是尾节点
                        cur.next.prev = cur.prev;
                    }else {
                        this.tail = cur.prev;
                    }
                }
            }
            cur = cur.next;
        }
    }

    public void clear() {
        ListNode cur = this.head;
        while (cur != null) {
            ListNode curNext = cur.next;
            cur.next = null;
            cur.prev = null;
            cur = curNext;
        }
        this.head = null;
        this.tail = null;
    }

   /*
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key);*/

}

}
