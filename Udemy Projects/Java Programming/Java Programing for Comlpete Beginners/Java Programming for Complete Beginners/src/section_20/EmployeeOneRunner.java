package section_20;

public class EmployeeOneRunner {

    public static void main(String[] args) {

        EmployeeOne employeeOne = new EmployeeOne();

        employeeOne.setName("VardenisVienas");
        employeeOne.setTitle("Programmer Analist");
        employeeOne.setSalary(567);
        employeeOne.setEmployer("Amazon");
        employeeOne.setCollageClass("Second-One");
        employeeOne.setEmail("vardenis-one@gmail.com");

        System.out.println(employeeOne);
        String employeeValue =  employeeOne.toString();
        System.out.println(employeeValue);


    }
}
