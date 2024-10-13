// EmployeeCollection.java
public interface EmployeeCollection {
    Iterator createIterator();  // Create an iterator for the collection
    void addEmployee(Context employee);  // Add an employee to the collection
}