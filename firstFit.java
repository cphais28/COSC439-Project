
import java.util.*;
public class firstFit extends BasicMemorySimulator {

    //CHECK THIS
    public firstFit(int partitionSize) {
        super(partitionSize);
    }

    //List of memory blocks
    private List<MemoryBlock> memoryBlocks;

    //All of them should be a fixed size partition
    private int partitionSize;

    //Now we need some processes to allocate memory
    //This list will be added onto
    private List<Process> processes;

    //Add process
    public void addProcess(Process process) {
        processes.add(process);
    }

    //Remove process
    public void removeProcess(Process process) {
        processes.remove(process);
    }

    //Allocate memory according to first fit
    public void allocateMemory() {
        for (Process process : processes) {
            for (MemoryBlock memoryBlock : memoryBlocks) {
                if (memoryBlock.isAllocated() == false) {
                    if (memoryBlock.getMemorySize() >= process.getProcessSize()) {
                        memoryBlock.setAllocated(true);
                        process.setStartLocation(memoryBlock.getStartAddress());
                        process.setEndLocation(memoryBlock.getEndAddress());
                        break;
                    }
                }
            }
        }
    }
}
