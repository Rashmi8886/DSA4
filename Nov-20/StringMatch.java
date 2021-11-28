class Solution {
    public boolean backspaceCompare(String s, String t) {
        return check(s).equals(check(t));
        
    
        
    }
        public String check(String s)
        {
            Stack<Character> stk=new Stack();
            for(char c:s.toCharArray())
            {
                if(c!='#')
                    stk.push(c);
                else if(!stk.isEmpty())
                {
                    stk.pop();
                }
            }
            return String.valueOf(stk);
        }
}