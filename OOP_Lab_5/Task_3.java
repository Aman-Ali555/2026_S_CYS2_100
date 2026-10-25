import java.util.Scanner;

class Data
{
    int number;
    private String roll;
    private int m_n;
    private int e_n;

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public int getM_n() {
        return m_n;
    }

    public void setM_n(int m_n) {
        this.m_n = m_n;
    }

    public int getE_n() {
        return e_n;
    }

    public void setE_n(int e_n) {
        this.e_n = e_n;
    }

    public Data() {
    }

    public Data(int number, String roll, int m_n, int e_n)
    {

        this.number = number;
        this.roll = roll;
        this.m_n = m_n;
        this.e_n = e_n;
    }
    void display(int n)
    {
        System.out.println("Enter total number of students: ");


    }

}
public class Task_3
{
    static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Data dt = new Data();
        int n = sc.nextInt();
        dt.display(n);
    }
}
