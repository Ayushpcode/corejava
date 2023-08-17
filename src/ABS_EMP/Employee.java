package ABS_EMP;

abstract class Employee {
    private String name;
    private int employeeId;
    private Employee() {}

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }
    abstract double calculateSalary();
}
