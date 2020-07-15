
import java.util.*;
public class BubbleSort{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = scan.nextInt();
		}
		for(int i=0;i<n-1;i++){
			boolean sam = true;
			for(int j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					sam = false;
				}
			}
			if(!sam)
			break;
		}
		for(int i:arr){
			System.out.print(i+" ");
		}
	}
}
