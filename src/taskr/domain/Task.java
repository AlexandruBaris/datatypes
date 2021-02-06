package taskr.domain;

import java.time.LocalDate;
import java.util.List;

public class Task {
    public String description;
    public String title;
    public String id;
    public List<String> tags;
    public TaskPriority priority;

    public LocalDate startDate;
    public LocalDate endDate;

    public Task(String title, String description, List<String> tags, TaskPriority priority, LocalDate startDate, LocalDate endDate) {
        this.title = title;
        this.description = description;
        this.tags = tags;
        this.priority = priority;
        this.startDate = startDate;
        this.endDate = endDate;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public void setPriority(TaskPriority priority) {
        this.priority = priority;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }


}
