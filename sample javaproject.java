//sample


import javax.swing.*;
import java.awt.event.*;

public class Sample implements ActionListener
{   
       
    JMenu  menu1,menu2,menu3,menu4,menu5,menu6;
    JMenuItem ix,iy,i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12;        
        
        {
    JFrame f=new JFrame("Menu and MenuItem Example");            
    JMenuBar mb=new JMenuBar();
            menu1=new JMenu("HOME");
            menu2=new JMenu("DDL");
            menu3=new JMenu("DML");
            menu4=new JMenu("TCL"); 
            menu5=new JMenu("TPL");
            menu6=new JMenu("HELP");
           
             ix=new JMenuItem("login");
             iy=new JMenuItem("exit");
            i1=new JMenuItem("create");           
            i2=new JMenuItem("drop");
            i3=new JMenuItem("alter");
            i4=new JMenuItem("select");           
            i5=new JMenuItem("insert");
            i6=new JMenuItem("update");
            i7=new JMenuItem("delete");                             
            i8=new JMenuItem("commit");
            i9=new JMenuItem("rollback");
            i10=new JMenuItem("grant");
            i11=new JMenuItem("revoke");
            i12=new JMenuItem("help");   
                   
      
           menu1.add(ix);menu1.add(iy);
           menu2.add(i1);menu2.add(i2);menu2.add(i3);
           menu3.add(i4);
            menu3.add(i5);menu3.add(i6);menu3.add(i7);menu4.add(i8);
            menu4.add(i9);menu5.add(i10);menu5.add(i11);
            menu6.add(i12);
            mb.add(menu1);            
            mb.add(menu2);
            mb.add(menu3);  
            mb.add(menu4);         
            mb.add(menu5);
            mb.add(menu6);           
            f.setJMenuBar(mb);            
            f.setSize(1500,1500);
            f.setLayout(null);
            f.setVisible(true);
            ix.addActionListener(this);
            iy.addActionListener(this);
            i1.addActionListener(this);
            i2.addActionListener(this);
            i3.addActionListener(this);
            i4.addActionListener(this);
            i5.addActionListener(this);
            i6.addActionListener(this);
            i7.addActionListener(this);
            i8.addActionListener(this);
            i9.addActionListener(this);
            i10.addActionListener(this);
            i11.addActionListener(this);
            i12.addActionListener(this);
            
        }
       public void actionPerformed(ActionEvent e)
       {
           if(e.getSource()==ix)
           {
             login o=new login();  
           }      
       if(e.getSource()==iy)
       {
           System.exit(0);
       }
           if (e.getSource()==i1)
           {
               create a=new create();
            
           }
           if(e.getSource()==i2)
           {
               drop b=new drop();
           }
           if(e.getSource()==i3)
           {
               alter c=new alter();
           }
           if(e.getSource()==i4)
           {
               select d=new select();
           }
           if(e.getSource()==i5)
           {
               insert g=new insert();
           }
           if(e.getSource()==i6)
           {
               update f=new update();
           }
         
           if(e.getSource()==i7)
           {
              delete j=new delete();
           } 
           if(e.getSource()==i8)
           {
               commit k=new commit();
           }
          
           if(e.getSource()==i9)
           {
               rollback x=new rollback();
           }
           if(e.getSource()==i10)
           {
             grant u=new grant();
           }
           if(e.getSource()==i11)
           {
               revoke n=new revoke();
           }
          if(e.getSource()==i12)
          {
              help q=new help();
          }      
       }
    public static void main(String[] args)
    {
       new  Sample(); 
}
}

1)//login

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class login 
{ 
    
   JFrame f;
    JLabel l1,l2;
 JTextField t1,t2;
 JButton b3,b4;
   JPanel panel= new JPanel();
   JLabel label=new JLabel("Login");
 JButton b1,b2;
 String qry1,userid,password;  
   login()
   {
      f=new JFrame("login"); 
      b1=new JButton("Login");
     b1.setBounds(50,90,90,30);
     f.add(b1);  
      b2=new JButton("Register");
     b2.setBounds(50,150,90,30);
     f.add(b2);
               
       panel.add(label);
       f.add(panel); 
       f.setSize(200,300);
       f.setVisible(true);
       f.setLayout(null);
     b1.addActionListener(new ActionListener()
    {
  public void actionPerformed(ActionEvent ae) {
 LOGIN1 x=new LOGIN1(); 
 
 }}
 );
      b2.addActionListener(new ActionListener()
    {
  public void actionPerformed(ActionEvent ae) {
 
     REG1 Y = new REG1();
 
 }}
 ); 
   }
 public static void main(String arg[])
  {
   
     new login(); 
   }}
   
  1.loginframe 
 
import java.awt.Color;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
public class LOGIN1  implements ActionListener {
    JFrame f;
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b,b1;
    String qry;
    String a,c ,d;
    JPasswordField value = new JPasswordField();  
      //JPasswordField valu = new JPasswordField();  
      
      LOGIN1()
      {
          
    
        f=new JFrame ("login");
        l1=new JLabel("User name :");
        l1.setBounds(100,100,180,30);
        f.add(l1);
          
      t1=new  JTextField("");
      t1.setBounds(250,100,130,30);
      f.add(t1);
        
        l2=new JLabel("Password :");
        l2.setBounds(100,160,180,30);
        f.add(l2);
        
          
      t2=new  JPasswordField ("");
      t2.setBounds(250,160,130,30);
      f.add(t2);
      
      l3=new JLabel ("Confirm password :");
      l3.setBounds(100,230,130,30);
      f.add(l3);
        
      t3=new  JPasswordField ("");
      t3.setBounds(250,230,130,30);
      f.add(t3);
        
     b=new JButton("login");
     b.setBounds(120,350,100,30);
     f.add(b);
      
         b1=new JButton("Exit");
         b1.setBounds(270,350,100,30);
         f.add(b1);
         
         b.addActionListener(this);
         b1.addActionListener(this);
         
        f.setLayout(null);
         f.setSize(500,600);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
          f.getContentPane().setBackground(Color.PINK);
      }
      
      
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            System.exit(0);
        }
        if(ae.getSource()==b)
        {
         String a=t1.getText();
         String c=t2.getText();
        String d=t3.getText();
         
        String password=new String(t2.getText());
        String confirmpassword=new String(t3.getText());
        
   
            try{
                    if(password.equals(confirmpassword))
                    {
                         Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/n","abc","789");
           Statement st = con.createStatement();
           String qry="select password from login where username ='"+t1.getText()+"'";
          ResultSet rs = st.executeQuery(qry);
          System.out.println("created");
       JOptionPane.showConfirmDialog(f, "successfully created", "message", JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
                        int result = 0;
                             
                             if(result == JOptionPane.YES_OPTION)
                 {
                System.exit(0);
                 }
                 
                     if(result == JOptionPane.CANCEL_OPTION)
                     {
                         System.exit(0);
                     }
                        
                    }else
                    {
                         JOptionPane.showMessageDialog(f,"check your  password "," error",JOptionPane.WARNING_MESSAGE);
                    }
           
            }catch(Exception e)
                
            {
                System.out.println(e);
            } 
        }}  

         public static void main(String[] args)
    {
        LOGIN1 l = new LOGIN1();
    }
}

2.register

