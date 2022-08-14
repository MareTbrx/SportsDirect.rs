package suites;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import profile_dropdown_menu.*;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        AccountDetailsButton.class, ContactPreferencesButton.class, TrackOrdersButton.class, WishListButton.class
})


public class ProfileDropdownMenuSuites {
}
