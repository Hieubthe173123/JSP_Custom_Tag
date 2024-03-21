/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;

import Model.CountView;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class EventListenDBContext extends DBContext {
    
    public static void main(String[] args) {
        EventListenDBContext db = new EventListenDBContext();
        System.out.println(db.getCountViewinID());
    }

    public CountView getCountViewbyID(int id) {
        try {
            String sql = "SELECT [countID]\n"
                    + "      ,[countView]\n"
                    + "  FROM [EventListener].[dbo].[CountView]\n"
                    + "  WHERE [countID] = 1";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CountView c = new CountView();
                c.setCountView(rs.getInt("countView"));
                return c;
            }
        } catch (SQLException ex) {
            Logger.getLogger(EventListenDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public int getCountViewinID() {
        try {
            String sql = "SELECT [countID]\n"
                    + "      ,[countView]\n"
                    + "  FROM [EventListener].[dbo].[CountView]\n"
                    + "  WHERE [countID] = 1";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt("countView");
            }

        } catch (SQLException ex) {
            Logger.getLogger(EventListenDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public void updateCountView(int countView) {
        try {
            String sql = "UPDATE [dbo].[CountView]\n"
                    + "   SET [countView] = ?\n"
                    + " WHERE [countID] = 1";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, countView);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EventListenDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
