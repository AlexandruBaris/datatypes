package taskr.service;

import taskr.domain.Task;
import taskr.domain.TaskPriority;
import taskr.repository.TaskRepository;

import java.time.LocalDate;
import java.util.List;

public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getByPriority(TaskPriority taskPriority) {
        return taskRepository.findByPriority(taskPriority);
    }

    public List<Task> getAll() {
        return taskRepository.findAll();
    }

    public List<Task> getForToday() {
        return taskRepository.findByDate(LocalDate.now());
    }

    public boolean save(Task task) {
        return taskRepository.save(task);
    }

    public boolean update(Task task) {
        return taskRepository.save(task);
    }

    public boolean delete(Task task) {
        return taskRepository.delete(task);
    }

    public Task getById(String id) {
        return taskRepository.findById(id);
    }

}