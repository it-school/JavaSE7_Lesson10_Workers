import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(new HourlyWorker(1, 1340, "Serge"));
        workers.add(new FixedWorker(2, 1590, "Kirill"));
        workers.add(new FixedWorker(3, 1290, "Andrey"));

        for (Worker worker : workers) {
            System.out.println(worker.toString());
        }

    }
}
