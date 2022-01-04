package Assignments;
import java.util.*;
public class Assignment5 {
    public static void main(String args[]){
        int array[] = {50,70,55,30,94,33,28};
        int temp=array[0];
        for(int i = 0; i<array.length; i++ ){
           if(array[i]>temp)
           temp=array[i];
        }
        System.out.println("Largest Number in the array is:"+ temp);
    }
}
