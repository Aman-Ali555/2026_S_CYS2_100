import java.util.Scanner;

public class Task_3 {
    static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter time: ");
        int t = sc.nextInt();
        int a = t/60;
        int b = t%60;
        if (a<12)
        {
            System.out.println(a+":" +b+" AM");

        }
        if (a>12)
        {
            System.out.println(a+":" +b+" PM");
        }



    }
}
