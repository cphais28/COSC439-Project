/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memorymanagementsimulatortest;

/**
 *
 * @author mikej
 */
class NextFitMemoryManager extends MemoryManager {
    private MemoryBlock start;
    private MemoryBlock lastAllocated;

    public NextFitMemoryManager(int memorySize) {
        start = new MemoryBlock(memorySize, false);
        lastAllocated = start;
    }

    @Override
    public void allocate(int size) {
        MemoryBlock current = lastAllocated;
        do {
            if (!current.allocated && current.size >= size) {
                if (current.size > size) {
                    MemoryBlock newBlock = new MemoryBlock(current.size - size, false);
                    newBlock.next = current.next;
                    current.next = newBlock;
                }
                current.size = size;
                current.allocated = true;
                lastAllocated = current;
                System.out.println("Memory allocated successfully.");
                return;
            }
            current = current.next;
            if (current == null) current = start;
        } while (current != lastAllocated);
        System.out.println("Not enough memory to allocate.");
    }

   @Override
    public void deallocate(int size) {
        MemoryBlock current = start;
        while (current != null) {
            if (current.allocated && current.size == size) {
                current.allocated = false;
                System.out.println("Memory deallocated successfully.");
                return;
            }
            current = current.next;
        }
        System.out.println("Memory block not found or already deallocated.");
    }

    @Override
    public void displayMemory() {
        MemoryBlock current = start;
        while (current != null) {
            System.out.println("Size: " + current.size + ", Allocated: " + current.allocated);
            current = current.next;
        }
    }
}