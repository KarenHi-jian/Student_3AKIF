

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WohnungJUnit
{
    @Test
    public void SemiTestZuviel()
    {
        Wohnung wien;
        wien=new Wohnung ("wien","Spengergasse 10/5/3A",true,false,200000);
        assertEquals(wien.getAnzZimmer(),4);
    }
    
    @Test
    public void SemiTestOk()
    {
        Wohnung wien;
        wien = new Wohnung ("wien","Spengergasse 10/5/3A", true,false,200000,4);
    }
    
    @Test
    public void TestGunstigsterWohnung()
    {
        Wohnung wien;
        wien = new Wohnung ("wien","Spengergasse 10/5/3A",true,false,200000);
        assertEquals(wien.getPreis(),200000);
    }
}
