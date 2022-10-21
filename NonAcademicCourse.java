public class NonAcademicCourse extends Course
{
    //decleration of ivars
    private String instructorName;
    private String startingDate;
    private String completionDate;
    private String examDate;
    private String prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;
    
    //Creation of Constructor class
    public NonAcademicCourse(String courseID,String courseName, int duration, String prerequisite)
    {
        //initalizing ivars to given parameters and values
        super(courseID, courseName, duration);
        this.prerequisite = prerequisite;
        this.startingDate = "";
        this.completionDate = "";
        this.examDate = "";
        this.isRegistered = false;
        this.isRemoved = false;
    }
    
    //Use of Getter to let the method to be accessed
    public String getPrerequisite()
    {
        return this.prerequisite; 
    }
    public String getInstrutorName()
    {
        return this.instructorName;
    }
    public String getStartDate()
    {
        return this.startingDate; 
    }
     public String getCompletionDate()
    {
        return this.completionDate; 
    }
     public String getExamDate()
    {
        return this.examDate; 
    }
    public boolean getIsRegistered()
    {
        return this.isRegistered;
    }
    public boolean getIsRemoved()
    {
        return this.isRemoved;
    }
    
    //Use of setter to set the new instructor name
    public void setInstructorName(String instructorName)
    {
        if(getIsRegistered())
        {
            System.out.println("your Instructor Name is alredy set as "+this.instructorName+" and it cannot be changed");
            
        }
        else
        {
           this.instructorName = instructorName;
        }
    }
     
    //register method
    public void register(String courseLeader, String instructorName, String startingDate, String completionDate, String examDate)
    {
        if (getIsRegistered())
        {
            System.out.println("Your Course is already registered");
        }
        else
        {
            super.setCourseLeader(courseLeader);
            this.setInstructorName(instructorName);
            this.startingDate = startingDate;
            this.completionDate = completionDate; 
            this.examDate = examDate;
            this.isRegistered = true;
            this.isRemoved = false;
        }
    }
      
    //remove method
    public void remove()
    {
        if (getIsRemoved())
        {
            System.out.println("The course is alredy removed");
        }
        else
        {
            super.setCourseLeader("");//Calling parent method setCourseLeader and assigning empty string as a parameter
            this.instructorName = "";
            this.startingDate = "";
            this.completionDate = "";
            this.examDate = "";
            this.isRegistered = false;
            this.isRemoved = true;
        }
    }
    
    //display method
    public void display()
    {
        super.display();//Calling display method of parent class
        String NOutput;//NOutput stands for NonAcademicCourse Output
        NOutput = "The Instructor Name is "+instructorName+", its starting, compeleation and exam date"+"\n"+"is "+startingDate+", "+completionDate+" and "+examDate+" respectively.";
        if (getIsRegistered())
        {
            System.out.println(NOutput);
        }
        else
        {
            System.out.println("Non Academic coures in not registered");
        }
        if(getIsRemoved())
        {
            System.out.println("The non academic course is removed");
        }
    }
}
