//создаем класс-наследник от класса "Фигура" -  "Квадрат"
public class Square extends Figure {
    final int width;
    final int diagonal;

    public Square(int width, int diagonal) {
        this.width = width;
        this.diagonal = diagonal;
    }

    @Override
    public double calculateArea() {
        return (double) diagonal * diagonal / 2;
    }
}
