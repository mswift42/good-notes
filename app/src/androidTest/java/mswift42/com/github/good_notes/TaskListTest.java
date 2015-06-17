package mswift42.com.github.good_notes;

import org.junit.Test;
import static org.junit.Assert.*;

public class TaskListTest {
    @Test
    public static void taskList_withonetask () {
        TaskList tasks = new TaskList();
        assertEquals(tasks.getTasks().size(),0);
        Task task = new Task();
        task.setSummary("task1");
        tasks.addTask(task);
        assertEquals(tasks.getTasks().size(),1);
    }
}
