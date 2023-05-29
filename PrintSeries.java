package Season2;

public class PrintSeries {
    public static void printDec(int a) {
    	if(a==1) {
    		System.out.println(a);
    		return;
    	}
    	System.out.print(a+" ");
    	printDec(a-1);
    	 
    }
    public static void printInc(int a) {
    	if(a==1) {
    		System.out.print(a+" ");
    		return;
    	}
    	
    	printInc(a-1);
    	System.out.print(a+" ");
    }
	public static void main(String[] args) {
		 PrintSeries.printDec(7);
		 PrintSeries.printInc(7);

	}

}
