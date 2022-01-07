package Homework.exercise;
import java.util.*;


public class Victory {
  
    public static void printPattern(String p){
        String name = "Victory is mine";
        int i=name.length();
    

        for(i=0;i<=name.length()+8;i++){
            System.out.print(p);  
        }

    }
    public static void main(String[] args) {
        
    
        String name = "Victory is mine";
    
        printPattern("/");
        System.out.println("\n||  " +name +"  ||");
        printPattern("\\");
      
        
    }  
}
