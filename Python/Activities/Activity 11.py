#Fruit Shop

"""Create a Python dictionary that contains a bunch of fruits and their prices.
Write a program that checks if a certain fruit is available or not."""

fruit_shop = {
    "apple" : 10,
    "banana" :24,
    "mangoes" : 20,
    "cherry": 15
}

available_check = input ("Which fruit are you looking for: ").lower()

if (available_check in fruit_shop):
    print ("Yes,Fruit is available")
else:
    print ("No,Fruit is not available")