import java.awt.Color;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class REG1  extends JFrame implements  ItemListener, ActionListener{
    
  JFrame f;
  JLabel l1,l2,l3;
  JTextField t1;
  JPasswordField t2=new JPasswordField();
   JPasswordField t3=new JPasswordField();
  JButton b1,b2;
 String a,b,c,password,confirmpassword; 
  String qry,qry1,qry2;
   
    REG1()
    {
         f = new JFrame("USER");
         l1=new JLabel("UserName :");
        l1.setBounds(100,100,180,30);
         f.add(l1);
        t1=new JTextField("");
        t1.setBounds(250,100,130,30);
        f.add(t1);
   l2=new JLabel("PassWord:");
        l2.setBounds(100,160,180,30);
         f.add(l2);
        t2=new JPasswordField("");
        t2.setBounds(250,160,130,30);
        f.add(t2);
      l3=new JLabel("Conform PassWord:");
        l3.setBounds(100,230,130,30);
         f.add(l3);
        t3=new JPasswordField("");
        t3.setBounds(250,230,130,30);
        f.add(t3);   
          b1=new JButton(" OK");
     b1.setBounds(120,350,100,30);
     f.add(b1);
 b2=new JButton("CANCEL");
     b2.setBounds(270,350,100,30);
     f.add(b2);
 
   
        b1.addActionListener(this);
        b2.addActionListener(this);
         
    f.setLayout(null);
   f.getContentPane().setBackground(Color.RED);  
   
    f.setSize(500,600);
     f.setVisible(true);
   
    
    }
public void actionPerformed(ActionEvent ae) {
 if (ae.getSource() == b1) 
 {
 
String a=t1.getText();
String b=t2.getText();
String c=t3.getText();
String password=new String(t2.getText()); 
 String confirmpassword=new String(t3.getText());
qry="create user"+"'"+a+"'"+"@localhost"+" "+"identified by"+" "+"'"+b+"'"+";";
System.out.println(qry);
 
    try
    {
  if(password.equals(confirmpassword))
{      
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/n","abc","789");
        Statement stmt=con.createStatement();
        
        stmt.executeUpdate(qry);
        System.out.println("created");
        
    JOptionPane.showMessageDialog(f,"Successfully Registered","message",JOptionPane.INFORMATION_MESSAGE);
}
  else{
      JOptionPane.showMessageDialog(f,"Check Your Password","error",JOptionPane.WARNING_MESSAGE); 
    
    }}
         catch(Exception e) 
                 {
           JOptionPane.showMessageDialog(f,"Already Exist.","Alert",JOptionPane.WARNING_MESSAGE);      
                 System.out.println(e);
                 }}
if(ae.getSource()==b2)
{
    System.exit(0);
}}
    public static void main(String[] args) {
     
      REG1 d = new REG1();
    
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
 2)//alter


import java.awt.Component;
import java.awt.event.*;
import java.sql.*;
import java.util.Objects;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;                              
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
public class alter extends JFrame implements  ItemListener, ActionListener
{
    JFrame f;
    JLabel l,l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2,t3,t5;
    JButton b1,b2,b3,gb,drop,modify;
    String tbl[]=new String[100];
    String qry="";  
    String qry2="";
    String qry3="";
    String dt="";
    String dv="";
    String si="";
    String s="";
    String rt="";
    String sr="";
    String db="";
    String tb="";
    String cn="";
    JComboBox c,j;
    String y[] = new String[1];
    JComboBox<String> cb = new JComboBox<>(y);
    JComboBox<String> v = new JComboBox<>(y);
    JComboBox<String> m = new JComboBox<>(y);
   JRadioButton r1,r2,r3;
  
alter()
{ f = new JFrame("frame");
    l=new JLabel("Enter the database name:"); 
    l.setBounds(50,100,200,30);
     
   gb = new JButton("Get Tables");
   gb.setBounds(300,100, 100, 30);
       
    l1=new JLabel("Enter the table name:");
    l1.setBounds(50,150,200,30);
    
    l2=new JLabel("Column name:");
    l2.setBounds(50,300,100,30);
    
     l3=new JLabel("Data Type:");
     l3.setBounds(50,350,100,30);
            
     l4=new JLabel("Size:");
     l4.setBounds(50,400,100,30);
   
     
    l5=new JLabel("Column name:");
    l5.setBounds(500,300,100,30);
    
     l6=new JLabel("Data Type:");
     l6.setBounds(500,350,70,30);
            
     l7=new JLabel("Size:");
     l7.setBounds(500,400,70,30);
   
    t1=new JTextField("");
    t1.setBounds(200,100,100,30);
   
    t2=new JTextField("");
    t2.setBounds(200,300,100,30);
    
    t3=new JTextField("");
    t3.setBounds(200,400,100,30);
 
    
    t5=new JTextField("");
    t5.setBounds(700,400,100,30);
    
    b1=new JButton("Cancel");
    b1.setBounds(250,500,80,30);
    
    b2=new JButton("Next");
    b2.setBounds(150,500,80,30);
    
   b3=new JButton("OK");
   b3.setBounds(50,500,80,30);
    
   modify=new JButton("Modify");
   modify.setBounds(550,500,80,30);
   
   drop=new JButton("Drop");
   drop.setBounds(1000,350,100,30);
   
   cb.setBounds(200,150,100,30);
   
   
String Datatype[] = {"int","varchar","String","Date"};
c =new JComboBox(Datatype);
c.setBounds(200,350,100,30);

String values[] = {"int","varchar","String","Date"};
j=new JComboBox(values);
j.setBounds(700,350,100,30);

r1=new JRadioButton("ADD");
r2=new JRadioButton("MODIFY");    
r3=new JRadioButton("DROP");
r1.setBounds(100,200,100,30);    
r2.setBounds(550,200,100,30);
r3.setBounds(1000,200,100,30);

ButtonGroup bg=new ButtonGroup();    
bg.add(r1);bg.add(r2);bg.add(r3);

    f.add(r1);
    f.add(r2);  
    f.add(r3);    
    f.add(l);
    f.add(l1);
    f.add(l2);
    f.add(l3);
    f.add(l4);
    f.add(l5);
    f.add(l6);
    f.add(l7);
    f.add(t1);
    f.add(cb);
    f.add(t2);
    f.add(t3);
    f.add(t5);
    f.add(c);
    f.add(j);
    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.add(gb);
    f.add(drop);
    f.add(modify);
    
    f.setLayout(null);
    f.setVisible(true);
    f.setSize(1200,800);
    
  b1.addActionListener(this);
  drop.addActionListener(this);
  modify.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  gb.addActionListener(this);
  
  cb.addItemListener(this);
  v.addItemListener(this);
  m.addItemListener(this);
}

  public void itemStateChanged(ItemEvent e) {

        if (e.getSource() == cb) {
            tb = (String) (cb.getSelectedItem());
            altercon ob=new altercon();                        
            ob.getcol(db,tb,cn);
            
        v=new JComboBox(ob.months);
       v.setBounds(1000,250,100,30); 
       f.add(v);
           
        m=new JComboBox(ob.months);
       m.setBounds(700,300,100,30); 
       f.add(m);
         
        }
  
  }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == gb) {
            
           db=t1.getText();
           db=db.trim();              
    
           try{
Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db,"abc","789");

Statement stmt=con.createStatement();

ResultSet rs=stmt.executeQuery("select table_name from information_schema.tables where table_type='base table' and table_schema='" + db +"'");
  
qry="Selected table "+db+"";
System.out.println(qry);
System.out.println(qry2);
while(rs.next())
{
  int i=1;
 tbl[i]=rs.getString(i);
 
 cb.addItem(tbl[i]);

i++;
}


con.close();

}catch(Exception e) 
    
{ System.out.println(e);}


    }
  
if(ae.getSource()==b1)
 {
   System.exit(0);
 }
  
if(ae.getSource()==b3)
{    String c1=t2.getText(); 
 String s=t3.getText();
 dt=dt+c.getItemAt(c.getSelectedIndex());
   qry="Alter table"+" "+tb+" add"+" "+c1+" "+dt+"("+s+")"+";";

c1="";
dt="";
t2.setText("");
t3.setText("");
System.out.println(qry);
altercon db1=new altercon();
db1.altercon(db,qry);
}


if (ae.getSource()==m)
    {tb=(String)(m.getSelectedItem());
        System.out.println(m);
    }

 if(ae.getSource()==modify)
 {   
 sr=sr+m.getItemAt(m.getSelectedIndex());
System.out.println(sr);

 String si=t5.getText();
 dv=dv+j.getItemAt(j.getSelectedIndex());
 qry3="Alter table"+" "+tb+" modify"+" "+sr+" "+dv+"("+si+")"+";";

dv="";
sr="";
t5.setText("");
System.out.println(qry3);
altercon db3=new altercon();
db3.getmodify(db,qry3);     
 }    
 
 if (ae.getSource()==v)
    {tb=(String)(v.getSelectedItem());
        System.out.println(v);
    }
            if(ae.getSource()==drop)
            {
     
 rt=rt+v.getItemAt(v.getSelectedIndex());
System.out.println(rt);

qry2="Alter table"+" "+tb+" "+"drop "+"column"+" "+rt+";";
System.out.println(qry2);
rt="";
t2.setText("");
t3.setText("");
altercon db2=new altercon();
db2.getdrop(db,qry2);

        }
    }
    
