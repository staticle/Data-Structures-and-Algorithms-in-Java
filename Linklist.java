public class Linklist {
    static class Node{
        int data;
        Node next;
    }
    static class LinkedList{
        Node head;
        void insert(int data){
            Node temp = new Node();
            temp.data = data;
            temp.next = null;
            if(head==null){
                head = temp;
            }
            else{
                Node g = head;
                while (g.next != null){
                    g = g.next;
                }
                g.next = temp;
            }
        }
        void show(){
            Node g =head;
            while (g.next != null){
                System.out.println(g.data);
                g=g.next;
            }
            System.out.println(g.data);
        }
        void insertFront(int data){
            Node temp = new Node();
            temp.data = data;
            temp.next = head;
            head = temp;
        }
        void insertAtPosition(int position,int data){
            //problem starting at 0 || 1 returns same result
            boolean flag = true;
            Node node= head, startingNode=null;
            Node temp = new Node();
            temp.data = data;
            for(int i=0;i<position-1;i++){
                node=node.next;
                if(node.next==null){
                    flag = false;
                    System.out.println("You entered Position greater than size");
                    break;
                }
            }
            if(flag) {
                startingNode = node.next;
                node.next = temp;
                temp.next = startingNode;
            }
        }
        void deleteByPosition(int position){
            Node temp = head,prevLink= null;
            boolean flag = true;
            for(int i=0;i<position-1;i++){
                if(position==0){ // covers if we wanna delete first element
                    temp = temp.next;
                    head = temp;
                    flag = false;
                    break;
                }
                else{
                    temp = temp.next;
                    if(temp.next ==null)
                    {
                        flag = false;
                        System.out.println("Cannot delete outside rangw");
                        break;
                    }
                }
            }
            if(flag) {
                Node delete = temp.next;
                temp.next = delete.next;
            }
        }
	void deleteByValue(int val){
		Node temp = head;
		boolean elementExists = false;
		if(temp.data == val){
			head = temp.next;
			elementExists = true;
		}
		else{
			while(temp.next!=null){
				Node prev = temp;
				temp = temp.next;
				if(temp.data == val){
					prev.next = temp.next;
					elementExists =true;
				}
			}
		}
		if(!elementExists)
		System.out.println("Element not found");
	}
    }
    public static void  main(String args[]){
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(6);
        list.insertFront(8);
        list.insert(9);
        list.insertFront(10);
        list.insert(15);
        list.insertAtPosition(5,89);
        list.insertAtPosition(2,77);
        list.deleteByPosition(7);
	list.deleteByValue(6);
        list.show();
    }
}
