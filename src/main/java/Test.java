import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        System.out.println("Enter something:");
        Scanner scan = new Scanner(System.in);

        String userInput = scan.nextLine();
        String revFlip = "";

        if(StringUtils.isNumeric(userInput)){
            System.out.println("You entered a number!");
        } else {
            revFlip = StringUtils.reverse(StringUtils.swapCase(userInput));
        }
        System.out.println(revFlip);
    }
}
