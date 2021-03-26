/*
* 1) Сделайте класс User, в котором будут следующие protected поля - name (имя), age (возраст), public методы setName,
* getName, setAge, getAge.
*
* Сделайте класс Worker, который наследует от класса User и вносит дополнительное private поле salary (зарплата),
* а также методы public getSalary и setSalary.
*
* Создайте объект этого класса 'Иван', возраст 25, зарплата 1000.
* Создайте второй объект этого класса 'Вася', возраст 26, зарплата 2000. Найдите сумму зарплата Ивана и Васи.
*
* Сделайте класс Student, который наследует от класса User и вносит дополнительные private поля стипендия, курс,
* а также геттеры и сеттеры для них.
*
* 2) Сделайте класс Driver (Водитель), который будет наследоваться от класса Worker из предыдущей задачи.
* Этот метод должен вносить следующие private поля: водительский стаж, категория вождения (A, B, C).
*
* */
public class Start {
    public static void main(String[] args) {
        Worker vanya = new Worker();
        vanya.setName("Иван");
        vanya.setAge(25);
        vanya.setSalary(1000);

        Worker vasya = new Worker();
        vasya.setName("Вася");
        vasya.setAge(26);
        vasya.setSalary(2000);

        System.out.println("На двоих Ваня и Вася зарабатывают - " +
                (vanya.getSalary() + vasya.getSalary()) + " денег");

        Driver driver = new Driver(); //вторая задача
        driver.setName("Ашот");
        driver.setSalary(100500);
        driver.setAge(45);
        driver.setDriveExperience(10);
        driver.setDriveCategory(DriveCategory.A);
        System.out.println(driver.toString());
    }
}
