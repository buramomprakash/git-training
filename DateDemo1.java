package collections;

import java.time.LocalDate;

public class DateDemo1 {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        System.out.println("today: " +today);
        System.out.println("tommorow: " +today.plusDays(1));
        System.out.println("Yesterday: " +today.minusDays(1));
        System.out.println("Next week: " +today.plusWeeks(1));


        String day;
        String month;
        String year;
        System.out.println("Enter the day: ");
        day = System.console().readLine();
        System.out.println("Enter the month: ");
        month= System.console().readLine();
        System.out.println("Enter the year: ");
        year = System.console().readLine();

        System.out.println("You were born on: "+LocalDate.of(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day)));

        LocalDate samplDate=LocalDate.parse("1999-09-02");
        System.out.println(samplDate.getMonth()+ " "+samplDate.getDayOfWeek()+" "+samplDate.getYear());
    }
    
}
