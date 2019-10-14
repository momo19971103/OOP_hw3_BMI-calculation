package com.example.lib;

import java.math.BigDecimal;
import java.util.Scanner;

public class BMI {
    private double BMI_V,height,weight = 0;
    private Scanner scanner = new Scanner(System.in);


    public void  getHight(){
        System.out.println("請輸入身高");
        height = scanner.nextDouble();
    }
    public void  getWight(){
        System.out.println("請輸入體重");
        weight = scanner.nextDouble();
    }
    public  void BMIAns(){
        BMI_V = weight/((height*height)/10000);
        BigDecimal BD = new BigDecimal(BMI_V);
        double ValueT2D = BD.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println("BMI為"+ValueT2D);
    }

}
