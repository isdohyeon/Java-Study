package level2.extends1;

public class ClassB extends ClassA {

    public ClassB(int a) {
        super(); // 기본 생성자. 생략 가능
        System.out.println("ClassB 생성자, a = " + a);
    }

    public ClassB(int a, int b) {
        super();
        System.out.println("ClassB 생성자 2, a = " + a + ", b = " + b);

    }
}
