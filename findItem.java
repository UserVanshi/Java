package Season2;

public class findItem {
	//find element from last 
	public static int find(int item, int i, int arr[]) {
		if(i==-1) {
			return -1;
		}
		if(arr[i]==item) {
			return i;
		}
		 
		return find(item,i-1,arr );
	}
	
	//find element from first
	public static int find2(int item, int i, int arr[]) {
		if(i==arr.length) {
			return -1;
		}
		if(arr[i]==item) {
			return i;
		}
		 
		return find2(item,i+1,arr );
	}
   public static void main(String args[]) {
	   
	   int arr[]= {1,2,3,4,5,6,5,7,3,5,11};
	   
	   int p=findItem.find(5, arr.length-1, arr);
	   int q=findItem.find2(5, 0, arr);
	   System.out.print("Index From last is "+p+" and from start is "+q);
   }
}
