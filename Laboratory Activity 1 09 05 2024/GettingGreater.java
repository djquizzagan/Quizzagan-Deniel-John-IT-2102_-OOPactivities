
import java.util.Scanner;

class Gettinginputs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Getting the greater value");
        System.out.print("Enter first character: ");
        char first = input.next().charAt(0);
        int char1 = (int) first;

        System.out.print("Enter second character: ");
        char second = input.next().charAt(0);
        int char2 = (int) second;

        System.out.print("-----------------------");
        System.out.print("Character with greater value" + (char) Math.max(char1, char2));

        System.out.print("-----------------------");

        System.out.println("Showing the ASCII codes ");
        System.out.println(first + "" + char1);
        System.out.println(second + "" + char2);

    }
}