public static void main(String s[])
{

    alter a=new alter();
}
}


//altercon
import java.sql.*;
import java.util.Vector;
import javax.swing.JComboBox;
public class altercon {
     Vector months = new Vector();
     String qry;
     
    void getcol(String db,String tb,String cn)
    {
        try{
Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db,"abc","789");

Statement stmt1=con.createStatement();
qry=" Show columns from  "+tb;
 ResultSet rs1=stmt1.executeQuery(qry);
   
while(rs1.next())
{
 months.addElement(rs1.getString(1));
 }
}catch(Exception e) 

{ System.out.println(e);}

}
    
 void altercon(String db,String qry)
 {
     try
   {
       Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection
         ("jdbc:mysql://localhost:3306/"+db,"abc","789");
      Statement stmt=con.createStatement();
      stmt.executeUpdate(qry);
      System.out.println("Added");
      con.close();
      }
   catch (Exception e)
   {
       System.out.println(e);
   }
 }
  void getmodify(String db,String qry3)
 {
     try
   {
       Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection
         ("jdbc:mysql://localhost:3306/"+db,"abc","789");
      Statement stmt=con.createStatement();
      stmt.executeUpdate(qry3);
      System.out.println("Modified");
      con.close();
      }
   catch (Exception e)
   {
       System.out.println(e);
   }
 }
 
    void getdrop(String db, String qry2) {
       
     try{
         
       Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db,"abc","789");
      Statement stmt=con.createStatement();
      stmt.executeUpdate(qry2);
      System.out.println("Droped");
      con.close();
     }
      catch (Exception e)
   {
       System.out.println(e);
    

   }
    } }
3)//create

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField; 
import javax.swing.JComboBox;
public class create  extends JFrame implements ActionListener 
{
   JFrame f=new JFrame("create");
   JLabel l1,l2,l3,l4,l5;
   JTextField t1,t2,t3,t5;
   JComboBox c4;
   JButton SUBMIT,CANCEL,NEXT;
   String db="";
   String dt="";
   String Query="";
   String Query1="";
   String c1="";
   
  create()
  { 
    l1=new JLabel("enter a database name");       
    l1.setBounds(110,100,200,30);
    l2=new JLabel("enter a table name");
    l2.setBounds(110,150,200,30);
    l3=new JLabel("column name");
    l3.setBounds(110,210,200,30); 
    String datatype[]={"int","varchar","date"};
    l4=new JLabel("datatype");
    l4.setBounds(110,270,250,30);  
    l5=new JLabel("size");
    l5.setBounds(110,375,275,30);
    
    t1=new JTextField("");
    t1.setBounds(250,100,200,30);
    t2=new JTextField("");
    t2.setBounds(250,150,200,30);
    t3=new JTextField("");
    t3.setBounds(250,210,200,30);  
    c4=new JComboBox(datatype);
    c4.setBounds(250,275,200,30);
    t5=new JTextField("");
    t5.setBounds(250,380,200,30);
    
   SUBMIT=new JButton("SUBMIT");
   SUBMIT.setBounds(200,425,100,30);
   CANCEL=new JButton("CANCEL");
   CANCEL.setBounds(320,425,100,30);
   NEXT=new JButton("NEXT");
   NEXT.setBounds(440,425,100,30);
   
   SUBMIT.addActionListener(this);
   CANCEL.addActionListener(this);
   NEXT.addActionListener(this);
    f.add(l1);f.add(l2); f.add(l3); 
    f.add(l4);f.add(l5);
    f.add(t1); f.add(t2);f.add(t3);
    f.add(c4);f.add(t5);
    f.add(SUBMIT); f.add(CANCEL);
    f.add(NEXT);
    f.setSize(600,600);
    f.setLayout(null);
    f.setVisible(true);
      }

public void actionPerformed(ActionEvent ae)
{ 
 
String db=t1.getText();
String tb=t2.getText();
String c1=t3.getText();
String s1=t5.getText();

dt=dt+c4.getItemAt(c4.getSelectedIndex());

if(ae.getSource()==NEXT)
{
 Query1=Query1+""+""+c1+" "+dt+"("+s1+")"+",";
}
if(ae.getSource()==SUBMIT)
{
 Query="create table"+" "+tb+"("+Query1+" "+c1+" "+dt+" ("+s1+"));";
}  
c1="";
s1="";
dt="";
tb="";
t3.setText("");
t5.setText("");
//t1.setText("");
//t2.setText("");
 System.out.println(Query);

dbcon db1=new dbcon();
db1.dcon(db,Query,Query1); 

}
public static void main(String args[]) 
{  
create p=new create();
 }
 }
 
//createcon


import java.sql.*;
public class dbcon 
{ 
void dcon(String db,String Query,String Query1)     
{
 try
 {        
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db+"","abc","789");
    Statement stmt=con.createStatement();
    stmt.executeUpdate(Query);
    System.out.println (" table created");
    con.close();     
    }
 catch(Exception e)
 {
    System.out.println(e);
  
    }
    }

}
   
 4) //delete      
         
     
import java.awt.Color;
import java.awt.Component;
import java.awt.event.*;
import java.sql.*;
import java.util.Objects;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;                              
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
public class delete extends JFrame implements  ItemListener, ActionListener{
    
  JFrame f;
  JLabel l1,l2,l3,l4,l5;
  JTextField t1,t2,t3,t4,t5;
  JRadioButton r1,r2;
  JButton gb,b1,b2,b3;
  String tb="";
  String db="";
  String cn="";
  String rt="";
  String opt="";
  String oa="";
  String a="";
  String qry,qry1,qry2,qry3;
    String tbl[]=new String[100];
     String y[] = new String[1];
       JComboBox<String> v = new JComboBox<>(y);
      JComboBox<String> cb = new JComboBox<>(y); 
      JComboBox<String> g = new JComboBox<>(y);
       Object[] oarr;
       String ak="";
       String cl="";
 String colnames="";
String colnames1="",colnames2="",colnames3="";

