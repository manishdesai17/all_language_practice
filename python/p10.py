#10.colatz  sequence

while(True):
  no=input("enter ant number:")
  if(no.isnumeric()):
      break
no=int(no)
print(no,end=" ")
while(no!=1):
    if(no%2==0):                             
        no=int(no/2)
        print("{}".format(no),end=" ")
    else:
        no=int((no*3)+1)
        print("{}".format(no),end=" ")