class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        index =-1
        
        hay_length=len(haystack)
        nee_length=len(needle)
        if hay_length < nee_length :
            return index

        
        for i in range (hay_length-nee_length+1):
            j=0
            
            while j<nee_length :
                
                    if  haystack[i+j]==needle[j] :
                    #   print(haystack[k],needle[j])
                      
                      index=i
                    else:
                        index=-1
                        break
                    j=j+1

            if index != -1 :
                return index
        
            

        return index