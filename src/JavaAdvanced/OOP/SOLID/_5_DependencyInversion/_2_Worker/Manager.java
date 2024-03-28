package JavaAdvanced.OOP.SOLID._5_DependencyInversion._2_Worker;

public class Manager {

    public Manager() {
        Worker worker = new Worker();
        worker.work();
    }
}
