# find the perfect number
# while 1:
#     no = input("enter number")
#     if no.isnumeric():
#         break
# no = int(no)
# number = []
# sum1 = 0
# for i in range(1, no):
#     if no % i == 0:
#         number.append(i)
# for i in number:
#     sum1 = sum1 + i
# if no == sum1:
#     print("Number is perfect..")
# else:
#     print("Number is not perfect..")

#enter term to print number
while(1):
 no=input("Enter term:")
 if(no.isnumeric()):
    break
no=int(no)
c=0
num=1
while(c<no):
    sum1=0
    for i in range(1,num):
        if(num%i==0):
            sum1=sum1+i
    if(num==sum1):
        c=c+1
        print(sum1)
    num=num+1
