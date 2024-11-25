import random
suit={1:'heart', 2:'diamond', 3:'spade',4:'club'}
for key,value in suit.items():
   print(key,"",value)
while(1):
 s=input("Please,choose  valid suit no:")
 if(s in ('1','2','3','4')):
       s=int(s)
       break

card={1:'Ace',2:2,3:3,4:4,5:5,6:6,7:7,8:8,9:9,10:10,11:'Jack',12:'Queen',13:'King'}
for key,value in card.items():
    print(key,":",value,end="   ")
    if(key==8):
      print("")
while(1):
 c=input("\nPlease,choose  valid card no:")
 if(c in ('1','2','3','4','5','6','7','8','9','10','11','12','13')):
       c=int(c)
       break
sr= random.randint(1,4)

cr = random.randint(1,13)
if(s==sr and c==cr):
   print("{} of {} is Lucky".format(card[c],suit[s]))
   #print("Random = ",card[cr]," ",suit[sr])
else:
   print("{} of {} is Not  Lucky".format(card[c],suit[s]))
   #print("Random = ",card[cr]," ",suit[sr])