package ch13.sec02.exam01;

//타입 파라미터로 K, M을 사용.
public class Product <K, M> {
    private K kind;
    private M model;

//    타입 파라미터를 리턴 타입과 매개변수 타입으로 사용
    public K getKind() { return this.kind; }
    public M getModel() { return this.model; }
    public void setKind(K kind) { this.kind = kind; }
    public void setModel(M model) { this.model = model; }
}
