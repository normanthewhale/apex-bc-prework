# Pre-Requisites   
### Pre-Class Assignment
All participants are required to complete and submit the Pre Class Assignment (see below) one week prior to the first day of the Apex Development Bootcamp. This pre-class assignment provides a temperature check for the student and instructor to ensure all students have the knowledge required to be successful in the course. This is an individual activity - please do not ask your peers for assistance. You may use any material found online or ask the instructor for assistance if needed.

### Computer Science Concepts & Nomenclature
- Ability to write if-statements and for-loops
- Ability to write a function with parameters
- Knowledge of different types of Data Types (Booleans, Strings, Collections)  

### Object Oriented Programming
There are a lot of concepts in Object Oriented Programming (OOP) and some of it is very important when developing in Apex. Here is the Wiki entry on OOP (and if that isn’t making sense, this might be better). Please make sure you understand the following concepts:
- Objects
- Polymorphism
- Encapsulation
- Inheritance
- Interfaces
If this is a new area to you, make sure to reach out if you have any clarifying questions.  

### Salesforce Sales Cloud & CPQ
- Participants should have a foundational knowledge of the Salesforce Object Model
    - What are Standard Objects in Salesforce? What are Custom Objects?
    - How are objects related to one another? (i.e. Master Detail relationships, lookups, etc.)
    - How to add/edit fields on an Object.
    - How to navigate and use the "Setup" menu.
- Participants should also have a working knowledge of Salesforce CPQ.  

### Git
- Beginner Level understanding of Git
    - If possible, please complete the ATG provided Git-Hub training. (You will need access to ATG GitHub to view the training).
    - Example: You should be able to connect your Salesforce Developer org to ATG's GitHub and be able to comfortably pull/push changes.
- Basic ability to navigate using the command line.  

### Required Programs
- VSCode as text editor
    - VSCode
- The following extensions installed for VSCode
    - SFDX CLI Integration
    - Salesforce Extension Pack
- Git Program
    - GitBash
    - Instructions to prep computer for using Git
- A fresh Salesforce Developer org with CPQ Installed. This org should also be connected to VSCode (and the ATG GitHub).  

### Attendance & Willingness to Learn
- Ability to commit to complete attendance. While life (and clients) happen, this course is designed as a bootcamp, and each class session can cover significant portions of material.
- All class sessions will be recorded, and in the event that a class is missed, participants are expected to make up any work on their own time.  

## Pre-Class Assignment
This course is meant to teach Apex to students that already have some familiarity with basic programming skills and a working knowledge of the basics of Object Oriented Programming (OOP).
This pre-class assignment provides a temperature check for the student and instructor to ensure all students have the knowledge required to be successful in the course. This is an individual activity - please do not ask your peers for assistance. You may use any material found online or ask the instructor for assistance if needed.
The instructor will ultimately be the subjective judge on satisfactory completion of the assignment and acceptance into the course.
What if I don't know the concepts required for the assignment
If you have some programming experience, but don't have a background in Object Oriented Programming, it is likely that the concepts required for the assignment might be things you have not learned.
In this case, you will need to do some self-study to get up to speed on the basics so that you have the baseline knowledge required to complete the assignment.  

### Study Resources
Here are some example resources, but feel free to find others as needed:
- Object-oriented programming - Wikipedia
- Beginner's guide - Object Oriented Programming
- Object Oriented Fundamentals: Polymorphism and Encapsulation  

### Requirements
1.	Any common, non-esoteric, OOP programming language can be used to complete the pre-work.
    - Examples: Java, C#, C, C++, Python, etc..
2.	If you would like to use a language not listed, please get approval from the instructor prior to starting.
3.	Your assignment needs to use git for source control and a link to the repository provided to the instructor.
    - Please make your repository private and use one of the following platforms:
    - GitHub, BitBucket, GitLab
4.	Your project must include a README.md file with your basic information and any comments we might need to know about.
5.	All assignments must be submitted to the instructor at least seven days prior to the class's start date. If you finish early, you are welcome to submit early.  

### Tools
1.	You may use whatever tools (code editors, compilers) you'd like to complete the assignment.
2.	If you do not currently have these programs installed, you may use an online compiler to run your code. If you choose to do this, once complete, recreate the project on your local device in order to push up to your repository. A few online compilers:
    - Repl>it
    - OnlineGDB  

### Demonstrated Skills
1.	Basic flow control
    - If statements, for loops
2.	OOP Fundamentals
    - Objects
    - Interfaces
    - Abstraction
    - Encapsulation
3.	Source Control
    - A basic understanding of git  

## Assignment  

### Overview
You are a new business owner and have decided to open a couple of new Zoos! Your job is to model the zoos using object oriented programming and then fill each zoo with a few animals of your choice.  

### Requirements
You will need to have the following data structures modeled as objects
- Zoo
    - This should have basic properties that a zoo might have, such as a name and address - be creative and have fun with it!
    - Your zoo will have a list of animals
    - You should be able to add animals to the zoo
    - You should be able to remove animals from the zoo
    - You should be able to get a list of all animals
    - You should be able to get a list of one specific animal
    - You should not expose direct property access to any variables
- Animal - this should be an abstract base class
    - This should include basic properties about an animal, such as name and color
    - All animals can eat and sleep
    - The animal can speak, but the implementation of how the animal speaks should be handled by each specific animal
- A class for each Animal which inherits from the base Animal class
    - You must have 3 different animals
    - Your animal should be able to speak in a way specific to this animal  

Your code needs to do the following
1.	Create at least two instances of your zoo to represent different locations
2.	Fill each zoo with at least one of each animal
3.	For each animal
    - Print out the name and color
    - Feed the animal
    - Have the animal speak
4.	Remove an animal from at least one zoo
5.	Have sufficient logging to the console to show what is happening.  

### Submitting
To submit your assignment:
1.	Ensure all of your changes are submitted to your repository
2.	Give the course instructor access to your repository
3.	Email your instructor with a link to the repository for a code review
