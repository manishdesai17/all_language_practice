class vihcle:
    def __init__(self,name,color):
        self.name=name
        self.color=color
class car(vihcle):
    def __init__(self,name,color,height):
        super().__init__(name,color)
        self.height=height
        print(self.name)
        print(self.color)
        print(self.height)
c1=car("porsche","yellow",2.4)

