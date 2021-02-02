package tasks;

import java.util.ArrayList;
import java.util.List;


public class TaskRepository {
    List<Task> list = new ArrayList<>();

    public boolean addTask(Task newTask) {
        list.add(newTask);
        return true;
    }
}
