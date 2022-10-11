/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import com.trunghieuph.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author TrungHieu
 */
public class NewEmptyJUnitTest {
    
    @Test
    public void TestFactorialGivenRightArgumentReturnWell(){
//        TEST cáse #1: 0! hi vọng 1
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        Assert.assertEquals(expected, actual);
        
//        Test case 2
         Assert.assertEquals(1, MathUtil.getFactorial(1));
//        Test case 3
         Assert.assertEquals(2, MathUtil.getFactorial(2));
}
    @Test
    public void TestFactorialGivenRightArgumentReturnWellV2(){
//        Test case 4
         Assert.assertEquals(6, MathUtil.getFactorial(3));
//        Test case 5
         Assert.assertEquals(24, MathUtil.getFactorial(4));
}
//    kiểm thử ngoại lệ khi đưa data cà chớn
//    n < 0: ko tính giai thừa
//    n> 20: ko tính giai thừa tràn kiểu long
//    hàm được thiết kế: Ném ra ngoại lệ tên là Illegal- Exception
//    thay vì nhận về 1 giá trị long, bạn nhận về câu chửi
//    ta đo lường câu chửi có xuât hiện hay ko khi n = -5
//    thấy ngoại lệ mừng rơi nước mắt
//    NẾU -5 MÀ APP NÉM RA NGOẠI LỆ, NGHĨA LÀ HÀM ỔN, CHẠY NHƯ KÌ VỌNG -> MÀU XANH
//    ĐÚNG KÌ VỌNG ~~~ MÀU XANH
   
    
    @Test(expected = Exception.class)
    public void TestFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5);
        
    }
}
 
//chốt DEAL xanh đỏ, nếu tất cả các @Test đều màu xanh -> hàm đúng cho những thứ mình đã test
//Xanh cuối cùng khi tất cả các @Test xanh
//1.Xanh khi tất cả cùng XANH



//Nếu trong các @Test có ít nhất 1 thằg đỏ/ xem như tất cả là đỏ/ ý nghĩa là hàm đúng thì phải đúng hết/ có 1 thằng sai ->
//hàm không ổn định về kết quả -> phải gọi là hàm sai

//2. Đỏ khi có ít nhất 1 thằng đỏ
//đỏ đến từ 1 trog 2 tình huống
//EXPECTED  đúng, AUTUAL trả về sai -> Bug của hàm
//Expexted đã tính/ gõ sai, Actual sai đúng