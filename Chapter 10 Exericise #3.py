#Joseph Mulray
#Chapter 10 Exercise 3

height=int(input("Enter the height of the figure: "))
for column in range (height,0,-1):
    for row in range(column):
        print(column,end=" ")
    print()
print("Done!")
