str = "aaassddffrree"
result = ""
for i in range(0, len(str)):
    if str[i] not in result:
        result += str[i]

print(result)