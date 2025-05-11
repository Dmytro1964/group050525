package Lesson04;

import java.util.SimpleTimeZone;

public class ManagerData {
    public static void main(String[] args) {
   Manager first = new Manager();
        first.age = 50;
        first.salary = 1000;

        System.out.println("Возраст" + first.age );
        System.out.println("Зарплата" + first.salary);
        // Мэнэджер first отпраздновал День Рождения и ему повысили зарплату.

        first.age = first.age + 1;
        first.salary = first.salary + 200;

        System.out.println("Возраст" + first.age );
        System.out.println("Зарплата" + first.salary);

        // создаем Мэнэджера Second

        Manager second = new Manager();
        second.age = 60;
        second.salary = 1300;

        System.out.println("Возраст" + second.age );
        System.out.println("Зарплата" + second.salary);

        // Мэнэджер second отпраздновал День Рождения и ему повысили зарплату.

        second.age = second.age + 1;
        second.salary = second.salary + 300;

        System.out.println("Возраст" + second.age );
        System.out.println("Зарплата" + second.salary);




    }
}
