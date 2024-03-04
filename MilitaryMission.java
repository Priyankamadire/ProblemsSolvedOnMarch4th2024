
/*
 * Mr.Bob and Mr.Cob are working on a Military Mission. 
They are supposed to encode the message and send the message to the under-cover team.

Where Cob has written a script.
Where the Script says double all the ascii values other than mentioned in the bracket
(97,101,105,111,117,65,69,73,79,85) and place a '#' in between. 

Help Bob in writing the Code. 


Sample Test Case-1
input = attack the enemy
output = at#tt#tac#ck#k t#th#he en#nem#my#y

 */
import java.util.*;

public class MilitaryMission {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(help(s));
    }

    public static String help(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!isVowel(c) && c != ' ') {
                sb.append(c);
                sb.append("#");
                sb.append(c);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U') {
            return true;
        }
        return false;
    }
}