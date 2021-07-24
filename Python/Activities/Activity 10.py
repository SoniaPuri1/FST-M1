#Tuple Number Checker

"""
Given a tuple of numbers, iterate through it and print only those numbers which are divisible by 5
Bonus points if you can make the user enter their own tuple."""

num = (10,15,20,3,4,5)
print("The numbers entered are: " , num)
print ("Numbers divisible by 5 are: ")
for i in num :
    if (i % 5 == 0):
        print (i)

    
    


