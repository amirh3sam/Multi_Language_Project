
# with Temp variable
a = 10
b = 20
t = a
a = b
b = t

print(f'a = {a} and b = {b}')

# without Temp variable

c = 10
d = 20

c = c + d
d = c - d
c = c - d
print(f'c = {c} and d = {d}')

