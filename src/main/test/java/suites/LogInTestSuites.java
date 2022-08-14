package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import log_in_tests.*;


@RunWith(Suite.class)

@Suite.SuiteClasses({
        ValidLoginTest.class, LoginTestWithInvalidPass.class, LoginTestWithInvalidEmailFormat.class,
        LoginTestWithInvalidEmail.class, LoginTestWithEmptyPassField.class, LoginTestWithEmptyEmailField.class,
        LoginTestWithEmptyEmailPassField.class

})

public class LogInTestSuites {
}
