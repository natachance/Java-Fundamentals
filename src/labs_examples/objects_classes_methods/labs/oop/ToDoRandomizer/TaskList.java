package labs_examples.objects_classes_methods.labs.oop.ToDoRandomizer;

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
//            task.setIdNumber(tasks.indexOf(task) + 1);//all tasks are being assigned idNumber of 1
            tasks.add(task);
            if (scanner.next().equalsIgnoreCase("x")) { //sometimes have to type x twice?
                break;
            }
        }
    }

    //selecting and printing a random task from the ArrayList of tasks
    public void presentTask() {
        int value;
            Random r = new Random();
            value = r.nextInt((tasks.size() - 0) + 1); //don't really understand Random and bound

        for(Task t : tasks){
            if (tasks.indexOf(t) == value){
                System.out.println(t.toString());
                System.out.println();
            }
        }
    }

    //marking a task complete
    public void completeTask(){
        //displaying all tasks, if any, and prompting user to choose a task to mark complete
        System.out.println("Please type in the number of the task you would like to mark complete and hit enter.");
        for(Task t : tasks) {
            if (tasks.isEmpty()) {
                    System.out.println("You have no tasks to complete!");
                    return;
                } else {
                    if (completedTasks.contains(t)) {
                        continue;
                    } else {
//                        System.out.println(t.toString()); not sure how to print index here
                        System.out.println((tasks.indexOf(t) + 1) + ". " + t.toString());
                        //first task in list prints fine, all others the first word is cut off
                    }
                }
            }
//this entire block of code below is getting skipped, just returning to main menu when a number is entered

       // marking a task complete by moving to the completedTasks ArrayList, and removing from tasks ArrayList
        int selection = scanner.nextInt();

        for(Task t : tasks){
            if((tasks.indexOf(t) - 1) == selection){
                completedTasks.add(t);
                tasksToRemove.add(t);
                System.out.println("Ok, '" + t.getTitle() + "' is marked complete.");
            }
        }
        tasks.removeAll(tasksToRemove);
    }
}

