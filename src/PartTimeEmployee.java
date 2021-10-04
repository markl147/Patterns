public class PartTimeEmployee extends Employee {

    private  double hourlyRate;
    public PartTimeEmployee(double hr) {
        this.hourlyRate = hr;
    }
    @Override
    public double getHourlyRate(){
        return this.hourlyRate;
    }

}
