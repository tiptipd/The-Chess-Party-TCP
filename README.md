######################################################################
#                                                                    #
#                                                                    #
#                  The Chess Party (TCP)                             #
#                                                                    #
#                                                                    #
######################################################################

ABOUT:
The-chess-party is a Java based online chess game that uses a TCP connection
to facilite online multiplayer.

-----------------------------------------------------------------------

Basic folder/package hierarchy utilizes a Maven-like tree:

│ .idea *******************************
└── src *******************************
*** ├── main **************************
****** ├── java ***********************  
****** │ **└── com.the-chess-party ****
****** │ ************* └── Client.java
*******└── resources ******************
   
   
│ .idea *******************************
└── src *******************************
*** ├── main **************************
****** ├── java ***********************  
****** │ **└── com.the-chess-party ****
****** │ ************* └── Server.java
*******└── resources ******************
       
 ------------------------------------------------------------------------------
 
 Folder names and descriptions:
 com (package): The highest package in the heirarchy. Is not recomened to
 place classes into this package. com is a naming convention used to signify
 comercial (disclaimer we are not making any money)
 
 the-chess-party (package): This is the main package that will contain all of the
 related classes, enums, interfaces, etc.
 
 resources (resources folder): This directory is used to store any static files
 that may be used or referenced in the program. They can be anything from
 audio files, images, JavaScript, ini files, etc.
 
 ------------------------------------------------------------------------------
 
 WORKFLOW:
 Listed bellow are the steps that we should follow to have an efficient workflow.
 The steps are intended to mirror enterprise level workflows. They are:
 
 0. Fork the repository to your personal GitHub throught the GitHub website.
 
 1. git init
 Create a directory on your local machine where the project will live and open 
 teminal, or gitBash in the newly created directory and enter git init.
 
 2. git clone <git@github.com:Sometextwillappear/here.git>
 This will copy the contents of your local repository into your directory.
 
 3. git pull 
 Pull from the main reposirty to get the most up to date branch.
 
 4. git checkout -b <name of branch or feature>
 Checkout allows the user to branch the code to create there own feature seperate
 from the main branch and other developers branch. 
 
 5. git add .
 Adds all the new changes to the staging area.
 
 6. git commit -m "<enter a comment about your commit changes here>"
 Commit all of the changes from the staging area. 
 
 7. git push <origin> <branch_feature>
 This will push your commits <breanch_feature> up to the master or <origin> repo
 
 8. Create a pull request on GitHub.com
 Here you can add additional comments to the pull request were others can review 
 the branch chages before they are pulled into the main repo.
 
