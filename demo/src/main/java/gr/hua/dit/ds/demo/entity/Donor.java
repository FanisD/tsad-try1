package gr.hua.dit.ds.demo.entity;

public class Donor {

    private String userID;
    private String name;
    private String email;
    private String bloodtype;
    private String livingarea;
    private String testresults;

    public Donor(String userID, String name, String email, String bloodtype, String livingarea, String testresults){
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.bloodtype = bloodtype;
        this.livingarea = livingarea;
        this.testresults = testresults;
    }

    public Donor(){
    }

    ///////////GETTERS/////////////////////////
    public String getUserID() {return userID;}

    public String getEmail() {return email;}

    public String getName() {return name;}

    public String getBloodtype() {return bloodtype;}

    public String getLivingarea() {return livingarea;}

    public String getTestresults() {return testresults;}


    ///////////SETTERS//////////////////////////
    public void setUserID(String userID) {this.userID = userID;}

    public void setEmail(String email) {this.email = email;}

    public void setName(String name) {this.name = name;}

    public void setBloodtype(String bloodtype) {this.bloodtype = bloodtype;}

    public void setLivingarea(String livingarea) {this.livingarea = livingarea;}

    public void setTestresults(String testresults) {this.testresults = testresults;}

    @Override
    public String toString(){
        return "Donor{" +
                "UserID =" + userID + '\'' +
                ", Email =" + email + '\'' +
                ", Name =" + name + '\'' +
                ", Blood type =" + bloodtype + '\'' +
                ", Living area =" + livingarea + '\'' +
                ", Test results =" + testresults + '\'' +
                '}';
    }


}
