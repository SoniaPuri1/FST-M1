"""Adding List Numbers
Write a function sum() such that it can accept a list of elements and print the sum of all elements"""

def sum(numbers):
    sum=0
    for n in numbers:
        sum += n
    return sum

numList = [10, 20 , 30 , 40,50]
result=sum(numList)

print ("Additon of numbers is:  " + str(result))

