
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.net.URI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
import java.awt.desktop.*;
import java.awt.*;
public class TASK_LAUNCH extends JFrame{

    //All variables, plan is to have a grid layout, three horizontal panels, middle has the ticket adder, bottom has HOTLINKS, Top has.. well.. no plan for that yet.
	private JPanel panel;
	private JLabel label;
	private JButton page;
	private JButton page2;
	private JButton page3;
	private JButton page4;
    private JButton action;
    private JButton action2;
    private JButton addTicket;
	private JTextField text;
	private int width = 750;
	private int height = 500;
	private String path;
	private static boolean flag;
	//GUI Initializer constructor. 
	public TASK_LAUNCH() {
		
		this.setTitle("Ticket Logger MIL");
		this.setSize(width,height);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setBackground(Color.RED);
        launcher();
        add(panel);
        this.setVisible(true);
	}
    
    
    
    //HOTLINKS (Mostly label components).
	public void launcher() {
        
        text = new JTextField(12);
						/* 
						
	TODO: Fix this f**king sh*t, the level of fustration is unbearable right now because
	this f**king seBackground function will not fucking work. Why?
						
						*/
        page = new JButton("New Ticket!");
     //   page.setBackground(Color.ORANGE);
     //   page.setForeground(Color.BLACK);
        page.addActionListener(new service());
        //First Button Initialized..

        page2 = new JButton("Idaptive Page");
    //    page2.setBackgroud(Color.GREEN);
    //    page2.setForeground(Color.BLACK);
        page2.addActionListener(new idaptive());
        //Second Button Initialized.

        action = new JButton("ALL DATA");
     //   action.setBackground(Color.BLACK);
     //   action.seForeground(Color.BLACK);
        action.addActionListener(new TASK_GET_TEXT_ARRAY());
        //Third Button Initialized, this is for the text file data.

        action2 = new JButton("Full Logs");
       // action2.setBackground(Color.WHITE);
    //    action2.setForeground(Color.BLACK);
        action2.addActionListener(new TASK_GET_TEXT_FILE());

        addTicket = new JButton("Save Ticket");
    //    addTicket.setBackground(Color.BLUE);
    //    addTicket.setForeground(Color.BLACK);
        addTicket.addActionListener(new TASK_ADD_TICKET());

        panel = new JPanel();
        panel.add(text);
        panel.add(page);
        panel.add(page2);
        panel.add(action);
        panel.add(action2);
        panel.add(addTicket);
		
	}
    


    public static boolean PATH_DATA(){

        String ans;
        ans = JOptionPane.showInputDialog("Are you a returning User? (y/n)");
        if(ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes")){ flag = true;}
            else{flag = false;}
            return flag;
    }



    //Uses boolean flag to determin path and data and how to use the NEW_TICKET object.
  /*  public void addTickets(){

        String username = System.getProperty("user.name");
        String ans;
        String data = text.getText();
        SD_MIL existingFile = new SD_MIL();
        if(PATH_DATA() == true) {existingFile.fileStart(data);}
            else if(PATH_DATA() == false){
                ans = JOptionPane.showInputDialog(null, "Would you like to start a new file?", "FILE_!", JOptionPane.OK_CANCEL_OPTION);
                    if(ans.equalsIgnoreCase("y") || and.equalsIgnoreCase("yes")){
                        existingFile.fileOpen("C:\\Users\\"+Username+"\\Documents\\TASK_DATA.txt", data);
                        }
                        else if(and.equalsIgnoreCase("n") || ans.equalsIgnoreCase("no")){
                            JOptionPane.showMessageDialog(null, "warning! the program will now shut down!", "Warning!", JOptionPane.ERROR_MESSAGE);
                            System.exit(0);
                            }
                        }
                else{
                System.exit(0);
                }
            }
                */

    //How about an array of all the data i want to append?
    
    public void FUNCTION_ADD_ELEMENTS(String data, boolean addFlag){
        ArrayList <String> datas = new ArrayList <String>();
            while(true){
                datas.add(data); //Don't know if this wil work...
                    if(addFlag == false){ break; }
                }
            }


    //For the first Button.(Link)
	private class service implements ActionListener{
        public void actionPerformed(ActionEvent e){
            try{
			    URI link = new URI("https://loc.servicenowservices.com/nav_to.do?uri=%2Fincident.do%3Fsys_id%3D-1%26sysparm_query%3Dactive%3Dtrue%26sysparm_stack%3Dincident_list.do%3Fsysparm_query%3Dactive%3Dtrue");
                java.awt.Desktop.getDesktop().browse(link);
			    JOptionPane.showMessageDialog(null, "New Ticket Page launched!", "Webpage Message", JOptionPane.ERROR_MESSAGE);}
			catch(Exception d){
				d.printStackTrace();
			}
        }
    }
	//For the second Button.(Link)
	private class idaptive implements ActionListener{
        public void actionPerformed(ActionEvent e){
            try{
                URI Ilink = new URI("https://loc.my.idaptive.app");
                java.awt.desktop.getDesktop().browse(Ilink);
                JOptionPane.showMessageDialog(null, "Idaptive Page Lauched!", "Webpage Message", JOptionPane.OK_OPTION);
            }
            catch(Exception x){
                x.printStackTrace();
            }
        }
    }
    //For the Third Button.(Get the array of the .txt file.)
	private class TASK_GET_TEXT_ARRAY implements ActionListener{
        public void actionPerformed(ActionEvent e){

            SD_MIL TASK_DATA = new SD_MIL();
            JOptionPane.showMessageDialog(null, TASK_DATA.IO_stream(path));

        }
    }
    //For the fouth button, To launch the TXT file.
    private class TASK_GET_TEXT_FILE implements ActionListener{
        public void actionPerformed(ActionEvent e){

            String user;
            Desktop desktop = Desktop.getDesktop();
            user = System.getProperty("user.name");
            File file = new File("C:\\Users\\"+user+"\\Desktop\\TODAY.txt");
                if(file.exists()){
                    desktop.open(file);
                }
                    else{
                            JOptionPane.showMessageDialog(null, "Warning! File Does not Exist","", JOptionPane.ERROR_MESSAGE);
                    }
            }
        }

        private class TASK_ADD_TICKET implements ActionListener{
            public void actionPerformed(ActionEvent e){
                

                    String username = System.getProperty("user.name");
                    String ans;
                    String data = text.getText();
                    SD_MIL existingFile = new SD_MIL();
                    if(PATH_DATA() == true) {existingFile.fileStart(data);}
                        else if(PATH_DATA() == false){
                            ans = JOptionPane.showInputDialog(null, "Would you like to start a new file?", "FILE_!", JOptionPane.OK_CANCEL_OPTION);
                                if(ans.equalsIgnoreCase("y") || and.equalsIgnoreCase("yes")){
                                    existingFile.fileOpen("C:\\Users\\"+username+"\\Documents\\TASK_DATA.txt", data);
                                    }
                                    else if(ans.equalsIgnoreCase("n") || ans.equalsIgnoreCase("no")){
                                        JOptionPane.showMessageDialog(null, "warning! the program will now shut down!", "Warning!", JOptionPane.ERROR_MESSAGE);
                                        System.exit(0);
                                        }
                                    }
                            else{
                            System.exit(0);
                            }
                        
            }
        }
	//Why do I need to return a boolean when I can just check for file Existence? SMH
	

	public static void main(String[] args) {
		PATH_DATA();
        new TASK_LAUNCH();
        //So far doe not work.. I DONT WANT TO WRITE UI's EVER AGAIN!!
	}

}