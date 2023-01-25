import java.text.ParseException;

//интерфейс для заполнения данных студентов
public interface ConsoleInput {

    void createStudents(int count) throws ParseException;
}
