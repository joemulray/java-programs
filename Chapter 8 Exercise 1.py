#Joseph Mulray
#Chapter 8 Exercise 1
import random
random=random.randint(1,100)
number=int(input("Enter a number between 1 and 100: "))
print(random)
print(number)
while(number>random):
    print(number, "is too high. Try again!")
    number=int(input("Enter a number between 1 and 100: "))
while(number<random):
    print(number,"is too low. Try again! ")
    number=int(input("Enter a number between 1 and 100: "))
if (number==random):
    print("Congradulations! You guessed the number! ")
