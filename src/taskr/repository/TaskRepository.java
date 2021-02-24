package taskr.repository;

import taskr.domain.Task;
import taskr.domain.TaskPriority;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;


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
        List<Task> list = new ArrayList<>();
        for (Task t : tasks) {
            if (t.priority == priority) list.add(t);
        }
        return list;
    }

    public List<Task> findByDate(LocalDate date) {
        List<Task> list = new ArrayList<>();
        for (Task t : tasks) if (isBetween(date, t.getStartDate(), t.getEndDate())) list.add(t);
        return list;
    }

    private boolean isBetween(LocalDate date, LocalDate startDate, LocalDate endDate) {
        return (date.compareTo(startDate) >= 0) || ((date.compareTo(startDate) >= 0) && (date.compareTo(endDate) >= 0));
    }

    public boolean save(Task task) {
        return tasks.add(task);
    }

    public boolean delete(Task task) {
        return tasks.remove(task);
    }

    public Task findById(String taskId) {
        for (Task t : tasks) {
            if (t.getId().equals(taskId)) {
                return t;
            }
        }
        Task empty = null;
        throw new NoSuchElementException();
    }

}
