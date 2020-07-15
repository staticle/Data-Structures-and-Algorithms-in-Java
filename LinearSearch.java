
import java.util.*;
public class LinearSearch{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = scan.nextInt();
		}
		int search = scan.nextInt();
		boolean sam = true;
		for(int i=0;i<n;i++){
			if(arr[i]==search){
				System.out.print("Element found at"+(i+1));
				sam=false;
				break;
			}
		}
		if(sam)
		System.out.println("Element Not Found");
	}
}
