package CLI.V5;

import java.util.Scanner;

public class Input {
    static Scanner sc = new Scanner(System.in);

    public static int getInt(String title) {
        System.out.print(title);
        return Integer.parseInt(sc.nextLine());
    }
}
