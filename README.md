/*
	V1.0.0.2 

	Program runs but still in development,  (Beta)

	Ticket Logger.
	Sam Abdalla.
	
	CONTACT (habdalla@loc.gov, Husamabdalla98@gmail.com) for suggestions or to report Bugs.


##Could not create Executable JAR file because i do not have eclipse :(##
	
###################################################################################
#			        *INSTRUCTIONS*					  #
#	1. Paste the package "TASK_SD" in C:\Packages\				  #
#	2. Right click on ticket logger and send to Desktop.			  #
#	3. Now that you have a desktop shortcut, you may launch the program by 	  #
#	Double clicking the batch file.						  #
#										  #
#	DISCLAIMER:								  #	
#		You may need to compile the source, please check		  #
#		if your package came with the source, with the class files,	  #
#		Or both. If you need to compile, right click batch file and edit. #
#		Then go to top and type "javac LAUNCH.java" then launch it once,  #
#		Then edit again and delete.					  #
#										  #
###################################################################################



	The Problems With the Service desk:

	1. Alot of times i loose track of tickets.
	2. When putting tickets in servicenow, I loose the user's PCID.
	3. Trying to get to all the frequent bookmarks in Time
	Eg: User calls needs MFA unlock, Idaptive needs to be right there.
	4. The users call back and i do not remember their problem. 
	5. I need to know which ticket i worked on, on a specific date.


	The Answer:

You might be thinking that all of these issues have imbedded solutions that are withing the systems
like to get to idaptive i just need to bookmark the page or to remember ticket info we can 
just get to Servicenow and search for it. By how can we remember the ticket if its lost?
most users have tens of ticket that we must sift through before finding what we are looking for.
These are all the realistic challenges that we face here in the service desk.
We must also acknowledge that frame is a very fast paced environment so everything must be done
at the nick of time, why would i go to the browser and spend time looking for idaptive when I can just click a button?
Why should I sift through service now when I can have a local repository with all my tasks, tickets, 
and incidents, Timestamped and signed with username? 

Introducing Task Logger!


	Description:

The purpose of frame program is to provide the user with dynamic functionality for 
operating daily tasks, and to have everything in the click of a button.
frame can help the technitian or the user of the program complete tasks and repetetive activities much faster.
frame is also intended to increase workflow productivity and to help the user keep track of tickets and tasks.

The first two buttons launch webpages, one for Idaptive and one for a new ticket on service now.
The third button "all data" scans the file and returns the last line of data appended to the file in a message box.
frame is to help the user identify where they left off.
The forth button "Full logs" launches the file that contains all of the data in readable format. (.txt)
the last two buttons provide the option of appending data to the existing file with or without the date. 
frame is to help the user of the program keep track of the data that is being stored in the file.


	More Details:

The program upon first installation, User will indicate that 
they are the first user, frame will trigger the boolean flag function to return TRUE or FALSE,
and will invoke an object of the IO class to create a text file to append the data to.
The program extends the Java JFrame class and thus inherets all of its methods.
The JFrame class is used to provide a user friendly GUI environment.
The program comes with buttons, all of which host a private sub class that implements
action listeners.
Some functions have been commented out for possible later implementation like the option to send the data to an email.

Exception handling for most classes and functions is by try/catch blocks and some are thrown at function declaration.
non-compiler related issues and exceptions in some cases will kill the process with the System.exit(0); Object.
These are usually cases where the user has refused the file creation.
*/
