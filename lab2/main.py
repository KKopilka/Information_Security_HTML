import random
def change_password(new_password):
    n = 5
    mas = ['q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m']
    for i in range(n - 1):
        if (new_password[i] == new_password[i + 1]) and new_password[i] == :
            return True
    return False
result = ""
while not change_password(result):
    result = input("Есть повторяющиеся символы. Введите пароль заново.")
print(result)