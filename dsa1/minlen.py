T = int(input())

for _ in range(T):

    N = int(input())

    A = list(map(int,input().split()))

    B = list(map(int,input().split()))

    diff_idx = []#difference index

    for i in range(N):

        if A[i] != B[i]:

            diff_idx.append(i)

    max1 = max(diff_idx)

    min1 = min(diff_idx)

    print(max1-min1+1) 