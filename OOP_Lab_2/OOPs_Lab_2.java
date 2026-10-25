import java.util.Scanner;

public class OOPs_Lab_2

{
        static void main(String[] args)
        {
            System.out.println("Hafiz Aman Ali");
            System.out.print("a");
            System.out.print("b");
            System.out.println("line1 \nline2");
            int x=10;
            System.out.println(x);
            x=20;
            System.out.println(x);
            String v="Aman Ali";
            System.out.println(v); 

            char v1='A';
            System.out.println(v1);
            float q = 7.3f;
            System.out.println(q);

            double p= 7.3;
            System.out.println(p);

            System.out.println((float)3.7);
            System.out.println((int)3.7);
            Long c= 10000000000L;
            System.out.println(c);
            String a ="10";
            String b ="11";
            System.out.println(a+b);

            int a1=Integer.parseInt("10");
            int b1=Integer.parseInt("11");
            System.out.println(a1+b1);

            System.out.println(Math.pow(2,10));
            System.out.println(7.0/2);
            System.out.println(7/2.0);

            System.out.println(Math.sqrt(4));
            System.out.println(Math.sqrt(1/1));

            System.out.println(Math.floor(3.7));

            System.out.println(Math.ceil(3.7));

            System.out.println(Math.abs(-1));

            System.out.println(Math.round(3.7));
            System.out.println(Math.round(3.5));
            System.out.println(Math.random());
//
//        int s=10;
//        int t=s+5;
//        System.out.println(++t);
//        System.out.println(--t);

            Scanner l=new Scanner(System.in);
            System.out.println("Enter your roll number");
            int roll=l.nextInt();
            System.out.println(roll);
            System.out.println("enter your total marks");
            double marks=l.nextInt();
            System.out.println(marks);
            System.out.println("enter your obtained marks");
            double obtained=l.nextInt();
            System.out.println(obtained);
            double percentage=(obtained*100)/marks;
            System.out.println("percentage is "+percentage);
        }
}

