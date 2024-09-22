public class Student
{
    private String name;
    private int alter;
    private String religion;
    
    public Student()
    {
        setName("Thomas");
        setAlter(40);
        setReligion("Religion");
    }

    public Student(String name, int alter,String religion)
    {
        setName(name);
        setAlter(alter);
        setReligion("Religion");
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


    public void printStudent()
    {
        System.out.println("Student:\t" + name + "\t" + alter + "\t" + religion);
    }
}
