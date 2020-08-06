public class Stacky
{
    static class Node{
        int data;
        Node next;
    }
    static class Stack{
        Node head;
        void push(int data){
            Node st = new Node();
            st.data = data;
            st.next=null;
            if(head==null){
                head = st;
            }
            else{
                st.next = head;
                head = st;
            }
        }
        void pop(){
            if(head==null)
                System.out.println("Stack Empty");
            else{
                 System.out.println(head.data);
                 head = head.next;
            }
        }
    }
	public static void main(String[] args) {
	    Stack sam = new Stack();
	    sam.push(5);
	    sam.push(6);
	    sam.pop();
	    sam.pop();
	    sam.pop();
	}
}
