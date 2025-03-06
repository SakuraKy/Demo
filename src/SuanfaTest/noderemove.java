package SuanfaTest;

public class noderemove {
    public static void main(String[] args) {

    }
    /*
     * public void removeFirst(){
     * 判断链表是否为空
     * if (size < 1) {
     * throw new RuntimeException("链表为空");
     * }
     * 因为有虚拟节点，所以不必考虑节点为空的问题
     * Node<E> x = head.next;
     * Node<E> temp = x.next;
     * 
     * 
     * head.next = temp;
     * temp.prev = head;
     * size--;
     * return x.val;
     * }
     */

    // ---------------------------

    /*
     * public E remove(){
     * 查看index是否越界
     * checkElementIndex(index);
     * 查找index对应的节点
     * Node<E> x = getNode(index);
     * 删除index位置的节点
     * Node<E> prev = x.prev;
     * Node<E> next = x.next;
     * prev.next = next;
     * next.prev = prev;
     * 
     * 
     * size--;
     * return x.val;
     * }
     */

}
