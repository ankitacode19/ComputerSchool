for i, j in zip(range(1,6), range(5,0,-1)):
    if i == 3 or j == 3:
        continue
    else:
        print(i, ' ', j)
