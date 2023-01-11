//создаем класс-наследник от класса "Фигура" -  "Круг"
public class Circle extends Figure {
    double area;
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        area = 3.14 * radius * radius;
        System.out.println("площадь круга = " + area);

    }
}
