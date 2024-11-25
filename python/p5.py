#find out if the two blood group are match

def blood_check(b1,b2):
    if(b1==b2):
        return 1
    else:
        return 0
bg=('A-','A+','B-','B+','O-','O+','AB+','AB-')
while(1): 
   bood_group1=input("Enter first person Blood Group:").upper()
   if(bood_group1 in bg):
       break
while(1):
   bood_group2=input("Enter second person Blood Group:").upper()
   if(bood_group2 in bg):
       break
if(blood_check(bood_group1,bood_group2)==1):
    print(" {} and {} blood groups are match...".format(bood_group1,bood_group2))
else:
    print("{} and {} blood groups are not match...".format(bood_group1,bood_group2))