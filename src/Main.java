import model.Student;

public class Main {
    public static void main(String[] args){
        Student student = new Student("Antony", 22, "Male", "12345678");
        System.out.println(student.getName() + " " + student.getAge() + " " + student.getGender() + " " + student.getId());
    }
}
