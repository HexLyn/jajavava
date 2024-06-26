package CLI.V4;

import CLI.V4.command.*;
import CLI.V4.ui.*;

public class App {
    Menu menu;

    public App() {
    }

    public void init(int menuSize) {
        menu = new Menu(menuSize);
        createMenu(menu);
    }

    public void createMenu(Menu menu) {
    }

    public void run() {
//        init(5);
        while (true) {
            menu.printMenu();
            Command command = menu.getSelect();
            command.execute();
        }
    }
}

