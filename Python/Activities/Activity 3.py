#Rock-Paper-Scissors Program

#To get the players names

Player1=input("Player 1: Enter the name: ")
Player2=input("Player 2: Enter the name: ")

#User choices for Rock,paper or Scissor
Player1Choice=input ("Player 1:Enter your choice:rock, paper or scissors: ").lower()
Player2Choice=input ("Player 2:Enter your choice:rock, paper or scissors: ").lower()

if Player1Choice==Player2Choice:
    print ("It's a tie!")

elif Player1Choice=="rock":
    if Player2Choice=="scissors":
        print("rock win!")
    else: 
        print("paper win!")
elif Player1Choice =="scissors":
    if Player2Choice=="paper":
        print("scissors win!")
    else:
        print ("rock win!")
elif Player1Choice=="paper":
    if Player2Choice=="rock":
        print("paper win!")
    else:
        print("scissors win!")
else:
    print ("Enter valid input.Player has entered a wrong choice.")

