
a= 12
b= 10
c= 20

a_is_median = (b < a < c) or (b > a > c)
b_is_median = (a < b < c) or (a > b > c)
c_is_median = (a < c < b) or (a > c > b)

if a_is_median :
    print(f'{a} is a median number')
elif b_is_median:
    print(f'{b} is a median number')
else:
    print(f'{c} is a median number')

