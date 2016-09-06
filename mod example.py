number1=input("enter a number divisible by 5: ")
number=int(number1)
if (number%5 == 0) and (100>=number) and (number>=1):
    print("number is valid")
else:
    print("number is invalid")
