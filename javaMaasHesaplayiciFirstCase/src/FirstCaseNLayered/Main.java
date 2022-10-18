package FirstCaseNLayered;

import FirstCaseNLayered.business.EmployeeManager;
import FirstCaseNLayered.entities.Employee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Employee employee = new Employee();
        employee.setId(1);
        System.out.print("Full Name:");
        employee.setName(scanner.nextLine());
        System.out.print("Salary:");
        employee.setSalary(scanner.nextDouble());
        System.out.print("Work Hours:");
        employee.setWorkHours(scanner.nextInt());
        System.out.print("Hire Year:");
        employee.setHireYear(scanner.nextInt());
        System.out.println("---------------------------------------------------------");


        EmployeeManager employeeManager = new EmployeeManager(employee);
        employeeManager.printConsole();

    }
}
