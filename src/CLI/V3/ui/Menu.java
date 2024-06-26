package CLI.V3.ui;

import CLI.V3.Input;
import CLI.V3.command.Command;

public class Menu {
    MenuItem[] menus;
    public Menu(int size) {
        menus = new MenuItem[size];
    }

    public void add(int ix, MenuItem item) {
        menus[ix] = item;
    }
    public void printMenu() {
        System.out.println("mmmmmmmmmmmmmmmmmmmmmm");
        for (int i = 0; i < menus.length; i++) {
            System.out.printf("%d.%s | ", i+1, menus[i].getTitle());
        }
        System.out.println();
        System.out.println("mmmmmmmmmmmmmmmmmmmmmm");
    }
    public Command getSelect() {
        int selectNo = Input.getInt("선택> ");
        return menus[selectNo-1].getCommand();
    }
}
