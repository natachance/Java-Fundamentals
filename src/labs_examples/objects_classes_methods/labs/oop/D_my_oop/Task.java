package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.Date;

public class Task {

    private String title;
    private Date creationDate;
    private Date dueDate;
    private String category;

    public Task(String title, Date creationDate, Date dueDate, String category) {
        this.title = title;
        this.creationDate = creationDate;
        this.dueDate = dueDate;
        this.category = category;
    }

    public Task(){};

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", creationDate=" + creationDate +
                ", dueDate=" + dueDate +
                ", category='" + category + '\'' +
                '}';
    }
}
