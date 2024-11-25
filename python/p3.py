#roll no using slicing


e=input("Enter Enrollment no:ex-CS24M034").upper()
l=len(e)
dep1=e[0:2]
year=e[2:4]
degree=e[4:5]
rno=e[5:]
if(dep1=="CS"):
         department="Computer Science"
         if(degree=="M"):
             degree="MCA"
         elif(degree=="B"):
            degree="BCA"
         elif(degree=="P"):
            degree="PGDCA"
elif(dep1=="ME"):
    department="Mechanical engineering"
    if(degree=="B"):
        degree="BME"
    elif(degree=="M"):
        degree="MME"
print("Department: {}   Year :20{}   Degree:{}    Roll No:{} ".format(department,year,degree,rno))