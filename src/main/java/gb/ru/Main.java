package gb.ru;

import gb.ru.sample01.ArrayWorker;
import gb.ru.sample01.Worker;
import gb.ru.sample01.WorkerHourlyRate;
import gb.ru.sample01.WorkerMonthlyRate;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {


        Worker worker1 = new WorkerHourlyRate("Oleg", 1000);
        Worker worker2 = new WorkerMonthlyRate("Petr", 123123);
        Worker worker3 = new WorkerMonthlyRate("Ivan", 100000);

       
        ArrayList<Worker> list = new ArrayList<>();
        list.add(worker1);
        list.add(worker2);

        for (Worker worker:list
             ) {
            System.out.println(worker.toString());
        }
        Collections.sort(list);
        for (Worker worker :
                list) {
            System.out.println(worker.toString());
            System.out.println(worker.calculateMonthlySalary());
        }

        ArrayWorker workers1 = new ArrayWorker();
        workers1.add(worker1);
        workers1.add(worker2);
        workers1.add(worker3);
        System.out.println(workers1.toString());
        workers1.sort();
        System.out.println(workers1.toString());

    }


}