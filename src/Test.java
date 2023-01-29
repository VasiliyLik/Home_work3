//класс для выведения итогов программы

//Необходимо создать абстрактный класс "Фигура" и классы наследники: "Квадрат", "Прямоугольник", "Треугольник" и "Круг".
// В абстрактном классе создайте абстрактный метод "расчета площади".
// В классах конкретных фигур у вас должны быть необходимые поля для задания параметров фигур.
// Инициализацию нужно сделать через конструкторы.
// В итоге должна получится программа, где имеются все типы фигур с нужными параметрами сторон,
// углов и рассчитываются площади этих фигур
public class Test {
    public static void main(String[] args) {
        Square square = new Square(10, 15);
        System.out.println(square.calculateArea());

        Rectangle rectangle = new Rectangle(20, 15);
        System.out.println(rectangle.calculateArea());

        Triangle triangle = new Triangle(21, 11);
        System.out.println(triangle.calculateArea());

        Circle circle = new Circle(14);
        System.out.println(circle.calculateArea());
    }
}
