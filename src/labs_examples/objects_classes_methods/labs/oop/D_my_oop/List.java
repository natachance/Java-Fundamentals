package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.ArrayList;

public class List {
    private ArrayList<String> taskList = new ArrayList<>();

    public List() {}

    public ArrayList<String> getTaskList() {
        return taskList;
    }

    public void setTaskList(ArrayList<String> taskList) {
        this.taskList = taskList;
    }
}
