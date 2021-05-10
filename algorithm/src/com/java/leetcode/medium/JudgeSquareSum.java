package com.java.leetcode.medium;

class JudgeSquareSum {
    public boolean judgeSquareSum(int c) {

        for(long i=0;i*i<=c;i++){
            double b=Math.sqrt(c-i*i);
            if(b==(int)b){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        JudgeSquareSum s=new JudgeSquareSum();
        boolean b = s.judgeSquareSum(11);
        System.out.println(b);
    }
}