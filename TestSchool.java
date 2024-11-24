import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSchool
{
    @Test 
    public void testLeer()
    {  
        School s;
        
        s = new School();
        assertEquals (s.altesterStudent(),-999);
        
    }
    
    @Test
    public void Test1()
    {
        School s;
        Student susi;
        
        s = new School();
        susi = new Student ("susi",21,"rk");
        s.anmelden(susi);
        assertEquals (s.altesterStudent(),21);
    }
    
    @Test
    public void Test2()
    {
        School s;
        Student max,susi;
        
        s = new School ();
        susi = new Student ("Susi",21,"rk");
        max = new Student ("Max",29,"ob");
        s.anmelden (susi);
        s.anmelden (max);
        assertEquals (s.altesterStudent(),29);
    }
    
    @Test
    public void Test3()
    {
        School s;
        Student susi,max,maria;
        
         s = new School();
         susi = new Student ("susi", 21,"rk");
         max = new Student ("max",29,"ob");
         maria = new Student ("maria",25,"ob");
         s.anmelden(susi);
         s.anmelden(max);
         s.anmelden(maria);
         assertEquals(s.altesterStudent(),29); 
    }
    
    @Test
    public void test4()
    {
        School s;
        Student susi, max, maria;
        
        s = new School ();
        susi = new Student ("susi",31,"rk");
        max = new Student ("max",29,"ob");
        maria = new Student ("maria",25,"ob"); 
        s.anmelden(susi);
        s.anmelden(max);
        s.anmelden(maria);
        assertEquals (s.altesterStudent(),31);
    }
    
    @Test 
    public void test5()
    {
        School s;
        Student susi,max,maria;
        
        s = new School ();
        susi = new Student ("susi",21,"rk");
        max = new Student ("max",29,"ob");
        maria = new Student ("maria",33,"ob"); 
        s.anmelden(susi);
        s.anmelden(max);
        s.anmelden(maria);
        assertEquals (s.altesterStudent(),33);
    }
}