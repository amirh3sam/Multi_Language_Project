str1 = input("enter your first string : ")
str2 = input("enter your second string  :")

combine = str1 + str2[1:] if str1[-1] == str2[0] else str1 + str2
print(combine)