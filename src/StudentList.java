import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class StudentList implements ConsoleInput, SearchStudentByDate, AverageAge {

    int countOfStudent = 3;
    private final BaseEntity[] list = new BaseEntity[countOfStudent];

    @Override
    public void createStudents(int count) throws ParseException {
        //здесь создаем студентов
        for (int i = 0; i < list.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("input firstName: ");
            final String firstName = sc.nextLine();

            System.out.println("input surName: ");
            final String surName = sc.nextLine();

            System.out.println("input date of Birth in the format - yyyy-MM-dd: ");
            final String dateOfBirth = sc.nextLine();
            String pattern = "yyyy-MM-dd";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            Date newDate = simpleDateFormat.parse(dateOfBirth);

            list[i] = new Student(firstName, surName, newDate);
        }
        System.out.println(Arrays.toString(list));
    }

    @Override
    public void findStudentByDate(Date date) throws ParseException {
        //здесь ищем студента по дате рождения
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a searching date of birth in the format - yyyy-MM-dd:");
        String searchBirthDate = scanner.nextLine();

        for (BaseEntity baseEntity : list) {
            String pattern = "yyyy-MM-dd";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            Date newDateInFind = simpleDateFormat.parse(searchBirthDate); //форматируем в тип Date
            long newDateInMilSec = newDateInFind.getTime();               //приводим к типу long введенное значение ДР
            long birthDateInMilSec = baseEntity.birthDate.getTime();      //приводим к типу long значение ДР в массиве
            if (newDateInMilSec == birthDateInMilSec) {                  //сравниваем введенное значение данными масива
                System.out.println(baseEntity);
            }
        }
    }

    @Override
    public void calculateAverageAge() {
        //здесь считаем их средний возраст
        long averageInMilSec = 0;
        for (BaseEntity baseEntity : list) {
            averageInMilSec = averageInMilSec + baseEntity.birthDate.getTime();
        }
        long midleAge = averageInMilSec / countOfStudent; //расчет среднего значения введенных ДР

        Date nowDate = new Date();
        long nd = nowDate.getTime();  //переводим текущую дату в миллисекунды

        long difference = nd - midleAge; //определяем разницу между настоящим временем и нашей средней датой ДР

        //вводим переменные для последующей конвертации миллисекунд в необходимый формат
        long SECOND = 1000;
        long MINUTE = SECOND * 60;
        long HOUR = MINUTE * 60;
        long DAY = HOUR * 24;
        long MONTH = DAY * 30;
        long YEAR = DAY * 365;

        long resYear = difference / YEAR;
        long resMonth = difference % YEAR / MONTH;
        long resDay = difference % YEAR % MONTH / DAY;
        long resHour = difference % YEAR % MONTH % DAY / HOUR;
        long resMin = difference % YEAR % MONTH % DAY % HOUR / MINUTE;

        //д.б. результат в виде: (например) 50 лет 3 месяца 5 дней 10 часов и 5 минут
        System.out.println(resYear + " лет " + resMonth + " месяц(ев) " + resDay + " дней " + resHour +
                " час(ов) " + resMin + " минут ");
    }
}
