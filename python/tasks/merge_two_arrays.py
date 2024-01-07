arr = [1, 2, 3, 4]
arr2 = [5, 6, 7, 8, 9, 10]
arr3 = []

for i in range(0, len(arr)-1):
    arr3.append(arr[i])


for i in range(0, len(arr2)):
    arr3.append(arr2[i])


print(arr3)