
import java.util.Scanner;

class GettingInputs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter the genre: ");
        String genre = input1.nextLine();

        System.out.print("Enter the album: ");
        String album = input1.nextLine();

        System.out.print("Enter the song title: ");
        String songtitle = input1.nextLine();

        System.out.print("Enter the arist: ");
        String artist = input1.nextLine();

        System.out.println("-----------------------------------------");
        System.out.println("SONG DETAILS");
        System.out.println("-----------------------------------------");
        System.out.println("Year Released: " + year);
        System.out.println("Genre: " + genre);
        System.out.println("Album: " + album);
        System.out.println("Title: " + songtitle);
        System.out.println("Artist: " + artist);

        input.close();

    }
}
