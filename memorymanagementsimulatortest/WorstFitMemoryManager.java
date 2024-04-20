/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memorymanagementsimulatortest;

import java.util.ArrayList;

/**
 *
 * @author mikej
 */
class WorstFitMemoryManager extends MemoryManager {
    private ArrayList<MemoryBlock> memoryBlocks;

    public WorstFitMemoryManager(int memorySize) {
        memoryBlocks = new ArrayList<>();
        memoryBlocks.add(new MemoryBlock(memorySize, false));
    }

    @Override
    public void allocate(int size) {
        int worstFitIndex = -1;
        int worstFitSize = -1;

        for (int i = 0; i < memoryBlocks.size(); i++) {
            MemoryBlock block = memoryBlocks.get(i);
            if (!block.allocated && block.size >= size && block.size > worstFitSize) {
                worstFitIndex = i;
                worstFitSize = block.size;
            }
        }

        if (worstFitIndex != -1) {
            MemoryBlock worstFitBlock = memoryBlocks.get(worstFitIndex);
            if (worstFitBlock.size > size) {
                MemoryBlock newBlock = new MemoryBlock(worstFitBlock.size - size, false);
                memoryBlocks.add(worstFitIndex + 1, newBlock);
            }
            worstFitBlock.size = size;
            worstFitBlock.allocated = true;
            System.out.println("Memory allocated successfully.");
        } else {
            System.out.println("Not enough memory to allocate.");
        }
    }

    @Override
    public void deallocate(int size) {
        for (MemoryBlock block : memoryBlocks) {
            if (block.allocated && block.size == size) {
                block.allocated = false;
                System.out.println("Memory deallocated successfully.");
                return;
            }
        }
        System.out.println("Memory block not found or already deallocated.");
    }

    @Override
    public void displayMemory() {
        for (MemoryBlock block : memoryBlocks) {
            System.out.println("Size: " + block.size + ", Allocated: " + block.allocated);
        }
    }
}