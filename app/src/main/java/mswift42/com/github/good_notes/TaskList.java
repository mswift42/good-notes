package mswift42.com.github.good_notes;

import java.util.ArrayList;
import java.util.UUID;

public class TaskList {
   private ArrayList<Task> mTasks;

   public ArrayList<Task> getTasks() {
      return mTasks;
   }

   public void addTask(Task task) {
      mTasks.add(task);
   }

   public Task getTask(UUID id) {
      for (Task t : mTasks) {
         if (t.getID().equals(id)) {
            return t;
         }
      }
      return null;
   }
}
