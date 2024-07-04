package ch17.sec07.exam01;

//Comparable 인터페이스를 상속받으면 compareTo를 무조건 구현해야 한다.
public class Student implements Comparable<Student>{
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String getName() {return name;}
    public int getScore() {return score;}

    @Override
    public int compareTo(Student o) {
        return Integer.compare(score, o.score);
    }
}
