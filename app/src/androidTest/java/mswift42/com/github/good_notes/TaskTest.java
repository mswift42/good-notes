package mswift42.com.github.good_notes;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

public class TaskTest {
    @Test
    public static void task_intitializes_correctly() {
        Task t1 = new Task();
        assertFalse((t1.getID() == null));
        t1.setSummary("task1");
        assertEquals(t1.getSummary(), "task1");
    }
    public void task_scheduled_setsgets_date() {
        Task t1 = new Task();
        Date d1 = new Date();
        t1.setScheduled(d1);
        assertEquals(d1, t1.getScheduled());
    }
}



