package suites;
import item_tests.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        AddToBag.class, AddToWishlist.class, BrandLink.class, ChoseSize.class, ClickOnCollors.class, ClickSizeGuide.class,
        DeliveryButton.class, DescriptionButton.class, EnterQuantity.class, HoverOverCollors.class, HoverOverPictures.class,
        ReturnsButton.class, TogglePicturesLeftRight.class, TogglePicturesUpDown.class, ToggleQuantity.class, View360.class,
        ZoomItem.class

})

public class ItemTestSuites {
}
