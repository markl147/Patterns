public class FactoryTester {

    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee(10, 10.50);
        System.out.println(employee.getHourlyRate());

        Employee employee1 = EmployeeFactory.getEmployee(40, 10.50);
        System.out.println(employee1.getHourlyRate());


    }
}
