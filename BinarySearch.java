import java.util.*;

public class BinarySearch
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	        int arr[] = new int[]{1,4,8,9,20};   
	        int search = scan.nextInt();
	        int l=0,h=arr.length-1,mid;
	        while(l<=h){
			mid=(l+h)/2;
			if(arr[mid]<search){
				l=mid+1;
			}
			else if(search==arr[mid]){
				System.out.println("Element Found at "+(mid+1));
				break;
			} 
			else{
				h=mid-1;
			}
	        }
		if(l>h){
			System.out.println("Element not found");
		}
	}
}

