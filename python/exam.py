eng= float(input())
maths= float(input())
science= float(input())
hindi= float(input())
french= float(input())

sum = eng+maths+science+hindi+french
per= (sum/5)
print(sum)
print(per)
if per < 40:
    print("FAILURE")

if per > 40 and per < 60:
    print("C")

if per > 60 and per < 80:
    print("B")

if per > 80 and per < 100:
    print("A")


