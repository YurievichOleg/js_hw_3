package gb.ru.sample01;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayWorker {
    ArrayList<Worker> workers;
    public ArrayWorker(){
        workers = new ArrayList<>();
    }
    public void add(Worker worker){
        workers.add(worker);
    }

    @Override
    public String toString() {
        String outWorkers = "";
        for (Worker worker :
                workers) {
            outWorkers += worker.toString() + "\n";
        }
        return outWorkers;
    }
    public void sort(){
        Collections.sort(workers);
    }
}
