package section_20;

import java.math.BigDecimal;

public class EmployeeWithConstructor extends PersonWithConstructor{
    private String title;
    private String employerName;
    private char employerGrade;
    private BigDecimal salary;

    public EmployeeWithConstructor() {
        // calls super() class first
        System.out.println("Employee Constructor");
    }

    public EmployeeWithConstructor(String name, BigDecimal salary) {
        super(name);
        this.salary = salary;
    }

}
