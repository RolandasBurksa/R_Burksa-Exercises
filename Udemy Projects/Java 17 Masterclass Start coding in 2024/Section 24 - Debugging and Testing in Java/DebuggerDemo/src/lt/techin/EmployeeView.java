package lt.techin;

public class EmployeeView {

    public void showDetails (Employee data) {

        System.out.println("Employee: " + data.getName());
        System.out.println("Department: " + data.getDepartment());
    }
}
