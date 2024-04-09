public class Process {
    //Set process size
    private int processSize;
    //Set process location
    private int startLocation;
    private int endLocation;
    //Set Process ID
    private int processID;

    //Constructor
    public Process(int processSize, int startLocation, int endLocation , int processID) {
        this.processSize = processSize;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.processID = processID;
    }

    //Getters and Setters
    public int getProcessSize() {
        return processSize;
    }

    public void setProcessSize(int processSize) {
        this.processSize = processSize;
    }

    public int getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(int startLocation) {
        this.startLocation = startLocation;
    }

    public int getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(int endLocation) {
        this.endLocation = endLocation;
    }

    public int getProcessID() {
        return processID;
    }

    public void setProcessID(int processID) {
        this.processID = processID;
    }

    //Prints out the process
    public String printProcess() {
        return "Process ID: " + processID + " Process Size: " + processSize + " Location: " + startLocation + " End Location: " + endLocation;
    }
    
}
