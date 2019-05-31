package labs_examples.objects_classes_methods.labs.oop.ToDoRandomizer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TaskList {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Task> tasks = new ArrayList<>();
    private ArrayList<Task> completedTasks = new ArrayList<>();
    private ArrayList<Task> tasksToRemove = new ArrayList<>();

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
                "When you've finished, type x and hit enter.");
        boolean addingTasks = true;
        while (addingTasks) {
            Task task = new Task();
            task.setTitle(scanner.nextLine());
            task.setIdNumber(task.getLastIdNumber() + 1);//all tasks are being assigned idNumber of 1
            tasks.add(task);
            if (scanner.next().equalsIgnoreCase("x")) { //sometimes have to type "Done" twice?, x working better
                break;
            }
        }
    }

    //selecting and printing a random task from the ArrayList of tasks
    public void presentTask() {
        int value;
        do {
            Random r = new Random();
            value = r.nextInt((tasks.size() - 0) + 1); //don't really understand Random and bound
        } while (completedTasks.contains(value));

        System.out.println(tasks.indexOf(value)); //how to print? returning "-1" right now
    }

    //marking a task complete by moving to the completedTasks ArrayList
    public void completeTask(){
            for(Task t : tasks){
                if(completedTasks.contains(t)) {
                    continue;
                } else if (tasks.isEmpty()) {
                    return;
                } else {
                    System.out.println("Please type in the number of the task you would like to mark complete and hit enter.");
                    //above text is printing over and over again above each task, need to move elsewhere or limit somehow
                    System.out.println(t.toString()); //first task prints fine, all others the first word is cut off
                }
            }

        int selection = scanner.nextInt();

        for(Task t : tasks){
            if(t.getIdNumber() == selection){
                completedTasks.add(t);
                tasksToRemove.add(t);
                System.out.println("Ok, '" + t.getTitle() + "' is marked complete.");
            }
        }
        tasks.removeAll(tasksToRemove);
    }
}

