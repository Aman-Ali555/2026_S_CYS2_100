class Std{
    void name(){
        System.out.println("Aman");
        System.out.println(100);
    }
}
class Dis {
    void display(Std s) {
        s.name();
    }
}
public class Task1
{
    public static void main(String[] args) {
        Std st = new Std();
        Dis d = new Dis();
        d.display(st);

    }
}
