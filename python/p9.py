#fibonacci sequence
while(True):
   n=input("Enter any number:")
   if(n.isnumeric()):
    break
n=int(n)
pre,next=1,0
sumof=0
print(sumof,end=", ")
for i in range(n):
    sumof=pre+next
    print(sumof,end=", ")
    pre=next
    next=sumof