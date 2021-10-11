package AccessModifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0);
        System.out.println("Bán kính của hình tròn là : " + circle.getRadius());
        System.out.println("Diện tích của hình tròn là : " + circle.getArea());
    }
}
