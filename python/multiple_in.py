# multiple inheritance

class BcaStudent:
    def __init__(self,name,city):
        print("call bcastudent")
        self.name=name
        self.city=city

class McaStudent:
    def __init__(self,name,city):
        print("call mca studnet")
        self.name=name
        self.city=city

class Mark(McaStudent,BcaStudent):
      def __init__(self, name, city,sub1,sub2):
           super().__init__(name, city)
           self.sub1=sub1
           self.sub2=sub2

      def printData(self):
         print("name=",self.name)
         print("city=",self.city)
         print("sub1=",self.sub1)
         print("sub2=",self.sub2)
         total=self.sub1+self.sub2
         print("total=",total)
         print("percentage=",total/2)
        
name=input("Enter name:"); 
city=input("Enter city:"); 
sub1=int(input("Enter sub1 mark:")); 
sub2=int(input("Enter sub2 mark:")); 
s1=Mark(name,city,sub1,sub2)
s1.printData()