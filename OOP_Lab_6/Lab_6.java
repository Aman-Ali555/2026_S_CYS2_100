class Student{
    String name = "Aman";
    int m = 100;
}
class teacher{
    void tec(Student s){
        System.out.println(s.name);
    }
    void ttt(Student d) {
        System.out.println(d.m);
    }
}

public class Lab_6 {
    static void main(String[] args) {
        Student st = new Student();
        teacher tc = new teacher();
        tc.tec(st);
        tc.ttt(st);
    }
}
