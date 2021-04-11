######################################################################
#                                                                    #
#                                                                    #
#                  The Chess Party (TCP)                             #
#                                                                    #
#                                                                    #
######################################################################

ABOUT:
The-chess-party is a Java based online chess game that uses a TCP connection
to facilitate online multiplayer.
 
 
-----------------------------------------------------------------------------------------------------
 
 
Basic folder/package hierarchy follows a standard Maven structure.
 
│    
└── src
    ├── main
    │   ├── java   
    │   │   └── com
    │   │        └──thechessparty
    │   │                    ├── game
    │   └── resources        │
    │                        │
    │                        │
    │                        └── connection
    │                                   ├──────────────────────jsonparsing 
    │                                   │                            ├── Json.java
    │                                   ├── Client.java                
    │                                   ├── ClientHandler.java
    │                                   ├── Server.java
    │                                   ├── ServerConnection.java
    │
    └── test
        ├── java 
        │   └── com
        │        └──thechessparty
        │                    ├── game
        │                    │
        └── resources        │
                             └── connection
                                        ├──────────────────────jsonparsing 
                                        │                            ├── Json.java
                                        ├── Client.java              │
                                        ├── ClientHandler.java       └── pojo
                                        ├── Server.java                   ├── SimpleTestCasePOJO.java
                                        ├── ServerConnection.java         ├── BookPOJO.java
                                                                          ├── DayPOJO.java
                                                                          ├── AuthorPOJO.java


-----------------------------------------------------------------------------------------------------


 FOLDERS AND PACKAGES:

 com (package): The highest package in the hierarchy. Is not recommended to
 place classes into this package. com is a naming convention used to signify
 commercial (disclaimer we are not making any money)
 
 thechessparty (package): This is the main package that will contain all of the
 related classes, enums, interfaces, etc.
 
 resources (resources folder): This directory is used to store any static files
 that may be used or referenced in the program. They can be anything from
 audio files, images, JavaScript, ini files, etc.

 src (source folder): The parent folder of all of the java files. This is a common 
 parent folder of all of the ancestor runnable files and packages

 main (folder): The parent folder of all of the files and resources that are needed 
 to run the program.

 test (folder): The parent folder of all of the files and resources that are related
 to unit/junit testing

 java (source folder): The parent directory of all of the Java files in the project.

 
 connection (package): The primary package of java classes that are related to the server
 and client TCP connection. 

 jsonparsing (package): The primary package of java classes that implement Jackson/JSON
 serial and de-serialization.

 game (package): The primary package of java classes that are related to the game logic.

 
 
-----------------------------------------------------------------------------------------------------

 BUILD AND INSTALL:
 

-----------------------------------------------------------------------------------------------------
 
 
 WORKFLOW:
 Listed bellow are the steps that we should follow to have an efficient workflow.
 The steps are intended to mirror enterprise level workflows. They are:
 
 0. Fork the repository to your personal GitHub through the GitHub website.
 
 1. git init
 Create a directory on your local machine where the project will live and open 
 teminal, or gitBash in the newly created directory and enter git init.
 
 2. git clone <git@github.com:Sometextwillappear/here.git>
 This will copy the contents of your local repository into your directory.
 
 3. git pull 
 Pull from the main repository to get the most up to date branch.
 
 4. git checkout -b <name of branch or feature>
 Checkout allows the user to branch the code to create there own feature separate
 from the main branch and other developers branch. 
 
 5. git add .
 Adds all the new changes to the staging area.
 
 6. git commit -m "<enter a comment about your commit changes here>"
 Commit all of the changes from the staging area. 
 
 7. git push <origin> <branch_feature>
 This will push your commits <branch_feature> up to the master or <origin> repo
 
 8. Create a pull request on GitHub.com
 Here you can add additional comments to the pull request were others can review 
 the branch changes before they are pulled into the main repo.
