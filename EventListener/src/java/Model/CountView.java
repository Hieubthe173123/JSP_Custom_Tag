/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DELL
 */
public class CountView {
    private int countID;
    private int countView;

    public CountView() {
    }

    public CountView(int countID, int countView) {
        this.countID = countID;
        this.countView = countView;
    }

    public int getCountID() {
        return countID;
    }

    public void setCountID(int countID) {
        this.countID = countID;
    }

    public int getCountView() {
        return countView;
    }

    public void setCountView(int countView) {
        this.countView = countView;
    }

    @Override
    public String toString() {
        return "CountView{" + "countID=" + countID + ", countView=" + countView + '}';
    }
    
    
}
