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

    //adding tasks to the TaskList ArrayList
    public void addingTasks() {
        System.out.println("Please enter your tasks, hitting enter after each one. " +
                "When you've finished, type 'Done' and hit enter.");
        boolean addingTasks = true;
        while (addingTasks) {
            Task task = new Task();
            task.setTitle(scanner.next());
            tasks.add(task);
            if (scanner.next().equalsIgnoreCase("done")) {
                break;
            }
        }
    }

    //selecting and printing a random task from the ArrayList of tasks
    public void presentTask() {
        int value;
        Random r = new Random();
        value = r.nextInt((tasks.size() - 0) + 1) + 0;
        System.out.println(tasks.indexOf(value)); //how to print? returning "-1" right now
    }

    //marking a task complete by moving to the completedTasks ArrayList
    public void completeTask(){
        System.out.println("Please select the task you would like to mark complete and hit enter.");
        for(Task t : tasks){
            System.out.println(t.toString());
        }
        //how to number each task? Index in ArrayList? How does this work?

//        completedTasks.add(Scanner.next());
    }
}

