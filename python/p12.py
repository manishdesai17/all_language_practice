d={'manish':'17-11-2003',
  'ashwin':'02-12-2004',
  'jignesh':'30-03-2000',
  'nitesh':'13-05-1999',
  'Pravin':'23-08-2005'}

while(True):
 dob=input("Enter any month:")
 if(dob.isnumeric()): 
  break
 
if(len(dob)==1):
  dob='0'+dob
x=0
for key,i in d.items():

    if(i[3:5]==dob):
      print('Date of birth:  {}:{}'.format(key,i))
      x=x+1
if(x==0):
    print("Data not fond")