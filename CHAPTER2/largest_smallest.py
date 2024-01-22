num1 = int(input('ENTER NUMBER:'))
num2 = int(input('ENTER NUMBER:'))
num3 = int(input('ENTER NUMBER:'))

sum = num1 + num2 + num3
print(sum)

average = num1 + num2 + num3 / 3
print(average)

product = num1 * num2 * num3
print(product)

minimum = num1

if num2 < minimum:
	minimum = num2

if num3 < minimum:
	minimum = num3

print('Smallest value is', minimum)

maximum = num1

if num2 > maximum:
	maximum = num2

if num3 > maximum:
	maximum = num3

print('largest value is ', maximum)