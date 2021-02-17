package taskr.repository;

import taskr.domain.Task;
import taskr.domain.TaskPriority;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TaskRepository {
    List<Task> tasks = new ArrayList<>(Arrays.asList(
            new Task("Study", "Java", Arrays.asList("Fun", "Practice"), TaskPriority.HIGH, LocalDate.now(), LocalDate.now()),
            new Task("Read books", "About Java", Arrays.asList("Reading", "Everyday"), TaskPriority.HIGH, LocalDate.now(), LocalDate.now()),
            new Task("Gym", "Be active", Arrays.asList("WorkOut", "Hard"), TaskPriority.MEDIUM, LocalDate.now(), LocalDate.now()),
            new Task("Water", "Drink Water", Arrays.asList("Everyday", "2L"), TaskPriority.MEDIUM, LocalDate.now(), LocalDate.now())
    ));

    public List<Task> findAll() {
        return tasks;
    }

    public List<Task> findByPriority(TaskPriority priority) {
        return null;
    }

}
