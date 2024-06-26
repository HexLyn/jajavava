package ch08.quiz08;

import java.util.Scanner;

public class MemberService {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MemberService memberService = new MemberService();

        String id = memberService.typeid();
        String pw = memberService.typepw();
        boolean result = memberService.login(id, pw);

        if (result) {
            System.out.println("길동 로긴");
            memberService.logout("hong");
        } else {
            System.out.println("id 또는 password가 올바르지 않어.");
        }
    }

    public String typeid() {
        System.out.println(" id 입력 : ");
        return scanner.nextLine();
    }
    public String typepw() {
        System.out.println(" pw 입력 : ");
        return scanner.nextLine();
    }

    private boolean login(String id, String password) {
        if ( id.equals("hong") && password.equals("12345")) {
            System.out.println("Login successful");
            return true;
        } else return false;
    }
    private void logout(String id) {
        System.out.println(id + " logged out");
    }


}