      JScrollPane jsp;
JTable table = new JTable();
DefaultTableModel model;
 String selectedData[][]= new String[10][10];
String[] col={"name","roll","depart"};
String[] coll={"","",""};
String selectedRow[]=new String[10];
    delete()
    {
         f = new JFrame("DELETE");
         l1=new JLabel("Enter database :");
        l1.setBounds(220,70,180,30);
         f.add(l1);
        t1=new JTextField("");
        t1.setBounds(320,70,150,30);
        f.add(t1);
        gb=new JButton("get table");
        gb.setBounds(560,70,150,30);
        f.add(gb);
        l2=new JLabel("Select table :");
        l2.setBounds(790,70,180,30);
        
        
        
          cb.setBounds(880,70,150,30);
        f.add(l2);
        
        
        
        f.add(cb);
        r1=new JRadioButton("delete all");
       
        r1.setBounds(890,150,100,30);
        r2=new JRadioButton("delete row");
     
        r2.setBounds(130,150,100,30);
        f.add(r1);
        f.add(r2);
        b3=new JButton("Delete row");
       // b3.setBounds(700,500,100,30);
        b3.setBounds(190,580,100,30);
        f.add(b3);
        l4=new JLabel("Select operator:");
        l4.setBounds(140,460,100,30);
        f.add(l4);
        l5=new JLabel("Enter values :");
        l5.setBounds(140,500,100,30);
        f.add(l5);
        t4=new JTextField("");
        t4.setBounds(250,500,140,30);
        f.add(t4);
l3=new JLabel("column name:");
l3.setBounds(140,190,100,30);
f.add(l3);
        b1=new JButton("Delete");
        b1.setBounds(1000,150,100,30);
     
        f.add(b1);
        b2=new JButton("Read");
        b2.setBounds(490,190,100,30);
        f.add(b2);
            jsp=new JScrollPane(table);
    f.add(jsp);
    jsp.setBounds(160,250,520,150);
      b2.addActionListener(this);
      b3.addActionListener(this);
        gb.addActionListener(this);
        b1.addActionListener(this);
        cb.addItemListener(this);
        v.addItemListener(this);
        g.addItemListener(this);
         f.setLayout(null);
         
ButtonGroup bg=new ButtonGroup();    
bg.add(r1);bg.add(r2);
String values[] = {"=","<",">","+","-",">=","<=","==","!="};
g=new JComboBox(values);
g.setBounds(250,460,140,30);
f.add(g);
    f.setVisible(true);
    f.setSize(1200,800);
    
    }
     public void itemStateChanged(ItemEvent e)
     {
           if (e.getSource() == cb) {
            tb = (String) (cb.getSelectedItem());
            deletecon ob=new deletecon();                        
            ob.getcol(db,tb,cn);
            
                  
        v=new JComboBox(ob.months);
       v.setBounds(240,190,130,30); 
       f.add(v);
           
     
           }
     }
    public void actionPerformed(ActionEvent ae) 
    {
         if (ae.getSource() == gb) {
            
           db=t1.getText();
           db=db.trim();              
    
           try{
Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db,"abc","789");

Statement stmt=con.createStatement();

ResultSet rs=stmt.executeQuery("select table_name from information_schema.tables where table_type='base table' and table_schema='" + db +"'");
  
qry="Selected database "+db+"";
System.out.println(qry);
//System.out.println(qry2);
while(rs.next())
{
  int i=1;
 tbl[i]=rs.getString(i);
 cb.addItem(tbl[i]);

i++;
}


con.close();

}catch(Exception e) 
    
{ System.out.println(e);}


    }
  if(ae.getSource()==b1)
  {
      
 rt=rt+cb.getItemAt(cb.getSelectedIndex());
 qry1="delete from "+rt;
 System.out.println(qry1);
 rt="";
deletecon ob = new deletecon();
ob.getdlt(db,qry1);
  }
   if(ae.getSource()==b2)
      {
          //  oa=oa+v.getItemAt(v.getSelectedIndex());
          System.out.println("selected values:");
          DefaultTableModel model = new DefaultTableModel();
         oarr=v.getSelectedObjects();
          for(int i=0; i<oarr.length; i++){
          {
              
              model.setColumnIdentifiers(oarr);
            colnames = colnames + oarr[i] + " ,";
            
           StringBuffer sb= new StringBuffer(colnames);
 sb.deleteCharAt(sb.length()-1);
            qry2="select "+sb+" from "+tb+";";
            System.out.println(qry2);
        table.setModel(model);
             table.setModel(model);
          model.addRow(coll);
          table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
          }
      }
          
             if( Objects.equals(opt,r2))
        {
        }else{
            try{
                Class.forName("com.mysql.jdbc.Driver");
                
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db,"abc","789");
                DefaultTableModel dm=new DefaultTableModel();
                Statement stmt=con.createStatement();
               ResultSet rs=stmt.executeQuery(qry2);
               
               ResultSetMetaData rsmd=rs.getMetaData();
               int cols=rsmd.getColumnCount();
                
                String c[]=new String[cols];
                for(int i=0;i<cols;i++)
                { 
                    c[i]=rsmd.getColumnLabel(i+1);
                   
                    dm.addColumn(c[i]);
                }
                Object row[]=new Object[cols];
                while(rs.next())
                {
                    for(int i=0;i<cols;i++)
                    {
                        row[i]=rs.getString(i+1);
                    }
                    dm.addRow(row);
                    
                }
                table.setModel(dm);
                con.close();
                
            }catch(Exception e)
            {
                System.out.println(e);
            }
  
            if (ae.getSource() == gb) {
 table.setShowHorizontalLines(true);
 table.setGridColor(Color.blue);
 table.selectAll();
 int[] selectedRow = table.getSelectedRows();
 int[] selectedColumns = table.getSelectedColumns();
 for (int i = 0; i < selectedRow.length; i++) {
 for (int j = 0; j < selectedColumns.length; j++) {
 selectedData[i][j] = (String) table.getValueAt(selectedRow[i], selectedColumns[j]);

 }
      }}}}
  
   if(ae.getSource()==b3)
   {
       String ak=t4.getText();
       a=a+v.getItemAt(v.getSelectedIndex());
       rt=rt+g.getItemAt(g.getSelectedIndex());
     
       qry2="delete "+"from"+" "+tb+" where "+a+" "+rt+" "+ak+";";
       System.out.println("ss");
       System.out.println(qry2);
   deletecon ob2=new deletecon();
   ob2.getRow(db,qry2);
      JOptionPane.showMessageDialog(f,"Row deleted."); 
   }
   
  
 }
    public static void main(String[] args) {
     
      delete d = new delete();
    }}
    
 5)  //deletecon


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
public class deletecon {
    
      Vector months = new Vector();
     String qry;
     
    void getcol(String db,String tb,String cn)
    {
        try{
Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db,"abc","789");

Statement stmt1=con.createStatement();
qry=" Show columns from  "+tb;
 ResultSet rs1=stmt1.executeQuery(qry);
   
while(rs1.next())
{
 months.addElement(rs1.getString(1));
 }
}catch(Exception e) 

{ System.out.println(e);}

}
    
  void getdlt(String db,String qry1)
  {
        try
   {
       Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection
         ("jdbc:mysql://localhost:3306/"+db,"abc","789");
      Statement stmt=con.createStatement();
      stmt.executeUpdate(qry1);
      System.out.println("deleted");
      con.close();
      }
   catch (Exception e)
   {
       System.out.println(e);
   }
  }
        void getRow(String db,String qry2)
    {
         try
   {
       Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db,"abc","789");
      Statement stmt=con.createStatement();
      stmt.executeUpdate(qry2);
      System.out.println("row deleted");
      con.close();
      }
   catch (Exception e)
   {
       System.out.println(e);
   }
    }
  }
    
6)//drop

   
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.*;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
public class drop  extends JFrame implements  ItemListener, ActionListener  {

    JFrame f;
    JLabel l1,l2;
    JTextField t1,t2;
    String tb,db;
    String rt;
     String y[] = new String[1];
       JComboBox<String> cb = new JComboBox<>(y);
         Vector months = new Vector();
        String tbl[]=new String[100];
        JRadioButton r1,r2;
        JButton b;
        String qry,qry1,qry2;
        int i=0;
  drop()
  {
      f=new JFrame("database");
      cb.setBounds(250,300,130,30);
      f.add(cb);
        l1=new JLabel("enter database");
        l1.setBounds(50,100,180,30);
        f.add(l1);
        t1=new JTextField("");
        t1.setBounds(150,100,80,30);
        f.add(t1);
      r1=new JRadioButton(" drop database");
      r1.setBounds(100,200,180,30);
      f.add(r1);
      r2=new JRadioButton(" drop table");
      r2.setBounds(400,200,180,30);
      f.add(r2);
   b=new JButton("Drop");
      b.setBounds(270,500,80,30);
      f.add(b);
      b.addActionListener(this);
      r2.addActionListener(this);
      r1.addActionListener(this);
      cb.addItemListener(this);
   
      f.setLayout(null);
      f.setSize(800,800);
      f.setVisible(true);
  }
  
        public void itemStateChanged(ItemEvent e)
        {
             if (e.getSource() == cb)
             {
                    String mysqlUrl = (String) (cb.getSelectedItem());
                   rt= (String) (cb.getSelectedItem());
             }
            
               if (e.getSource() == cb) {
            tb = (String) (cb.getSelectedItem());
            //cb.setBounds(50,200,80,30);
            f.add(cb);
            dropcon ob=new dropcon();                        
            ob.getcol(db,tb);}
        }
  
