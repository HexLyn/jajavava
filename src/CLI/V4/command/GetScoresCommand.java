package CLI.V4.command;

import CLI.V4.Input;
import CLI.V4.domain.StudentScores;

public class GetScoresCommand  implements Command {
    StudentScores studentScores = StudentScores.getInstance();

    @Override
    public void execute() {
        int [] scores = studentScores.getScores();

        for(int i = 0; i < scores.length; i++) {
            scores[i] = Input.getInt("scores ["+ i +"]>");
        }
    }
}
