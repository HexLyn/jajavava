package ch01.sec09;

//public : 공용, 전체에서 접근 가능한 클래스란 뜻.
//void : 리턴을 안한다. 빈값을 리턴. 해당 위치에 int, string등 입력해서 사용.
//main : main(String[] args)
public class Hey {
    public static void main(String[] args) {
    {
        System.out.println("Hello JAVA");
        System.out.println("한글을 뱉어");
    }
}
}
//System.out이 java에서 console.log포지션.
//psvm(main), sout
//.으로 시작하는 파일은 hidden파일이다.
//한글이 깨진다면 setting에서 UTF-8설정,
// HELP-VM설정에서
//-Dbfile.encoding=UTF-8
//-Dbconsole.encoding=UTF-8, 입력.