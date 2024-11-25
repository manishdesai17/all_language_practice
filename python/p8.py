# find percentage of student passed

while(1):
 students=input("how many student enter :")
 if(students.isnumeric()): 
  students=int(students)
  p=0
  i=1
  break
while(i<=students):
      m=input("enter {} student marks:".format(i))
      if(m.isnumeric()):
        m=int(m)
        if(m>100 or m<0):
           print("enter valid student  marks")
           continue
        if(m>40):
           p+=1
        i+=1
print("percentage of student passed is {}%".format((p*100)/students))