package Lesson04;

public class Exercise02 {
    public static void main(String[] args) {

    // задание 02
        int temperatureMonday = 7;
        int temperatureTuesday = 9;
        int temperatureWednesday = 14;
        int temperatureThursday = 15;
        int temperatureFriday = 15;
        int temperatureSaturday = 17;
        int temperatureSanday = 19;
        int daysWeek = 7;

        int average = (temperatureMonday + temperatureTuesday + temperatureWednesday + temperatureThursday +
                temperatureFriday +  temperatureSaturday +  temperatureSanday) / daysWeek;

        System.out.println( "double average" + average); }
}
