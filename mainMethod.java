
public class mainMethod {
    public static void main(String[] args) {
        //Create a new memory simulator
        BasicMemorySimulator memorySimulator = new BasicMemorySimulator(1000);
        //Example 1
        Process process1 = new Process(100, 0, 1);
        //Example 2
        Process process2 = new Process(200, 0, 2);
        //Example 3
        Process process3 = new Process(300, 0, 3);
        //The location has not been set yet as they will be allocated a location within the memory simulator
        //This is also where we will allow the user to choose which algorithm they want to use
        //Add the processes to the memory simulator
        // memorySimulator.addProcess(process1);
        // memorySimulator.addProcess(process2);
        // memorySimulator.addProcess(process3);

        //Print out the processes
        System.out.println(process1.printProcess());
        System.out.println(process2.printProcess());
        System.out.println(process3.printProcess());
        //This needs to be automated in another loop or perhaps in a list
    }
    
}

