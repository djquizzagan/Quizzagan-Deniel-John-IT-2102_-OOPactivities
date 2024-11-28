import java.util.Scanner;

class MultiplicationTable {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the size of the multiplication table: ");
int maxnum = scanner.nextInt();

int[][] multable = new int[maxnum][maxnum];
    for (int i = 0; i < maxnum; i++) {
    for (int j = 0; j < maxnum; j++) {
multable[i][j] = (i + 1) * (j + 1);  
}
}
System.out.println("Multiplication Table:");
    for (int i = 0; i < maxnum; i++) {
    for (int j = 0; j < maxnum; j++) {
System.out.printf("%4d", multable[i][j]);
}
System.out.println(); 
}
scanner.close();
}
}
