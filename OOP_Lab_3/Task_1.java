class hello{
    String name = "Hafiz";
    int roll = 18;
    void h(){
        System.out.println("Hello World");
    }

}
class Task_1 {
    static void main(String[] args) {
        hello f = new hello();
        f.h();
        System.out.println(f.name);
        System.out.println(f.roll);
    }
}
