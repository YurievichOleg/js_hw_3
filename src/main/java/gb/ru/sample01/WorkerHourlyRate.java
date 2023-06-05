package gb.ru.sample01;

public class WorkerHourlyRate extends Worker{
    public WorkerHourlyRate(String name, String post, double salary){
        super.name =name;
        super.post = post;
        super.hourlyRate = true;
        super.salary = salary;
    }

    public WorkerHourlyRate(String name, double salary){
        this(name, "worker",  salary);
    }
    @Override
    public boolean getHourlyRate() {
        return this.hourlyRate;
    }

    @Override
    public double getSalary() {
        return this.salary;
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
