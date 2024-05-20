/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.ServletContext;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author DELL
 */
public class RequestListener implements ServletRequestListener {

    public void requestDestroyed(ServletRequestEvent sre) {

    }

    public void requestInitialized(ServletRequestEvent sre) {
        ServletContext context = sre.getServletContext();

        // Kiểm tra xem viewCount đã được khởi tạo trong ApplicationContext chưa
        if (context.getAttribute("countView") == null) {
            // Nếu chưa, khởi tạo và lưu vào ApplicationContext
            context.setAttribute("countView", new AtomicInteger(0));
        }

        // Tăng viewCount lên 1 mỗi khi có request được initialized
        AtomicInteger countView = (AtomicInteger) context.getAttribute("countView");
        countView.incrementAndGet();
    }

}
