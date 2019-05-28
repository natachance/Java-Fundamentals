package labs_examples.objects_classes_methods.labs.oop.ToDoRandomizer;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskList {
    Scanner scanner = new Scanner(System.in);

    ArrayList<Task> taskList = new ArrayList<>();

    public TaskList(ArrayList<Task> taskList) {
        this.taskList = taskList;
    }

//    private void addingTasks() {
//        boolean addingTasks = true;
//        while (addingTasks) {
//            Task task = new Task();
//            task.setTitle(scanner.next());
//            taskList.add(task);
//            if (scanner.next().equalsIgnoreCase("done")) {
//                break;
//            }
//        }
//    }
}

