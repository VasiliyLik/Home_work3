//создаем класс-наследник от класса "Фигура" -  "Треугольник"
public class Triangle extends Figure {
    double area;
    int basis;
    int height;

    public Triangle(int basis, int height) {
        this.basis = basis;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        area = 0.5 * basis * height;
        System.out.println("площадь треугольника = " + area);
    }
}
