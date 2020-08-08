public class CircularLinkedList
{
    static class Node{
        int data;
        Node next;
    }
    static class Circular{
        Node head;
        void push(int data){
            Node sam = new Node();
            sam.data = data;
            sam.next = head;
            if(head==null){
                sam.next = sam;
                head = sam;
            }
            else{
                Node temp = head;
                while(temp.next!=head){
                    temp=temp.next;
                }
                temp.next = sam;
            }
        }
        void show(){
            Node temp = head;
            while(temp.next !=head){
                System.out.println(temp.data);
                temp = temp.next;
            }
            
                System.out.println(temp.data);
        }
    }
	public static void main(String[] args) {
	    Circular list = new Circular();
	    list.push(5);
	    list.push(6);
	    
	    list.push(6);
	    list.show();
	}
}
