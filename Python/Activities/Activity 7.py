# List Sum Calculator

numbers = list(input("Enter the numbers seperated by commas:").split (","))
#numbers = [3,4,5]
sum = 0
for i in numbers:
    sum += int(i)
    print (sum)
