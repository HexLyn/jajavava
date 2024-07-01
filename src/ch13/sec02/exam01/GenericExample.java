package ch13.sec02.exam01;

public class GenericExample {
    public static void main(String[] args) {
//        K는 Tv로, M은 String으로 대체
        Product<TV, String> product1 = new Product<>();


//        setter 매개값은 반드시 Tv의 String을 제공.
        product1.setKind(new TV());
        product1.setModel("스마트 Tv");
//        getter 리턴값은 Tv와 String이 됨.
        TV tv = product1.getKind();
        String tvModel = product1.getModel();

//        K는 Car로 대체, M은 String으로 대체
        Product<Car, String> product2 = new Product<>();
        product2.setKind(new Car());
        product2.setModel("SUV자동차");

        Car car = product2.getKind();
        String carModel = product2.getModel();
    }
}
