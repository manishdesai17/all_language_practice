myfile=open("myfile.txt","r")
line=myfile.read()
#split w+ saparate word
print("*** Read old file ***")
print(line)
s=line.split(" ")
print(s)
myfile.close()
myfile1=open("myfile1.txt","w+")
for i in s:
    myfile1.write(i+" ")

myfile1.seek(0)
line1=myfile1.read()
print("\n**** Read new file ****")
print(line1)
myfile1.close()