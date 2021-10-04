import random
def change_password(new_password):
    n = 5
    for i in range(n - 1):
        if new_password[i] == new_password[i + 1]:
            return True
    return False
result = ""
while not change_password(result):
    result = input("Есть повторяющиеся символы. Введите пароль заново.")
print(result)