package CLI.V3.command;

import CLI.V3.Input;
import CLI.V3.domain.StudentScores;

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
