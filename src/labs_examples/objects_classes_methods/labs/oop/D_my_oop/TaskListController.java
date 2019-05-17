package labs_examples.objects_classes_methods.labs.oop.D_my_oop;


import java.util.ArrayList;
import java.util.Scanner;

public class TaskListController {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //could create scanner here to use inside main method

        TaskListController taskListController = new TaskListController();

        System.out.println("Welcome to To-Do TaskList Randomizer!");

        Category category = taskListController.initializeCategory();
    }

    public void runToDoApp(){
        boolean keepGoing = true;

        do {
            System.out.println("Select from the options below (type in the number of your choice):");
            System.out.println("1. Complete a task");
            System.out.println("2. Create a new task");
            System.out.println("3. View completed tasks");
            System.out.println("4. Quit");

            int response = scanner.nextInt();
            if (response == 1){
                completeTask();
            } else if (response == 2) {
                createTask();
            } else if (response == 3){
                viewCompletedTasks();
            } else if (response == 4){
                break;
            }
        } while (keepGoing);
    }

    private void viewCompletedTasks() {
    }

    private void completeTask() {
        //ask if want all tasks, or tasks by category
        //if tasks by category, list all categories to select from
    }

    private void createTask() {
        //list all categories to choose from, and ask if want to add to existing or create new category
        //if create new, call initializeCategory()
        //create new task, add to tasklist
    }

    public Category initializeCategory() {

        System.out.println("Please enter a list category.");

        String categoryName = scanner.next();

        ArrayList<String> taskList = new ArrayList<>();

        System.out.println("Great, let's get started! Please enter your tasks for this list, hitting enter after each one. " +
                "When you've finished, type 'done' and hit enter.");

        boolean addingTasks = true;
        while (addingTasks) {
            taskList.add(scanner.next());
            if (scanner.next().equalsIgnoreCase("done")) {
                break;
            }
        }

        Category category = new Category(categoryName);
        return category;
    }

    public void addCategory(){
        System.out.println("Would you like to add a new category?");

        while (scanner.next().equalsIgnoreCase("Y")) {
            initializeCategory();
        }
    }
}
