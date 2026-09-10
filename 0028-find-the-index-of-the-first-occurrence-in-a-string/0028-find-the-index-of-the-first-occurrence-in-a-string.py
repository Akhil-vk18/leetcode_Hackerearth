class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        index =-1
        i=0
        j=0
        hay_length=len(haystack)
        nee_length=len(needle)
        if hay_length < nee_length :
            return index

        
        while(i< hay_length):
            j=0
            k=i
            check=0
            while j<nee_length and check<nee_length  :
                
                check=check+1
                if k < hay_length :
                    if  haystack[k]==needle[j] :
                    
                    #   print(haystack[k],needle[j])
                      k=k+1
                      index=i
                    else:
                        
                        check=0
                        index=-1
                        break
                else:
                    index=-1
                    break
                j=j+1

            if index != -1 :
                return index
        
            i=i+1

        return index