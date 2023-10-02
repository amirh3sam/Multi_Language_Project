num1 = float(input("Enter the first number: "))
num2 = float(input("Enter the second number: "))
operator = input("Enter your operator (+, -, *, /): ")

print(f"num1 = {num1}")
print(f"num2 = {num2}")
print(f"operator = {operator}")

result = 0

if operator == '+':
    result = num1 + num2
elif operator == '-':
    result = num1 - num2
elif operator == '/':
    if num2 == 0:
        raise ZeroDivisionError("Division by zero is not allowed")
    result = num1 / num2
elif operator == '*':
    result = num1 * num2
else:
    raise ValueError("Operator has to be +, -, *, or /")

print(f"Calculation is: {result}")