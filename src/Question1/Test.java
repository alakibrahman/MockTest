package Question1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    @Test
    public void testWorkerToString() {
        Worker worker = new Worker("Nabil", 30000);
        String expected = "Worker{name='Nabil', salary=30000.0}";
        assertEquals(expected, worker.toString());
    }
    @Test
    public void testSupervisorToString1() {
        Supervisor worker = new Supervisor("Kuddus", 40000, "service");
        String expected = "{Worker{name='Kuddus', salary=40000.0} {divisionName='service'}";
        assertEquals(expected, worker.toString());
    }

}
