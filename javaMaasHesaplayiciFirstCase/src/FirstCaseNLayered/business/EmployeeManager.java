package FirstCaseNLayered.business;


import FirstCaseNLayered.entities.Employee;

import java.util.Scanner;

public class EmployeeManager{

    private Employee employee;

    public EmployeeManager(Employee employee) {
        this.employee = employee;
    }

    public double tax() {
        double calculatedTax;
        double taxRate = 0.03;
        if (employee.getSalary() <= 1000) {
            calculatedTax = 0;
        } else {
            calculatedTax = employee.getSalary() * taxRate;
        }
        return calculatedTax;
    }

    public double bonus() {

        double bonus = 30;
        double totalBonus;
        int extraWorkHours;

        if (employee.getWorkHours() > 40) {
            extraWorkHours = employee.getWorkHours() - 40;
            totalBonus = extraWorkHours * bonus;
        } else {
            extraWorkHours = 0;
            totalBonus = 0;
        }
        return totalBonus;
    }

    public double raiseSalary() {
        int currentDate = 2021;
        double Salary = employee.getSalary();
        double increaseSalary;

        if (currentDate - employee.getHireYear() < 10) {
            increaseSalary = Salary * 0.05;
        } else if (currentDate - employee.getHireYear() > 9 && currentDate - employee.getHireYear() < 20) {
            increaseSalary = Salary * 0.1;
        } else {
            increaseSalary = Salary * 0.15;
        }


        return increaseSalary;
    }

    public void printConsole() {

        String name = employee.getName();
        double salary = employee.getSalary();
        int workHours = employee.getWorkHours();
        int hireYear = employee.getHireYear();
        double tax = tax();
        double bonus = bonus();
        double raiseSalary = raiseSalary();
        double netSalary = salary - tax + bonus;
        double totalSalary = netSalary + raiseSalary;


        System.out.print("Adı : ");
        System.out.println(name);
        System.out.print("Maaşı : ");
        System.out.println(salary);
        System.out.print("Çalışma Saati : ");
        System.out.println(workHours);
        System.out.print("Başlangıç Yılı: ");
        System.out.println(hireYear);
        System.out.print("Vergi: ");
        System.out.println(tax);
        System.out.print("Bonus : ");
        System.out.println(bonus);
        System.out.print("Maaş Artışı : ");
        System.out.println(raiseSalary);
        System.out.print("Vergi ve Bonuslar ile birlikte maaş : ");
        System.out.println(netSalary);
        System.out.print("Toplam Maaş: ");
        System.out.println(totalSalary);


    }

}
