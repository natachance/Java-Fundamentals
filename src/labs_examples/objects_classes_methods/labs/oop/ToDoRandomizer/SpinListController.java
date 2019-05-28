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

    //main menu options
    private void mainMenu(TaskList taskList) {
        System.out.println("Main Menu: please type the number of your selection and hit enter");
        System.out.println("1. randomly present a task to complete");
        System.out.println("2. input a new task");
        System.out.println("3. mark an existing task complete");

        int response = scanner.nextInt();

        if (response == 1) {
            taskList.presentTask();
        } else if (response == 2) {
            inputTask(taskList);
        } else if (response == 3) {
            completeTask(taskList);
        } else {
            //allowing for entry error and reprinting menu with options
            System.out.println("Please enter a number from the menu list.");
            System.out.println();
            mainMenu(taskList);
        }
    }

    //selecting and printing a random task from the ArrayList of tasks
//    private void presentTask(TaskList taskList) {
//        int value;
//        Random r = new Random();
////        value = r.nextInt(tasks.size() - 0); //why can't I call .size or any other .operators? have tried calling on taskList
//         //and on getTasks. and it won't work no matter what
//    }

    //adding a task to the existing TaskList ArrayList
    private void inputTask(TaskList taskList) {
        System.out.println("Please type in your task and hit enter.");
        Task task = new Task();
        task.setTitle(scanner.next());
//        tasks.add(task); //add operator doesn't work
        //ideally could reuse addingTasks method here but can't get that method to work
    }

    //marking a task complete by moving to the completedTasks ArrayList
    private void completeTask(TaskList taskList) {
        System.out.println("Please select the task you would like to mark complete and hit enter.");
        for(Task t : taskList.getTasks()){
            System.out.println(t.toString());
        }
        //how to number each task? Index in ArrayList? How does this work?

//        completedTasks.add(Scanner.next());
    }

    //initial setup of populating tasks into the TaskList (an Array List of Tasks)
    private TaskList initializeTaskList() {
        System.out.println("Welcome to SpinList!");
        System.out.println("Please enter your tasks, hitting enter after each one. " +
        "When you've finished, type 'Done' and hit enter.");

        ArrayList<Task> taskList = new ArrayList<>();
//        taskList.addingTasks(); //why can't I call this method? it doesn't work when I have it in TaskList or below in controller

        boolean addingTasks = true;
        while (addingTasks) {
            Task task = new Task();
            task.setTitle(scanner.next()); //cutting off tasks after a space is entered
            taskList.add(task);
            if (scanner.next().equalsIgnoreCase("Done")) { //must type "Done" in spite of ignoreCase
                break;
            }
        }
        TaskList newTaskList = new TaskList(taskList);
        return newTaskList;
    }

//        private void addingTasks() {
//            boolean addingTasks = true;
//            while (addingTasks) {
//                Task task = new Task();
//                task.setTitle(scanner.next());
//                tasks.add(task);  //do not understand why this breaks when moving into its own method (fine within initializeTaskList)
//                if (scanner.next().equalsIgnoreCase("done")) {
//                    break;
//                }
//            }
//        }
}