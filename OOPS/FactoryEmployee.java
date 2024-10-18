//16. Create a subclass called FactoryEmployee, for all factory employees we need to store bus_no, emp_boards.Create a super class related to this subclass.

class Employee {
    private int empId;
    private String empName;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    @Override
    public String toString() {
        return "Employee ID: " + empId + ", Name: " + empName;
    }
    
}
class FactoryEmployee extends Employee {
    private String busNo;
    private String empBoards;

    public FactoryEmployee(int empId, String empName, String busNo, String empBoards) {
        super(empId, empName);
        this.busNo = busNo;
        this.empBoards = empBoards;
    }

    public String getBusNo() {
        return busNo;
    }

    public String getEmpBoards() {
        return empBoards;
    }

    @Override
    public String toString() {
        return super.toString() + ", Bus No: " + busNo + ", Boards: " + empBoards;
    }

    public static void main(String[] args) {
        FactoryEmployee employee1 = new FactoryEmployee(101, "Alice", "B123", "6:30 AM");
        System.out.println(employee1.toString());

        FactoryEmployee employee2 = new FactoryEmployee(102, "Bob", "B456", "7:00 AM");
        System.out.println(employee2.toString());
    }
}
