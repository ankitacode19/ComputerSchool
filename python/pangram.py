#The quick brown fox jumps over the lazy dog
import string
s = input("Enter pangram: ")
len = len(s)

b = set(string.ascii_lowercase)

s = set(s.lower())

test = b <= s
print(test)