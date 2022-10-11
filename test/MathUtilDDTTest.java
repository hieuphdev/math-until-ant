/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import com.trunghieuph.mathutil.core.MathUtil;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)   //class này chuẩn bị chơi trò tách data ra khỏi câu lệnh xanh đỏ cho dễ ksoat các test case
//thư viện JUnit nó sẽ tự gểnate thêm code phía hậu trường lúc biên dịch để giúp hiện thực hóa ý tưởng DDT
//ví dụ nó sẽ tự biết lấy data ở mảng 2 chiều nào đó nhồi vào hàm
//assertEquals()
//ép ta phải viết code theo cách nào đó định trước mới chạy đươck thư viện đó đc gọi tên mới: framework

public class MathUtilDDTTest {
    
//    ta tự tạo ra 1 hàm, tên tùy ý, trả về mảng 2 chiều chứa danh sách data ta dự định nhồi vào hàm getF() và assertE()
//    phần duyệt mảng để nhồi vào hàm test, frame work sẽ tự lo, coder ko cần lo
    @Parameterized.Parameters //bộ DATA nè
    public static Object[] innitData() {
        
        int a[] = {5, 10, 15, 20, 25};
//mảng có giá trị ngay lúc ban đầu
        Object arr[][] = {{1, 0}, {1, 1}, {2, 2}, {6, 3}, {24, 4}, {120,5}, {720,6}};
        
        return arr;
       
    }
    @Parameterized.Parameter(value = 0) 
    public long expected;
//    getFactoria() -> expected
    @Parameterized.Parameter(value = 1)
    public int n;
//    biến này lưu giá trị đưa cho hàm getF() đẻ check
//    ta sẽ map 2 biến này ứng với 2 cột của từng dòng của mảng ở trên
//    ta phải quy ước biến expecttd map vào cột nào mình muốn
//    thứ tự biến ko quan trọng, thứ tự cột trong mảng ko quan trọng vì ta sẽ cấu hình việc map tương ứng!!!
//    test hoy
    @Test
    public void testFatorialGivenRightArgumentReturnsWell() {
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
}
//DDT: DATA DRIVEN TESTING: là 1 kĩ thuật viết code dùng trong unit test dùng để test các hàm/ class một cách
//dùng để viết code test các hàm/ class một cách dễ đọc hơn
//bằng cách tách data kiểm thử và caau lệnh test hàm thành 2 nơi khác nhau
//ví dụ cách cũ, no-DDT
//assertEquals(0, getF(0))
//assertEquals(1, getF(1))
//assertEquals(2, getF(2))
//assertEquals(6, getF(3))
//assertEquals(24, getF(4))
//ccacsh này dễ viết nhưng khó kiểm tra đủ hết tập test case cần
//test, trộn lẫn data đưa vào, và caau lệnh gọi hàm kiểm thử
//kĩ thuật test data 00 11 22 63 244, để riêng ra 1 chỗ,
//sau đó nhồi, fill, fix, nạp chúng vào lệnh gọi hàm assertEquals(?, getF(?))
//giúp code trong sáng dễ hỉu
//kĩ thuật này gọi là DATA           DRIVEN      TESTING
//                   TÁCH DATA      HƯỚNG VỀ    CODE KIỂM THỬ
//THAM SỐ HÓA DATA- BIẾN DATA RA 1 NƠI ĐẶT CHO CHÚNG TÊN BIẾN
//LÁT HỒI NHÒOI VÀO LỆNH SO SÁNH
//THAM SỐ HÓA - BIẾN DATA THÀNH BIẾN THAM SỐ - PARAMETERRIZED

//mảng 2 chiều


//bài tập về nhà, chọn 1 unit test framework đã thích
//c#: NUnit, xUnit, MSTest, ..
//search gg unit test framework of + tên nn lập trình