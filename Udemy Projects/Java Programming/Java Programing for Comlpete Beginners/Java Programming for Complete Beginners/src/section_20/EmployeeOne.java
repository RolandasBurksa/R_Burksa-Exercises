package section_20;

public class EmployeeOne  extends StudentOne{
    private String title;
    private String employer;
    private String employeeGrade;
    private int salary;

    public String getTitle() {
        return title;
    }

    public String getEmployer() {
        return employer;
    }

    public String getEmployeeGrade() {
        return employeeGrade;
    }

    public int getSalary() {
        return salary;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public void setEmployeeGrade(String employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return title + " # " + employer + " # " +  salary + " # " + super.getEmail() + " # " + super.getCollageClass();
    }


}
