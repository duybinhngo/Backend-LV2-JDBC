package model;

public class Student {

    private String id;
    private String name;
    private String dateOfBirth;
    private String mail;
    private String majorID;

    public Student() {
        id = "";
        name = "";
        dateOfBirth = "";
        mail = "";
        majorID = "";
    }

    public Student(
            String id,
            String name,
            String dateOfBirth,
            String mail,
            String majorID) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.mail = mail;
        this.majorID = majorID;
    }

    // get private fields
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getMail() {
        return mail;
    }

    public String getMajorID() {
        return majorID;
    }

    // set private fields
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setMajorID(String majorID) {
        this.majorID = majorID;
    }
}