package labs_examples.objects_classes_methods.labs.oop.ToDoRandomizer;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TaskList {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Task> tasks = new ArrayList<>();
    private ArrayList<Task> completedTasks = new ArrayList<>();

    public TaskList(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public ArrayList<Task> getCompletedTasks() {
        return completedTasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public void setCompletedTasks(ArrayList<Task> completedTasks) {
        this.completedTasks = completedTasks;
    }

    //can't call this method in controller - no idea why
//        private void addingTasks() {
//        boolean addingTasks = true;
//        while (addingTasks) {
//            Task task = new Task();
//            task.setTitle(scanner.next());
//            tasks.add(task);
//            if (scanner.next().equalsIgnoreCase("done")) {
//                break;
//            }
//        }
//    }

    public void presentTask() {
        int value;
        Random r = new Random();
        value = r.nextInt((tasks.size() - 0) + 1) + 0;
        System.out.println(tasks.indexOf(value)); //how to print? returning "-1" right now
    }
}

