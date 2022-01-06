package collections;
import java.util.*;


public class CollectionsDemo {
    public static void main(String[] args){
        ListDemo sd = new ListDemo();
       sd.find(8);
       sd.find(20);
    }

    
}

class ListDemo{
    List<Integer> num;
    //private Iterator<Integer> iterator;

    public ListDemo(){
        num=new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(7);
        num.add(6);
        num.add(3);
        num.add(2);
        num.add(8);
    }
    public void printList(){

       // iterator= num.iterator();
       // while(iterator.hasNext()){
         //   System.out.println(iterator.next());
        // }


        for(Integer i : num){
            System.out.println(i);
        }
    }
    public void find(Integer i){
        if(num.contains(i)){
            System.out.format("found %d at Location %d %n", i, num.indexOf(i));
        }else{
             System.out.format("%d not found %n", i);
        }
    }

}





class SetDemo{
    Set<Integer> num;

    public void createSet(){
        num=new HashSet<>();
        num.add(1);
        num.add(2);
        num.add(5);
        num.add(6);
        num.add(4);
        num.add(2);
        num.add(1);
    
    }

  public void printSet(){
    for(Integer i:num){
       System.out.println(i);
       }
    }
    
}