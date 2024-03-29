
import java.util.*;

public class MemoryBlock {
    //Set memory size
    private int memorySize;
    //setting start address of block
    private int startAddress;
    //setting end address of block
    private int endAddress;
    //Keeping track whether the block is already allocated
    private boolean isAllocated;

    //Constructor
    public MemoryBlock(int memorySize, int startAddress, int endAddress) {
        this.memorySize = memorySize;
        this.startAddress = startAddress;
        this.endAddress = endAddress;
        this.isAllocated = false;
    }

    //Getters and Setters
    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public int getStartAddress() {
        return startAddress;
    }

    public void setStartAddress(int startAddress) {
        this.startAddress = startAddress;
    }

    public int getEndAddress() {
        return endAddress;
    }

    public void setEndAddress(int endAddress) {
        this.endAddress = endAddress;
    }

    //Sends back value of allocation
    public boolean isAllocated() {
        return isAllocated;
    }

    //Sets value of allocation. Either it is false or true
    public void setAllocated(boolean allocated) {
        isAllocated = allocated;
    }

}
