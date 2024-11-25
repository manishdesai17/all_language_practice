import re
#file any mobile no in string
print("find mobile no in string")
s1="""Gujarat Vidyapith 72858 84703 was established as a national university without a government
charter. Gandhiji was its (576) 580-1984 life-long chancellor. Professor 9328304561 A T Gidwani was its founder
vice-chancellor. After Gandhiji, Sardar Vallabhbhai Patel, 9105555091 Dr. Rajendra Prasad and 
Morarji Desai (+1)207 558 0918 adorned the post of chancellor of the Vidyapith.Later, 
many more institutions, colleges and schools were affiliated to the Vidyapith."""

#9048389075
#99755 90877
#(555) 555-1234
#(+1)202 555 0118
p1=r"\d{10}"
p2=r"\d{5}\s\d{5}"
p3=r"\(\d{3}\)\s\d{3}\D\d{3}"
p4=r"\(\D\d{1}\)\d{3}\s\d{3}\s\d{4}"

all=p1+"|"+p2+"|"+p3+"|"+p4
x=re.findall(all,s1)
print(x)