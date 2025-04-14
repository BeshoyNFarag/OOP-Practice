
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Airplane condor = new Airplane(66382, "Leipzig", "12:04:23");
        condor.delay();
        condor.fligthStatus("leipzig");
        condor.showDetails();
    }
}