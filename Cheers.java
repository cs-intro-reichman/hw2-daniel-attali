// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	   String wordInput = args[0];
                String upperWordInput = wordInput.toUpperCase();
                int numTimes = Integer.parseInt(args[1]);
                
                for (int i = 0; i < upperWordInput.length(); i++) {
                        
                        char singleWord = upperWordInput.charAt(i); 
                        String specialWord = "AEFHILMNORSX"; 
                        if (specialWord.indexOf(singleWord) >= 0) {
                                System.out.println("Give me an " + singleWord + ": " + singleWord + "!");
                        } else {
                                 System.out.println("Give me a  " + singleWord + ": " + singleWord + "!");
                        }
                }

                System.out.println("What does that spell?");

                for (int j = 0; j < numTimes; j++) {
                        System.out.println(upperWordInput + "!!!");
                }


        }
}