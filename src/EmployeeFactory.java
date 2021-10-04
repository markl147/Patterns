public class EmployeeFactory {

    public static Employee getEmployee(int hoursAllocated, double hourlyRate) {
        if(hoursAllocated >= 20) {
            return new FullTimeEmployee(hourlyRate);
        } else {
            return new PartTimeEmployee(hourlyRate);
        }
    }

}
