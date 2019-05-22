package labs_examples.objects_classes_methods.labs.oop.D_my_oop;


import java.util.ArrayList;
import java.util.Scanner;

public class TaskListController {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        TaskListController taskListController = new TaskListController();
        System.out.println("Welcome to SpinList!");
        taskListController.runToDoApp();
    }

    public void runToDoApp(){
        boolean keepGoing = true;

        do {
            System.out.println("Select from the options below (type in the number of your choice):");
            System.out.println("1. Create a new task");
            System.out.println("2. Complete a task");
            System.out.println("3. View completed tasks");
            System.out.println("4. Quit");

            int response = scanner.nextInt();
            if (response == 1){
                createTask();
            } else if (response == 2) {
                completeTask();
            } else if (response == 3){
                viewCompletedTasks();
            } else if (response == 4){
                break;
            }
        } while (keepGoing);
    }

    private void createTask() {
        //list all categories to choose from, and ask if want to add to existing or create new category
        //if create new, call initializeCategory()
        //create new task, add to tasklist
    }

    private void completeTask() {
        //ask if want all tasks, or tasks by category
        //if tasks by category, list all categories to select from
    }

    private void viewCompletedTasks() {
    }

    public TaskList initializeTaskList() {

        System.out.println("Please enter a list category.");
        String category = scanner.next();

        ArrayList<Task> taskList = new ArrayList<>();

        System.out.println("Great, let's get started! Please enter your tasks for this list, hitting enter after each one. " +
                "When you've finished, type 'done' and hit enter.");

        boolean addingTasks = true;
        while (addingTasks) {
            Task t = new Task();
            t.setTitle(scanner.next());
            taskList.add(t);
            if (scanner.next().equalsIgnoreCase("done")) {
                break;
            }
        }

//        TaskList newTaskList = new TaskList(taskList, category);
        return null;
    }
}
