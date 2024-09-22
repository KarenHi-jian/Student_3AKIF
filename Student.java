public class Student
{
    private String name;
    private int alter;
    private String religion;
    private boolean matura;
    
    
    public Student()
    {
        setName("Thomas");
        setAlter(40);
        setReligion("Religion");
        setMatura (false);
        
        
    }

    public Student(String name, int alter,String religion, boolean matura)
    {
        setName(name);
        setAlter(alter);
        setReligion(religion);
        setMatura(matura);
    }

    public void setName(String neuName)
    {
        name = neuName;
    }

    public void setAlter(int neuAlter)
    {
        alter = neuAlter;
    } 
    
    public void setReligion (String neuReligion)
    {
        religion= neuReligion;
    }
    
    
    public void setMatura(boolean neuMatura)
    {
        matura = neuMatura;
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
        System.out.println("Student:\t" + name + "\t" + alter + "\t" + religion + "\t"+ matura);
    }
}
