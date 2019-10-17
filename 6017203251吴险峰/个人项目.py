import random
Set_number = random.randint(0,100)
print(Set_number)
N = 1
try:             
    Guess_number = int(input("输入猜测的数："))
except NameError and ValueError:
    print("输入内容须为整数！")
    Guess_number = int(input("重新输入猜测的数："))
    N = N + 1
while(Guess_number < Set_number or Guess_number > Set_number):
    N = N + 1
    if Guess_number > Set_number:
        print("对不起，太大了")
    elif Guess_number < Set_number:
        print("对不起，太小了")
    try:
        Guess_number = int(input("重新输入猜测的数："))
    except NameError and ValueError:
        print("输入内容须为整数！")
        Guess_number = int(input("重新输入猜测的数："))
        N = N + 1
print("预测{}次，你猜中了".format(N))
