/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DB.EventListenDBContext;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;

/**
 *
 * @author DELL
 */
@WebListener
public class PageListenerView implements ServletRequestListener{
    
    EventListenDBContext db = new EventListenDBContext();
    private int countView = db.getCountViewinID();
    
    public void requestDestroyed(ServletRequestEvent sre) {
        
    }

    public void requestInitialized(ServletRequestEvent sre) {
       countView++;
       db.updateCountView(countView);
    }
    
    public int ReturnCountView(){
        return countView;
    }
    
    
}
