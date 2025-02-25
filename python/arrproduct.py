arr = [1,2,3,4,5,6]
n = len(arr)
output = []
for i in arr:
    m = 1
    for j in arr:
        if i != j:
            m = m*j
    output.append(m)

print(output)

