
import java.util.*;
public class MaxElement{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = scan.nextInt();
		}
		int ele = arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>ele){
				ele = arr[i];
			}
		}
		System.out.print(ele);
	}
}
