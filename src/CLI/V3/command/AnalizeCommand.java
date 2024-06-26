package CLI.V3.command;


import CLI.V3.domain.StudentScores;

public class AnalizeCommand implements Command {
    StudentScores studentScores = StudentScores.getInstance();

    @Override
    public void execute() {
        int [] scores = studentScores.getScores();
        int max =0;
        int sum=0;
        double avg=0;

        for(int i=0;i<scores.length;i++){
            max = (max<scores[i])? scores[i]: max;
            sum += scores[i];
        }
        avg = (double)sum/studentScores.getStudentNum();

        System.out.println("치ㅗ고점수: " +max);
        System.out.println("평균점수: " +avg);
    }
}
