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
// Best Fit Memory Management
class BestFitMemoryManager extends MemoryManager {
    private ArrayList<MemoryBlock> memoryBlocks;

    public BestFitMemoryManager(int memorySize) {
        memoryBlocks = new ArrayList<>();
        memoryBlocks.add(new MemoryBlock(memorySize, false));
    }

    @Override
    public void allocate(int size) {
        MemoryBlock bestFitBlock = null;
        int bestFitIndex = -1;

        for (int i = 0; i < memoryBlocks.size(); i++) {
            MemoryBlock block = memoryBlocks.get(i);
            if (!block.allocated && block.size >= size) {
                if (bestFitBlock == null || block.size < bestFitBlock.size) {
                    bestFitBlock = block;
                    bestFitIndex = i;
                }
            }
        }

        if (bestFitBlock != null) {
            if (bestFitBlock.size > size) {
                MemoryBlock newBlock = new MemoryBlock(bestFitBlock.size - size, false);
                memoryBlocks.add(bestFitIndex + 1, newBlock);
            }
            bestFitBlock.size = size;
            bestFitBlock.allocated = true;
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
