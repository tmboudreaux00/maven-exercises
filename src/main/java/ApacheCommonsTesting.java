
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class ApacheCommonsTesting{

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter anything below:");
        String response = scanner.nextLine();

        boolean valid = false;
        do {
            if (StringUtils.isNumeric(response)) {
                System.out.print("This is a number. Try again. \nEnter anything below:\n");
                response = scanner.nextLine();
            } else {
                valid = true;
            }
        } while (!valid);

        String swapCase = StringUtils.swapCase(response);
        System.out.println("Case-swapped: " + "'" + swapCase + "'");

        String reverseString = StringUtils.reverse(response);
        System.out.println(response + " reversed: " + "'" + reverseString + "'");

        String reverseSwapCase = StringUtils.reverse(swapCase);
        System.out.println("Reversed and case-swapped: " + "'" + reverseSwapCase + "'");

    }
}
