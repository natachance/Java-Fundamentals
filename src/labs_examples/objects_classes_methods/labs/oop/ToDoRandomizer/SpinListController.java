package labs_examples.objects_classes_methods.labs.oop.ToDoRandomizer;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class SpinListController {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SpinListController run = new SpinListController();
        TaskList taskList = run.initializeTaskList();
        run.runSpinList(taskList);
    }

    private void runSpinList(TaskList taskList) {
            mainMenu(taskList);
    }

    private void mainMenu(TaskList taskList) {
        System.out.println("Main Menu: please type the number of your selection and hit enter");
        System.out.println("1. randomly present a task to complete");
        System.out.println("2. input a new task");
        System.out.println("3. mark an existing task complete");

        if (scanner.next().equalsIgnoreCase("1")) {
            presentTask(taskList);
        } else if (scanner.next().equalsIgnoreCase("2")) {
            inputTask();
        } else if (scanner.next().equalsIgnoreCase("3")) {
            completeTask();
        } else {
            System.out.println("Please enter a number from the menu list.");
            System.out.println();
            mainMenu(taskList);
        }
    }

    private void presentTask(TaskList taskList) {
        int value;
        Random r = new Random();
        value = r.nextInt();
    }

    private void inputTask() {
        Task task = new Task();
        task.setTitle(scanner.next());
        taskList.add(task);
    }

    private void completeTask() {
    }

    private TaskList initializeTaskList() {
        System.out.println("Welcome to SpinList!");
        System.out.println("Please enter your tasks, hitting enter after each one. " +
        "When you've finished, type 'done' and hit enter.");

        ArrayList<Task> taskList = new ArrayList<>();
        boolean addingTasks = true;
        while (addingTasks) {
            Task task = new Task();
            task.setTitle(scanner.next());
            taskList.add(task);
            if (scanner.next().equalsIgnoreCase("done")) {
                break;
            }
        }

        TaskList newTaskList = new TaskList(taskList);
        return newTaskList;
    }
}