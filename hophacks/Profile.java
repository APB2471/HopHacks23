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

    public Profile(String username, String firstName, String lastName,
                        String email, String phone, String city, String state,
                        String zip, String comments) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone= phone;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.comments = comments;
    }

    public String getUsername() {
        return this.username;
    }
}
