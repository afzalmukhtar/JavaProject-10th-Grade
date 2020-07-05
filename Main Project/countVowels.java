public class countVowels
{
    int countvowels(String str,char ch)
    {
        int i,ctr=0;
        ch = Character.toUpperCase(ch);
        if(ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U')
        {
            for(i=0;i<str.length();i++)
            {
                if(str.charAt(i)==ch)
                ctr = ctr+1;
            }
            return ctr;
        }
        else
        return -1;
    }
}
