#Joseph Mulray
#Chapter 10 Exercise 1

numberFile=open('numbers.txt')
for x in range (20):
    number=int(numberFile.readline())
    if number%2==0:
        print(number)
print("Done!")
