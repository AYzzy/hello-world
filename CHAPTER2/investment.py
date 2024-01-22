
p = 1000  
r = 0.07  
a = 10
b = 20
c = 30

amount = p * (1 + r) ** a
next = p * (1 + r) ** b
last =  p * (1 + r) ** c

print(f"After {a} years, the amount on deposit is: ${amount:.2f}")
print(f"After {b} years, the amount on deposit is: ${next:.2f}")
print(f"After {c} years, the amount on deposit is: ${last:.2f}")