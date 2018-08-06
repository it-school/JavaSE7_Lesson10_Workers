public class FixedWorker implements Worker {
    int ID;
    double pay;
    String name;



    public FixedWorker(int ID, double pay, String name) {
        this.ID = ID;
        this.pay = pay;
        this.name = name;
    }

    @Override
    public double pay() {
        return pay;
    }

    @Override
    public String toString() {
        return "FixedWorker{" +
                "ID=" + ID +
                ", pay=" + pay() +
                ", name='" + name + '\'' +
                '}';
    }
}
