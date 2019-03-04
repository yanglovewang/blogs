package com.yang.springboottest.enums;

import java.text.NumberFormat;

public class test {

    public static void main(String[] args) {
        // 创建一个数值格式化对象
        NumberFormat numberFormat = NumberFormat.getInstance();
        // 设置精确到小数点后2位
        numberFormat.setMaximumFractionDigits(2);
        String format = numberFormat.format(((float) 2 / (float) 5) * 100) + "%";

        System.out.println(format);

    }
}
