package mswift42.com.github.good_notes;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TaskTest {
    @Test
    public static void task_intitializes_correctly() {
        Task t1 = new Task();
        assertThat((t1.getID() != null), is(false));
    }
}



