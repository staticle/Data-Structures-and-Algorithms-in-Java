public class Queueee
{
    static class Queue{
        int arr[];
        int len;
        int front = -1;
        int rear = -1;
        Queue(int n){
            arr = new int[n];
            len = n;
        }
        void enqueue(int val){
            if(front==len-1){
                System.out.println("Queue Full");
            }
            else{
                arr[++front] = val;
            }
        }
        void dequeue(){
            if(rear==len-1||rear==front){
                 System.out.println("Queue Empty");
            }
            else{
                System.out.println(arr[++rear]);
            }
        }
    }
	public static void main(String[] args) {
		Queue q = new Queue(5);
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(8);
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.enqueue(5);
		q.enqueue(6);
	}
}
