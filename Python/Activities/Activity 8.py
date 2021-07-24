# List Checker
#number = [1,2,3,4,6]
#print ("The number given in the list are: " , number)

number = list(input("Enter the numbers seperated by commas").split(","))
print ("The number given in the list are: " + str(number))

if number[0]==number[-1]:
    print("true" )
else:   
    print ("False")