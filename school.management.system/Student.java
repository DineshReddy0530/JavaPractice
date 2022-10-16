public class Student{
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;
    
    /**
     * To create a new student 
     * Fees paid initially is 0
     * Fees for every student is $30000
     * @param id -  id of the Student
     * @param name - name of the Student
     * @param grade - grade of the Student
     */
    public Student(int id,String name,int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid =0;
        this.feesTotal = 30000;
    }

    // Not going to alter student's id and name
    /**
     * This function is used to update the student grade
     * @param grade - new grade of the student
     */
    public void setGrade(int grade){
        this.grade = grade;
    }

    /**
     * School is going to receive funds from the student
     * Add the fees to the feesPaid
     * @param fees - fees paid by the student
     */
    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(fees);
    }
    /**
     * 
     * @return remaining fees
     */
    public String getRemainingFees(){
        return "Remaining fees to be paid by "+ getName()+" is "+(feesTotal-feesPaid);
    }
    /**
     * 
     * @return id of the student
     */
    public int getId() {
        return this.id;
    }
    /**
     * 
     * @return name of the student
     */
    public String getName() {
        return this.name;
    }
    /**
     * 
     * @return grade of the student
     */
    public int getGrade() {
        return this.grade;
    }
    /**
     * 
     * @return fees paid by the student
     */
    public String getFeesPaid() {
        return "Fee paid by "+getName()+" is "+ this.feesPaid;
    }
    /**
     * 
     * @return total fees of the student
     */
    public String getFeesTotal() {
        return "Total fees for "+getName()+" is "+this.feesTotal;
    }



    
}