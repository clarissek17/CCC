import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int donuts = in.nextInt(); // starting donuts
		int events = in.nextInt(); // number of events
		in.nextLine();
		String foobar; // plus or minus
		String num; // number inputed
		int newNum;
		
		for(int i = 0; i < events; i++){
		    
		    foobar = in.nextLine();
		    num = in.nextLine();
		    newNum = Integer.valueOf(num);
		    
		    
		    if(foobar.equals("+")){
		        donuts += newNum;
		    }else if(foobar.equals("-")){
		        donuts -= newNum;
		    }
		    

		} // for
		
		
		System.out.println(donuts);
		
		
	}
}
