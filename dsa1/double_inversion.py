
t= int(input())
for _ in range(t):
    n=int(input())
    IA=list(map(int,input().split()))
    IR=list(map(int,input().split()))
    A=[0]*n
    avail=list(range(1,n+1))
    avail.sort(reverse=True)
    flag=0
    for i in range(n-1,-1,-1):
        pos=IA[i]
        if pos >= len(avail):
            flag=1
            print(-1)
            break
        A[i]=avail[pos]
        avail.pop(pos)
    if flag==1: continue
    for i in range(n):
        if IA[i] + IR[n-1-i] != n - A[i]:
            flag = 1
            print(-1)
            break
    if flag==0 :print(" ".join(map(str,A)))