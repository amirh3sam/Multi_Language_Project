string_result = ""
str_value = "Amir"

for i in range(len(str_value)):
    string_result += str_value[i] + ", " if i != len(str_value) - 1 else str_value[i]

print(string_result)