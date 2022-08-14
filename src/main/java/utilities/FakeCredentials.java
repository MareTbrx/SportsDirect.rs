package utilities;
import com.github.javafaker.Faker;

public class FakeCredentials {

    public static String [] createRegistrationData () {

        Faker faker = new Faker();

        String regemail = faker.internet().emailAddress();
        System.out.print(regemail);

        String reg_firstname = faker.name().firstName();
        System.out.print(reg_firstname);

        String reg_lastname = faker.name().lastName();
        System.out.print(reg_lastname);

        String reg_password = faker.internet().password(6, 20, true);
        System.out.print(reg_password);

        String confirmpassword = faker.internet().password(6, 20, true);
        System.out.print(confirmpassword);

        String bad_login_email_format = faker.name().fullName();
        System.out.println(bad_login_email_format);

        String short_password = faker.internet().password(2,5,true,true);
        System.out.println(short_password);

        String quantity  = String.valueOf(faker.number().numberBetween(2,5));
        System.out.println(quantity);





        return new String[]{regemail, reg_firstname, reg_lastname, reg_password, confirmpassword, bad_login_email_format,
        short_password, quantity};
    }
}
