# Hướng Dẫn Sử Dụng Hàm Sum

## Giới Thiệu

Dự án này cung cấp một hàm `sum()` để cộng hai số nguyên cực lớn (Big Number) được biểu diễn dưới dạng chuỗi (String). Hàm này hữu ích khi cần xử lý các số vượt quá giới hạn của kiểu dữ liệu số nguyên thông thường trong Java.

## Cấu Trúc Dự Án

```
sum_func/
├── src/
│   ├── website/ndlamdev/bignumber/
│   │   └── MyBigNumber.java          # Class chứa hàm sum
│   └── test/website/ndlamdev/bignumber/
│       └── MyBigNumberTest.java      # Unit test
├── libs/                             # Thư viện JUnit
└── out/                              # Thư mục chứa file đã biên dịch
```

## Mô Tả Hàm Sum

### Cú Pháp

```java
public static String sum(String stn1, String stn2)
```

### Tham Số

- `stn1`: Chuỗi biểu diễn số nguyên thứ nhất
- `stn2`: Chuỗi biểu diễn số nguyên thứ hai

### Giá Trị Trả Về

- Trả về một chuỗi (String) biểu diễn tổng của hai số

### Ví Dụ

```java
String result = MyBigNumber.sum("123456789", "987654321");
// Kết quả: "1111111110"
```

## Cách 1: Test Bằng Hàm Main

### Bước 1: Biên Dịch Code

Mở terminal/command prompt tại thư mục gốc của dự án và chạy lệnh:

```bash
javac -d out/production/sum_func src/website/ndlamdev/bignumber/MyBigNumber.java
```

### Bước 2: Chạy Chương Trình

Chạy lệnh sau với hai tham số là các số cần cộng:

```bash
java -cp out/production/sum_func website.ndlamdev.bignumber.MyBigNumber <số_thứ_nhất> <số_thứ_hai>
```

### Ví Dụ Cụ Thể

```bash
java -cp out/production/sum_func website.ndlamdev.bignumber.MyBigNumber 123456789123456789 987654321987654321
```

### Kết Quả Mong Đợi

```
MyBigNumber: 1111111111111111110
Time process: 0 ms
BigNumber: 1111111111111111110
Time process: 0 ms
```

Chương trình sẽ hiển thị:
- Log (INFO) kết quả tính toán từ hàm `MyBigNumber.sum()`
- Kết quả tính toán từ hàm `MyBigNumber.sum()`
- Thời gian xử lý cử hàm `MyBigNumber.sum()`
- Kết quả so sánh với class `BigInteger` của Java
- Thời gian xử lý của hàm `BigInteger`

### Test Với Số Cực Lớn

```bash
java -cp out/production/sum_func website.ndlamdev.bignumber.MyBigNumber 999999999999999999999999999999999999999 111111111111111111111111111111111111111
```

Kết quả:
```
Oct 08, 2025 5:53:21 AM website.ndlamdev.bignumber.MyBigNumber sum
INFO: 1111111111111111111111111111111111111110
MyBigNumber: 1111111111111111111111111111111111111110
Time process: 0 ms
BigNumber: 1111111111111111111111111111111111111110
Time process: 0 ms
```

## Cách 2: Test Bằng Unit Test

### Yêu Cầu

Đảm bảo đã có các thư viện JUnit trong thư mục `libs/`:
- junit-jupiter-api-6.0.0.jar
- junit-jupiter-engine-6.0.0.jar
- junit-platform-console-standalone-6.0.0.jar
- junit-platform-commons-6.0.0.jar
- junit-platform-engine-6.0.0.jar

### Bước 1: Biên Dịch Test Class

```bash
javac -cp "out/production/sum_func;libs/*" -d out/production/sum_func src/test/website/ndlamdev/bignumber/MyBigNumberTest.java
```

**Lưu ý:** 
- Trên Windows sử dụng dấu `;` để phân tách classpath
- Trên Linux/Mac sử dụng dấu `:` để phân tách classpath

### Bước 2: Chạy Unit Test

#### Sử Dụng JUnit Console Launcher

**Cú pháp cho JUnit 6.0.0:**

```bash
java -jar libs/junit-platform-console-standalone-6.0.0.jar execute --class-path out/production/sum_func --scan-class-path
```

#### Hoặc Chạy Test Cụ Thể

```bash
java -jar libs/junit-platform-console-standalone-6.0.0.jar execute --class-path out/production/sum_func --select-class test.website.ndlamdev.bignumber.MyBigNumberTest
```

#### Xem Danh Sách Test (Discovery Mode)

```bash
java -jar libs/junit-platform-console-standalone-6.0.0.jar discover --class-path out/production/sum_func --scan-class-path
```

### Kết Quả Mong Đợi

