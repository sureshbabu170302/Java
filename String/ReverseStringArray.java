package String;

public class ReverseStringArray 
{
    public static void main(String[] args) 
    {
        String st = "welcometoscaler";
        reverseVowels(st);   
    }   

    public static void reverseVowels(String str)  
    {
        char[]s = str.toCharArray();
        int i = 0;
        int j =  s.length -1;
        
        while (i < j)
        {
            while(s[i]!='a' && s[i]!='e' && s[i]!='i' && s[i]!='o' && s[i]!='u')
            {
                i++;
            }
            while(s[j]!='a' && s[j]!='e' && s[j]!='i' && s[j]!='o' && s[j]!='u')
            {
                j--;
            }

            if(i>=j)
            {
                break;
            }

            char temp = s[i];
            s[i]=s[j];
            s[j]=temp;
            
            i++;
            j--;
        }

        for(int k=0 ; k<s.length ; k++)
        {
            System.out.print(s[k]);
        }
    }
}
