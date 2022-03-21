# README.txt

This app is for students to help them organize their school life. This app has its own local network.
This means the Student has to be registered into the database to be able to use this app.
This app allows a student to input their schedule from all the classes offered at the school,
be a part of any extracurricular activities offered, send messages to staff members, and view the school's lunch menu.
This app shows all the events of the user on their daily calendar page, and also has a monthly calendar view which allows them
to choose any day and then view all activities of that day.

This app is the project for FBLA 2022 for the event Mobile App Development

### References

#### Springboot:

    https://spring.io/guides/gs/rest-service/

#### JDK 11.0.13:

https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html

### API Definitions

#### /calendar

#### /calendar

- userid
- date
- type

#### /getallactivities

- NONE

#### /getuseractivity

- userid

#### /addactivity

- userid
- act_id

#### /login

- username
- password

#### /teachers

- NONE

#### /addschedule

- user_id
- class_id

#### /getschedule

- user_id

#### /getallclasses

- NONE

#### /lunchmenu

- NONE

#### /getMessage

- user_id

#### /sendMessage

- userid
- recipient_id
- usbject
- msg_content

#### /getSentMessage

- user_id
