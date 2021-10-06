package comp.comp152;

public class SalaryEmployee extends Employee{

    private double yearlySalary;

    public SalaryEmployee(double salary){
        yearlySalary = salary;
    }

    @Override
    public double calculateBiWeeklyPay() {
        return 0;
    }
}
