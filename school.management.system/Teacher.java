public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;
    /**
     * Creates a new Teacher's object
     * @param id - id of the teacher
     * @param name - name of the teacher
     * @param salary - salary of the teacher
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }
    /**
     * 
     * @return id of the teacher
     */
    public int getId() {
        return this.id;
    }
    /**
     * 
     * @return name of the teacher
     */
    public String getName() {
        return this.name;
    }
    /**
     * 
     * @return salary of the teacher
     */
    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
    
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }
    
}
