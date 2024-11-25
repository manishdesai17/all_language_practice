#find prime number
while(True):
 no=input("enter no:")
 if(no.isnumeric()):
   break
no=int(no)
c=0
for i in range(2,no+1):
    if (no%i)==0:
     c=c+1
if(c==1):
   print("{} is prime number".format(no))
else:
  print("{} is not prime number".format(no))