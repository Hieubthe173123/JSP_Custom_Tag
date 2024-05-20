/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/TagHandler.java to edit this template
 */
package Controller;

import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.JspFragment;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class ConvertToVnDateTag extends SimpleTagSupport {

    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void doTag() throws JspException, IOException {
        String formattedDate = convertDate(value);
        getJspContext().getOut().write(formattedDate);
    }
    
    private String convertDate(String value){
        try {
            //format ngày ban đầu
            SimpleDateFormat inputFormatDate = new SimpleDateFormat("MM-dd-yyyy");
            //format ngày mới
            SimpleDateFormat outputFormatDate = new SimpleDateFormat("'Ngay' dd, 'thang' MM, 'nam' yyyy");
            
            //Convert formart date ban đầu
            Date date = inputFormatDate.parse(value);
            
            //out put ra format date mới
            String formatDate = outputFormatDate.format(date);
            
            return formatDate;
            
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static void main(String[] args) {
        
    }

}
