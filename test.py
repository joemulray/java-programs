#Joseph Mulray
#Python Test
#December 9 2014
#Programming a Tresure Chest

#fuction definitions

def checkQuestion(newAnswer):
    if newAnswer=="Christmas":
        num=1
    if newAnswer!="Christmas":
        num=0
    return num










#################MAIN####################
name=input("Enter your name: ")
print(name,"Welcome to the Tresure Chest Program! ")
secretCode=input("Please enter your secret code: ")



if secretCode==('science') or (secretCode=='infomatics') or (secretCode=='computer'):
    answer=int(input("What special holiday do we celebrate on December 25?: "))
    correctAnswer=checkQuestion(answer)
    if correctAnswer==1:
        print("You have gained access to the Treasure Chest. ")
        getTreasure()
        
    if correctAnswer!=1:
        print("Incorrect Answer! Program terminated")
else:
    print("The secret code you entered is not correct. Program Terminated.")
    
