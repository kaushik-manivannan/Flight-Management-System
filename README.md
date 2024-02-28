# Flight Management System (Vimaan Airlines)
## Overview
The Flight Management System is a Java Swing application designed to manage domestic and international flight schedules, bookings, and passenger information. The system provides separate interfaces for administrators and passengers to interact with the system, offering functionalities such as viewing flight schedules, booking flights, and managing user accounts.

## Demo Screenshot
<img width="894" alt="Screenshot 2024-02-28 at 1 23 21 PM" src="https://github.com/kaushik-manivannan/Flight-Management-System/assets/144855772/4ea1dec7-b6ba-4ae3-b4af-3c00462e35b4">

## Key Features
### User Modes:

* Admin Mode: Administrators can manage flight schedules, including adding, editing, and deleting domestic and international flights.
* Passenger Mode: Passengers can log in, view flight schedules, and book flights.
### Flight Scheduling:

* Domestic and international flight schedules can be managed independently.
* Features include adding, editing, and deleting flights, along with viewing available flights.
### User Authentication:

Passengers can create accounts and log in.
Admins can log in using separate credentials.
### Password Reset:

Passengers can reset their passwords by providing their username and verifying their identity.
## Implementation Details
### Java Swing: 
The graphical user interface (GUI) is implemented using Java Swing for a user-friendly experience.
### CSV Handling: 
Flight and passenger data is stored in CSV files, and the system uses CSV handling for data input/output.
### Factory Pattern:
Used Eager Singleton and Enum Singleton Factory patterns to create objects for International and Domestic flights
### Stream API:
Used for list operations including file handling.
## How to Run
### Requirements:

Java Runtime Environment (JRE) should be installed.
### Run the Application:

Compile and run the Driver class, which serves as the entry point for the application.
The user will be prompted to select the user type (Admin or Passenger).
### Admin Mode:

To access admin functionalities, log in with admin credentials (username: admin , password: admin).
Admins can manage flight schedules, including adding, editing, and deleting flights.
### Passenger Mode:

To access passenger functionalities, log in as a passenger or sign up for a new account.
Passengers can view flight schedules and make bookings.
### Password Reset:

Passengers can reset their passwords by providing their username and verifying their identity.
## Contributors
The project was collaboratively developed by seven contributors, each responsible for specific components:

Admin Interface: Contributor: **Haresh Ramasamy**

Responsibilities: Implemented the admin interface, including flight scheduling and management functionalities.

Passenger Interface: Contributor: **Deepak Sundar Narayanan**

Responsibilities: Implemented the passenger interface, including flight viewing and booking functionalities.

Login and Authentication: Contributor: **Akash Arumugam Venkatachalapathy**

Responsibilities: Implemented the login system and user authentication for both admins and passengers.

Password Reset: Contributor: **Kaushik Manivannan**

Responsibilities: Implemented the password reset functionality for passengers.

CSV Handling: Contributor: **Yakgna Venkatesh Ramasamy**

Responsibilities: Implemented CSV handling for storing and retrieving flight and passenger data.

User Sign Up: Contributor: **Aravind Sathyanarayanan**

Responsibilities: Implemented the user sign-up functionality for passengers.

User Mode Selection:  Contributor: **Chakradhar Abhinay Mocherla**

Responsibilities: Implemented the user mode selection interface for choosing between admin and passenger modes.

## Conclusion
The Flight Management System provides a comprehensive solution for managing flight schedules and bookings. The collaborative effort of the seven contributors has resulted in a user-friendly and functional application.
