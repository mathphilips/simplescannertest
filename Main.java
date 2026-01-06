package HelloWorld;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String helloWorld = sc.nextLine();
        System.out.println(helloWorld);
        sc.close();
        System.exit(0);
    }
}