```
.
+-- JUnit Platform Suite [OK]
+-- JUnit Jupiter [OK]                                                                                                                                                              
| '-- MyBigNumberTest [OK]                                                                                                                                                          
|   +-- testSumDifferentLength() [OK]                                                                                                                                               
|   +-- testSumMaxCarry() [OK]                                                                                                                                                      
|   +-- testSumAlternatingDigits() [OK]                                                                                                                                             
|   +-- testSumWithCarryOver() [OK]                                                                                                                                                 
|   +-- tesSum() [OK]                                                                                                                                                               
|   +-- testSumSmallNumbers() [OK]                                                                                                                                                  
|   +-- testSumAllNines() [OK]                                                                                                                                                      
|   +-- testSumBothZero() [OK]                                                                                                                                                      
|   +-- testSumPowerOfTen() [OK]                                                                                                                                                    
|   +-- testSumWithZero() [OK]                                                                                                                                                      
|   +-- testSumSameNumbers() [OK]                                                                                                                                                   
|   +-- testSumRepeatingDigits() [OK]                                                                                                                                               
|   '-- testSumWithLeadingZeros() [OK]                                                                                                                                              
'-- JUnit Vintage [OK]

Test run finished after 466 ms
[         4 containers found      ]
[         0 containers skipped    ]
[         4 containers started    ]
[         0 containers aborted    ]
[         4 containers successful ]
[         0 containers failed     ]
[        13 tests found           ]
[         0 tests skipped         ]
[        13 tests started         ]
[         0 tests aborted         ]
[        13 tests successful      ]
[         0 tests failed          ]
```

### Giải Thích Unit Test

File `MyBigNumberTest.java` thực hiện:

1. Tạo hai số cực lớn dưới dạng chuỗi
2. Tính tổng bằng hàm `MyBigNumber.sum()`
3. Tính tổng bằng class `BigInteger` của Java
4. So sánh hai kết quả để đảm bảo tính chính xác

```java
@Test
public void tesSum() {
    String a = "123123132132132133412436787124354657687651324354963625167345069723627384957508597687546351364735846987543236475869865435245367";
    String b = "11232753876573512661562313524162738387656172834637548637465136273876136247850978654634783596787367283878767283987657621728394";
    
    BigInteger bigA = new BigInteger(a);
    BigInteger bigB = new BigInteger(b);
    
    String resultMyBigNumber = MyBigNumber.sum(a, b);
    String resultBigNumber = bigA.add(bigB).toString();
    
    Assertions.assertEquals(resultMyBigNumber, resultBigNumber);
}
```

## Test Trong IDE (IntelliJ IDEA/Eclipse)

### IntelliJ IDEA

1. Mở file `MyBigNumber.java`
2. Click chuột phải vào hàm `main()` và chọn **"Run 'MyBigNumber.main()'"**
3. Vào **Run -> Edit Configurations**
4. Thêm tham số vào mục **Program arguments**: `999999999 111111111`
5. Click **OK** và chạy lại

Để chạy Unit Test:
1. Mở file `MyBigNumberTest.java`
2. Click vào biểu tượng Play màu xanh bên cạnh tên class hoặc method test
3. Chọn **"Run 'MyBigNumberTest'"**

### Eclipse

1. Mở file `MyBigNumber.java`
2. Click chuột phải chọn **Run As -> Java Application**
3. Vào **Run -> Run Configurations**
4. Chọn tab **Arguments**
5. Nhập tham số: `999999999 111111111`
6. Click **Run**

Để chạy Unit Test:
1. Mở file `MyBigNumberTest.java`
2. Click chuột phải chọn **Run As -> JUnit Test**

## Lưu Ý Quan Trọng

1. **Định dạng đầu vào**: Hai tham số phải là chuỗi số nguyên hợp lệ (chỉ chứa các chữ số 0-9)

2. **Số âm**: Phiên bản hiện tại chưa hỗ trợ số âm. Chỉ hoạt động với số nguyên dương

3. **Hiệu suất**: Hàm được tối ưu để xử lý các số rất lớn với hiệu suất tốt

4. **So sánh với BigInteger**: Kết quả được kiểm chứng bằng cách so sánh với class `BigInteger` của Java để đảm bảo độ chính xác

## Thuật Toán

Hàm `sum()` hoạt động theo nguyên tắc cộng từng chữ số từ phải sang trái, tương tự như cách cộng tay:

1. Bắt đầu từ chữ số cuối cùng của mỗi số
2. Cộng từng cặp chữ số tương ứng và số nhớ
3. Lưu chữ số hàng đơn vị vào kết quả
4. Chuyển số nhớ sang cột tiếp theo
5. Lặp lại cho đến hết cả hai số
6. Đảo ngược chuỗi kết quả để có đáp án cuối cùng

## Tác Giả

- **Nguyen Dinh Lam**
- Email: ndlam.dev@gmail.com
- Phone: +84 855354919
- Website: ndlamdev

## Giấy Phép

Dự án này được tạo ra cho mục đích học tập và nghiên cứu.

