package StringDemo;

import java.util.Stack;

//翻转字符串里的单词
public class Solution {

    public String reverseWords(String s) {
        String str=s.trim();
        char[] string=str.toCharArray();
        StringBuilder stringBuilder=new StringBuilder();
        boolean flag=true;
        Stack<String> stack=new Stack<>();

        for(int i=0;i<string.length;i++){

            if(string[i]==' '){
                if(string[i+1]!=' '){
                    str=stringBuilder.toString();
                    stack.push(str);
                    stringBuilder=new StringBuilder();
                    flag=true;
                }else{
                    flag=false;
                }
            }

            if(flag&&string[i]!=' '){
                stringBuilder.append(string[i]);
            }
        }
        str=stringBuilder.toString();
        stack.push(str);
        stringBuilder=new StringBuilder();

        while(!stack.isEmpty())
        {
            stringBuilder.append(stack.pop()+' ');
        }
        str=stringBuilder.toString();
        str=str.trim();
        return str;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        String string="  hello       world!  good   Boy  ";
        System.out.println(solution.reverseWords(string));
    }

}
