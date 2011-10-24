import org.junit.*;
import java.util.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest {

    @Before
    public void setup() {
        Fixtures.deleteAllModels();
    }
 
    @Test
    public void createAndRetrieveUser() {
        TykmihUser user = new TykmihUser("test@chrysostom-family.com", "pass123", "Sam Winchester");
        user.save();
        
        TykmihUser retrieveUser = TykmihUser.find("byEmail", "test@chrysostom-family.com").first();
        
        assertNotNull(retrieveUser);
        assertEquals("Sam Winchester", retrieveUser.fullname);
    }

}
