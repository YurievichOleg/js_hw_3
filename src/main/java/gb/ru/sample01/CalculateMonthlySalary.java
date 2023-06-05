package gb.ru.sample01;

public interface CalculateMonthlySalary {
    boolean getHourlyRate();
    double getSalary();
    default double calculateMonthlySalary(){
        double salary;
        if(getHourlyRate()){
            salary = 20.8 * 8 * getSalary();
        } else {
            salary = getSalary();
        }
        return salary;
    }
}
