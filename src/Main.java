import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите N и М");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] result = new int[n];
        System.out.println("Введите " +m+" тоннелей ");
        for (int i = 0; i < 2*m; i++) {
            int x = scanner.nextInt();
            result[x-1]++;
        }
        System.out.println(Arrays.toString(result));
    }
}