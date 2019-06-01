package labs_examples.objects_classes_methods.labs.oop.ToDoRandomizer;

public class Task {
    String title;
    int idNumber;
//    int idCounter = 0;

    public Task() {
//        idNumber = idCounter + 1; //how to capture +1 to idCounter here? to keep adding?
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

    @Override
    public String toString() {
        return
//                idNumber + ". " +
                title;
    }
}
