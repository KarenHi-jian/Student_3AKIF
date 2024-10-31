


public class SemiTest_Computer
{
    public void TestZuNiedrig()
    {
        Computer Lenovo;
        Lenovo = new Computer("Lenovo",true,899,100);
        System.out.println(Lenovo.getMhz());
        
    }
    
    public void TestZuHoch()
    {
        Computer Lenovo;
        Lenovo = new Computer("Lenovo",true,899,5000);
        System.out.println(Lenovo.getMhz());
    }
    
    public void TestOk()
    {
        Computer Lenovo;
        Lenovo = new Computer("Lenovo",true,899,2000);
        System.out.println(Lenovo.getMhz());
    }
}
