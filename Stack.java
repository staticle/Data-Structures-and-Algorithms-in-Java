public class Stack
{
    static class Stack{
        int size = 2;
        int top=0;
        int arr[] = new int[size];
        
        void push(int data){
            if(top>=size)
                System.out.println("Stack Full");
            else{
                 arr[top] = data;
                 top++;
            }
        }
        void pop(){
            if(top<=0)
                System.out.println("Stack Empty");
            else{
                 System.out.println(arr[top-1]);
                 top--;
            }
        }
    }
	public static void main(String[] args) {
	    Stack sam = new Stack();
	    sam.push(1);
	    sam.push(2);
	    sam.pop();
	    sam.pop();
	    sam.pop();
	    sam.pop();
	    sam.push(3);	    
	    sam.pop();
	}
}
