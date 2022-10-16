import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(1, "Lizzy", 1000);
        Teacher teacher2 = new Teacher(2, "Mitchel", 1500);
        Teacher teacher3 = new Teacher(3, "Robinson", 1000);
        ArrayList<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);

        Student student1 = new Student(1, "Dinesh", 4);
        Student student2 = new Student(2, "Reddy", 12);
        Student student3 = new Student(3, "Honey", 5);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        School ghs = new School(teacherList, studentList);
        student1.payFees(5000);
        System.out.println(student1.getFeesPaid());
        System.out.println(student1.getFeesTotal());
        System.out.println(student1.getRemainingFees());
        System.out.println("GHS has earned "+ghs.getTotalMoneyEarned());
        student2.payFees(10000);
        System.out.println(student2.getRemainingFees());
        System.out.println("GHS has earned "+ghs.getTotalMoneyEarned());
        teacher1.setSalary(1000);
        teacher1.receiveSalary(teacher1.getSalary());
        System.out.println("GHS paid salary to "+teacher1.getName()+" and has remaining amount "+ghs.getTotalMoneyEarned());
    }
    
}
