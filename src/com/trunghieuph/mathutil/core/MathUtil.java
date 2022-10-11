/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trunghieuph.mathutil.core;

/**
 *
 * @author TrungHieu
 */
public class MathUtil {
//  trong class này ta sẽ viết các hàm tiện ich/ dùng chung 
//cho nhiều class khác. Cái gì mà chung cho các class khác thì thường sẽ THIẾT KẾ LÀ STATIC

//hàm này tính n! = 1.2.3.4...n
//    Quy ước: ko có giai thừa
//    0! = 1! = 1
//    chỉ tính từ o..20 vì 21 vượt 18 con số 0, vượt long
    
public static long getFactorial(int n) {
    if (n < 0 || n > 20) 
        throw new IllegalArgumentException("Invalid n. N must be between 0..20");
    if (n == 0 || n == 1)
        return 1;
    long product = 1;
    for (int i = 2; i <= n; i++)
        product *= i;
    return product;
    
}
}

//học kĩ thuật viết code đc gọi là TDD: test driven development
//là kĩ thuật ngay khi viết code, ngay khi thiết kế ra tên hàm đã phải chuẩn bị luôn bộ kiểm thử, chuẩn bị luôn các test case
//chuẩn bị luôn các tình huống (case) sẽ xài
//chuẩn bị luôn các tình huống test các hàm để xác định hàm đúng/ sai
//viết code hướng về đa,r bảo các bài kiểm thử đặt ra
//cá test cases - các tình huống xài hàm 1 khi hàm viết xong
//Case 1: #1 n = 0; get Factorial(0) -> expected hy vọng hàm trả ra: 1
//Case 2: #2 n=1;   get Factorial(1) -> expected hy vọng hàm trả ra: 1
//Case 3: #3 n=5;   get Factorial(5) -> expected hy vọng hàm trả ra: 120
//Case 4: #4 n=-5;   get Factorial(-5) -> expected hy vọng hàm trả ra: CHỬI, KO HỢP LỆ
//Case 5: #5 n=21;   get Factorial(21) -> expected hy vọng hàm trả ra: CHỬI, KO HỢP LỆ

//TEST CASE: là một tình huống kiểm thử app xem nó chạy đúng hay ko bằng cách đưa data cụ thể nào đó. xem nó output ra có đúng dự kiến hay 0
//           đưa data -> chờ app xử lý -> kết quả
