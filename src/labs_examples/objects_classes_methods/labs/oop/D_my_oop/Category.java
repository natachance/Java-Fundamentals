package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.ArrayList;

public class Category {
    private String categoryName;
    private ArrayList<String> taskList;

    public Category(String name, ArrayList taskList) {
        this.categoryName = name;
        this.taskList = taskList;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public ArrayList getTaskList() {
        return taskList;
    }

    public void setTaskList(ArrayList taskList) {
        this.taskList = taskList;
    }

    public void addCategory(){

    }
}
