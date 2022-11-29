package Selenium2;



public class practice {
	
	//static int [] arr = {23,34,75,66,93};
	public static void main(String[] args) {
		
	/*int s =  SumofDigits(arr.length-1);
	System.out.println(s);
			
					
	}
	private static int SumofDigits(int j) {
       if(j==0)
    	   return arr [j];
       return arr [j] + SumofDigits(j-1);*/
       
		
		String a = "software testing";
		
		String [] bs = a.split(" ");
		for(int i = bs.length-1;i>=0;i--) {
			System.out.print(bs[i]+" ");
			
		}

	}
}
	



