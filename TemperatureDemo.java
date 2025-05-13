package Lesson05;

public class TemperatureDemo {
    public static void main(String[] args) {
        Temperature temperatureF = new Temperature();

        temperatureF.C = 0;
        temperatureF.toFahrenheit();

        System.out.println("Температура по Фаренгейту:" + temperatureF.toFahrenheit());



    }
}
