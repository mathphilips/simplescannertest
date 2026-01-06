package HelloWorld;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String helloWorld = scanner.nextLine();
        System.out.println(helloWorld);
        scanner.close();
        System.exit(0);
    }
}