public class AcademicCourse extends Course
{
    //ivars decleration
    private String lecturerName;
    private String level;
    private String credit;
    private String startingDate;
    private String completionDate;
    private int numberOfAssessments;
    private boolean isRegistered;
    
    //Creation of Constructor class
    public AcademicCourse(String courseID,String courseName, int duration, String level, String credit, int numberOfAssessments)
    {
        //initalizing ivars to given parameters and values
        super(courseID, courseName, duration);
        this.level = level;
        this.numberOfAssessments = numberOfAssessments;
        this.credit = credit;
        this.lecturerName = "";
        this.startingDate = "";
        this.completionDate = "";
        this.isRegistered = false;
    }
    
    //Use of Getter to let the method to be accessed
    public String getLecturerName()
    {
        return this.lecturerName;
    }
    public String getLevel()
    {
        return this.level;
    }
    public String getCredit()
    {
        return this.credit;
    }
    public String getStartingDate()
    {
        return this.startingDate;
    }
    public String getCompletionDate()
    {
        return this.completionDate;
    }
    public int getNumberOfAssessments()
    {
        return this.numberOfAssessments;
    }
    public boolean getIsRegistered()
    {
        return this.isRegistered;
    }
    
    //Use of setter to set the new lecturer name 
    public void setLecturerName(String lectureName)
    {
        this.lecturerName = lectureName;
    }
    
    //Use of setter to set the number of assessments   
    public void setNumberOfAssessments(int numberOfAssessments )
    {
        this.numberOfAssessments = numberOfAssessments;
    }
    
    //register method starts here
    public void register(String courseLeader, String lecturerName, String startingDate, String completionDate)
    { 
       if (getIsRegistered())
       {
            System.out.println("The academic course is already registered");
    
       }

       else
       {
         super.setCourseLeader(courseLeader);//Calling parent method setCourseLeader and assigning given courseLeader as paremeter
         this.lecturerName = lecturerName;
         this.startingDate = startingDate;
         this.completionDate = completionDate;
         this.isRegistered = true; 
       }    
    }
    
    //display method stsrts here
    public void display()
    {
        super.display();//Calling display method of parent class 
        String AOutput;//AOutput stands for AcademicCourse Output
        AOutput = "The Lecture Name is "+lecturerName+", its Level and credit is "+level+", "+credit+" respectivly. the starting and compleation Date"+"\n"+ " is "+startingDate+", "+completionDate+" respectivly. Lastly, number of assessments are "+numberOfAssessments;
        if(getIsRegistered())
        {
          System.out.println(AOutput);      
        }
        else
        {
            System.out.println("Academic coures in not registered"); 
        }
    
    }   
}

