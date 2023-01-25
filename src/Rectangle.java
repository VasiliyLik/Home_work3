//создаем класс-наследник от класса "Фигура" -  "Прямоугольник"
public class Rectangle extends Figure {
    double area;
    double length;
    double width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        area = length * width;
        System.out.println("площадь прямоугольника = " + area);

    }
}
