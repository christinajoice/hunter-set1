a=[1,2,3,4,5]
b=[1,2,3]
yes=all(x in a for x in b)
if(yes==0):
print("It is a subset")
else:
print("Not a subset")
