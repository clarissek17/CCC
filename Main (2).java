import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

        
		int num = in.nextInt(); // number of codes
		in.nextLine();
		String code;
		String newCode = "";
		String output = "";

		int total = 0;


		for(int i = 0; i < num; i++) {

			code = in.nextLine();

			for(int j = 0; j < code.length(); j++) {

				// remove lowercase letters
				if(code.charAt(j) >= 91) {

					newCode += "";
				}

				// add uppercase letters
				else if(code.charAt(j) >= 65) {

					newCode += code.charAt(j);

				}

				

				// add numbers
				else {
				    
				    String temp = "0";
				    String negTemp = "0";
				    boolean negMode = false;
				    int addit = 0;
				    
				    for(int k = 0; k < code.length() - j; k++){
				        
				        // if its a positive number, add it to temp
				        if(code.charAt(j + k) < 65 && !String.valueOf(code.charAt(j + k)).equals("-") && negMode == false){
				            temp += String.valueOf(code.charAt(j + k));
				        }
				        
				        // if its after a neg sign, add it to negTemp
				        else if(code.charAt(j + k) < 65 && !String.valueOf(code.charAt(j + k)).equals("-") && negMode == true){
				            negTemp += String.valueOf(code.charAt(j + k));
				        }
				        
				        // if its a negative sign, change to neg mode
				        else if(String.valueOf(code.charAt(j + k)).equals("-")){
				            
				            // free up negTemp
				            if(negMode){
				                total += Integer.valueOf(negTemp) * -1;
				                negTemp = "0";
				                
				            }
				            
				            // change to neg mode
				            negMode = true;
				        }

				            
				        // if its a letter, break
				        else if(code.charAt(j + k) >= 65){
				            break;
				        }
				        
				        addit = k;
				        
				    } // k for loop
				    
				    j += addit;
				    
				    
				    total += Integer.valueOf(temp);
				    total += Integer.valueOf(negTemp) * -1;


				}



			} // inner for

			newCode += String.valueOf(total);

			output += newCode + "\n";

			newCode = "";
			total = 0;


		} // for

		System.out.println(output);
		

	}
}