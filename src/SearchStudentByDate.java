import java.text.ParseException;
import java.util.Date;

//интерфейс для поиска из списка студентов по Дате рождения
public interface SearchStudentByDate {

    void findStudentByDate(Date date) throws ParseException;
}
