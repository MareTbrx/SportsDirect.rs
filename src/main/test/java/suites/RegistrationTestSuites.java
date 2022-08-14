package suites;
import RegistrationTest.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        Valid.class, WithDayMonthWithoutYear.class, WithDayWithoutMonthYear.class, WithDayYearWithoutMonth.class,
        WithEmptyConfirmPassField.class, WithEmptyPassField.class, WithInvalidEmailFormat.class, WithMonthWithoutDayYear.class,
        WithoutEmail.class, WithoutFirstName.class, WithoutLastName.class, WithPassNotMatchingConfirmPass.class,
        WithPassUnderMinimumChar.class, WithYearMonthWithoutDay.class, WithYearWithoutDayMonth.class


})

public class RegistrationTestSuites {
}
