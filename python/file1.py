myfile=open("myfile.txt","w")
myfile.write("""After returning from South Africa,
              Gandhiji moved all over India.
              He personally experienced the political,
              social, educational and economic deteriorated
              conditions after observing life of Indian people.
              Bapu made untiring efforts to find solution 
              to all there problems.
              He made some initial experiments of
              education in Kochrab and Sabarmati Ashram during 1915-1920.""")
myfile.writelines("\n\n\mAgain my name is manish")
myfile=open("myfile.txt","r")
print(myfile.readline())
print(myfile.read())
myfile.close()

myfile=open("myfie1.txt","w+")
myfile.write("""""")

myfile=open("myfile.txt","a")
myfile.write("\nthis is my first file in python programing")
myfile=open("myfile.txt","r")
print(myfile.read())
myfile.close()