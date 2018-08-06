public class HourlyWorker implements Worker {
    int ID;
    double pay;
    String name;

    public HourlyWorker(int ID, double pay, String name) {
        this.ID = ID;
        this.pay = pay;
        this.name = name;
    }

    @Override
    public double pay() {
        return 20.8 * 8 * pay;
    }

    @Override
    public String toString() {
        return "HourlyWorker{" +
                "ID=" + ID +
                ", pay=" + pay() +
                ", name='" + name + '\'' +
                '}';
    }
}
