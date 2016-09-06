#Joseph Mulray
#Chapter 6 Exercise 3
word1=input("Enter a word: ")
word2=input("Enter a second word: ")
word3=input("Enter a third word: ")
length1=len(word1)
length2=len(word2)
length3=len(word3)
if (length1>length2) and (length1>length3):
    print(word1, "has the most letters")
if (length2>length1) and (length2>length3):
    print(word2, "has the most letters")
if (length3>length1) and (length3>length2):
    print(word3, "has the most letters")
if (length1==length2) and (length1==length3):
    print("The words are the same length")
