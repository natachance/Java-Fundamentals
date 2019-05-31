package labs_examples.objects_classes_methods.labs.oop.ToDoRandomizer;

public class Task {
    String title;
    int idNumber;
    int lastIdNumber;

    public Task() {
        idNumber = lastIdNumber + 1;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getLastIdNumber() {
        return lastIdNumber;
    }

    @Override
    public String toString() {
        return idNumber + ". " +
                title;
    }
}
