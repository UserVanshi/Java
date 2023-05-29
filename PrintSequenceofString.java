package Season2;

public class PrintSequenceofString {
    public static void printseq(String n , String ans, int i) {
    	
    	if(i>=n.length()) {
    		System.out.println(ans);
    		return;
    	} 
    	//
    	printseq(n,ans + n.charAt(i),i+1);
    	printseq(n,ans,i+1);
    	
    	 
    }
public static int countseq(String n , String ans, int i, int count) {
    	
    	if(i>=n.length()) {
    		System.out.print(ans+" ");
    		count++;
    		return count;
    	} 
    	//
    	 
    	return countseq(n,ans,i+1,count) + countseq(n,ans + n.charAt(i),i+1,count);
    	
    	 
    }

public static int countseq2(String n , String ans, int i) {
	
	if(i>=n.length()) {
		System.out.print(ans+" ");
		 
		return 1 ;
	} 
	//
	 
	return countseq2(n,ans,i+1) + countseq2(n,ans + n.charAt(i),i+1);
	
	 
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=countseq2("abc","",0);
		System.out.print(n);
		

	}

}
