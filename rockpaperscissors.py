'''Rock, Paper, Scissors: The Game'''

## Style Guide ## 
# classes are capitalized
# functions are separated by underscores
# variables are camel-case

# need a random number to choose a hand for the computer to throw
import random

# rock, paper, and scissors are hands
# each hand has a name, wins against a hand, and loses to a hand
class Hand:

	# initializing function, includes name of the hand
	# winsAgainst and losesAgainst become arrays instead of strings to extend to Lizard/Spock
	def __init__(self, name, winsAgainst, losesTo):
		self.name = name
		# the hand that wins against self (ex. for rock, this is paper)
		self.winsAgainst = winsAgainst
		# the hand that loses to self (ex. for rock, this is scissors)
		self.losesTo = losesTo


# set up the basic game with three hands
# add two more hands with arrays for winning and losing hands to extend to Lizard/Spock
rockHand = Hand("rock", "paper", "scissors")
paperHand = Hand("paper", "scissors", "rock")
scissorsHand = Hand("scissors", "rock", "paper")
# rename this to fiveHands or a more generic name to extend to Lizard/Spock
threeHands = [rockHand,paperHand, scissorsHand]

# tell the user what their options are and how to play
def explain_game():
	print "\nThis is rock, paper, scissors! If you don't want to play, type computer.\
		\nIf you do want to play, type one of these options:"
	# if you renamed threeHands up above, rename this too to extend to Lizard/Spock
	for k in threeHands:
		print k.name
	print "---------"

# find out what hand the user threw & choose a hand for lazy users
# don't want to call this the human hand because it's a string, not a Hand object
def collect_human_typed(): 
	# lowercase and remove leading and trailing spaces from user input
	humanTyped = ((raw_input()).lower()).strip()
	# future improvement: give someone a chance to fix a typo
	# future improvement: let someone quit the game here
	return humanTyped

# tell them what they typed
# if the human typed computer, choose an option on their behalf
def display_or_convert_human_typed(humanTyped):
	print "You said {}.".format(humanTyped)
	# if the human types computer
	if humanTyped == "computer":
		# select a random hand from the array for the human to throw
		humanTyped = (random.choice(threeHands)).name
		print "We chose {} on your lazy behalf.".format(humanTyped)
	return humanTyped


# select a random hand from the array for the computer to throw
def collect_computer_hand():
	computerHand = random.choice(threeHands)
	print "The computer threw {}.".format(computerHand.name)
	return computerHand

# uses the appropriate verb to describe the physical interactions between the hands
def description_of_outcome(winner, loser):
	winner = str(winner)
	loser = str(loser)
	verb = "wins against"
	# add more elifs to extend to Lizard/Spock
	if winner == loser:
		verb = "is the same as"
	elif winner == "rock":
		verb = "crushes"
	elif winner == "paper":
		verb = "covers"
	elif winner == "scissors":
		verb = "cuts"
	else: 
		verb = "declares inexplicable victory over"
	print winner.capitalize() + " " + verb + " " + loser + "."


# find out whether the human or the computer won
# humanTyped is a string; computerHand is a Hand object
def declare_winner(humanTyped, computerHand):
	# tie
	if humanTyped == computerHand.name:
		print "Welp, you tied."
		description_of_outcome(humanTyped, computerHand.name)
	# human wins
	# compare against all items in winningHands array to extend to Lizard/Spock
	elif humanTyped == computerHand.winsAgainst:
		print "Congratulations, you win!"
		description_of_outcome(humanTyped, computerHand.name)
	# computer wins
	# compare against all items in losingHands array to extend to Lizard/Spock
	elif humanTyped == computerHand.losesTo:
		print "Sorry, you lose."
		description_of_outcome(computerHand.name, humanTyped)
	# human typed something that couldn't be compared
	else:
		print "Curses! We couldn't compare your input to the computer's.\
		\nTry rock, paper, or scissors next time."

def play_game():
	explain_game()
	humanTyped = display_or_convert_human_typed(collect_human_typed())
	computerHand = collect_computer_hand()
	declare_winner(humanTyped, computerHand)
	# future improvement: ask the player if they want to play again or quit
	# future improvement: keep score

play_game()
