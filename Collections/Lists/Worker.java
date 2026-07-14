public class Worker {

    int workerId;
    String workerName;
    String designation;
    double salary;

    public Worker(int workerId, String workerName, String designation, double salary) {
        this.workerId = workerId;
        this.workerName = workerName;
        this.designation = designation;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker ID   : " + workerId +
               "\nWorker Name : " + workerName +
               "\nDesignation : " + designation +
               "\nSalary      : " + salary;
    }
}