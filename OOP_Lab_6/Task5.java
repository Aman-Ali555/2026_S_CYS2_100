class Teacher {
    String name;
    Teacher(String name) {
        this.name = name;
    }
}

class Department {
    String teacher;
    public Department(String teacher) {
        this.teacher = teacher;
    }

    void t(){
        System.out.println("Hello World");
    }
}


public class Task5 {
        public static void main(String[] args) {
            Teacher t1 = new Teacher("Ali");
            Department d1 = new Department("Ali");
            System.out.println(d1.teacher);
            d1.t();

    }
}
