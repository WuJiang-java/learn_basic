package com.java.leetcode.leetbook;

/**
 * 字符串转换整数 (atoi)
 */
public class MyAtoi {

    //有点问题
    public int myAtoi(String s) {

        StringBuffer sb=new StringBuffer("");
        for(int i=0;i<s.length();i++){

            char c=s.charAt(i);
            if(c==' '){
                continue;
            }else if((c>=48&&c<=57)||c==45){
                sb.append(s.charAt(i));
            }else if("".equals(sb.toString())&&(c>57||c=='+'||c=='.')){
                return 0;
            }else if(sb.length()==1&&(c<48||c>57)){
                return 0;
            }else if(c<=48||c>=57){
                break;
            }
        }

        Long temp=Long.parseLong(sb.toString());
        if(temp>0){
            return temp>2147483647?2147483647:temp.intValue();
        }else{
            return  temp<-2147483648?-2147483648:temp.intValue();
        }
    }

    public int myAtoi1(String s){

        char[] chars = s.toCharArray();
        int size=chars.length;
        int index=0;
        //先去空格
        while (index<size&&chars[index]==' '){
            index++;
        }

        while (index>=size){
            return 0;
        }
        //再判断符号
        int sign=1;
        if(chars[index]=='-'||chars[index]=='+'){
            if(chars[index]=='-'){
                sign=-1;
            }
            index++;
        }
        int result=0;
        int temp=0;
        while (index<size){
            int num=chars[index]-'0';
            if(num>9||num<0){
                break;
            }
            temp=result;
            result=result*10+num;
            if(result/10!=temp){
                if(sign>0){
                    return Integer.MAX_VALUE;
                }else {
                    return Integer.MIN_VALUE;
                }
            }
            index++;

        }
        return result*sign;
    }

}
