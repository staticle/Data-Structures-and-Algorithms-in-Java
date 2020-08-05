public class DoublyLinkedList
{
    static class Node{
        int data;
        Node next;
        Node prev;
    }
    static class Dll{
        Node head = null;
        Node phead = null;
        void push(int data){
            Node val = new Node();
            val.data = data;
            val.next = null;
            val.prev = null;
            if(head==null){
                head = val;
                phead = val;
            }
            else{
                Node temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
                val.prev = temp;
                phead = val;
                temp.next = val;
            }
        }
        void show(){
            while(head.next!=null){
                System.out.println(head.data);
                head = head.next;
            }
            System.out.println(head.data);
        }
        void bshow(){
            while(phead.prev!=null){
                System.out.println(phead.data);
                phead = phead.prev;
            }
            System.out.println(phead.data);
        }
    }
	public static void main(String[] args) {
	    Dll sam = new Dll();
	    sam.push(5);
	    sam.push(6);
	    sam.push(8);
	    sam.push(7);
	    sam.show();
	    sam.bshow();
	}
}
