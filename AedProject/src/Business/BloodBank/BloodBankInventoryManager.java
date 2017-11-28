/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodBank;

import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author JAGTAP
 */
public class BloodBankInventoryManager {
    
    private ArrayList<BloodGroup> listOfBloodGroup;
    private WorkQueue workQueue;
    private int id;
    private static int count;
    private String name;
    
    public BloodBankInventoryManager()
    {
        listOfBloodGroup = new ArrayList<>();
        workQueue = new WorkQueue();
        count++;
        id=count;
    }

    public ArrayList<BloodGroup> getListOfBloodGroup() {
        return listOfBloodGroup;
    }

    public void setListOfBloodGroup(ArrayList<BloodGroup> listOfBloodGroup) {
        this.listOfBloodGroup = listOfBloodGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }   

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String toString()
    {
        return name;
    }
}
