import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int days = in.nextInt();
		in.nextLine();
		String[] weather = new String[days];
		String[] backup = new String[days];
		int pat = 0;
		int max = 0;
		
		// get input
		for(int i = 0; i < days; i++){
		    weather[i] = in.nextLine();
		    backup[i] = weather[i];
		}
		
		
		boolean good = false;
		// if it's all s, one is wrong
		for(int i = 0; i < days; i++){
		    
		    if(weather[i].equals("P")){
		        good = true;
		    }
		    
		} // for
		
		
		
		// change the one day with s
		for(int i = 0; i < days; i++){
		    
		    if(i != 0){
		        weather[i - 1] = backup[i - 1]; // change back to old    
		    }
		    
		    
		    // change the day
		    weather[i] = "S";
		    
		    // check the pattern length
		    for(int j = 0; j < days; j++){
		        
		        // if its s, add 1
		        if(weather[j].equals("S")){
		            pat++;
		            
		            // check if pattern is max
		            if(pat > max){
		                max = pat;
		            } // if
		            
		        }
		        // if its p, reset
		        else{
		            pat = 0;
		        }

		    } // for check pattern
		    pat = 0;
		   
		    
		} // for add s
		
		
		if(good){
		    System.out.println(max);
		}else{
		    System.out.println(days - 1);
		}