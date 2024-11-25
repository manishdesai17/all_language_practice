    
#find the natural no

while(1):
   n=input("enter any number you want to find natural no:")
   if(n.isnumeric()):
     n=int(n)
     sum=n*(n+1)/2
     print("sum of natural number {} is :".format(n),sum)
     break
