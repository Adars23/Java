public class Course
{
    //ivars decleration
    private String courseID;
    private String courseName;
    private String courseLeader;
    private int duration;
    
    //Creation of Constructor class
    public Course(String courseID, String courseName, int duration)
    {
        //initalizing ivars to given parameters 
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseLeader = "";
        this.duration = duration;
    }
    
    //Use of Getter to let the method to be accessed
    public String getCourseID()
    {
        return this.courseID;
    }
    public String getCourseName()
    {
        return this.courseName;
    }
    public int getDuration()
    {
        return this.duration;
    }
    public String getCourseLeader()
    {
        return this.courseLeader;
    }
    
    //Use of setter to set new name 
    public void setCourseLeader(String courseLeader)
    {
        //initializing value of parameter to ivar-courseLeader
        this.courseLeader = courseLeader;
    }
    
    //Display method
    public void display()
    {
        String COutput;//COutput stands for Course Output
        COutput ="The Course ID is "+courseID+" ,Course Name is "+courseName+" ,Duration is "+duration+" months.";
        if(this.courseLeader.isEmpty() == false )
        {
            COutput = COutput +"  and Course Leader is "+ courseLeader;
        }
        System.out.println(COutput);

    }
}
