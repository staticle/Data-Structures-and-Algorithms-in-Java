import java.util.*;
public class infToPo
{
    static int Precedence(char ch){
        switch(ch){
            case '+':
                case '-':
                    return 1;
            
            case '*':
                case '/':
                    return 2;
            
            case '^':
                return 3;
        }
        return -1;
    }
    static String inToPo(String  val){
        Stack<Character> slack = new Stack<Character>();
        String res = new String("");
        for(int i=0;i<val.length();i++){
            char ch = val.charAt(i);
            
            if(Character.isLetterOrDigit(ch)) res+=ch;
            else if(ch == '(') slack.push(ch);
            else if(ch == ')'){
                while(!slack.isEmpty() && slack.peek()!= '(') res+= slack.pop();
                if(!slack.isEmpty() && slack.peek()!='(') return "Invalid";
                else slack.pop();
            }
            else{
                while(!slack.isEmpty() && Precedence(ch) <= Precedence(slack.peek())){
                    if(slack.peek() == '(') return "Invalid";
                    res += slack.pop();
                }
                slack.push(ch);
            }
        }
        while(!slack.isEmpty()){
            if(slack.peek() == '(') return "Invalid";
            res += slack.pop();
        }
        return res;
    }
	public static void main(String[] args) {
		String val = "a+b*(c^d-e)^(f+g*h)-i";
		System.out.println(inToPo(val));
	}
}
