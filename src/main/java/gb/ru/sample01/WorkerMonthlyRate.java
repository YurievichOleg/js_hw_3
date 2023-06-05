package gb.ru.sample01;

public class WorkerMonthlyRate extends Worker {
    public WorkerMonthlyRate(String name, String post, double salary){
        super.name = name;
        super.post = post;
        super.hourlyRate = false;
        super.salary = salary;
    }
    public WorkerMonthlyRate(String name, double salary){
        this(name, "worker", salary);
    }

    @Override
    public boolean getHourlyRate() {
        return false;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public double calculateMonthlySalary() {
        return super.calculateMonthlySalary();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