    public void actionPerformed(ActionEvent ae) 
    {
         
         
      if(ae.getSource()==b)
      {
          System.out.println("ss");
               
          
               JOptionPane.showConfirmDialog(b," Are You  sure want to drop ?", "Swing Tester",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
                int result = 0;
                 if(result == JOptionPane.YES_OPTION)
                 {
                    // rt=rt+cb.getItemAt(cb.getSelectedIndex());
                  qry="drop table "+tb+" "+";";
            
                  qry1="drop database "+rt+";";
                
                  System.out.println(qry1);
                  System.out.println(qry);
                  dropcon ob1=new dropcon();
                  ob1.getdrop(db, qry);
                  dropcon ob2=new dropcon();
                  ob2.getData(db,qry1);
                  
                  System.exit(0);
                 }    
                     
                  else if (result == JOptionPane.NO_OPTION){
               System.exit(0);
            }
          
      }
                
   if(ae.getSource()==r2)
        {
            System.out.println("ff");
            {
         db=t1.getText();
         db=db=db.trim();
         try
         {
             Class.forName("com.mysql.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db,"abc","789");
             Statement stmt=con.createStatement();
             ResultSet rs=stmt.executeQuery("select table_name from information_schema.tables where table_type='base table' and table_schema='"+db+"'");
             while(rs.next())
             {
                 int i=1;
                 tbl[i]=rs.getString(i);
                 cb.addItem(tbl[i]);
                 i++;
                 
             }
             con.close();
         
     }catch(Exception e)
     {
         System.out.println(e);
     }
            }     
        }
    
   
        
        if(ae.getSource()==r1)
        {
    
            System.out.println("Database names.........");
   try{
Class.forName("com.mysql.jdbc.Driver");

String mysqlUrl = "jdbc:mysql://localhost/n";
Connection con = DriverManager.getConnection(mysqlUrl, "abc", "789");
Statement stmt=con.createStatement();
DatabaseMetaData dbmd = con.getMetaData();
ResultSet ctlgs = dbmd.getCatalogs();
while (ctlgs.next())
{
    int i=1;
    tbl[i]=ctlgs.getString(i);
     cb.addItem(tbl[i]);
     i++;
  
   System.out.println(ctlgs.getString(1));
}

con.close();

}catch(Exception e) 
    
{ System.out.println(e);}
   
    }
      
    }  
    
    public static void main(String[] args) {
      drop a= new drop();
     
        
    }

}
  //dropcon  



import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;

public class dropcon 
{
   
      Vector months = new Vector();
     String qry,qry1;
     
    void getcol(String db,String tb)
    {
        try{
Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+ db,"abc","789");

Statement stmt1=con.createStatement();
qry=" Show columns from  "+tb;
 ResultSet rs1=stmt1.executeQuery(qry);
   
while(rs1.next())
{
 months.addElement(rs1.getString(1));
 }
}catch(Exception e) 

{ System.out.println(e);}

    }
    
void getdrop(String db, String qry2) {
       
     try{
         
       Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db+"","abc","789");
      Statement stmt=con.createStatement();
      stmt.executeUpdate(qry2);
      System.out.println("Droped");
      con.close();
     }
      catch (Exception e)
   {
       System.out.println(e);
    

   }
}
void getData(String db,String qry1)
{
         try{
Class.forName("com.mysql.jdbc.Driver");
  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/n","abc","789");
      Statement stmt=con.createStatement();
      stmt.executeUpdate(qry1);
      System.out.println("database Droped");
      con.close();

}catch(Exception e) 
    
{ System.out.println(e);}
    
}}

  7) //insert 

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;

public class insert implements ItemListener, ActionListener {
    JFrame f;
     String tbl[]=new String[100];
    Object[] oarr;
    String y[] = new String[1];
    JLabel l;
    JTextField t1;
    JComboBox<String> bk = new JComboBox<>(y);
    String tname,Dbname="";
    int ch = 0, m, n;
    JButton b, b1,b2,b3;
    JList l1;
    String colnames = "";
    JScrollPane jsp;

    JTable table = new JTable();

    DefaultTableModel model;

    String[] col = {"Name", "Roll Number", "Department"};

    String[] col1 = {"", "", ""};
    String selectedData[][] = new String[10][10];
insert()
{

f = new JFrame("ComboBox Example");

 l=new JLabel("Enter Database Name");
 l.setBounds(110,100,200,30);
 f.add(l);
 
t1=new JTextField("");
t1.setBounds(250,100,200,30);
f.add(t1);

  b = new JButton("Read");
  b.setBounds(120, 230, 80, 30);
  f.add(b);
  
  b1 = new JButton("Insert");
  b1.setBounds(120, 280, 80, 30);
  f.add(b1);
  
b2 = new JButton("Get Tables");
b2.setBounds(125,410,150,30);
f.add(b2);

b3 = new JButton("Exit");
b3.setBounds(125,530,80,30);
f.add(b3);

DefaultListModel<String> listModel = new DefaultListModel<>();
l1 = new JList<>(listModel);
l1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
bk.setBounds(250, 150, 200, 30);
f.add(bk);

bk.addItemListener(this);
b.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
jsp = new JScrollPane(table);
f.add(jsp);
jsp.setBounds(300, 340, 520, 150);
f.setLayout(null);
f.setVisible(true);
f.setSize(1000, 800);
f.setLocationRelativeTo(null);
f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

}

    public void itemStateChanged(ItemEvent e) {

        if (e.getSource() == bk) {
            tname = (String) (bk.getSelectedItem());
            Dbconn ob1=new Dbconn();                        
             ob1.getcol(tname,Dbname);
           l1 = new JList(ob1.months);
l1.setBounds(300,180,100,125);
f.add(l1);      
        }
                 
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b2) {
            
           Dbname=t1.getText();
           Dbname=Dbname.trim();              
    
           try{
Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+Dbname,"abc","789");

Statement stmt=con.createStatement();

ResultSet rs=stmt.executeQuery("select table_name from information_schema.tables where table_type='base table' and table_schema='" + Dbname +"'");
  

while(rs.next())
{
  int i=1;
 tbl[i]=rs.getString(i);
 
 bk.addItem(tbl[i]);

i++;
}


con.close();

}catch(Exception e) 
    
{ System.out.println(e);}

}
             if (ae.getSource() == b) {

            DefaultTableModel model = new DefaultTableModel();

            oarr = l1.getSelectedValues();
            for (int i = 0; i < oarr.length; i++) {
                {
                    model.setColumnIdentifiers(oarr);
                    colnames = colnames + oarr[i] + ",";

                }
            }

            table.setModel(model);
            model.addRow(col1);
        }
              
         if (ae.getSource() == b1) {

            table.setShowHorizontalLines(true);
            table.setGridColor(Color.blue);
            table.selectAll();
            int[] selectedRow = table.getSelectedRows();
            int[] selectedColumns = table.getSelectedColumns();

            for (int i = 0; i < selectedRow.length; i++) {
                for (int j = 0; j < selectedColumns.length; j++) {

                    selectedData[i][j] = (String) table.getValueAt(selectedRow[i], selectedColumns[j]);
                  
                }
            }
           
            Dbconn ob2 = new Dbconn();
             ob2.getdatatype(tname, colnames, selectedData,Dbname);

        }    
         if (ae.getSource() == b3) {
             System.out.println("I m exit button");
               f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
         }
         }

    public static void main(String[] args) 
{
             
       insert x1=new insert() ;

    }

}

//insertcon

   
import java.sql.*;
import javax.swing.*;
import java.util.*;
public class Dbconn
{
    Vector months = new Vector();
     String qry1="";
    int ch=0;
    String dt[]=new String[100];
    
    

