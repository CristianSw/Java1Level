package lesson5;

import java.util.HashSet;

public class EmployeeRunner {
    public static void main(String[] args) {


        HashSet<Employee> employees = new HashSet<>();
        employees.add(new Employee("Daniela", "Dolinta", "Admin Helper",
                "daniela.dolinta@unclesam.com", "37312345678", 9000, 21));
        employees.add(new Employee("Cristian", "Dolinta", "Administrator",
                "cristian.dolinta@unclesam.com", "37312345678", 15000, 22));
        employees.add(new Employee("Cristin", "Burduja", "Founder",
                "cristin.burduja@unclesam.com", "37312345678", 10000, 22));
        employees.add(new Employee("Test", "Person", "Test Position",
                "test.email@unclesam.com", "37312345678", 9000, 41));
        employees.add(new Employee("Test", "Person", "Test Position",
                "test.email@unclesam.com", "37312345678", 9000, 41));

        employeeOlder40(employees);

    }

    private static void employeeOlder40(final HashSet<Employee> employees) {
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.displayEmployee();
            }
        }
    }
}

