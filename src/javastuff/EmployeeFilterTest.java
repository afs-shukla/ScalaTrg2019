package javastuff;

import java.util.ArrayList;
import java.util.List;

public class EmployeeFilterTest {

    private static List<String> filterEmployee(List<Employee> employees , Double amt) {
        List<String> names = new ArrayList<String>();
        for(Employee emp: employees){
            System.out.println(emp.toString());
            if(emp.getSal() >= amt){
                names.add(emp.getEmpName());
            }
        }
        return names;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("satish", 30, 40000.00));
        employees.add(new Employee("Harish", 35, 30000.00));
        employees.add(new Employee("Kunal", 26, 70000.00));
        employees.add(new Employee("Geetha", 30, 80000.00));
        employees.add(new Employee("Guru", 32, 20000.00));
        employees.add(new Employee("Jignesh", 24, 70000.00));
        employees.add(new Employee("anjuman", 37, 45000.00));
        employees.add(new Employee("Gulfam", 50, 60000.00));
        employees.add(new Employee("Abdul", 44, 48000.00));
        employees.add(new Employee("Mark", 30, 50000.00));
        System.out.println( employees);
        System.out.println( filterEmployee(employees,80000.00));

        }
    }

