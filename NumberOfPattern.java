import java.util.*;
import java.io.*;
class numberPattern
{
    private String str;
    numberPattern(String str)
    {
        this.str = str;
    }
    
    void printNumberOfPattern()
    {
        Stack<Integer> st = new Stack<Integer>();
        
        for(int i=0; i<= str.length(); i++)
        {
            st.push(i+1);
            if(i == str.length() || str.charAt(i)=='I')
            {
                while(!st.isEmpty())
                {
                    System.out.print(st.peek() + " ");
                    st.pop();
                }
            }
        }
    }
}

public class NumberOfPattern
{
	public static void main(String[] args) throws Exception{
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		String str = br.readLine();
		
		numberPattern p = new numberPattern(str);
		p.printNumberOfPattern();
	}
}