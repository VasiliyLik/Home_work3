import java.util.Date;

//создаем абстрактный класс для определения поля birth Date из потенциально любого списка объектов, содержащих такое поле
public abstract class BaseEntity {
    protected final Date birthDate;

    public BaseEntity(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }
}
