package taskr.repository;

import taskr.domain.Task;
import taskr.domain.TaskPriority;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TaskRepository {
    List<Task> tasks = new ArrayList<>(Arrays.asList(
            new Task("Study", "Java", Arrays.asList(""), TaskPriority.HIGH, LocalDate.now(), LocalDate.now())
    )

    );


}
