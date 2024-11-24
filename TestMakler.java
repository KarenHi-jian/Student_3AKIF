

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMakler
{
    @Test
    public void TestLeer()
    {
        Makler m;
        
        m = new Makler();
        assertEquals (m.gunstigstenWohnung(),-1);
    }
    
    @Test
    public void Test1()
    {
        Makler m;
        Wohnung objekt0, objekt1;
        
        m = new Makler();
        
        objekt0 = new Wohnung("wien", 200000); 
        objekt1 = new Wohnung("baden", 600000); 
        m.hinzufugen(objekt0);
        m.hinzufugen(objekt1);
        assertEquals(200000, m.gunstigstenWohnung());
    }
}