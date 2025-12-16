package Model;

public class Feedback {
    private int id;
    private String className;
    private String subject;
    private String studentMail;
    private int punctuality;
    private int skills;
    private int quality;
    private int support;
    private int response;
    private int satisfaction;
    private String comment;

    public Feedback() {
    }

    public Feedback(int id, String className, String subject, String studentMail, int punctuality, int skills, int quality, int support, int response, int satisfaction, String comment) {
        this.id = id;
        this.className = className;
        this.subject = subject;
        this.studentMail = studentMail;
        this.punctuality = punctuality;
        this.skills = skills;
        this.quality = quality;
        this.support = support;
        this.response = response;
        this.satisfaction = satisfaction;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getStudentMail() {
        return studentMail;
    }

    public void setStudentMail(String studentMail) {
        this.studentMail = studentMail;
    }

    public int getPunctuality() {
        return punctuality;
    }

    public void setPunctuality(int punctuality) {
        this.punctuality = punctuality;
    }

    public int getSkills() {
        return skills;
    }

    public void setSkills(int skills) {
        this.skills = skills;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getSupport() {
        return support;
    }

    public void setSupport(int support) {
        this.support = support;
    }

    public int getResponse() {
        return response;
    }

    public void setResponse(int response) {
        this.response = response;
    }

    public int getSatisfaction() {
        return satisfaction;
    }

    public void setSatisfaction(int satisfaction) {
        this.satisfaction = satisfaction;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    


}
