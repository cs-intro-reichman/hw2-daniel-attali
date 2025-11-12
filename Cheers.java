// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String word = args[0];
            int times = Integer.parseInt(args[1]);
            word=word.toUpperCase();
            String an ="AEFHILMNORSX";
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                boolean usean=(an.indexOf(ch)>=0);
                String article = usean ? "an " : "a  ";
                System.out.println("Give me " + article + " " + ch + ": " + ch + "!");
            }

            System.out.println("What does that spell?");
            for (int i = 0; i < times; i++) {
            System.out.println(word + "!!!");
}



        }
}
