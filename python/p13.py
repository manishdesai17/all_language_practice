def count1(price,note,n):
    while(price>=(n*note)):
         n+=1
    return n-1    
note=[500,200,100,50,20,10,5,2,1]
price=input("Enter price:")

while(1):
 if(not price.isnumeric()):
    price=input("Enter price: ")
 else:
    break
price=int(price)

def check(price,poin):
    while(price>0):
     if(price<note[poin]):
        poin+=1
     else:   
      n=count1(price,note[poin],1)
      print("Note {}: {}".format(note[poin],n))
      price=price-n*note[poin]
      poin+=1





if(price>=500):
  print("----------------")
  poin=0
  check(price,poin)

if(price>=200):
   print("----------------")
   poin=1
   check(price,poin)

if(price>=100):
    print("----------------")
    poin=2
    check(price,poin)

if(price>=50):
    print("----------------")
    poin=3
    check(price,poin)

if(price>=20):
    print("----------------")
    poin=4
    check(price,poin)

if(price>=10):
    print("----------------")
    poin=5
    check(price,poin)
if(price>=5):
    print("----------------")
    poin=6
    check(price,poin)
if(price>=2):
    print("----------------")
    poin=7
    check(price,poin)
if(price>=1):
    print("----------------")
    poin=8
    check(price,poin)  
     