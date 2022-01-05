package collections;

import java.util.*;

public class OrderProcess {

    public static void main(String[] args) {
        List<Item>items=new ArrayList<>();
        
        items.add(new Item("Soap-Pears",2,65.78));
        items.add(new Item("Biscuit-Bourbon",5,14.89));
        items.add(new Item("Oil-Freedom",1,145.35));
        items.add(new Item("Frangrance-Fogg",1,265.32));
        items.add(new Item("Flour-Atta",1,28.44));

        Order order =new Order(1,"lion",items);
        order.displayOrder();
        
    }
    
}
class Order{
    private int orderId;
    private String customername;
    private List<Item>items;
    private double netTotal;


    public Order(int orderId,String customername , List<Item> items){
       this.orderId=orderId;
       this.customername=customername;
       this.items=items;
       this.netTotal=0;
       for(Item item:items){
        netTotal += item.getPrice();
        }
    }


    public int getOrderId() {
        return orderId;
    }


    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }


    public String getCustomername() {
        return customername;
    }


    public void setCustomername(String customername) {
        this.customername = customername;
    }


    public List<Item> getItems() {
        return items;
    }


    public void setItems(List<Item> items) {
        this.items = items;
    }


    public double getNetTotal() {
        return netTotal;
    }


    public void setNetTotal(double netTotal) {
        this.netTotal = netTotal;
    }
 public void displayOrder(){
    System.out.printf("Order Id: %d %100s %n", orderId , customername);
    System.out.printf("%50s , %n","Items");
    for(Item item:items){
        System.out.printf("%20s , %d , %4.2f %4.2f %n",
        item.getName(),item.getQuantity(),item.getPrice(),item.getTotalCost());
    }
    System.out.printf("=========%n");
    System.out.printf("NetTotal:%4.2f %n",netTotal);
 }

    
}

class Item{
    private String name;
    private int quantity;
    private double price;
    private double totalCost;

    public Item(String name,int quantity,double price){
        this.name=name;
        this.quantity=quantity;
        this.price=price;
        this.totalCost=quantity*price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
    
}