//создаем класс-наследник от класса "Фигура" -  "Квадрат"
public class Square extends Figure {
    double area;
    int width;
    int diagonal;

    public Square(int width, int diagonal) {
        this.width = width;
        this.diagonal = diagonal;
    }

    @Override
    public void calculateArea() {
        area =(double) diagonal * diagonal / 2;
        System.out.println("площадь квадрата = " + area);
    }
}
