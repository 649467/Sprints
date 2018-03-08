
/* Created by InteliJ Idea

 *User: Nicholas Gaultney
 *Date: 3/8/2018
 *Time: 11:07 AM
 *Contact: nmgaultney@gmail.com
 */

import java.util.Queue;
import java.util.Stack;

public class justMethods {

    private String reverse(String string){
        String reversedString = "";
        for(int i = string.length() -1; i >= 0; i++) {
            reversedString += string.charAt(i) ;
        }

        return reversedString;
    }

    private String decimate(String string){
        StringBuilder decimatedString = new StringBuilder(string);

        int i = 4;
        while(i < decimatedString.length()){
            decimatedString.deleteCharAt(i);
            i += 5;
        }

        return decimatedString.toString();
    }

    public String stringManipulation(String victim){
        victim = reverse(victim);
        return decimate(victim);
    }

    public void starTriangle(int numStarStacks){
        int numSpaces = numStarStacks - 1;
        starTriangle(1, numSpaces, numStarStacks);

    }

    private void starTriangle(int numStars, int numSpaces, int numStarStacks){
        if (numStars > = numStarStacks){        // Was changing to the num of upper bound stars
            return;
        }

        printTimes(' ', numSpaces);
        printTimes('*', numStars);
        starTriangle(numStars + 2, numSpaces - 1, numStarStacks);

    }

    private void printTimes(char character, int numTimes){
        for(int i = 0; i < numTimes; i++){
            System.out.print(character);
        }
        System.out.println();
    }

    public Stack transfer(Queue queue){
        Stack stack = new Stack();
        while (!(queue.isEmpty())){
            stack.push(queue.remove());
        }
        return stack;
    }
}
