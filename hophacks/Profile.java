public class Profile {

    
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String city;
    private String state;
    private String zip;
    private String comments;
    public int age;
    public String sex;
    public String race;
    public String previousTreatments;
    public String otherHealthProblems;
    public String disease;
    public String stage;

    public Profile(String username, String firstName, String lastName,
                   String email, String phone, String city, String state,
                   String zip, String comments, String sex, int age, String race,
                   String prevTreatments, String otherHealthTreatments,
                   String disease, String stage) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.comments = comments;
        this.age = age;
        this.sex = sex;
        this.race = race;
        this.previousTreatments = prevTreatments;
        this.otherHealthProblems = otherHealthTreatments;
        this.disease = disease;
        this.stage = stage;
    }

    public String getUsername() {
        return this.username;
    }
}
