package ref;

public class MethodChange {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("before method call : " + a);
        changePrimitive(a);
        System.out.println("after method call : " + a);
    }

    static void changePrimitive(int x) { // 매개변수로 받은 값이 변경되어도 인수로 넣은 값에는 영향이 없다(기본형)
        x = 20;
    }
}
