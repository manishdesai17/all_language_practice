no={1:"One",
    2:"Two",
    3:"Three",
    4:"Four",
    5:"Five",
    6:"Six",
    7:"Seven",
    8:"Eight",
    9:"Nine",
    10:"Ten",
    11:"Eleven",
    12:"Twelve",
    13:"Thirteen",
    14:"Fourteen",
    15:"Fifteen",
    16:"Sixteen",
    17:"Seventeen",
    18:"Eighteen",
    19:"Nineteen",
    20:"Twenty",
    30:"Thirty",
    40:"Forty",
    50:"Fifty",
    60:"Sixty",
    70:"Seventy",
    80:"Eighty",
    90:"Ninety",
    100:"hundred"}

def check(no1):
    for k,i in no.items():
        if(k==no1):
            return no[no1]

no1=int(input("Enter any number:"))
if(no1<=20):
   print(check(no1))

elif(no1>20 and no1<=99):
    s=no1%10
    s1=no1-s
    print(check(s1),check(s))
elif(no1>99 and no1<=999):
    print(no1%10)
    print(no1//10)
    print(no1%100)
    print(no1//100)
    n=no1%100
    first=no1//100
    n1=no1%10
    n2=n-n1
    if(n<21):
        print(check(first),"Hundred",check(n))
    else:
        print(check(first),"Hundred",check(n2))

    
