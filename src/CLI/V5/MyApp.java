package CLI.V5;

import CLI.V4.command.*;
import CLI.V4.ui.Menu;
import CLI.V4.ui.MenuItem;

public class MyApp extends App {
    @Override
    public void createMenu(Menu menu) {
        super.createMenu(menu);

        menu.add(0, new MenuItem("학생수", new InitScoresCommand()));
        menu.add(1, new MenuItem("점수입력", new GetScoresCommand()));
        menu.add(2, new MenuItem("점수리스트", new PrintScoreCommand()));
        menu.add(3, new MenuItem("분석", new AnalizeCommand()));
        menu.add(4, new MenuItem("종료", new ExitCommand()));
    }

    public static void main(final String[] args) {
        App app = new MyApp();
        app.init(5);
        app.run();
    }
}
