/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memorymanagementsimulatortest;

/**
 *
 * @author mikej
 */
// Abstract class for memory management
abstract class MemoryManager {
    abstract void allocate(int size);
    abstract void deallocate(int size);
    abstract void displayMemory();
}