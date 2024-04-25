/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memorymanagementsimulatortest;

/**
 *
 * @author mikej
 * used ChatGPT 4 for creation
 */
import java.util.Scanner;

public class MemorySimulation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemoryManager memoryManager = null;

        System.out.println("Select the memory allocation method:");
        System.out.println("1: Best Fit");
        System.out.println("2: Worst Fit");
        System.out.println("3: First Fit");
        System.out.println("4: Next Fit");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                memoryManager = new BestFitMemoryManager(100);
                break;
            case 2:
                memoryManager = new WorstFitMemoryManager(100);
                break;
            case 3:
                memoryManager = new FirstFitMemoryManager(100);
                break;
            case 4:
                memoryManager = new NextFitMemoryManager(100);
                break;
            default:
                System.out.println("Invalid selection. Exiting program.");
                System.exit(0);
        }

        System.out.println("Initial memory state:");
        memoryManager.displayMemory();

        System.out.println();
        // Simulate memory allocation
        System.out.println("Allocating 20 units of memory for process 1...");
        memoryManager.allocate(20);
        memoryManager.displayMemory();

        System.out.println();
        System.out.println("Allocating 30 units of memory for process 2...");
        memoryManager.allocate(30);
        memoryManager.displayMemory();

        System.out.println();
        // Simulate memory deallocation
        System.out.println("Deallocating 20 units of memory used for process 1...");
        memoryManager.deallocate(20);
        memoryManager.displayMemory();

        System.out.println();
        System.out.println("Allocating 10 units of memory for process 3...");
        memoryManager.allocate(10);
        memoryManager.displayMemory();

        System.out.println();
        // User creates their own memory manager
        memoryManager = null;
        System.out.println("Time to create your own memory manager!");
        System.out.println("Enter the memory size:");
        int memorySize = scanner.nextInt();

        System.out.println("Select the memory allocation method:");
        System.out.println("1: Best Fit");
        System.out.println("2: Worst Fit");
        System.out.println("3: First Fit");
        System.out.println("4: Next Fit");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                memoryManager = new BestFitMemoryManager(memorySize);
                break;
            case 2:
                memoryManager = new WorstFitMemoryManager(memorySize);
                break;
            case 3:
                memoryManager = new FirstFitMemoryManager(memorySize);
                break;
            case 4:
                memoryManager = new NextFitMemoryManager(memorySize);
                break;
            default:
                System.out.println("Invalid selection. Exiting program.");
                System.exit(0);
        }

        //User can allocate and deallocate memory
        System.out.println("Initial memory state:");
        memoryManager.displayMemory();
        int userChoice = 0;

        while (userChoice != -1) {
            System.out.println("Enter 1 to allocate memory, 2 to deallocate memory, or -1 to exit:");
            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("Enter the size of memory to allocate:");
                    int size = scanner.nextInt();
                    memoryManager.allocate(size);
                    memoryManager.displayMemory();
                    break;
                case 2:
                    System.out.println("Enter the size of memory to deallocate:");
                    size = scanner.nextInt();
                    memoryManager.deallocate(size);
                    memoryManager.displayMemory();
                    break;
                case -1:
                    userChoice = -1;
                    break;
                default:
                    System.out.println("Invalid selection.");
            }
        }

        scanner.close();
    }
}
