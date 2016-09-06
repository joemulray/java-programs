#Joseph Mulray
#Python Test
#December 9 2014
#Programming a Tresure Chest Program

#####fuction definitions#####

#Determines if the answer the user entered is 'Christmas' and if it is returns the number 1, otherwise returns the number 0
def checkQuestion(newAnswer):
    if newAnswer=="Christmas":
        num=1
    if newAnswer!="Christmas":
        num=0
    return num


#Prints the following Treasure Chest message if the secret code is correct
def getTreasure():
    print('                 *')
    print('                ***')
    print('               *****')
    print('              *******')
    print('             *********')
    print('            ***********')
    print('           *************')
    print('          ***************')
    print('         *****************')
    print('        *******************')
    print('       *********************')
    print('                ***')
    print('                ***')
    print('                ***')
    print("   The treasure is the tree of life!")
    




#################MAIN####################

#Prompting user for name and code   
name=input("Enter your name: ")
print("Welcome to the Tresure Chest Program,",name+"!")
secretCode=input("Enter the secret code: ")


#Testing Secret Code
if secretCode==('computing') or (secretCode=='hill') or (secretCode=='computer'):
    answer=(input("What special holiday do we celebrate on December 25?: "))
    
    correctAnswer=checkQuestion(answer)
    
    if correctAnswer==1:
        print("You have gained access to the Treasure Chest. ")
        getTreasure()
        
    if correctAnswer!=1:
        print("Incorrect Answer! Program terminated.")
else:
    print("The secret code you entered is not correct. Program Terminated.")
    