    void getcol(String tname,String Dbname)
    {
        try{
Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+Dbname,"abc","789");

Statement stmt1=con.createStatement();
        ResultSet rs1=stmt1.executeQuery("show columns from "+tname);
   
while(rs1.next())
{
 
 months.addElement(rs1.getString(1));
   

}
con.close();

}catch(Exception e) 
    
{ System.out.println(e);}

}
     void getdatatype( String tname,String colnames,String [][] selectedData,String Dbname)
    {
       
         
         try{
Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/n","abc","789");

      StringBuffer sb= new StringBuffer(colnames);
      sb.deleteCharAt(sb.length()-1);
    
 String qry="SELECT "+sb +" from "+ tname;
 
qry1="insert into "+tname+" values(";
Statement stmt1=con.createStatement();
ResultSet rs = stmt1.executeQuery(qry);
       ResultSetMetaData rsmd = rs.getMetaData();
       int n = rsmd.getColumnCount();
         int j=0,k=0;
       for(int i=1;i<=n;i++)
  {
                  
      
    if(rsmd.getColumnTypeName(i)=="INT")
  {
      
      qry1=qry1+ selectedData[j][k]+",";
        k++;     
    
      
  }else
  {
     if(rsmd.getColumnTypeName(i)=="VARCHAR")
         
  {
      
    qry1=qry1+ "'" + selectedData[j][k]+ "'" +",";
      k++;
     
  } 
     else
     {
         if(rsmd.getColumnTypeName(i)=="DATE")
         {
             qry1=qry1+ "'" +selectedData[j][k] +"'" +",";
             k++;
           
         }
     }
  }
      
       
                }
   StringBuffer sb1= new StringBuffer(qry1);
      sb1.deleteCharAt(sb1.length()-1);
      qry1=sb1.toString()+")";
      
   System.out.println(qry1);
  
Statement stmt2=con.createStatement();
stmt2.executeUpdate(qry1);
JOptionPane.showMessageDialog(null, "I am happy.");
con.close();

}catch(Exception e) 
    
{ System.out.println(e);}
         
            

}
      
    }

8)//select

import java.awt.Color;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import java.util.*;
import javax.swing.table.DefaultTableModel;


public class select   implements ItemListener ,ActionListener{
   
    
JFrame f;
  String Dbname;
  String qry,qry1,qry2,qry3,qry4,qry5;
String y[]=new String[1];
  String tbl[]=new String[100];
   Label l,l2,l3;
   String rr;
   JComboBox k;
 Boolean opt1,opt2,opt3,opt4,opt5;
 JRadioButton r1,r2,r3,r4,r5,r6;
JComboBox<String>bk=new JComboBox<>(y);
JComboBox v;
String tname;
int ch=0;
String w;
JButton b,b2;
JList l1;
TextField t1,t2;
 Object[] oarr;
 String colnames="";
String colnames1="",colnames2="",colnames3="";

JScrollPane jsp;
JTable table = new JTable();
DefaultTableModel model;
 String selectedData[][] = new String[10][10];
String[] col={"name","roll","depart"};
String[] coll={"","",""};

select()
{
    
    
    
    f=new JFrame("select");
    b=new JButton("read");
    b.setBounds(659,500,100,30);
    f.add(b);
    DefaultListModel<String> listModel = new DefaultListModel<>();
    l1 =new JList<>(listModel);
    l1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
     l=new Label("Enter DataBase Name :");
    l.setBounds(230,30,150,90);
        f.add(l);
        
      l2=new Label("Choose condition :");
      l2.setBounds(230,280,130,30);
      f.add(l2);
      l3=new Label("Enter values :");
      l3.setBounds(230,400,130,30);
      f.add(l3);
      
        t1=new TextField("");
          t1.setBounds(400,60,120,30);
        f.add(t1);
         b2 = new JButton("Get Tables");
        b2.setBounds(590, 60, 130, 30);
        f.add(b2);
    t2=new TextField("");
    t2.setBounds(400,400,130,30);
    f.add(t2);
        r3=new JRadioButton("ascending");
        r3.setBounds(200,250,150,30);
      //  f.add(r3);
        r4=new JRadioButton("decending");
        r4.setBounds(360,250,150,30);
        //f.add(r4);
        r6=new JRadioButton("filter");
        r6.setBounds(500,150,150,30);
        f.add(r6);
    bk.setBounds(750,60,90,30);
    f.add(bk);
      r1=new JRadioButton("Select All");
        r2=new JRadioButton("Custom");  
        r1.setBounds(200,150,150,30);    
r2.setBounds(350,150,100,30);    
ButtonGroup bg=new ButtonGroup();    
bg.add(r1);bg.add(r2);

f.add(r1);f.add(r2);

 String values[] = {"asc","desc"," '%a' "," 'a%' ","="," '_r_','rekha' "};
k=new JComboBox(values);
k.setBounds(400,280,130,30);
f.add(k);
    
    bk.addItemListener(this);
    b.addActionListener(this);
    b2.addActionListener(this);
   
   
    jsp=new JScrollPane(table);
    f.add(jsp);
    jsp.setBounds(800,250,520,150);
    f.setLayout(null); 
    f.setSize(15000,15000);
    f.setVisible(true);
 
}
 
    public void itemStateChanged(ItemEvent e)
{
    if(e.getSource()==bk)
    {tname=(String)(bk.getSelectedItem());
   
 Dbcon1 ob=new Dbcon1();
ob.getcol2(Dbname,tname);

//v=new JComboBox(ob.months);
//v.setBounds(390,190,80,30);
//f.add(v);
l1=new JList(ob.months);
l1.setBounds(750,140,200,100);
f.add(l1);
    }
}
    
    
 public void actionPerformed(ActionEvent ae)
  {
        if (ae.getSource() == b2) {
            
           Dbname=t1.getText();
           Dbname=Dbname.trim();              
    
           try{
Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+Dbname,"abc","789");

Statement stmt=con.createStatement();

ResultSet rs=stmt.executeQuery("select table_name from information_schema.tables where table_type='base table' and table_schema='" + Dbname +"'");
  
qry="selected table "+Dbname+"";
System.out.println(qry);
while(rs.next())
{
  int i=1;
 tbl[i]=rs.getString(i);
 
 bk.addItem(tbl[i]);

i++;
}


con.close();

}catch(Exception e) 
    
{ System.out.println(e);}

}
      
        
      
