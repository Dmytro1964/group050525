package Lesson05;

public class CarDemo {
    public static void main(String[] args) {

        Car car1 = new Car();

        car1.brand = "BMW";
        car1.model = "CX6";
        car1.year = 2024;
        car1.mileage = 10000;

        System.out.println( "Марка автомобиля:" + car1.brand);
        System.out.println("Модель автомобиля:" + car1.model);
        System.out.println("Год выпуска:" + car1.year );
        System.out.println("Год выпуска:" + car1.mileage );


        Car car2 = new Car();

        car2.brand = "VW";
        car2.model = "Passat";
        car2.year = 2020;
        car2.mileage = 50000;

        System.out.println( "Марка автомобиля:" + car2.brand);
        System.out.println("Модель автомобиля:" + car2.model);
        System.out.println("Год выпуска:" + car2.year );
        System.out.println("Год выпуска:" + car2.mileage );

    }
}
