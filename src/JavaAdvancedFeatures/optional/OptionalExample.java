package JavaAdvancedFeatures.optional;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        Optional<String> stringOptional1 = Optional.of("Hello");
        Optional<String> stringOptional2 = Optional.of("World");
        Optional<String> stringOptional3 = Optional.ofNullable(null);

        //lambda expression
        stringOptional1.ifPresent(variable -> System.out.println(variable));

        String value = stringOptional3.orElse("Hello World!");
        String text = stringOptional2.orElse("Tekstas");

        System.out.println(value + "\n" + text);

        /*Option<RegistrationForm> regFrom = Optional.of(user-interface-rest-api);
        regFrom.ifPresent(reg -> database.save());

        if (regFrom.isPresent()){
            database.save();
        } else {
            throw new Exception();
        }
         */
    }
}
