def add(x,y):
  return x+y

def sub(x,y):
  return x-y

def mul(x,y):
  return x*y

def div(x,y):
  return x/y

print("Simple Calculator \n\n")

while(1):
  c=input("Select one operation \n a. Add \n b. Subtract \n c. Multiply \n d. Divide \n")
  a= int(input("Enter 1st number: "))
  b= int(input("Enter 2nd number: "))
  if c == 'a':    
   print (add(a, b))    
  elif c == 'b':    
   print (sub(a, b))    
  elif c == 'c':    
   print (mul(a, b))    
  elif c == 'd':    
   print (div(a, b))   
  else:    
   print ("This is an invalid input")
  d=input("Would you like to continue? y or n")
  if (d=="n"):
    break
