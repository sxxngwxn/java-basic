package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("before method call : " + dataA.value);
        changeReference(dataA);
        System.out.println("after method call : " + dataA.value);
    }

    static void changeReference(Data dataX) { // 매개변수로 받아 변경한 값이 인수로 넣은 값도 변경된다(참조형)
        dataX.value = 20;
    }
}
