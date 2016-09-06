#Joseph Mulray
#Python Project
#December 4,2014
#I did not help anyone with this project and I did not receive help from anyone.

import random


### Four fuctions ###

def numberTest(number):
    while (number.isdigit()==False):
        print("The number you have entered is not a number")
        number=input("Enter a number between 0 and 500: ")
    number=int(number)

    if (number>500) or (number<0):
        print("The number you have entered is not in range")
        number=input("Enter a number between 0 and 500: ")
        return numberTest(number)
    return number


        
#Testing if numbers are the same digits
def digitsTest (number,randNum):
    counter=0
    if (number%10)==(randNum%10):
        counter+=1
    if (number//10%10)==(randNum//10%10):
          counter+=1
    if (number//100)==(randNum//100):
              counter+=1
    return counter

#Tests counter and adds users winnings
def counterTest(counter):
    winnings=0
    if counter==3:
        print("Congradulations!, You won $500.00")
        winnings=500
    if counter==2:
        print("Congradulations! You won $50.00")
        winnings=50
    if counter==1:
        print("Congradulations! You won $5.00")
        winnings=5
    if counter==0:
        print("Sorry you did not win, please try again")
    
    return winnings



#Welcome Fuction
def welcome():

#Prompts user for their name and welcome message
    name=input("Please enter your name: ")
    print(name,"welcome to the L O T T E R Y  G A M E !")
    print("The purpose of this game is to see if you can win'money' by playing the lottery. You will be prompted a number from 0 to 500. The computer will generate a random number between 0 and 500.If your numebrs match you win $500.00. If one of the digits is the same in both numbers -- with the same place value, then you win $5.00.If two of the numbers are the same -- with same place value, you win $50.00.After each game you will be asked if you want to play again. When you have finished playing you will be told the amount of money you have won.GOOD LUCK!\n")

#Playing game fuction
def playgame():

#Randomly generates number and Prompts users input
    randNum=random.randint(1,500)
    number=input("Enter a number between 0 and 500: ")
    

#Tests users input if it is a digit and in range
    number=numberTest(number)


#Counts number of digits that are the same between computers number and users number    
    counter=digitsTest(number,randNum)
    
    
    print("Winning Number:", randNum)
    print("Players Number: ",number)
    money=counterTest(counter)
    return money


#################################MAIN#######################################
welcome()
winnings=0

#Testing if user wants to play again
playAgain=True
while playAgain==True:
    winnings+=playgame()
    userinput=input("Do you want to play another game? ('Y' or 'N') :")
    if userinput.upper()!="Y":
        playAgain=False
print("Thank you for playing your total winnings are:", "$%.2f " %winnings+".")
    

