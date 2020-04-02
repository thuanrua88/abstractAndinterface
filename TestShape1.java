package abstractAndinterface;

public class TestShape1 {
    public static void main(String[] args) {
        Shape1 p1 = new Rectangle1(1, 2);
        System.out.println(p1);
        System.out.println("Area is " + p1.getArea());

        Shape1 p2 = new Triangle1(3, 4);
        System.out.println(p2);
        System.out.println("Area is " + p2.getArea());
    }
}
