# # Fibonacci strings
# allchar = (
#     "a",
#     "b",
#     "c",
#     "d",
#     "e",
#     "f",
#     "g",
#     "h",
#     "i",
#     "j",
#     "k",
#     "l",
#     "m",
#     "n",
#     "o",
#     "p",
#     "q",
#     "r",
#     "s",
#     "t",
#     "u",
#     "v",
#     "w",
#     "x",
#     "y",
#     "z",
# )
# while 1:
#     char = input("enter any character :")
#     if char in allchar:
#         break
# sum1 = 0
# n1, n2 = "a", "b"
# for i in allchar:
#     if i == char:
#         break
#     sum1 = n2 + n1
#     print(sum1, end=" ")
#     n1 = n2
#     n2 = sum1


# fibonacci sequence
while True:
    n = input("Enter any number:")
    if n.isnumeric():
        break
n = int(n)
pre, next = "A", "B"
print(pre, " ", next, end="")
for i in range(0, n):
    sumof = next + pre
    print(sumof, end=", ")
    pre = next
    next = sumof
