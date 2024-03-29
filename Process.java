public class Process {
    //Set process size
    private int processSize;
    //Set process location
    private int location;
    //Set Process ID
    private int processID;

    //Constructor
    public Process(int processSize, int location, int processID) {
        this.processSize = processSize;
        this.location = location;
        this.processID = processID;
    }

    //Getters and Setters
    public int getProcessSize() {
        return processSize;
    }

    public void setProcessSize(int processSize) {
        this.processSize = processSize;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getProcessID() {
        return processID;
    }

    public void setProcessID(int processID) {
        this.processID = processID;
    }

    //Prints out the process
    public String printProcess() {
        return "Process ID: " + processID + " Process Size: " + processSize + " Location: " + location;
    }
    
}
