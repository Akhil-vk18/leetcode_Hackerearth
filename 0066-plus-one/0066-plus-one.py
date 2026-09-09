class Solution:
    def plusOne(self, digits: list[int]) -> list[int]:
        num=0
        for digit in digits:
            num= num*10 +digit
        num=num+1
        print(num)
        j=len(digits)+1
        print(j)
        answer=[0]*j
        print(answer)

        while(num>0):
            digit=num%10
            print("digit :",digit)
            answer[j-1]=digit
            j=j-1
            num=num//10
            print("num :",num)

        

        if answer[0]==0:
            answer.pop(0)
        print(answer)
        return answer