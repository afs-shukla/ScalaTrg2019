package javastuff;

public class Employee {
    private String empName;
    private Integer age;

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", age=" + age +
                ", sal=" + sal +
                '}';
    }

    private Double sal;

    public Employee(String empName, int age, double sal) {
        this.empName = empName;
        this.age = age;
        this.sal = sal;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }



}
