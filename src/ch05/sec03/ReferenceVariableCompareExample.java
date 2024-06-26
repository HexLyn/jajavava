package ch05.sec03;

public class ReferenceVariableCompareExample {
    public static void main(String[] args) {
        int[] arr1;
//        배열 선언, String[] arr1 이면 문자열 배열.
        int[] arr2;
        int[] arr3;

        arr1 = new int[] {1, 2 ,3};
        arr2 = new int[] {1, 2 ,3};
//        arr2의 주소값을 arr3에 할당
        arr3 = arr2;

//        ==은 객체의 주소값을 비교.
//        new 를 할 때마다 객체의 주소가 새로 할당됨.
//        즉, arr1과 arr2의 주소값은 다르다.
        System.out.println(arr1 == arr2);
        System.out.println(arr2 == arr3);
    }
}
