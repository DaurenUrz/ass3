// IteratorPatternDemo.java
public class IteratorPatternDemo {
    public static void main(String[] args) {
        // Create an employee collection
        EmployeeList employeeList = new EmployeeList(3);
        employeeList.addEmployee(new Context("John", 25, 3000.0));
        employeeList.addEmployee(new Context("Jane", 32, 4500.0));
        employeeList.addEmployee(new Context("Mike", 28, 2000.0));

        // Create an iterator for the employee list
        Iterator iterator = employeeList.createIterator();

        // Iterate through the employee list
        while (iterator.hasNext()) {
            Context employee = iterator.next();
            System.out.println(employee);
        }
    }
}