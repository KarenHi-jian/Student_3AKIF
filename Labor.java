public class Labor
{
    private String gebaude;
    private int stock;
    private boolean beamer;
    private int anzPlatze;
    
    public Labor()
    {
        setGebaude("C");
        setStock(5);
        setBeamer(true);
        setAnzPlatze(20);
    }
    
    public Labor(String gebaude, int stock, boolean beamer, int anzPlatze)
    {
        setGebaude(gebaude);
        setStock(stock);
        setBeamer(beamer);
        setAnzPlatze(anzPlatze);
    }
    
    public Labor(String gebaude, int stock, boolean beamer)
    {
        setGebaude(gebaude);
        setStock(stock);
        setBeamer(beamer);
        setAnzPlatze(20);
    }
    
    public Labor(String gebaude, int stock)
    {
        setGebaude(gebaude);
        setStock(stock);
        setBeamer(true);
        setAnzPlatze(20);
    }
    
    public Labor(String gebaude)
    {
        setGebaude(gebaude);
        setStock(5);
        setBeamer(true);
        setAnzPlatze(20);
    }
    
    public void setGebaude(String gebaude)
    {
        this.gebaude = gebaude;
    }
    
    public void setStock(int stock)
    {
        if ((stock>=0)&&(stock<=20))
        {
            this.stock=stock;
        }
        else
        {
            System.out.println(" Fehler, Üngultige Stock.Stock muss zwieschen 0 und 7 ");
        }
    }
    
    public void setBeamer(boolean beamer)
    {
        this.beamer=beamer;
    }
    
    public void setAnzPlatze(int anzPlatze)
    {
        this.anzPlatze=anzPlatze;
    }
    
    public String getGebaude()
    {
        return gebaude;
    }
    
    public int getStock()
    {
        return stock;
    }
    
    public boolean getBeamer()
    {
        return beamer;
    }
    
    public int getAnzPlatze()
    {
        return anzPlatze;
    }


}