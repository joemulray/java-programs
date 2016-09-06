#Joseph Mulray
#Python Project Clean Version
#I did not help anyone with this project and I did not receive help from anyone.
import random

#Input at beginning of Program
name=input("Please enter your name:")

print(name,"welcome to the L O T T E R Y  G A M E !")
print("The purpose of this game is to see if you can win'money' by playing the lottery. You will be prompted a number from 0 to 500. The computer will generate a random number between 0 and 500.If your numebrs match you win $500.00. If one of the digits is the same in both numbers -- with the same place value, then you win $5.00.If two of the numbers are the same -- with same place value, you win $50.00.After each game you will be asked if you want to play again. When you have finished playing you will be told the amount of money you have won.GOOD LUCK!\n")

num=input("Enter a number between 0 and 500: ")


#Main Program 4 Fuctions
testingNumber(num)












#Calculations
randNum=random.randint(1,500)






#Def Fuctions and If Statements
def testingNum(num):
    while (num.isdigit()==False):
        print("The number you have entered is not a number")
        num=input("Enter a number between 0 and 500: ")
    num=int(num)

    while(num>500) or (num<0):
        print("The number you have entered is not in range")
        num=input("Enter a number between 0 and 500: ")
    print("Number is Valid")


def test1 (num):
    counter=0  
    if str(num)[0]==str(randNum)[0]:
        counter+=1
        if str(num)[1]==str(randNum)[1]:
          counter+=1
          if str(num)[2]==str(randNum)[2]:
              counter+=1
