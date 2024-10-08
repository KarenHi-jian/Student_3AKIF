public class Student
{
    private String name;   // Name des Studierende
    private int alter;       // Alter des Studierende
    private String religion; //....
    private boolean matura;
    //Cunstructor
    
    public Student(String name,int alter,String religion,boolean matura)
    {
       setName(name); 
       setAlter(alter);
       setReligion(religion);
       setMatura(matura);
    }
    
    public Student(String neuName,int alter, String religion)
    {
        setName(name);
        setAlter(alter);
        setReligion(religion);
        setMatura(false);
    }
    
    public Student(String name)
    {
        setName(name);
        setAlter(14);
        setReligion("ob");
        setMatura(false);       
    }
    
    public Student()
    {
        setName("UNKN");
        setAlter(14);
        setReligion("ob");
        setMatura(false);
    }

    public void setName(String name)
    {

        this.name = name;

    }

    public void setAlter(int alter)
    {
        this.alter = alter;
    } 
    
    public void setReligion (String religion)
    {
        this.religion= religion;
    }
    
    
    public void setMatura(boolean matura)
    {
        this.matura = matura;
    }
    
    
    public String getName()
    {
        return name;
    }

    public int getAlter()
    {
        return alter;
    
    }
    
    public String getReligion()
    {
        return religion;
    }
    
    public boolean getMatura()
    {
        return matura;
    }
    
    public void printStudent()
    { 
        System.out.println(name+ ": " +  alter + " Jahre, Rel: " + religion + ", Matura: " + matura);
        
    }
    
    

}
