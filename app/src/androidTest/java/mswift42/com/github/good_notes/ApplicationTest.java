package mswift42.com.github.good_notes;

import android.app.Application;
import android.test.ApplicationTestCase;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
        TaskTest.task_intitializes_correctly();
        TaskListTest.taskList_withonetask();
        TaskListTest.taskList_getTaskwithId();
    }
}