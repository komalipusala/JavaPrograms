public class Employee {
    private String name;
    private int salary;
    public void init(String n, int sal) {
        name = n;
        salary = sal;
    }
    public void print() {
        System.out.println(name);
        System.out.println(salary);
    }

    public void setSalary(int sal) {
        salary = sal;
    }
    public int getSalary() { 
        return salary;
    }

    public class TestEmployee {
        public static void main(String[] args) {
            Employee e;
            e = new Employee();

            e.init("john", 35000);
            e.print();
            e.setSalary(55000);

            if(e.getSalary() > 50000){
                System.out.println("Fat salary");
            }
        }
    }
}