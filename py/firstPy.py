print("Hello World")

for x in range (1,10):
	print(x)

x = 1
while x < 10
	print(x)
	x += 1

while True:
	print('To infinity and beyond')

my_list = [1, 2, 4, 'Hello', "It's me", 3.14159, True]

my_list.append('PyPy')
my_list.remove()		#removes from first
my_list.pop()			#removes from last
my_list.pop(3)

my_list.insert(2, 2.71)
my_list.index(3.14159)  #will give you 5

a = [2, 3, 5, 7, 11, 13]
for element in a:
	print('A nymber is ', element)    #just like for each loop in java

#iterate with index
for index in range(0, len(a)):
	print(a(index))

#both
for index, value in enumerate(a):
	print(index, value)				#enumerate is a function returns two values


b = [1, 2,3 ,4 ,5 ,6 ,7, 8]

half_list = b[0:4]
second_half  = b[4:]
copied_list = b[:]
last_element = b[-1]  #8
second_last = b[-2]

c = b[0:4:2] #Get every second element upto 4th element

reverse_second_half = a[-1:-5:-1] # 8, 7, 6, 5

reverse_list = a[::-1]


#List comprehension

even_list = [num for num in b if num%2 == 0]

odd_list = [num for num in b if num%2 != 0]

matrix = [[1, 2, 3], [4, 5, 6]]
flat_matrix = [x for row in matrix for x in row]
#[1,2,3,4,5,6]

veg = "tomatoe"      	#strings are also like arrays or lists
correct = veg[:-1]		#removing last character
tmt = veg[::2]
eotamot = veg[::-1]


#dictionaries
age = {}
age['george'] = 10
age['fred'] = 12
age['henry'] = 10
print age['george'] #10
print('matt' in age)  #False



#Functions
def fun1():
	return "Hello", "World"

hello, world = fun1()
print(hello, world)

def fib(n):			#Write fibonacci series upto n
	a, b = 0, 1
	while b < n:
		print(b, end=' ')
		a, b = b, a+b
	print()

def fib2(n):		#return fibonacci series upto n
	result = []
	a, b = 0, 1
	while b < n:
		result.append(b)
		a, b = b, a+b
	return result

#on the another file:-
#	import file_name
#	file_name.fib(10)
#	fibonaci = file_name.fib2(20)
#	print(fibonaci)



#Files
fin = open("foo.txt")
for line in fin:
	# manipulate line
fin.close()

fout = open("bar.txt", "w")
fout.write("hello world")
fout.close()

#implicit close (new 2.5+ style)
with open('bar.txt') as fin:
for line in fin:
	# process line



#don't use tabs always use spaces

#port no can be from 1024 to 65536