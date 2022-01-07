package Homework.exercise;
import java.util.*;

public class Spikey {
    public static void printSkype(){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("\\");
            }
            for(int j=1;j<=i;j++){
                System.out.print("/");
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print("/");
            }
            for(int j=i;j<=n;j++){
                System.out.print("\\");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printSkype();
    }
}
