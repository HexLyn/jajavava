package CLI.V3;

public class Menu {
    String menus [] = {"학생 수", "점수 입력","점수리스트","분석","종료"};

    public void printMenu() {
        System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmmmm");
        for (int i = 0; i < menus.length; i++) {
            System.out.printf("%d.%s | ", i+1, menus[i]);
        }
        System.out.println();
        System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmmmm");}

    public int getSelect() {
        int selectNo = Input.getInt("선택> ");
        return selectNo;
    }
}
