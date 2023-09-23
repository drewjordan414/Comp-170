number = input("Enter a number to convert to binary: ")
number = int(number)
k = number 
binary = ""
while k > 0:
    remainder = k % 2
    binary = str(remainder) + binary
    k = k // 2
print("The binary representation of", number, "is", binary)
