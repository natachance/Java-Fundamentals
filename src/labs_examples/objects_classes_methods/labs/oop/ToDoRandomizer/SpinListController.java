package labs_examples.objects_classes_methods.labs.oop.ToDoRandomizer;

import java.util.Scanner;
import java.util.ArrayList;

public class SpinListController {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SpinListController run = new SpinListController();
        TaskList taskList = run.initializeTaskList();
        run.mainMenu(taskList);
    }

    //main menu options
    private void mainMenu(TaskList taskList) {
        System.out.println("Main Menu: please type the number of your selection and hit enter");
        System.out.println("1. randomly present a task to complete");
        System.out.println("2. add new tasks");
        System.out.println("3. mark an existing task complete");

        int response = scanner.nextInt();

        if (response == 1) {
            taskList.presentTask();
            mainMenu(taskList);
        } else if (response == 2) {
            taskList.addingTasks();
            mainMenu(taskList);
        } else if (response == 3) {
            taskList.completeTask();
            mainMenu(taskList);
        } else {

            //allowing for entry error - reprints menu with options
            System.out.println("Please enter a number from the menu list.");
            System.out.println();
            mainMenu(taskList);
        }
    }

    //initial setup to populate tasks into a TaskList object (an ArrayList of Tasks)
    private TaskList initializeTaskList() {
        System.out.println("Welcome to SpinList!");

        ArrayList<Task> taskList = new ArrayList<>();
        TaskList newTaskList = new TaskList(taskList);
        newTaskList.addingTasks();
        return newTaskList;
    }
}