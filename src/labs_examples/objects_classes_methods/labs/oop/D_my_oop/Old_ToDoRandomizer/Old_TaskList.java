package labs_examples.objects_classes_methods.labs.oop.D_my_oop.Old_ToDoRandomizer;

import java.util.ArrayList;

public class Old_TaskList {
    private ArrayList<Old_Task> taskList = new ArrayList<>();

    public Old_TaskList() {}

    public ArrayList<Old_Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(ArrayList<Old_Task> taskList) {
        this.taskList = taskList;
    }
}

