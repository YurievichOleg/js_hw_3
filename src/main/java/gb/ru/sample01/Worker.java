package gb.ru.sample01;

public abstract class Worker implements CalculateMonthlySalary, Comparable<Worker>{
    protected String name;
    protected String post;
    protected boolean hourlyRate;
    protected double salary;

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", post='" + post + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", salary=" + salary +
                ", month salary=" + this.calculateMonthlySalary() +
                '}';
    }

    @Override
    public int compareTo(Worker o) {
        if(o.calculateMonthlySalary() < this.calculateMonthlySalary()){
            return 1;
        } else if (this.calculateMonthlySalary() < o.calculateMonthlySalary()) {
            return -1;
        }else {
            return 0;
        }
    }
}
