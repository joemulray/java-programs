sportsList=open('sports.txt')
for index in range(1,21):
    sp=sportsList.readline()
    print(str(index) + " ", sp.rstrip())
