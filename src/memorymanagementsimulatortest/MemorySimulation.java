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

        // Simulate memory allocation
        System.out.println("Allocating 20 units of memory...");
        memoryManager.allocate(20);
        memoryManager.displayMemory();

        System.out.println("Allocating 30 units of memory...");
        memoryManager.allocate(30);
        memoryManager.displayMemory();

        // Simulate memory deallocation
        System.out.println("Deallocating 20 units of memory...");
        memoryManager.deallocate(20);
        memoryManager.displayMemory();

        System.out.println("Allocating 10 units of memory...");
        memoryManager.allocate(10);
        memoryManager.displayMemory();

        scanner.close();
    }
}
