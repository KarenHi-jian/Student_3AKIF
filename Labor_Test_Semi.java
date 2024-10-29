public class Labor_Test_Semi
{
    public void testZuHoch()
    {
        Labor labor1;
        labor1= new Labor("c",10,true,20);
        System.out.println(labor1.getStock());
        
    }
    
    public void testOK()
    {
        Labor labor2;
        labor2= new Labor("d",5,true,20);
        System.out.println(labor2.getStock());
    }
    
    
    
}
