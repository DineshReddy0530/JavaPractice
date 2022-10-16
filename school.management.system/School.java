import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public School(ArrayList<Teacher> teachers,ArrayList<Student> students){
        this.teachers = teachers;
        this.students = students;
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }
    /**
     * 
     * @return list of teachers in the school
     */
    public List<Teacher> getTeachers(){
        return teachers;
    }
    /**
     * Adds teacher to the school
     * @param teacher to be added to the school
     */
    public void setTeachers(Teacher teacher){
        teachers.add(teacher);
    }
    /**
     * 
     * @return list of students in the school
     */
    public List<Student> getStudents() {
        return this.students;
    }
    /**
     * Adds a student to the school
     * @param student to be added to the school
     */
    public void setStudents(Student student) {
        students.add(student);
    }
    /**
     * 
     * @return Total money earned by the school
     */
    public int getTotalMoneyEarned() {
        return this.totalMoneyEarned;
    }
    /**
     * Adds the total money earned by the school
     * @param moneyEarned money that is supposed to be added
     */
    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }
    /**
     * 
     * @return total money spent by the school
     */
    public int getTotalMoneySpent() {
        return this.totalMoneySpent;
    }
    /**
     * Subtracts money spent on salary of teachers by the school
     * @param moneySpent money spent by the school
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned-= moneySpent;
    }


}
