class Patient{
    String name = "Ahmed";
}
class Doctor{
    void CheckingPatient(Patient p){
        System.out.println("Dr. Sara is checking " + p.name);
    }
}
public class Task2 {
    static void main(String[] args) {
        Patient p = new Patient();
        Doctor dr = new Doctor();
        dr.CheckingPatient(p);
    }
}
