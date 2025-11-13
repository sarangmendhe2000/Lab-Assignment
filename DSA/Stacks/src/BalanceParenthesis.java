
public class BalanceParenthesis {

	
	public static boolean checkParenthesis(String str)
	{
		MyStackListGeneric<Character> st = new MyStackListGeneric<>();
		
		for(int i=0 ; i<str.length();i++)
		{
			Character ch = str.charAt(i);
			
			if(ch=='(' || ch == '[' || ch == '{')
			{
				st.push(ch);
			}
			
			else
			{
				if(st.isEmpty())
				{
					return false;
				}
				else
				{
					Character ch2 = st.pop();
					
					switch(ch)
					{
					case ']' ->{
						if(ch2 != '[')
						{
							return false;
						}
					}
					
					case '}' ->{
						
						if(ch2 != '{')
						{
							return false;
						}
					}
					
					case ')' ->{
						
						
						if(ch2 != '(')
						{
							return false;
						}
					}
					

					}
				}
			}
		}
		
		return st.isEmpty();
	}
	
	
	
}
