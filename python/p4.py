import random
s=input("enter any string:")
t=s.split()
i=0
j=len(t)-1
while(i<j):
    print(t[j]," ",t[i],end=" ")
    j-=1
    i+=1
    
'''i=0
while(True):
    s1=random.randint(1,len(s))
    s2=random.randint(1,len(s))
    print("s1=",s1)
    print("s2=",s2)
    if(s1<s2):
        print("After:",s[s1:s2])
        break
    elif(s1>s2):
        print("After:",s[s2:s1])
        break'''