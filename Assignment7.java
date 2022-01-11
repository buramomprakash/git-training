package Assignments.assignment;
import java.time.LocalDate;

public class Assignment7 {

        public static void main(String[] args) {
        date();
    
    }


    

    public  static void date(){
        String day;
        String month;
        String year;
          
        System.out.println("Enter the day: ");
        day=System.console().readLine();

        System.out.println("Enter the month: ");
        month=System.console().readLine();
        
        System.out.println("Enter the year: ");
        year=System.console().readLine();
        LocalDate sd=LocalDate.of(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day));
        System.out.println("Date Entered: " +sd);
        
        for(int i=1;i<=Integer.parseInt(day) ;i++)
        {
        LocalDate readDate=LocalDate.of(Integer.parseInt(year),Integer.parseInt(month),i);
        System.out.print(readDate);
        System.out.println("      " +readDate.getDayOfWeek());
        }

    }
    
}
