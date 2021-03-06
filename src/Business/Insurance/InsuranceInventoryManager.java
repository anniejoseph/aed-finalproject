/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Insurance;

import Business.Employee.Person;
import Business.Insurance.Insurance;
import Business.Insurance.InsuranceInventoryManager;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author kruti
 */
public class InsuranceInventoryManager extends Person{
    private ArrayList<Insurance> listOfInsurance;
    private WorkQueue workQueue;
    private int id;
    private static int count;
    private String name;
    
    public InsuranceInventoryManager()
    {
        listOfInsurance=new ArrayList<>();
        workQueue = new WorkQueue();
        count++;
        id=count;
    }

    public ArrayList<Insurance> getListOfInsurance() {
        return listOfInsurance;
    }

    public void setListOfInsurance(ArrayList<Insurance> listOfInsurance) {
        this.listOfInsurance = listOfInsurance;
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

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        InsuranceInventoryManager.count = count;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    
    @Override
    public String toString()
    {
        return name;
    }
}
