#Joseph Mulray
#Chapter 7 Exercise 2
import random
num=int(input("Enter a number between 1 and 5: "))
while (num>=5 and num<=1):
    print("invalid input")
    num=int(input("Enter a number between 1 and 5: "))
randNum=random.randint(1,5)
print("Your number is", num)
print("Random number is", randNum)
