string = input("Enter String: ")
# len = len(string)
string2 = string[::-1]

if string == string2:
    print("palindrome")
else:
    print("not palindrome")
