package CLI.V5.command;

import CLI.V4.Input;
import CLI.V4.command.Command;
import CLI.V4.domain.StudentScores;

public class InitScoresCommand implements Command {
    StudentScores studentScores = StudentScores.getInstance();

    @Override
    public void execute() {
        int studentNum = Input.getInt("학생 수> ");
        studentScores.setStudentNum(studentNum);
    }
}
