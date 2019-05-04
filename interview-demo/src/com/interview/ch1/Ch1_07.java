package com.interview.ch1;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;

/**
 * @Description 第一章 第七节 代码示例
 * @Author wanglei
 * @Date 2019/5/4
 * @Param
 * @return
 **/
public class Ch1_07 {
    public static void main(String[] args) {
        /*
         * 数组传参示例
         */
//        int[] arr = {2, 3, 4, 8};
//        change(arr);
//        System.out.println(arr[2]);

        /*
         * 字符串转数组
         */
//        String str = "laowang,stone,wanglei";
//        String[] arr = str.split(","); // 字符串转数组
//        System.out.println(arr[0]);

        /*
         * String To Array
         */
//        String[] arr = {"laowang", "stone", "wanglei"};
//        // 方式一：遍历
//        StringBuffer sb = new StringBuffer();
//        for (int i = 0; i < arr.length; i++) {
//            sb.append(arr[i]);
//            if (i != arr.length - 1)
//                sb.append(",");
//        }
//        System.out.println(sb.toString());
//        // 方式二：Arrays.toString
//        String str2 = Arrays.toString(arr);
//        System.out.println(str2);
//        // 方式三：StringUtils.join
//        String str3 = StringUtils.join(Arrays.asList(arr), ","); // 使用英文逗号分隔
//        System.out.println(str3);



    }

    private static void change(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] *= i;
            }
        }
    }


}
