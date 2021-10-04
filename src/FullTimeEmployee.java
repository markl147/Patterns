public class FullTimeEmployee extends Employee {

    private  double hourlyRate;
    public FullTimeEmployee(double hr) {
        this.hourlyRate = hr;
    }
    @Override
    public double getHourlyRate(){
        return this.hourlyRate;
    }
}
