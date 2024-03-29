// This class will simulate the contiguous memory allocation of a computer system
import java.util.*;

//This will replicate the contiguous memory allocation
public class BasicMemorySimulator {
    
    //List of memory blocks
    private List<MemoryBlock> memoryBlocks;

    //All of them should be a fixed size partition
    private int partitionSize;

    //Now we need some processes to allocate memory
    //This list will be added onto
    private List<Process> processes;

    //Constructor
    public BasicMemorySimulator(int partitionSize) {
        this.partitionSize = partitionSize;
        this.memoryBlocks = new ArrayList<>();
    }

    //Add memory block
    public void addMemoryBlock(MemoryBlock memoryBlock) {
        memoryBlocks.add(memoryBlock);
    }

    //Remove memory block
    public void removeMemoryBlock(MemoryBlock memoryBlock) {
        memoryBlocks.remove(memoryBlock);
    }

    // //Add process
    // public void addProcess(Process process) {
    //     processes.add(process);
    // }

}
