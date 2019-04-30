package hello

fun main(args: Array<String>) {
    println("Hello worrld!")

    //các kiểu dữ
    //khai báo biến, có thể thau đổi nhiều lần không giông val (value) chỉ thay đổi 1 lần
    var x: Double
    x = 743646.9347
    println("x = $x")

    var age:Int?
    age = 30
    println ("Tuoi vua bang la $age")
    //? sau tên biến có thể null được
    //nhưng để sử dụng ta phải gán giá trị cho nó
    val aNullableInt:Int? //ta phải khởi tạo biến này trước khi sửa dụng nếu không nó sẽ báo lỗi
    //không thể in ra màn hình vì giá trị bằng null
    //println("Không thể in ra màn hình giá trị aNullableInt = $aNullableInt vì chưa khởi tạo")

    aNullableInt = 15
    println("giá trị của aNullableInt sau khi đc khởi tạo: $aNullableInt")



    //Corvert giữa các kiểu dữ liệu (ép kiểu)
    //
    val anInt:Int = 123;
    val anDouble: Double = anInt.toDouble();
    println("Gí trị của anDouble sau khi convert tư anInt: $anDouble")

    //Ví dự khác
    val anLong:Long? = 12
    val anotherDouble:Double? = anLong?.toDouble() //khi không có dấu hỏi thì sẽ báo lỗi vì giá trị anLong có thể null nên khi gán cho anDouble thì anDouble là có thể null nên ta phải thêm dấu ? phía sau
    println("Giá trị của anotherDouble = $anotherDouble")
    // ==  so sánh giá trị (value)


    //=== có nghĩa là trị bằng nhau và vùng chứa dữ liệu cùng 1 nơi (value và vùng nhớ)
    //Ví du
    //khai báo biến z kiểu dữ liệu double
    var z:Double = 248.0
    var a1:Double = z
    var a2:Double = z

    if (a1 === a2) {
        println("a1 bằng a2 có cùng vùng nhớ (trỏ đén z) và có cùng giá trị $z")
    }



    //Kiểu boolean


    //Lưu ý ta nên khai báo dạng val khi nào báo lỗi ta chuyển sang var --> bởi vì trong một ố trường hợp ta chỉ cần khai báo dung 1 lần


    //BÀI 2 ====STRING ; CHAR ; ARRAY #########
    //
    // 1

    //'' : dấu nháy đơn là kiểu char (1 ký tự)
    //"": là 1 chuỗi ký tự kiểu string (nhiều hơn 1 ky tự)
    val anChar:Char = 's'
    val aString:String = "Hôm này là thứ 3 thì chắc chắn là thứ 3"
    val anotherString = aString.replace("\u0020","")

    //ta có thể tách chuỗi thành các ký tự sử dụng vòng lặp for
    for (char in aString) {
        println("Ký tư: $char")
    }
    for (char in anotherString) {
        println("Ký tư: $char")
    }

    //ta có hàm arrayOf dùng để tạo mảng từ các phần tử của mảng
    //Ví dụ:
    val strings:Array<String> = arrayOf("n","g","h", "i", "a", "dt")
    println("strings: $strings")
    for (string in strings) {
        println("string $string")
    }

    //Ví dụng một mảng các số nguyên
    val inNumbers:Array<Int> = Array<Int>(5, {i -> i * 8})
    for(int in inNumbers) {
        println("int: $int")
    }
}