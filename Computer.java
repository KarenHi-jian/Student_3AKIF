public class Computer
{
    private String hersteller;
    private boolean laptop;
    private int preis;
    private int mhz;
    
    public Computer()
    {
        setHersteller("Lenovo");
        setLaptop(true);
        setPreis(899);
        setMhz(2000);
    }
    
    public Computer(String hersteller,boolean laptop,int preis,int mhz)
    {
        setHersteller(hersteller);
        setLaptop(laptop);
        setPreis(preis);
        setMhz(mhz);
    }
    
    public Computer(String hersteller, boolean laptop,int preis)
    {
        setHersteller(hersteller);
        setLaptop(laptop);
        setPreis(preis);
        setMhz(2000);
    }
    
    public Computer(String hersteller,boolean laptop)
    
    {
        setHersteller(hersteller);
        setLaptop(laptop);
        setPreis(899);
        setMhz(2000);
    }
    
    public Computer(String hersteller)
    {
        setHersteller(hersteller);
        setLaptop(true);
        setPreis(899);
        setMhz(2000);
    }
    
    public void setHersteller(String hersteller)
    {
        this.hersteller=hersteller;
    }
    
    public void setLaptop(boolean laptop)
    {
        this.laptop=laptop;
    }
    
    public void setPreis(int preis)
    {
        this.preis=preis;
    }
    
    public void setMhz(int mhz)
    {
        if(( mhz >= 1000)&&(mhz <= 4000))
        {
            this.mhz=mhz;
        }
        else
        {
            System.out.println("Fehler: Üngultiges Wert. Der Wert muss zwichen 1000 und 4000 liegen.");
        }
    }
    
    public String getHersteller()
    {
        return hersteller;
    }
    
    public boolean getLaptop()
    {
        return laptop;
    }
    
    public int getPreis()
    {
        return preis;
    }
    
    public int getMhz()
    {
        if((mhz <1000)&&(mhz > 4000))
        {
            return mhz;
        }
        else 
        {
            System.out.println("Fehler. Der Wert muss zwischen 1000 und 4000 liegen");
            return 2000;
        }
    }
    
    public void printComputer()
    {
        System.out.println(hersteller + laptop + preis + mhz);
    }
    
    
}