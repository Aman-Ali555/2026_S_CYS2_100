class Info
{
    private String name;
    private int roll;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getRoll()
    {
        return roll;
    }

    public void setRoll(int roll)
    {
        this.roll = roll;
    }
}
public class Task_1
{
    static void main(String[] args) {
        Info i = new Info();
        i.setName("Hafiz Aman Ali");
        i.setRoll(100);
        System.out.print("Name: "+i.getName()+"\nRoll no.: "+i.getRoll());
    }
}
