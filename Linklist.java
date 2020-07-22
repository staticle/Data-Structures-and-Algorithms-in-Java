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
    }
    public static void  main(String args[]){
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(6);
        list.insertFront(8);
        list.insert(9);
        list.insertFront(10);
        list.insert(15);
        list.show();
    }
}
