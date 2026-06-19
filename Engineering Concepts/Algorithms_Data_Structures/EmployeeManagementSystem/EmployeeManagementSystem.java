public class EmployeeManagementSystem {

    static class Employee {
        int employeeId;
        String name;
        String position;
        double salary;

        public Employee(int employeeId, String name,
                        String position, double salary) {
            this.employeeId = employeeId;
            this.name = name;
            this.position = position;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee ID: " + employeeId +
                   ", Name: " + name +
                   ", Position: " + position +
                   ", Salary: $" + salary;
        }
    }

    private Employee[] employees;
    private int size;

    public EmployeeManagementSystem(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    public void addEmployee(Employee employee) {
        if (size < employees.length) {
            employees[size] = employee;
            size++;
            System.out.println("Employee added successfully.");
        } else {
            System.out.println("Employee array is full.");
        }
    }

    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    public void traverseEmployees() {
        if (size == 0) {
            System.out.println("No employees found.");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public void deleteEmployee(int employeeId) {

        int index = -1;

        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == employeeId) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Employee not found.");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            employees[i] = employees[i + 1];
        }

        employees[size - 1] = null;
        size--;

        System.out.println("Employee deleted successfully.");
    }

    public static void main(String[] args) {

        EmployeeManagementSystem system =
                new EmployeeManagementSystem(10);

        system.addEmployee(
                new Employee(101, "John", "Manager", 75000));

        system.addEmployee(
                new Employee(102, "Alice", "Developer", 60000));

        system.addEmployee(
                new Employee(103, "Bob", "Tester", 50000));

        System.out.println("\nEmployee Records:");
        system.traverseEmployees();

        System.out.println("\nSearching Employee ID 102:");

        Employee emp = system.searchEmployee(102);

        if (emp != null)
            System.out.println(emp);
        else
            System.out.println("Employee not found.");

        System.out.println("\nDeleting Employee ID 102:");
        system.deleteEmployee(102);

        System.out.println("\nEmployee Records After Deletion:");
        system.traverseEmployees();
    }
}