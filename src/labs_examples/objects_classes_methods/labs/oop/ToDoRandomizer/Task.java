package labs_examples.objects_classes_methods.labs.oop.ToDoRandomizer;

public class Task {
    String title;

    public Task() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
