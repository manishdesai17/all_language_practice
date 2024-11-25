# multilevel inheritance

class student:
    def __init__(self,name,city,mobile):
        self.name=name
        self.city=city
        self.mobile=mobile

class marks(student):
    def __init__(self,name,city,mobile,sub1,sub2):
        super().__init__(name,city,mobile)
        self.sub1=sub1
        self.sub2=sub2

class sportMark(marks):
    def __init__(self, name, city, mobile, sub1, sub2,sport_mark):
        super().__init__(name, city, mobile, sub1, sub2)
        self.sport_mark=sport_mark

    def printData(self):
        print("name=",self.name)
        print("city=",self.city)
        print("mobile=",self.mobile)
        print("sub1=",self.sub1)
        print("sub2=",self.sub2)
        print("sport marks=",self.sport_mark)
        total=self.sub1+self.sub2+self.sport_mark
        print("Total",total)
        print("pecentage=",total/3)
         
s1=sportMark("manish","deesa",9090897867,60,70,89)
s1.printData()