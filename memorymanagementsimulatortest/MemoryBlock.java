/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memorymanagementsimulatortest;

/**
 *
 * @author mikej
 */
import java.util.ArrayList;
import java.util.LinkedList;

// Basic memory block structure
class MemoryBlock {
    int startAddress; // Start address for block visualization (if needed)
    int size;
    boolean allocated;

    MemoryBlock next; // For linked list in First Fit and Next Fit

    public MemoryBlock(int size, boolean allocated) {
        this.size = size;
        this.allocated = allocated;
        this.next = null;
    }
}