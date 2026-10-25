class Teach{
    String name;
    Teach(String name){
        this.name = name;
    }
}
class School{
    Teach teacher;
    School(Teach teacher){
        this.teacher = teacher;
    }
}
public class Task6 {
    static void main(String[] args) {
        Teach t1 = new Teach("Ali");
        School s1 = new School(t1);
        System.out.println(s1.teacher.name);
    }
}
