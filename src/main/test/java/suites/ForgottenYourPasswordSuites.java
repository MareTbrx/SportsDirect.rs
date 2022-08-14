package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import forgotten_your_password_tests.*;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        CancelbuttonTest.class, LinkTest.class, WithEmptyEmailField.class, WithInvalidEmailFormat.class,
        WithValidEmail.class
})



public class ForgottenYourPasswordSuites {
}
