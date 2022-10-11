/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trunghieuph.mathutil.main;

import com.trunghieuph.mathutil.core.MathUtil;

/**
 *
 * @author TrungHieu
 */
public class Main {
    public static void main(String[] args) {
        
//        Test case #1 n = 0 -> expexted getF(0) trả về 1
        
        long expected  = 1;
        long actual = MathUtil.getFactorial(0);
        System.out.println("0! status: expexted = " + expected
                                + " | actual = " + MathUtil.getFactorial(0));
        System.out.println("1! status: expexted = " + expected
                                + " | actual = " + MathUtil.getFactorial(1));
        System.out.println("5! status: expexted = 120 "
                                + " | actual = " + MathUtil.getFactorial(5));
//        System.out.println("-5! status: expexted = EXCEPTION"
//                                + " | actual = " + MathUtil.getFactorial(-5));
        System.out.println("-5! status: expexted = EXCEPTION"
                                + " | actual = " );
        MathUtil.getFactorial(-5);
        
//        NẾU CÓ EXCEPTION XẢY RA, MỪNG RƠI NƯỚC MẮT VÌ HÀM CHẠY THIÉT KẾ VỚI -5

    }
    
}
//VIỆC CHẠY BỘ TEST/ XEM TỪNG DÒNG KẾT QUẢ ĐƯỢC IN RA, ĐỂ SUY NGHĨ ĐỂ KẾT LUẬN 1 HÀM ĐÚNG SAI
//-> VỤ NÀY MẤT SỨC -> MANUAL TEST, RẤT CẢM GIÁC THỦ CÔNG

//KO HIỆU QUẢ NẾU CODE ĐC CHỈNH SỬA, TA LẠI PHẢI LUẬN LẠI KQUA BẰNG THỦ CÔNG

//KĨ THUẬT THỨ 2 XHIEN: TEST AUTOMATION: MÁY KẾT LUẬN DÙM LUN. TA CHỈ NHÌN 2 THỨ DUY NHẤT SAU KHI CHẠY
//ĐÚNG SAI XANH ĐỎ


//buổi thứ 3
//FRAME WORK ÉP DEV PHẢI VIẾT CODE THEO 1 KHUNG DỰNG SẴN NÀO ĐÓ
//THƯỜNG DÙNG KÍ HIỆU = @
//annotation - flag đánh dấu 1 điều gì đó sẽ diên ra
//lúc biên dịch, runtime

