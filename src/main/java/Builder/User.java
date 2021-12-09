package Builder;


import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

import java.util.List;

@Builder @ToString
public class User {
    private String firstName;
    private String lastName;
    private String gender;
    @Singular
    private  List<String> occupations;
    private int age;
    private int weight;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public List<String> getOccupations() {
        return occupations;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }
}
