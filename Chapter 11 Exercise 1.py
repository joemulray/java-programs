#Joseph Mulray
#Chapter 11 Exercise 1

list=[]
name=input("Enter your name: ")
list.append(name)
for x in range(5):
    num=int(input("Enter your test score: "))
    list.append(num)
average=(list[1]+list[2]+list[3]+list[4]+list[5])/5
studentInfo=open('studentinfo.txt','w')
studentInfo.write("Name: "+ list[0])
studentInfo.write("Tests: " + str(list[1]+list[2]+list[3]+list[4]+list[5]))
studentInfo.write("Average: "+ str(average))
