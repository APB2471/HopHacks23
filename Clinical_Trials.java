public class Clinical_Trials {
    public int minAge;
    public int maxAge;
    public Sex sex;
    public Race race;
    public String previousTreatments;
    public String otherHealthProblems;
    public String disease;
    public String stage;
    public String address;

    enum Sex {
        ALL,
        MALE,
        FEMALE,
    }

    enum Race {
        WHITE,
        BLACK,
        AMERICAN_INDIAN,
        ASIAN,
        PACIFIC_ISLANDER,
        OTHER
    }

    public Clinical_Trials(int minAge, int maxAge, Sex sex, Race race, String previousTreatments,
                           String otherHealthProblems, String disease, String stage, String address) {
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.sex = sex;
        this.race = race;
        this.previousTreatments = previousTreatments;
        this.otherHealthProblems = otherHealthProblems;
        this.disease = disease;
        this.stage = stage;
        this.address = address;
    }
}
