class Order{
    int orderNo = 104;
}
class Customer{
    String name = "Noor";
    void placeOrder(Order order){
        System.out.println(name + " placed order " + order.orderNo);
    }
}
public class Task4
{
    static void main(String[] args) {
        Order o1 = new Order();
        Customer c1 = new Customer();
        c1.placeOrder(o1);
    }
}
