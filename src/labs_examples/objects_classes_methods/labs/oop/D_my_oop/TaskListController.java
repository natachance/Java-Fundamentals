package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskListController {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to To-Do List Randomizer!");


        






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

        Category category = new Category(categoryName, taskList);
        return category;
    }

    public void addCategory(){
        System.out.println("Would you like to add a new category?");

        while (scanner.next().equalsIgnoreCase("Y")) {
            initializeCategory();
        }
    }
}
