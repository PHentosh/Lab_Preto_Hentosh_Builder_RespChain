package Builder;


import org.junit.*;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class TestBuilder {
    @Test
    public void testVariables(){
        User user = User.builder()
                .firstName("Petro")
                .lastName("Hentosh")
                .age(18)
                .occupation("UCU student")
                .gender("m")
                .build();

        Assertions.assertEquals(user.getAge(), 18);
        Assertions.assertEquals(user.getFirstName(), "Petro");
        Assertions.assertEquals(user.getGender(), "m");
        List<String> l = new ArrayList<>();
        l.add("UCU student");
        Assertions.assertEquals(user.getOccupations(), l);
        Assertions.assertEquals(user.getWeight(), 0);
        Assertions.assertEquals("Hentosh", user.getLastName());
    }
}
