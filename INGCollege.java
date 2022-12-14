
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
public class INGCollege 
{
    private JFrame jf,AC_df,NC_df;
    private JPanel CPjp,ACjp,NCjp;
    private JLabel  lbl_i, lbl_ng, lbl_Welcome, lbl_Vision, lbl_Mission,lbl_by,
                    lbl_AC, lbl_AC_ID, lbl_AC_Name,lbl_AC_Duration, lbl_AC_Level,lbl_AC_Credit, lbl_AC_NOA,
                    lbl_AC_Leader, lbl_AC_Lecturer, lbl_AC_SDate, lbl_AC_CDate,
                    lbl_NC, lbl_NC_ID, lbl_NC_Name, lbl_NC_Duration, lbl_NC_Prerequsit,
                    lbl_NC_Leader, lbl_NC_Instrutor,lbl_NC_SDate, lbl_NC_CDate, lbl_NC_EDate ;
    private JTextField txt_AC_ID, txt_AC_Name, txt_AC_Duration, txt_AC_Level, txt_AC_Credit, txt_AC_NOA, txt_AC_Leader, txt_AC_Lecturer,
                       txt_AC_SDate, txt_AC_CDate, txt_NC_ID, txt_NC_Name, txt_NC_Duration, txt_NC_Prerequsit, txt_NC_Leader, txt_NC_Instrutor,
                       txt_NC_SDate, txt_NC_CDate, txt_NC_EDate ;
    private JButton btn_AC1, btn_NC1, btn_AC2, btn_NC2, btn_AC3, btn_NC3,
                    btn_AC_add, btn_AC_Register, btn_AC_Clear, btn_AC_Display,
                    btn_NC_add, btn_NC_Register, btn_NC_Remove, btn_NC_Clear, btn_NC_Display ;
    private Font fnt1, fnt2, fnt3;
    private JTable table_AC_Display, table_NC_Display;
    private ArrayList<Course> nonAcademicCourseList, academicCourseList;
    private DefaultTableModel AC_TableModel, NC_TableModel;
    public INGCollege()
    {

        
        //Frame for Academic Course and Non Academic Course
        jf = new JFrame("Course");
        jf.setBounds(10,10,1350,800);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        
        
        //Font for title
        fnt1 = new Font("Areal",Font.PLAIN,35);
        
        //Font for normal content
        fnt2 = new Font("Areal",Font.PLAIN,20);
        
        //Font for logo
        fnt3 = new Font("Areal",Font.PLAIN,17);
        
        //Cover page panel
        CPjp = new JPanel();
        CPjp.setBounds(0,0,1440,900);
        CPjp.setBackground(new Color(178, 240, 158));
        CPjp.setLayout(null);        
        
        
        //logo
        lbl_i = new JLabel("INNOVATE");
        lbl_i.setBounds(600,10,400,50);
        lbl_i.setFont(fnt1);
        CPjp.add(lbl_i);
        
        lbl_ng = new JLabel("N E P A L    G R O U P");
        lbl_ng.setBounds(600,35,400,50);
        lbl_ng.setFont(fnt3);
        CPjp.add(lbl_ng);
        //Welcome message
        lbl_Welcome = new JLabel("Welcome to Course registration form");
        lbl_Welcome.setBounds(400,220,950,50);
        lbl_Welcome.setFont(fnt1);
        CPjp.add(lbl_Welcome);
        
        //Academic Button
        btn_AC3 = new JButton("Academic Course");
        btn_AC3.setBounds(300,330,350,60);
        btn_AC3.setFont(fnt1);
        btn_AC3.setBackground(new Color(255,255,255));
        CPjp.add(btn_AC3);
        //Non Academic Button
        btn_NC3 = new JButton("Non Academic Course");
        btn_NC3.setBounds(700,330,400,60);
        btn_NC3.setFont(fnt1);
        btn_NC3.setBackground(new Color(255,255,255));
        CPjp.add(btn_NC3);
        
        
        //Mission
        lbl_Vision = new JLabel("Our Mission");
        lbl_Vision.setBounds(450,600,200,50);
        lbl_Vision.setFont(fnt1);
        CPjp.add(lbl_Vision);
        
        //Message Mission
        lbl_Mission = new JLabel("To develop Industry-Ready Graduates");
        lbl_Mission.setBounds(650,605,400,50);
        lbl_Mission.setFont(fnt2);
        CPjp.add(lbl_Mission);
        
        //Powered-by
        lbl_by = new JLabel("Powered By: Aadarsha Muni Shakya");
        lbl_by.setBounds(550,650,400,50); 
        lbl_by.setFont(fnt2);
        CPjp.add(lbl_by);
        
        //Academic Course Panel
        ACjp = new JPanel();
        ACjp.setBounds(0,0,1440,900);
        ACjp.setBackground(new Color(178, 240, 158));
        ACjp.setLayout(null);
        
        
        //Row 1
        //Title Academic Coures
        lbl_AC = new JLabel("Academic Course");
        lbl_AC.setBounds(535,5,700,50);
        lbl_AC.setFont(fnt1);
        ACjp.add(lbl_AC);
        
        //Row 2
        ///CourseID        
        lbl_AC_ID = new JLabel("Coures ID:");
        lbl_AC_ID.setBounds(120,80,100,50);
        lbl_AC_ID.setFont(fnt2);
        ACjp.add(lbl_AC_ID);
        ///Coures ID text field
        txt_AC_ID = new JTextField();
        txt_AC_ID.setBounds(220,90,200,30);
        txt_AC_ID.setFont(fnt2);
        ACjp.add(txt_AC_ID);
        
        //Coures Name
        lbl_AC_Name = new JLabel("Course Name:");
        lbl_AC_Name.setBounds(860,80,140,50);
        lbl_AC_Name.setFont(fnt2);
        ACjp.add(lbl_AC_Name);
        ///Course Name text field
        txt_AC_Name = new JTextField();
        txt_AC_Name.setBounds(995,90,200,30);
        txt_AC_Name.setFont(fnt2);
        ACjp.add(txt_AC_Name);
        
        //row 3
        ///Duration
        lbl_AC_Duration = new JLabel("Duration:");
        lbl_AC_Duration.setBounds(80,160,90,50);
        lbl_AC_Duration.setFont(fnt2);
        ACjp.add(lbl_AC_Duration);
        ///Duration text field
        txt_AC_Duration = new JTextField();
        txt_AC_Duration.setBounds(170,170,150,30);
        txt_AC_Duration.setFont(fnt2);
        ACjp.add(txt_AC_Duration);
        ///Level
        lbl_AC_Level = new JLabel("Level:");
        lbl_AC_Level.setBounds(520,160,70,50);
        lbl_AC_Level.setFont(fnt2);
        ACjp.add(lbl_AC_Level);
        ///Level text field
        txt_AC_Level = new JTextField();
        txt_AC_Level.setBounds(590,170,150,30);
        txt_AC_Level.setFont(fnt2);
        ACjp.add(txt_AC_Level);
        ///Credit
        lbl_AC_Credit = new JLabel("Credit:");
        lbl_AC_Credit.setBounds(1000,160,70,50);
        lbl_AC_Credit.setFont(fnt2);
        ACjp.add(lbl_AC_Credit);
        /// Credit Text field
        txt_AC_Credit = new JTextField(); 
        txt_AC_Credit.setBounds(1070,170,150,30);
        txt_AC_Credit.setFont(fnt2);
        ACjp.add(txt_AC_Credit);
       
        //Row 4
        //Number of Assessments
        lbl_AC_NOA = new JLabel("Number of Assessments:");
        lbl_AC_NOA.setBounds(450,240,240,50);
        lbl_AC_NOA.setFont(fnt2);
        ACjp.add(lbl_AC_NOA);
        ///Number of Assessments text field
        txt_AC_NOA = new JTextField(); 
        txt_AC_NOA.setBounds(695,250,200,30);
        txt_AC_NOA.setFont(fnt2);
        ACjp.add(txt_AC_NOA);
        
        //Row 5 Add button
        btn_AC_add = new JButton("Add");
        btn_AC_add.setBounds(610,335,100,40);
        btn_AC_add.setFont(fnt2);
        btn_AC_add.setBackground(Color.WHITE);
        ACjp.add(btn_AC_add);
        
        //Row 6
        //Coures Leader
        lbl_AC_Leader = new JLabel("Coures Leader:");
        lbl_AC_Leader.setBounds(120,410,150,50);
        lbl_AC_Leader.setFont(fnt2);
        ACjp.add(lbl_AC_Leader);
        ///Coures Leader text field
        txt_AC_Leader = new JTextField();
        txt_AC_Leader.setBounds(260,420,200,30);
        txt_AC_Leader.setFont(fnt2);
        ACjp.add(txt_AC_Leader);
        
        //Lecturer Name
        lbl_AC_Lecturer = new JLabel("Lecturer Name:");
        lbl_AC_Lecturer.setBounds(850,410,150,50);
        lbl_AC_Lecturer.setFont(fnt2);
        ACjp.add(lbl_AC_Lecturer);
        ///Course Name text field
        txt_AC_Lecturer = new JTextField();
        txt_AC_Lecturer.setBounds(995,420,200,30);
        txt_AC_Lecturer.setFont(fnt2);
        ACjp.add(txt_AC_Lecturer);
        
        //Row 7
        //Starting Date
        lbl_AC_SDate = new JLabel("Starting Date:");
        lbl_AC_SDate.setBounds(120,490,150,50);
        lbl_AC_SDate.setFont(fnt2);
        ACjp.add(lbl_AC_SDate);
        ///Starting Date text field
        txt_AC_SDate = new JTextField();
        txt_AC_SDate.setBounds(250,500,200,30);
        txt_AC_SDate.setFont(fnt2);
        ACjp.add(txt_AC_SDate);
        
        //Completion Date
        lbl_AC_CDate = new JLabel("Completion Date:");
        lbl_AC_CDate.setBounds(830,490,170,50);
        lbl_AC_CDate.setFont(fnt2);
        ACjp.add(lbl_AC_CDate);
        ///Course Name text field
        txt_AC_CDate = new JTextField();
        txt_AC_CDate.setBounds(995,500,200,30);
        txt_AC_CDate.setFont(fnt2);
        ACjp.add(txt_AC_CDate);
        
        //Row 8
        btn_AC_Register = new JButton("Register");
        btn_AC_Register.setBounds(585,580,150,40);
        btn_AC_Register.setFont(fnt2);
        btn_AC_Register.setBackground(Color.WHITE);
        ACjp.add(btn_AC_Register);
        
        //Row 9
        //Changing AC and NC
        btn_AC1 = new JButton("Academic Course");
        btn_AC1.setBounds(50,650,200,40);
        btn_AC1.setFont(fnt2);
        btn_AC1.setBackground(Color.WHITE);
        btn_NC1 = new JButton("Non Academin Course");
        btn_NC1.setBounds(270,650,250,40);
        btn_NC1.setFont(fnt2);
        btn_NC1.setBackground(Color.WHITE);
        ACjp.add(btn_AC1);
        ACjp.add(btn_NC1);
        
        //Clear Button
        btn_AC_Clear = new JButton("Clear");
        btn_AC_Clear.setBounds(1075,650,100,40);
        btn_AC_Clear.setBackground(Color.WHITE);
        btn_AC_Clear.setFont(fnt2);
        ACjp.add(btn_AC_Clear);
               
        //Display Button
        btn_AC_Display = new JButton("Display");
        btn_AC_Display.setBounds(1200,650,100,40);
        btn_AC_Display.setBackground(Color.WHITE);
        btn_AC_Display.setFont(fnt2);
        ACjp.add(btn_AC_Display);
        
        //Panel for Non Academic Course
        NCjp = new JPanel();
        NCjp.setBounds(0,0,1440,900);
        NCjp.setBackground(new Color(178, 240, 158));
        NCjp.setLayout(null);
        
        //Row 1
        //Title Academic Coures
        lbl_NC = new JLabel("Non Academic Course");
        lbl_NC.setBounds(505,5,400,50);
        lbl_NC.setFont(fnt1);
        NCjp.add(lbl_NC);
        
        //Row 2
        ///CourseID        
        lbl_NC_ID = new JLabel("Coures ID:");
        lbl_NC_ID.setBounds(120,90,100,50);
        lbl_NC_ID.setFont(fnt2);
        NCjp.add(lbl_NC_ID);
        ///Coures ID text field
        txt_NC_ID = new JTextField();
        txt_NC_ID.setBounds(220,100,200,30);
        txt_NC_ID.setFont(fnt2);
        NCjp.add(txt_NC_ID);
        
        //Coures Name
        lbl_NC_Name = new JLabel("Course Name:");
        lbl_NC_Name.setBounds(860,90,140,50);
        lbl_NC_Name.setFont(fnt2);
        NCjp.add(lbl_NC_Name);
        ///Course Name text field
        txt_NC_Name = new JTextField();
        txt_NC_Name.setBounds(995,100,200,30);
        txt_NC_Name.setFont(fnt2);
        NCjp.add(txt_NC_Name);
        
        //row 3
        ///Duration
        lbl_NC_Duration = new JLabel("Duration:");
        lbl_NC_Duration.setBounds(120,180,100,50);
        lbl_NC_Duration.setFont(fnt2);
        NCjp.add(lbl_NC_Duration);
        ///Duration text field
        txt_NC_Duration = new JTextField();
        txt_NC_Duration.setBounds(210,190,200,30);
        txt_NC_Duration.setFont(fnt2);
        NCjp.add(txt_NC_Duration);
        ///Prerequsit
        lbl_NC_Prerequsit = new JLabel("Prerequsit:");
        lbl_NC_Prerequsit.setBounds(880,180,100,50);
        lbl_NC_Prerequsit.setFont(fnt2);
        NCjp.add(lbl_NC_Prerequsit);
        ///Prerequsit Text field
        txt_NC_Prerequsit = new JTextField(); 
        txt_NC_Prerequsit.setBounds(995,190,200,30);
        txt_NC_Prerequsit.setFont(fnt2);
        NCjp.add(txt_NC_Prerequsit);
        
        //Row 4
        btn_NC_add = new JButton("Add");
        btn_NC_add.setBounds(610,270,100,40);
        btn_NC_add.setFont(fnt2);
        btn_NC_add.setBackground(Color.WHITE);
        NCjp.add(btn_NC_add);
        
        //Row 5
        //Coures Leader
        lbl_NC_Leader = new JLabel("Coures Leader:");
        lbl_NC_Leader.setBounds(120,350,140,50);
        lbl_NC_Leader.setFont(fnt2);
        NCjp.add(lbl_NC_Leader);
        ///Coures Leader text field
        txt_NC_Leader = new JTextField();
        txt_NC_Leader.setBounds(270,360,200,30);
        txt_NC_Leader.setFont(fnt2);
        NCjp.add(txt_NC_Leader);
        
        //Instrutor Name
        lbl_NC_Instrutor = new JLabel("Instrutor Name:");
        lbl_NC_Instrutor.setBounds(850,350,140,50);
        lbl_NC_Instrutor.setFont(fnt2);
        NCjp.add(lbl_NC_Instrutor);
        ///Course Name text field
        txt_NC_Instrutor = new JTextField();
        txt_NC_Instrutor.setBounds(995,360,200,30);
        txt_NC_Instrutor.setFont(fnt2);
        NCjp.add(txt_NC_Instrutor);
        
        //Row6
        ///Starting Date
        lbl_NC_SDate = new JLabel("Starting Date:");
        lbl_NC_SDate.setBounds(80,440,150,50);
        lbl_NC_SDate.setFont(fnt2);
        NCjp.add(lbl_NC_SDate);
        ///Starting Date text field
        txt_NC_SDate = new JTextField();
        txt_NC_SDate.setBounds(210,450,150,30);
        txt_NC_SDate.setFont(fnt2);
        NCjp.add(txt_NC_SDate);
        ///Completion Date
        lbl_NC_CDate = new JLabel("Completion Date:");
        lbl_NC_CDate.setBounds(505,440,170,50);
        lbl_NC_CDate.setFont(fnt2);
        NCjp.add(lbl_NC_CDate);
        ///CDate text field
        txt_NC_CDate = new JTextField();
        txt_NC_CDate.setBounds(670,450,170,30);
        txt_NC_CDate.setFont(fnt2);
        NCjp.add(txt_NC_CDate);
        ///EDate
        lbl_NC_EDate = new JLabel("Exam Date:");
        lbl_NC_EDate.setBounds(960,440,150,50);
        lbl_NC_EDate.setFont(fnt2);
        NCjp.add(lbl_NC_EDate);
        /// EDate Text field
        txt_NC_EDate = new JTextField(); 
        txt_NC_EDate.setBounds(1070,450,150,30);
        txt_NC_EDate.setFont(fnt2);
        NCjp.add(txt_NC_EDate);
        
        
        //Row 7
        //Register Button
        btn_NC_Register = new JButton("Register");
        btn_NC_Register.setBounds(505,550,150,40);
        btn_NC_Register.setFont(fnt2);
        btn_NC_Register.setBackground(Color.WHITE);
        NCjp.add(btn_NC_Register);
        //Remove Button
        btn_NC_Remove = new JButton("Remove");
        btn_NC_Remove.setBounds(680,550,150,40);
        btn_NC_Remove.setFont(fnt2);
        btn_NC_Remove.setBackground(Color.WHITE);
        NCjp.add(btn_NC_Remove);
        
        //Row 8
        //Changing AC and NC
        btn_AC2 = new JButton("Academic Course");
        btn_AC2.setBounds(50,650,200,40);
        btn_AC2.setFont(fnt2);
        btn_AC2.setBackground(Color.WHITE);
        btn_NC2 = new JButton("Non Academin Course");
        btn_NC2.setBounds(270,650,250,40);
        btn_NC2.setFont(fnt2);
        btn_NC2.setBackground(Color.WHITE);
        NCjp.add(btn_AC2);
        NCjp.add(btn_NC2);
        
    
        
        //Clear Button
        btn_NC_Clear = new JButton("Clear");
        btn_NC_Clear.setBounds(1075,650,100,40);
        btn_NC_Clear.setFont(fnt2);
        btn_NC_Clear.setBackground(Color.WHITE);
        NCjp.add(btn_NC_Clear);
        //Display Button
        btn_NC_Display = new JButton("Display");
        btn_NC_Display.setBounds(1200,650,100,40);
        btn_NC_Display.setFont(fnt2);
        btn_NC_Display.setBackground(Color.WHITE);
        NCjp.add(btn_NC_Display);
        
        
        
        
        
        
        
        //Action Listene
        //switching between tabs
        btn_AC1.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                        {
                            ACjp.setVisible(true);
                            NCjp.setVisible(false);
                            CPjp.setVisible(false);
                        }
                }
            );
        btn_NC1.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                        {
                            ACjp.setVisible(false);
                            NCjp.setVisible(true);
                            CPjp.setVisible(false);
                        }
                }
            );
        btn_AC2.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                        {
                            NCjp.setVisible(false);
                            ACjp.setVisible(true);
                            CPjp.setVisible(false);
                        }
                }
            );
        btn_NC2.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                        {
                           NCjp.setVisible(true);
                           ACjp.setVisible(false);
                           CPjp.setVisible(false);
                        }
                }
            );
        btn_AC3.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                        {
                            ACjp.setVisible(true);
                            NCjp.setVisible(false);
                            CPjp.setVisible(false);
                        }
                }
            );
        btn_NC3.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                        {
                            ACjp.setVisible(false);
                            NCjp.setVisible(true);
                            CPjp.setVisible(false);
                        }
                }
            );
        jf.add(CPjp);
        jf.add(ACjp);
        jf.add(NCjp);    
        
        ///creating array list of course class
        academicCourseList = new ArrayList<Course>();
        nonAcademicCourseList = new ArrayList<Course>();
        
        ///For academic course
        //add button
        
        btn_AC_add.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                        {
                            String AC_CourseID = txt_AC_ID.getText();
                            String AC_Name = txt_AC_Name.getText();
                            String AC_Level = txt_AC_Level.getText();
                            String AC_Credit = txt_AC_Credit.getText();
                            /// try catch for integers i.e. duration and number of assessements
                            try
                            {
                                String AC_Duration_d = txt_AC_Duration.getText();
                                int AC_Duration = Integer.parseInt(AC_Duration_d);
                                String AC_NOA_d = txt_AC_NOA.getText();
                                int AC_NOA = Integer.parseInt(AC_NOA_d);
                            }
                            catch(Exception ex)
                            {
                                String AC_Duration_d = txt_AC_Duration.getText();
                                String AC_NOA_d = txt_AC_NOA.getText();
                                if(AC_Duration_d.isEmpty() || AC_NOA_d.isEmpty())
                                {
                                    JOptionPane.showMessageDialog(jf,"The text field is empty");
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(jf,"Invalid data type!!!");
                                }
                            }
                            
                            String AC_NOA_d = txt_AC_NOA.getText();
                            int AC_NOA = Integer.parseInt(AC_NOA_d);
                            String AC_Duration_d = txt_AC_Duration.getText();
                            int AC_Duration = Integer.parseInt(AC_Duration_d);
                            if (AC_CourseID.isEmpty() || AC_Name.isEmpty() || AC_Level.isEmpty() || AC_Credit.isEmpty())
                            {
                                JOptionPane.showMessageDialog(jf,"The text field is empty");
                            }
                            else
                            { 
                                for(Course c :academicCourseList)
                                {
                                    if(AC_CourseID.equals(c.getCourseID()))
                                    {
                                        JOptionPane.showMessageDialog(jf,"Given ID is already added!!! Please try with a different ID.");
                                        return;
                                    }
                                }  
                                Course AC_obj_add = new AcademicCourse(AC_CourseID,AC_Name,AC_Duration,AC_Level,AC_Credit,AC_NOA);
                                academicCourseList.add(AC_obj_add);
                                JOptionPane.showMessageDialog(jf,"The records are added");
                            }   
                        }
                }
            );
        ///Register button
        btn_AC_Register.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                        {
                            String AC_CourseLeader = txt_AC_Leader.getText();
                            String AC_LecturerName = txt_AC_Lecturer.getText();
                            String AC_SDate = txt_AC_SDate.getText();
                            String AC_CDate = txt_AC_CDate.getText();
                            
                            if(AC_CourseLeader.isEmpty() || AC_LecturerName.isEmpty() || AC_SDate.isEmpty() || AC_CDate.isEmpty())
                                {
                                    JOptionPane.showMessageDialog(jf,"The text field is empty");    
                                }
                                else
                                {
                                    for (int i = 0 ; i<academicCourseList.size();i++)
                                    {
                                        if(academicCourseList.get(i).getCourseID().equals(txt_AC_ID.getText()))
                                        {
                                            AcademicCourse ac = (AcademicCourse)academicCourseList.get(i);  
                                            if(!ac.getIsRegistered())
                                            {
                                                ac.register(AC_CourseLeader, AC_LecturerName, AC_SDate, AC_CDate);
                                                JOptionPane.showMessageDialog(jf,"The Academic course is registered");
                                            }
                                            else if(ac.getIsRegistered())
                                            {
                                                JOptionPane.showMessageDialog(jf,"The Academic course is already registered");    
                                            }
                                            else
                                            {
                                                JOptionPane.showMessageDialog(jf,"The Course ID dosen't match!!!");
                                            }
                                        }
                                    }
                                }                             
                            
                        }
                }
            );
        ///Clear button
        btn_AC_Clear.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    txt_AC_ID.setText("");
                    txt_AC_Name.setText("");
                    txt_AC_Duration.setText("");
                    txt_AC_Level.setText("");
                    txt_AC_Credit.setText("");
                    txt_AC_NOA.setText("");
                    txt_AC_Leader.setText("");
                    txt_AC_Lecturer.setText("");
                    txt_AC_SDate.setText("");
                    txt_AC_CDate.setText("");
                    JOptionPane.showMessageDialog(jf,"All text fields are cleared");
                }
            }
        );
        /// Display button
        btn_AC_Display.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    AC_df = new JFrame("Display");
                    AC_df.setBounds(80,150,1300,500);
                     
                    
                    AC_TableModel = new DefaultTableModel();
                        
                    table_AC_Display = new JTable(AC_TableModel);
                    
                    AC_TableModel.addColumn("Course ID");
                    AC_TableModel.addColumn("Course Name");
                    AC_TableModel.addColumn("Level");
                    AC_TableModel.addColumn("Credit");
                    AC_TableModel.addColumn("Duration");
                    AC_TableModel.addColumn("Number of Assessments");
                    AC_TableModel.addColumn("Course Leader");
                    AC_TableModel.addColumn("Lecturer Name");
                    AC_TableModel.addColumn("Starting Date");
                    AC_TableModel.addColumn("Complition Date");
                    
                    
                        
                    String[] columnNames = {"Course ID","Course Name","Level","Credit","Duration","Number of Assessments","Course Leader","Lecturer Name","Starting Date","Complition Date"};
                        
                    AC_TableModel.addRow(columnNames);
                    
                    for (int i = 0; i<academicCourseList.size();i++)
                    {
                        if(academicCourseList.get(i).getCourseID().equals(txt_AC_ID.getText()))
                        {
                            AcademicCourse AC = (AcademicCourse)(academicCourseList.get(i));
                            String AC_CourseID = AC.getCourseID(); 
                            String AC_Name =  AC.getCourseName();
                            String AC_Level = AC.getLevel();
                            String AC_Credit = AC.getCredit();
                            int AC_Duration_d = AC.getDuration();
                            String AC_Duration = Integer.toString(AC_Duration_d);
                            int AC_NOA_d = AC.getNumberOfAssessments();
                            String AC_NOA = Integer.toString(AC_NOA_d); 
                            String AC_CourseLeader = AC.getCourseLeader();
                            String AC_LecturerName = AC.getLecturerName();
                            String AC_SDate = AC.getStartingDate();
                            String AC_CDate = AC.getCompletionDate();
                            
                            String[] data = {AC_CourseID,AC_Name,AC_Level,AC_Credit,AC_Duration,AC_NOA,AC_CourseLeader,AC_LecturerName,AC_SDate,AC_CDate};
                            AC_TableModel.addRow(data);
                        }    
                    }  
                    AC_df.add(table_AC_Display); 
                    AC_df.setVisible(true);
                }
            }
        );
        ///Action listener for NonAcademicCourse
        ///Add button
        btn_NC_add.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                        {
                            String NC_CourseID = txt_NC_ID.getText();
                            String NC_Name = txt_NC_Name.getText();
                            String NC_Prerequsit = txt_NC_Prerequsit.getText();
                            
                            ///Try catch for integer
                            try
                            {
                                String NC_Duration_d = txt_NC_Duration.getText();
                                int NC_Duration = Integer.parseInt(NC_Duration_d);
                            }
                            catch(NumberFormatException ex)
                            {
                                String NC_Duration_d = txt_NC_Duration.getText();
                                if(NC_Duration_d.isEmpty())
                                {
                                    JOptionPane.showMessageDialog(jf,"The text field is empty");    
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(jf,"Invalid data type!!!");
                                }
                            }
                            
                            String NC_Duration_d = txt_NC_Duration.getText();
                            int NC_Duration = Integer.parseInt(NC_Duration_d);
                             if (NC_CourseID.isEmpty() || NC_Name.isEmpty() || NC_Prerequsit.isEmpty()) 
                            {
                                JOptionPane.showMessageDialog(jf,"The text field is empty");
                            }
                            else
                            {
                                for (Course c : nonAcademicCourseList)
                                {
                                    if(NC_CourseID.equals(c.getCourseID()))
                                    {
                                        JOptionPane.showMessageDialog(jf,"Given ID is already added!!! Please try with a different ID.");
                                        return;   
                                    }
                                }
                                NonAcademicCourse NC_obj_add = new NonAcademicCourse(NC_CourseID,NC_Name,NC_Duration,NC_Prerequsit);
                                nonAcademicCourseList.add(NC_obj_add);
                                JOptionPane.showMessageDialog(jf,"The records are added");
                            }   
                        }
                }
            );
        ///Register button
        btn_NC_Register.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                        {
                            String NC_CourseLeader = txt_NC_Leader.getText();
                            String NC_InstrutorName = txt_NC_Instrutor.getText();
                            String NC_SDate = txt_NC_SDate.getText();
                            String NC_CDate = txt_NC_CDate.getText();
                            String NC_EDate = txt_NC_EDate.getText();
                            
                            if(NC_CourseLeader.isEmpty() || NC_InstrutorName.isEmpty() || NC_SDate.isEmpty() || NC_CDate.isEmpty() || NC_EDate.isEmpty())
                            {
                                JOptionPane.showMessageDialog(jf,"The text field is empty");
                            }          
                            else
                            {
                                for(int i = 0;i<nonAcademicCourseList.size();i++)
                                {
                                    if(nonAcademicCourseList.get(i).getCourseID().equals(txt_NC_ID.getText()))
                                    {
                                        NonAcademicCourse nac = (NonAcademicCourse) nonAcademicCourseList.get(i);
                                        if(!nac.getIsRegistered())
                                        {
                                            nac.register(NC_CourseLeader, NC_InstrutorName, NC_SDate, NC_CDate, NC_EDate);
                                            
                                            JOptionPane.showMessageDialog(jf,"The Non Acaremic Course is registered");           
                                        }
                                        else if(nac.getIsRegistered())
                                        {
                                            JOptionPane.showMessageDialog(jf,"The Non Academic course is already registered");     
                                        }
                                        else
                                        {
                                            JOptionPane.showMessageDialog(jf,"The Course ID dosent match!!!"); 
                                        }
                                    }
                                }
                            }
                        }
                }
            );
        ///Remove button
        btn_NC_Remove.addActionListener(new ActionListener()
                { 
                    public void actionPerformed(ActionEvent e)
                        {
                            if (txt_NC_Leader.getText().isEmpty() || txt_NC_Instrutor.getText().isEmpty() || txt_NC_SDate.getText().isEmpty() || txt_NC_CDate.getText().isEmpty() ||txt_NC_EDate.getText().isEmpty())
                            {
                                JOptionPane.showMessageDialog(jf,"The text field is empty");    
                            }
                            else
                            {
                                for(int i = 0; i<nonAcademicCourseList.size(); i++ )
                                {
                                    if(nonAcademicCourseList.get(i).getCourseID().equals(txt_NC_ID.getText()))
                                    {
                                        NonAcademicCourse nac = (NonAcademicCourse) nonAcademicCourseList.get(i);
                                        if(!nac.getIsRemoved())
                                        {
                                            nac.remove();
                                            JOptionPane.showMessageDialog(jf,"The Non Academic course is removed");
                                        }
                                        else if(nac.getIsRemoved())
                                        {
                                            JOptionPane.showMessageDialog(jf,"The Non Academic course is already removed");     
                                        }
                                        else
                                        {
                                            JOptionPane.showMessageDialog(jf,"The Course ID dosent match!!!"); 
                                        }
                                    }
                                }
                            }
                        }
                }
            );
        ///Clear button
        btn_NC_Clear.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    txt_NC_ID.setText("");
                    txt_NC_Name.setText("");
                    txt_NC_Duration.setText("");
                    txt_NC_Prerequsit.setText("");
                    txt_NC_Leader.setText("");
                    txt_NC_Instrutor.setText("");
                    txt_NC_SDate.setText("");
                    txt_NC_CDate.setText("");
                    txt_NC_EDate.setText("");
                    JOptionPane.showMessageDialog(jf,"All text fields are cleared");
                }
            }
        );
        /// Display button
        btn_NC_Display.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    //Display frame for Non Academic    
                    NC_df = new JFrame("Display");
                    NC_df.setBounds(80,200,1200,500);
                    
                        
                    NC_TableModel = new DefaultTableModel();
                        
                    table_NC_Display = new JTable(NC_TableModel);
                        
                    NC_TableModel.addColumn("Course ID");
                    NC_TableModel.addColumn("Course Name");
                    NC_TableModel.addColumn("Prerequsit");
                    NC_TableModel.addColumn("Duration");
                    NC_TableModel.addColumn("Course Leader");
                    NC_TableModel.addColumn("Instructoe Name");
                    NC_TableModel.addColumn("Starting Date");
                    NC_TableModel.addColumn("Complition Date");
                    NC_TableModel.addColumn("Exam Date");
                      
                    // Column Names
                    String[] columnNames = {"Course ID","Course Name","Prerequsit","Duration","Course Leader","Instructoe Name","Starting Date","Complition Date","Exam Date"};
                        
                    NC_TableModel.addRow(columnNames);
                    for (int i = 0; i< nonAcademicCourseList.size(); i++)
                    {
                        if(nonAcademicCourseList.get(i).getCourseID().equals(txt_NC_ID.getText()))
                        {
                            NonAcademicCourse NC = (NonAcademicCourse)(nonAcademicCourseList.get(i));
                            String NC_CourseID = NC.getCourseID();
                            String NC_Name = NC.getCourseName();
                            String NC_Prerequsit = NC.getPrerequisite();
                            int NC_Duration_d = NC.getDuration();
                            String NC_Duration = Integer.toString(NC_Duration_d);  
                            String NC_CourseLeader = NC.getCourseLeader();
                            String NC_InstrutorName = NC.getInstrutorName();
                            String NC_SDate = NC.getStartDate();
                            String NC_CDate = NC.getCompletionDate();
                            String NC_EDate = NC.getExamDate();
                            
                            String[] data = {NC_CourseID, NC_Name, NC_Prerequsit, NC_Duration, NC_CourseLeader, NC_InstrutorName, NC_SDate, NC_CDate, NC_EDate};
                            NC_TableModel.addRow(data);
                        }
                        NC_df.add(table_NC_Display);
                        NC_df.setVisible(true);
                    }        
                }
            }
        );
        jf.setVisible(true);
        CPjp.setVisible(true);
        ACjp.setVisible(false);
        NCjp.setVisible(false);
    }
    public static void main(String []args)
    {
        new INGCollege();
    }
}
