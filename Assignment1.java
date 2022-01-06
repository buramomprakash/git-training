package Assignment;

public class Assignment1 {
    
    public void add(int a , int b){
        int sum= a+b;
       System.out.println("additon of two numbers is :" +sum);
    }   
    public void sub(int a , int b){
        int sub= a-b;
       System.out.println("subtractiton of two numbers is :" +sub);
    }   
    public void mul(int a , int b){
        int mul= a*b;
       System.out.println("multplication of two numbers is :" +mul);
    }   
    public void div(int a , int b){
        double div= a/b;
       System.out.println("division of two numbers is :" +div);
    }   
    public void mod(int a , int b){
        int mod= a%b;
       System.out.println("Modulus of two numbers is :" +mod);
    } 
    
    public static void main(String[] args) {
        int a=20 , b=10 ;
        Assignment1 as=new Assignment1();
        as.add(a,b);
        as.sub(a,b);
        as.mul(a,b);
        as.div(a,b);
        as.mod(a,b);
    
    
        
    }
}
