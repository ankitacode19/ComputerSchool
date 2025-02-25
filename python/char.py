char = input()

if char.islower():
    print("lowercase")

elif char.isupper():
    print("uppercase")


elif char.isdigit():
    print("number")

else:
    print("special")