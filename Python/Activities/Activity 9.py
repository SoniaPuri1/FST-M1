# Combining Lists
"""Given a two list of numbers create a new list such that new list should contain 
only odd numbers from the first list and even numbers from the second list."""


Listone = [1,2,3,4,5]
Listtwo = [9,10,11,12,13]

Listthree = []

for num in Listone:
    if ( num % 2 !=0 ):
        Listthree.append(num)

for num in Listtwo:
    if ( num % 2 == 0):
        Listthree.append(num)

print(Listthree)
