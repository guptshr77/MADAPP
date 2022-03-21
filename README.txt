<title>README.txt</title>

This app is for students to help them organize their school life. This app has its own local network. 
This means the Student has to be registered into the database to be able to use this app. 
This app allows a student to input their schedule from all the classes offered at the school, 
be a part of any extracurricular activities offered, send messages to staff members, and view the school's lunch menu. 
This app shows all the events of the user on their daily calendar page, and also has a monthly calendar view which allows them 
to choose any day and then view all activities of that day.

This app is the project for FBLA 2022 for the event Mobile App Development

<h3>References</h3> 
<h4>Springboot: </h4>  
    https://spring.io/guides/gs/rest-service/ 
<h4>JDK 11.0.13: </h4>  
    https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html

<h3>API Definitions</h3> 

<h4>/calendar</h4> 
      
<h4>/calendar</h4> 
    <ul>
	<li>userid</li>
	<li>date</li>
	<li>type</li>
    </ul>
<h4>/getallactivities</h4>
    <ul>
	<li>NONE</li>
    </ul>	 
<h4>/getuseractivity</h4> 
     <ul>
	<li>userid</li>
    </ul> 
<h4>/addactivity</h4> 
    <ul>
	<li>userid</li>
	<li>act_id</li>
    </ul> 
<h4>/login</h4> 
    <ul>
	<li>username</li>
	<li>password</li>
    </ul>  
<h4>/teachers</h4> 
    <ul>
	<li>NONE</li>
    </ul>  
<h4>/addschedule</h4> 
    <ul>
	<li>user_id</li>
	<li>class_id</li>
    </ul>  
<h4>/getschedule</h4> 
    <ul>
	<li>user_id</li>
    </ul>  
<h4>/getallclasses</h4> 
    <ul>
	<li>NONE</li>
    </ul> 
<h4>/lunchmenu</h4> 
    <ul>
	<li>NONE</li>
    </ul> 
<h4>/getMessage</h4> 
    <ul>
	<li>user_id</li>
    </ul>  
<h4>/sendMessage</h4> 
    <ul>
	<li>userid</li>
	<li>recipient_id</li>
	<li>usbject</li>
	<li>msg_content</li>
    </ul> 
<h4>/getSentMessage</h4> 
    <ul>
	<li>user_id</li>
    </ul> 
