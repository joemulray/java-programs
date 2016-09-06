#Joseph Mulray
#Exercise 2 Chapter 4
import math
oldNum=(input("Enter a negative or postive floating point number: "))
num=float(oldNum)
num1=abs(num)
num2=int(num)
num3=round(num)
num4=math.floor(num)
num5=math.ceil(num)
num6=pow(num,3)
print("The absolute value of", num, "is", num1)
print("The integer portion of", num, "is", num2)
print(num, "rounded to the nearest whole number is", num3)
print("The floor of", num, "is", num4)
print("The ceil of", num, "is", num5)
print(num, "to the 3rd power %.3f" %  num6)
