#Joseph Mulray
#Chaper 9 Exercise 4


def yourGrade(grade):
    if grade>=60:
        print("Good, you passed!")
    else:
        print("Sorry, you did not pass")
def testGrade(grade):
    if grade>100 or grade<0:
        print("invalid input")
        grade=int(input("Enter a valid grade: "))
        testGrade(grade)
    
#Main Program        
for x in range(5):
    grade=int(input("Enter your grade: "))
    testGrade(grade)
    yourGrade(grade)
    
    
