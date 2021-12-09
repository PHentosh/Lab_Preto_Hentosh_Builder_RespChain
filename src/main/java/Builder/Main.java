package Builder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .firstName("Petro")
                .lastName("Hentosh")
                .age(18)
                .occupation("UCU student")
                .gender("m")
                .build();

        System.out.println(user);
    }
}
