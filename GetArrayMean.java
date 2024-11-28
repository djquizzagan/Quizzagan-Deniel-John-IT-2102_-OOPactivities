import java.util.Scanner;

class GetArrayMean {
public static float getArrayMean(int[] arr) {
int sum = 0;
    for (int num : arr) {
    sum += num;  
}
return (float) sum / arr.length;  
}

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter number of elements: ");
int n = scanner.nextInt();
int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
    System.out.print("Enter number: ");
    arr[i] = scanner.nextInt();  
}
float mean = getArrayMean(arr);
System.out.println(String.format("Mean of array is: %.2f", mean));
scanner.close();
}
}
