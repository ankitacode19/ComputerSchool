#check anagram

string1 = input("first string: ")
string2 = input("second string: ")
# len1 = len(string1)
# len2 = len(string2)

string1 = sorted(string1)
string2 = sorted(string2)

if string1 == string2:
    print("anagram")

else:
    print("not anagram")


