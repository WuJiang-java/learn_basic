package com.java.test;

import java.math.BigDecimal;

public class Test {

    public static void main(String[] args) {
       /* //BigDecimal类型比较
        BigDecimal b1=new BigDecimal(0.400).setScale(4,BigDecimal.ROUND_HALF_DOWN);
        BigDecimal b2=new BigDecimal(0.40).setScale(4,BigDecimal.ROUND_HALF_DOWN);
        BigDecimal b3=null;
        BigDecimal b4=null;

        System.out.println(b3==b4);*/

        //分割字符串
        String selectProperties = "id,referrate,bizdate,endprice,description,modifytime";
        String[] splitProperties = selectProperties.split(",");
        for (String selectProperty : splitProperties) {
            System.out.println(selectProperty);
        }

//        Season season=Season.SPRING;

        double x=4.0;
        int y=4;
        x/=++y;
        System.out.println(x);


    }

    enum Season{
        SPRING("春天","春暖花开"),
        SUMMER("夏天","夏日炎炎");

        private String seasonName;
        private String seasonDesc;

        private Season(String seasonName,String seasonDesc){
            this.seasonName=seasonName;
            this.seasonDesc=seasonDesc;
        }

        public String getSeasonName() {
            return seasonName;
        }

        public void setSeasonName(String seasonName) {
            this.seasonName = seasonName;
        }

        public String getSeasonDesc() {
            return seasonDesc;
        }

        public void setSeasonDesc(String seasonDesc) {
            this.seasonDesc = seasonDesc;
        }

        @Deprecated
        public static String getName(String seasonDesc){
            String name=null;
            for (Season status :
                    Season.values()) {
             if(status.getSeasonDesc().equals(seasonDesc)){
                 name=status.getSeasonName();
             }
            }
            return name;
        }
    }

}
