/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.Date;

/**
 *
 * @author JAGTAP
 */
public class VitalSigns {
    
    private Date date;
    private float bp;
    private float temp;
    private float pluseRate;
    private float respirationRate;
    
    public VitalSigns()
    {
        date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getBp() {
        return bp;
    }

    public void setBp(float bp) {
        this.bp = bp;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getPluseRate() {
        return pluseRate;
    }

    public void setPluseRate(float pluseRate) {
        this.pluseRate = pluseRate;
    }

    public float getRespirationRate() {
        return respirationRate;
    }

    public void setRespirationRate(float respirationRate) {
        this.respirationRate = respirationRate;
    }
    
    
            
    
    
}