             if(   Objects.equals(opt1, r1))
        {
        }else{
            try{
                Class.forName("com.mysql.jdbc.Driver");
                
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+Dbname,"abc","789");
                DefaultTableModel dm=new DefaultTableModel();
                Statement stmt=con.createStatement();
               ResultSet rs=stmt.executeQuery("select * from "+tname);
               
               ResultSetMetaData rsmd=rs.getMetaData();
               int cols=rsmd.getColumnCount();
                
                String c[]=new String[cols];
                for(int i=0;i<cols;i++)
                { 
                    c[i]=rsmd.getColumnLabel(i+1);
                   
                    dm.addColumn(c[i]);
                }
                Object row[]=new Object[cols];
                while(rs.next())
                {
                    for(int i=0;i<cols;i++)
                    {
                        row[i]=rs.getString(i+1);
                    }
                    dm.addRow(row);
                    
                }
                table.setModel(dm);
                con.close();
                
            }catch(Exception e)
            {
                System.out.println(e);
            }
       
        }
               
        
             
      if(ae.getSource()==b)
      {
          System.out.println("selected values:");
          DefaultTableModel model = new DefaultTableModel();
           oarr=l1.getSelectedValues();
          for(int i=0; i<oarr.length; i++){
          {
              model.setColumnIdentifiers(oarr);
            colnames = colnames + oarr[i] + " ,";
         
           StringBuffer sb= new StringBuffer(colnames);
 sb.deleteCharAt(sb.length()-1);
 


 rr= (String) (k.getSelectedItem());
 String w=t2.getText();
           qry1="select "+ sb+"from"+" "+tname+";";
           //qry1="select *"+"from"+" "+tname+"where"+sb+"="+rr+";";
          qry3="select * "+"from"+" "+tname+" order"+" by "+sb+""+rr+";";
           qry4="select * "+"from"+" "+tname+" where "+sb+"like "+"'"+w+"'"+";";
           qry5="select * "+"from"+" "+tname+" where "+sb+" "+rr+"'"+w+"'"+";";
           System.out.println(qry3);
          System.out.println(qry4);
          System.out.println(qry5);
         System.out.println(sb);
           
          System.out.println(qry1);
         table.setModel(model);
             table.setModel(model);
          model.addRow(coll);
          table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
          }
      }
        
        
        
           if(Objects.equals(opt2, r2))
           {}else{
               try{
                Class.forName("com.mysql.jdbc.Driver");
                
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+Dbname,"abc","789");
                DefaultTableModel dm=new DefaultTableModel();
                Statement stmt=con.createStatement();
                 
               ResultSet rs=stmt.executeQuery(qry1);
               
               ResultSetMetaData rsmd=rs.getMetaData();
               int cols=rsmd.getColumnCount();
                
                String c[]=new String[cols];
                for(int i=0;i<cols;i++)
                { 
                    c[i]=rsmd.getColumnLabel(i+1);
                   
                    dm.addColumn(c[i]);
                }
                Object row[]=new Object[cols];
                while(rs.next())
                {
                    for(int i=0;i<cols;i++)
                    {
                        row[i]=rs.getString(i+1);
                    }
                    dm.addRow(row);
                    
                }
                table.setModel(dm);
                con.close();
                
            }catch(Exception e)
            {
                System.out.println(e);
            }
               }
            
        
                   if(Objects.equals(opt3, r3))
                        {}else{
               try{
                Class.forName("com.mysql.jdbc.Driver");
                
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+Dbname,"abc","789");
                DefaultTableModel dm=new DefaultTableModel();
                Statement stmt=con.createStatement();
                 
               ResultSet rs=stmt.executeQuery(qry3);
               
               ResultSetMetaData rsmd=rs.getMetaData();
               int cols=rsmd.getColumnCount();
                
                String c[]=new String[cols];
                for(int i=0;i<cols;i++)
                { 
                    c[i]=rsmd.getColumnLabel(i+1);
                   
                    dm.addColumn(c[i]);
                }
                Object row[]=new Object[cols];
                while(rs.next())
                {
                    for(int i=0;i<cols;i++)
                    {
                        row[i]=rs.getString(i+1);
                    }
                    dm.addRow(row);
                    
                }
                table.setModel(dm);
                con.close();
                
            }catch(Exception e)
            {
                System.out.println(e);
            }
               }
           
        
        
        
        
                   if(Objects.equals(opt3, r3))
                        {}else{
               try{
                Class.forName("com.mysql.jdbc.Driver");
                
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+Dbname,"abc","789");
                DefaultTableModel dm=new DefaultTableModel();
                Statement stmt=con.createStatement();
                 
               ResultSet rs=stmt.executeQuery(qry4);
               
               ResultSetMetaData rsmd=rs.getMetaData();
               int cols=rsmd.getColumnCount();
                
                String c[]=new String[cols];
                for(int i=0;i<cols;i++)
                { 
                    c[i]=rsmd.getColumnLabel(i+1);
                   
                    dm.addColumn(c[i]);
                }
                Object row[]=new Object[cols];
                while(rs.next())
                {
                    for(int i=0;i<cols;i++)
                    {
                        row[i]=rs.getString(i+1);
                    }
                    dm.addRow(row);
                    
                }
                table.setModel(dm);
                con.close();
                
            }catch(Exception e)
            {
                System.out.println(e);
            }
               }
       
           
        
                   if(Objects.equals(opt4, r6))
                        {}else{
               try{
                Class.forName("com.mysql.jdbc.Driver");
                
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+Dbname,"abc","789");
                DefaultTableModel dm=new DefaultTableModel();
                Statement stmt=con.createStatement();
                 
               ResultSet rs=stmt.executeQuery(qry5);
               
               ResultSetMetaData rsmd=rs.getMetaData();
               int cols=rsmd.getColumnCount();
                
                String c[]=new String[cols];
                for(int i=0;i<cols;i++)
                { 
                    c[i]=rsmd.getColumnLabel(i+1);
                   
                    dm.addColumn(c[i]);
                }
                Object row[]=new Object[cols];
                while(rs.next())
                {
                    for(int i=0;i<cols;i++)
                    {
                        row[i]=rs.getString(i+1);
                    }
                    dm.addRow(row);
                    
                }
                table.setModel(dm);
                con.close();
                
            }catch(Exception e)
            {
                System.out.println(e);
            }
               }
                   
        
         if (ae.getSource() == b) {
 table.setShowHorizontalLines(true);
 table.setGridColor(Color.blue);
 table.selectAll();
 int[] selectedRow = table.getSelectedRows();
 int[] selectedColumns = table.getSelectedColumns();
 for (int i = 0; i < selectedRow.length; i++) {
 for (int j = 0; j < selectedColumns.length; j++) {
 selectedData[i][j] = (String) table.getValueAt(selectedRow[i], selectedColumns[j]);

 }
 }
 Dbcon1 ob2 = new Dbcon1();
             
 ob2.getSelect(tname,selectedData,Dbname);
 //ob2.getdata(tname,colnames,selectedData,Dbname,sb,rr);
 
 }
    
  }
  }
 
 public static void main(String[] args) {
      
        select s =new select();
        Dbcon1 ob1=new Dbcon1();
       
         
    }}

 //selectcon
    
    import java.sql.*;
import javax.swing.*;
import java.util.*;
public class Dbcon1
{
Vector months = new Vector();
String qry="";
int ch=0;

String dt[]=new String[100];


    void getcol2(String Dbname,String tbname)
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+Dbname,"abc","789");
            Statement stmt1=con.createStatement();
            qry=" show columns from "+tbname;
            ResultSet rs1=stmt1.executeQuery(qry);
         
            while(rs1.next())
            {
                months.addElement(rs1.getString(1));
                System.out.println(rs1.getString(1));
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }}
    
    void getSelect(String Dbname, String [][]SelectedData,String tname)
            
            
    {
        
       
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+Dbname,"root","");
            Statement stmt1=con.createStatement();
           //
          qry=" select * from "+tname;
        //  qry="select * from "+tbname+"order"+"by"+"name"+"asc"+"";
            ResultSet rs1=stmt1.executeQuery(qry);
         
            while(rs1.next())
            {
                months.addElement(rs1.getString(1));
          
                System.out.println(rs1.getString(1));
            }
        }catch(Exception e)
        {
            System.out.println(e);
        } 
    }
}

9)//update


