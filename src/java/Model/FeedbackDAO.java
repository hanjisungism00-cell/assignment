package Model;

import dal.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FeedbackDAO extends DBContext {
    PreparedStatement stm;
    ResultSet rs;
   
    public List<Feedback> getFeedback() {
        List<Feedback> data = new ArrayList<>();
        try {
            String strSQL = "select * from Feedback f join Class_Subject_Lecturer c on f.csl_id = c.id ";
            stm = connection.prepareStatement(strSQL);
            rs = stm.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String className = rs.getString("class_name");
                String subject = rs.getString("subject");
                String studentMail = rs.getString("student_mail");
                int punctuality = rs.getInt("punctuality");
                int skills = rs.getInt("skills");
                int quality = rs.getInt("quality");
                int support = rs.getInt("support");
                int response = rs.getInt("response");
                int satisfaction = rs.getInt("satisfaction");
                String comment = rs.getString("comment");
                
                Feedback f = new Feedback(id, className, subject, studentMail, punctuality, skills, quality, support, response, satisfaction, comment);
                data.add(f);
            }

        } catch (Exception e) {
            System.out.println("getProducts:" + e.getMessage());

        }
        return data;
    }
}
