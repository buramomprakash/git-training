package assignments;
import java.util.*;

public class Assignment1 {
    public void add(a,b){
        int sum= a+b;
       System.out.println("additon of two numbers is :" +sum);
    }   
    public void sub(a,b){
        int sub= a-b;
       System.out.println("subtractiton of two numbers is :" +sub);
    }   
    public void mul(a,b){
        int mul= a*b;
       System.out.println("multplication of two numbers is :" +mul);
    }   
    public void div(a,b){
        double div= a/b;
       System.out.println("division of two numbers is :" +div);
    }   
    public void mod(a,b){
        int mod= a%b;
       System.out.println("Modulus of two numbers is :" +mod);
    } 
    
    public static void main(String[] args) {
        int a=20 , b=10 ;
        Assignment1 as=new Assignment1();
        as.add(a,b );
        as.sub(a,b);
        as.mul(a,b);
        as.div(a,b);
        as.mod(a,b);
    
    
        
    }   
}    