import java.awt.Color;
import java.awt.event.*;
import java.sql.*;
import java.util.Objects;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;                              
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class update  extends JFrame implements  ItemListener, ActionListener{

 JFrame f;
 JLabel l1,l2,l3,l4,l5,l6,l7,l8;
 JTextField t1,t2,t3,t4,t5;
 JButton b,b1,b2,b3,b4;
   JRadioButton r1,r2;
 String db="";
 String tb="";
 String opt="";
 String rt="";
 String as="";
 String oarr="";
 String sa="";
 String j="";
 String x="";
 String colnames="";
  String tbl[]=new String[100];
  String qry,qry1,qry2;
   String y[] = new String[1];
    JComboBox<String> cb = new JComboBox<>(y);
     JComboBox<String> g = new JComboBox<>(y);
       JComboBox<String> h = new JComboBox<>(y);
       JComboBox<String> k = new JComboBox<>(y);
       JComboBox<String> m = new JComboBox<>(y);
      JScrollPane jsp;
JTable table = new JTable();
DefaultTableModel model;
 String selectedData[][]= new String[10][10];
String[] col={"name","roll","depart"};
String[] coll={"","",""};
    
    update()
    {
      f = new JFrame("UPDATE");
        l1=new JLabel("Enter database name :");
        l1.setBounds(450,100,180,30);
        f.add(l1);
        
        t1=new JTextField("");
        t1.setBounds(600,100,150,30);
        f.add(t1);
        
        b=new JButton("get table");
        b.setBounds(800,100,130,30);
        f.add(b);
        
       l2=new JLabel("Choose table name :");
       l2.setBounds(450,150,150,30);
       f.add(l2);
         
       cb.setBounds(600,150,150,30);
       f.add(cb);
       
       l3=new JLabel("Enter column name :");
       l3.setBounds(50,300,150,30);
       f.add(l3);
       
      b3=new JButton("view");
      b3.setBounds(800,150,130,30);
      f.add(b3);
      
       
       l4=new JLabel("enter new values :");
       l4.setBounds(50,380,150,30);
       f.add(l4);
       //new value
       t3=new JTextField("");
       t3.setBounds(230,380,150,30);
       f.add(t3);
       //update secify
       b1=new JButton("Update");
       b1.setBounds(150,600,130,30);
       f.add(b1);
       
          l5=new JLabel("Enter column name where:");
       l5.setBounds(50,430,180,30);
       f.add(l5);

 
 l6=new JLabel("Enter value from where:");
 l6.setBounds(50,530,150,30);
 f.add(l6);
 
 t5=new JTextField("");
 t5.setBounds(230,530,150,30);
 f.add(t5);
 //update all
 b2=new JButton("Update all");
 b2.setBounds(400,380,130,30);
 f.add(b2);
 
 l7=new JLabel("conditions  :");
         l7.setBounds(50,340,180,30);
         f.add(l7);
         
         l8=new JLabel("conditions :");
         l8.setBounds(50,480,180,30);
         //f.add(l8);
         
        r1=new JRadioButton("update specify");
        r1.setBounds(390,200,180,30);
        
        r2=new JRadioButton("update all");
        r2.setBounds(130,200,180,30);
        
        
        f.add(r1);
        f.add(r2);
        
        String values[] = {"=","<",">","+","-",">=","<=","==","!="};
k=new JComboBox(values);
k.setBounds(230,330,150,30);
f.add(k);
        
String va[] = {"=","<",">","+",">=","<=","==","!="};
m=new JComboBox(values);
m.setBounds(230,480,150,30);
//f.add(m);

 jsp=new JScrollPane(table);
    f.add(jsp);
    jsp.setBounds(660,250,620,350);
     b1.addActionListener(this);
b.addActionListener(this); 
   cb.addItemListener(this);
   g.addItemListener(this);
   b2.addActionListener(this);
   b3.addActionListener(this);
  
    f.setLayout(null);
    f.setVisible(true);
    f.setSize(1500,800);
    }
    
     public void itemStateChanged(ItemEvent e)
     {
          if (e.getSource() == cb) {
            tb = (String) (cb.getSelectedItem());
            updatecon ob=new updatecon();                        
            ob.getcol(db,tb);
            
            //update specify
             g=new JComboBox(ob.months);
      
        g.setBounds(230,300,150,30);
       f.add(g);
       //update all
       h=new JComboBox(ob.months);
     
       h.setBounds(230,430,150,30);
 f.add(h);
       
          }
          
 }
       public void actionPerformed(ActionEvent ae) 
       {
           if(ae.getSource()==b1)
           {
               System.out.println("dd");
               rt=rt+g.getItemAt(g.getSelectedIndex());
             as=as+k.getItemAt(k.getSelectedIndex());
             j=j+h.getItemAt(h.getSelectedIndex());
             String sa=t3.getText();
             String x=t5.getText();
               qry1="update "+tb+" "+"set"+" "+rt+" "+as+" "+"'"+sa+"'"+" "+"where"+" "+j+" "+"="+" "+x+";";
               System.out.println(qry1);
                JOptionPane.showMessageDialog(f,"updated row."); 
               updatecon ob2=new updatecon();
               ob2.getup(db, qry1);
           }
           if(ae.getSource()==b2)
           {
               System.out.println("aa");
               rt=rt+g.getItemAt(g.getSelectedIndex());
                as=as+k.getItemAt(k.getSelectedIndex());
                 String sa=t3.getText();
               qry2="update "+tb+" "+"set"+" "+rt+" "+as+" "+sa+";";
               System.out.println(qry2);
                JOptionPane.showMessageDialog(f,"update all."); 
               updatecon ob3=new updatecon();
               ob3.getups(db, qry2);
           }
         
           
         if (ae.getSource() == b) {
            
           db=t1.getText();
           db=db.trim();              
    
           try{
Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db,"abc","789");

Statement stmt=con.createStatement();

ResultSet rs=stmt.executeQuery("select table_name from information_schema.tables where table_type='base table' and table_schema='" + db +"'");
  
qry="Selected database "+db+"";
System.out.println(qry);

while(rs.next())
{
  int i=1;
 tbl[i]=rs.getString(i);
 
 cb.addItem(tbl[i]);

i++;
}


con.close();

}catch(Exception e) 
    
{ System.out.println(e);}
           
         
         }}
       
    public static void main(String[] args) {
      
        update u = new update();
        
    }

   
    
}

//updatecon


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;

public class updatecon {
    
    
      Vector months = new Vector();
     String qry,qry1;
     
    void getcol(String db,String tb)
    {
        try{
Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+ db,"abc","789");

Statement stmt1=con.createStatement();
qry=" Show columns from  "+tb;
 ResultSet rs1=stmt1.executeQuery(qry);
   
while(rs1.next())
{
 months.addElement(rs1.getString(1));
 }
}catch(Exception e) 

{ System.out.println(e);}

    }
    
void getup(String db,String qry1)
{
    
      try
   {
       Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection
         ("jdbc:mysql://localhost:3306/"+db+"","abc","789");
      Statement stmt=con.createStatement();
      stmt.executeUpdate(qry1);
      
      System.out.println("updated row");
      con.close();
      }
   catch (Exception e)
   {
       System.out.println(e);
   }
  
}
void getups(String db,String qry2)
{
    try
   {
       Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection
         ("jdbc:mysql://localhost:3306/"+db+"","abc","789");
      Statement stmt=con.createStatement();
      stmt.executeUpdate(qry2);
      System.out.println("updated all");
      con.close();
      }
   catch (Exception e)
   {
       System.out.println(e);
   }
    
}
}
10)//commit



import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class commit{
    
   JFrame frame=new JFrame("commit");
   JPanel panel= new JPanel();
   JLabel label=new JLabel("commit");
   commit()
   {
       panel.add(label);
       frame.add(panel);
       frame.setSize(200,300);
      
       frame.setVisible(true);
   }
   public static void main(String arg[])
   {
   
      new commit(); 
   }
}
 
  11)//grant               

        import java.awt.FlowLayout;      
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class grant
{
    JFrame frame=new JFrame("grant");
    JPanel panel=new JPanel();
    JLabel label=new JLabel("grant");
    grant(){
        panel.add(label);
        frame.add(panel);
        frame.setSize(200,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
      public static void main(String arg[])
      {
      grant m=new grant();
      }
      }                             

12)//help
    
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class help{
    
   JFrame frame=new JFrame("help");
   JPanel panel= new JPanel();
   JLabel label=new JLabel("help");
   help()
   {
       panel.add(label);
       frame.add(panel);
       frame.setSize(200,300);
      
       frame.setVisible(true);
   }
   public static void main(String arg[])
   {
   
      new help(); 
   }
}
13)//revoke

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class revoke{
    
   JFrame frame=new JFrame("revoke");
   JPanel panel= new JPanel();
   JLabel label=new JLabel("revoke");
   revoke()
   {
       panel.add(label);
       frame.add(panel);
       frame.setSize(200,300);
      
       frame.setVisible(true);
   }
   public static void main(String arg[])
   {
   
      new revoke(); 
   }
}
14)//rollback
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class rollback{
    
   JFrame frame=new JFrame("rollback");
   JPanel panel= new JPanel();
   JLabel label=new JLabel("rollback");
   rollback()
   {
       panel.add(label);
       frame.add(panel);
       frame.setSize(200,300);
      
       frame.setVisible(true);
   }
   public static void main(String arg[])
   {
   
      new rollback(); 
   }
}
15)//save
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class save{
    
   JFrame frame=new JFrame("save");
   JPanel panel= new JPanel();
   JLabel label=new JLabel("save");
   save()
   {
       panel.add(label);
       frame.add(panel);
       frame.setSize(200,300);
      
       frame.setVisible(true);
   }
   public static void main(String arg[])
   {
   
      new save(); 
   }
}
16)//turnicate
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class turnicate {
    
   JFrame frame=new JFrame("turnicate");
   JPanel panel= new JPanel();
   JLabel label=new JLabel("turnicate");
   turnicate()
   {
       panel.add(label);
       frame.add(panel);
       frame.setSize(200,300);
      
       frame.setVisible(true);
   }
   public static void main(String arg[])
   {
   
      new turnicate(); 
   }
}
17)//point

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class point{
    
   JFrame frame=new JFrame("point");
   JPanel panel= new JPanel();
   JLabel label=new JLabel("point");
   point()
   {
       panel.add(label);
       frame.add(panel);
       frame.setSize(200,300);
      
       frame.setVisible(true);
   }
   public static void main(String arg[])
   {
   
      new point(); 
   }
}
.......................##...............................
