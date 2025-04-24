from random import randint
# Ask user for the fixed length of the arrays ( lists in python, we will not use numpy )

isInRange = False
def fixedLen(): #Create a function to ask customer for a fixed length
    fixedLength = int(input("Please enter a fixed length between 1 - 12: "))
    return fixedLength

while (not isInRange): #If is in range we continue, if not, we ask again
    fixedLength = fixedLen()
    if not ( 1 <= fixedLength <= 12 ):
        fixedLength = fixedLen()
    else:
        isInRange = True

arrayA = [] #Create arrayA as an empty array
    
for _ in range(fixedLength):
    newElementOfA = int(input(f"Enter element #{_}: "))
    arrayA.append(newElementOfA) # append elements

arrayB = [] #Create arrayB as an empty array
for _ in range(fixedLength):
    newElementOfB = randint(1,20)
    arrayB.append(newElementOfB) # append elements

sumArrays = [(arrayA[i] + arrayB[i]) for i in range(fixedLength)]
# Sum of Arrays in a new array with list comprehension

dotProduct = 0 # Initialize dot product as 0 and then sum
for _ in range(fixedLength):
    dotProduct += (arrayA[_] * arrayB[_])

sumOfPairs = 0 # Initialize sum of pairs as 0 and then sum if pair
for _ in arrayA:
    if ( _ % 2 == 0):
        sumOfPairs += _

averageOfB = 0 # Initialize average as 0 en
for _ in arrayB:
    averageOfB += _
    averageOfB = (averageOfB / fixedLength)

arrayC = [0 for i in range(fixedLength * 2)] # Create array C
for _ in range(fixedLength):
    pairIndex = int(2 * _)
    oddIndex = int((2 * _) + 1)
    arrayC[oddIndex] = arrayB[_]
    arrayC[pairIndex] = arrayA[_]

maxValueArrayC = max(arrayC)
indexMaxValue = arrayC.index(maxValueArrayC)