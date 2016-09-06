


public class StudentInfo
{	String ID;
	double GPA;

    public StudentInfo(String ID, double GPA)
    {
    	this.GPA= GPA;
    	this.ID=ID;
    }
    public String getID()
    {
    	return ID;
    }
    public double GPA()
    {
    	return GPA;
    }
    public String toString()
    {
    	String str="ID: " + ID + "\nGPA: " + GPA;
    	return str;
    }
}