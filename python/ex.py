import re
s="manishdesai@gmail.com"
x=re.search("\.",s)
print(x)

x=re.search("[@]",s)
print(x)

x=re.findall("[a]",s)
print(x)

x=re.findall("^m.*",s)
print(x)

x=re.findall("c.+",s)
print(x)

x=re.findall("^.*[@].*[.].*",s)
print(x)
