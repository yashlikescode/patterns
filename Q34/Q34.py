def vec(x):
    alp = "abcdefghijklmnopqrstuvwxyz"
    temp = alp[1:x]
    res =  temp[::-1] + alp[0] + temp
    return res

def ext(s,r):
    temp = s[0:r]
    res = temp[0:-1] + temp[::-1]
    return res

def pr(lis):
    for i in range(len(lis)):
        if i != len(lis)-1:
            print(lis[i],end="-")
        else:
            print(lis[i],end="")

def das(x):
    print("-"*x,end = "")

n = int(input())
master = vec(n)

lis = list(range(1,n+1))
f = (n*2) - 2
for i in lis:
    das(f)
    pr(ext(master,i))
    das(f)
    f -= 2
    print()

lis.reverse()
for j in lis[1:n+1]:
    if j==lis[1]:
        f+=4
    else:
        f+=2
    das(f)
    pr(ext(master,j))
    das(f)
    print()
