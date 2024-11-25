import re
#find email address
s2=""" Gujarat Vidyapith was established as a national university without a
 government charter. Gandhiji manish@gmail.com was its life-long chancellor. Professor
A T Gidwani was its founder vice-chancellor.a.manish@gamil.com After Gandhiji, Sardar 
Vallabhbhai Patel, Dr. m@g.c Rajendra Prasad and Morarji Desai manish123@gmail.c adorned the
post of chancellor of the Vidyapith.Later, many more institutions, 
colleges and schools were affiliated to the Vidyapith."""

#abc@gmail.com
#a@g.c
p1=r"\w+\@\w+\.\w+"
p2=r"\w\.\w+\@\w+\.\w+"
all=p1+"|"+p2
x=re.findall(all,s2)
print(x)