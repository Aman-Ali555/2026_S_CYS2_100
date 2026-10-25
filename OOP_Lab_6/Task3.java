class Player{
    String name = "Hamza";
}
class Coach{
    void train(Player p)
    {
        System.out.println("Coach is training " + p.name);
    }
}
public class Task3 {
    static void main(String[] args) {
        Player p = new Player();
        Coach c = new Coach();
        c.train(p);
    }
}
