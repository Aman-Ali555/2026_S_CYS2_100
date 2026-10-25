class abc
{
    private String name;
    private int roll;

    public abc(String name, int roll)
    {
        this.name = name;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll()
    {
        return roll;
    }

    public void setRoll(int roll)
    {
            this.roll=roll;
    }
}
public class Task_2
{
    static void main(String[] args)
    {
        abc a = new abc("Hafiz Aman Ali",100);
        abc b = new abc("Haseeb",110);
        System.out.println(a.getName());
        System.out.println(a.getRoll());
        System.out.println(b.getName()+"\n"+b.getRoll());
    }
}