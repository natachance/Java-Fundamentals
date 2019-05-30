package labs_examples.objects_classes_methods.labs.oop.ToDoRandomizer;

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

    //main menu options
    private void mainMenu(TaskList taskList) {
        System.out.println("Main Menu: please type the number of your selection and hit enter");
        System.out.println("1. randomly present a task to complete");
        System.out.println("2. input new tasks");
        System.out.println("3. mark an existing task complete");

        int response = scanner.nextInt();

        if (response == 1) {
            taskList.presentTask();
        } else if (response == 2) {
            taskList.addingTasks();
        } else if (response == 3) {
            taskList.completeTask();
        } else {
            //allowing for entry error and reprinting menu with options
            System.out.println("Please enter a number from the menu list.");
            System.out.println();
            mainMenu(taskList);
        }
    }

    //initial setup of populating tasks into the TaskList (an Array List of Tasks)
    private TaskList initializeTaskList() {
        System.out.println("Welcome to SpinList!");

        ArrayList<Task> taskList = new ArrayList<>();
        TaskList newTaskList = new TaskList(taskList);
        newTaskList.addingTasks();
        return newTaskList;
    }
}