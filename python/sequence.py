#count frequency in aaabbbcc print as a3b3c2
s=input()
new={}
for i in range(len(s)):
    key = s[i]
    c = 0
    for j in range(len(s)):
        if key == s[j]:
            c=c+1
    new[key] = c

for i,j in new.items():
    print(i,j,sep='',end='')