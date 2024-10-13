// EmployeeList.java
public class EmployeeList implements EmployeeCollection {
    private Context[] employees;
    private int index = 0;

    public EmployeeList(int size) {
        employees = new Context[size];
    }

    @Override
    public void addEmployee(Context employee) {
        if (index < employees.length) {
            employees[index++] = employee;
        }
    }

    @Override
    public Iterator createIterator() {
        return new EmployeeIterator();
    }

    // Inner class for the iterator implementation
    private class EmployeeIterator implements Iterator {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < index;
        }

        @Override
        public Context next() {
            return employees[currentIndex++];
        }
    }
}