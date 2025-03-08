package lt.techin;

import java.util.Scanner;

public class EmployeeController {

    public static void main(String[] args) {

        System.out.println("Input Id:");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        System.out.println("Employee id = " + id);

        EmployeeView view = new EmployeeView();

        Employee model = getDataFromDatabase(id);
        view.showDetails(model);

        System.out.println("- - - - - -");

        model.setDepartment("Java");
        System.out.println("After update: ");
        view.showDetails(model);
    }

    private static Employee getDataFromDatabase(int id) {

        Employee emp = new Employee();
        if (id == 101) {
            emp.setName("John");
            emp.setDepartment("Python");
        }
        return emp;
    }
}
