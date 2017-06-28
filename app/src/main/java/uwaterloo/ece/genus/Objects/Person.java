package uwaterloo.ece.genus.Objects;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by whcda on 6/27/2017.
 */
@IgnoreExtraProperties
public class Person {
    String firstName = "";
    String lastName = "";
    String gender = "";
    int age;
    String intro;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
