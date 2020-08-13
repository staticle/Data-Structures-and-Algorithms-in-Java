import java.util.*;
public class postEval
{
    static int inToPo(String  val){
        Stack<Integer> slack = new Stack<Integer>();
        for(int i=0;i<val.length();i++){
            if(Character.isLetterOrDigit(val.charAt(i))) slack.push(Integer.parseInt(String.valueOf(val.charAt(i))));
            else{
                int b = slack.pop(),a = slack.pop();
                switch(val.charAt(i)){
                    case '+':
                        slack.push(a+b);
                        break;
                    case '-':
                        slack.push(a-b);
                        break;
                    case '*':
                        slack.push(a*b);
                        break;
                    case '/':
                        slack.push(a/b);
                        break;
                }
            }
        }
        return slack.pop();
    }
	public static void main(String[] args) {
		String val = "231*+9-";
		System.out.println(inToPo(val));
	}
}
