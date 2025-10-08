# Big Number Calculator - Spring Boot Application

## 📝 Mô tả
Ứng dụng web tính tổng các số cực lớn với giao diện đẹp và hiện đại.

## ✨ Tính năng
- ✅ Nhập 2 số bất kỳ (chỉ chứa chữ số 0-9)
- ✅ Tính tổng các số lớn với độ chính xác tuyệt đối
- ✅ Hiển thị kết quả và thời gian thực hiện phép toán (milliseconds)
- ✅ Giao diện responsive, đẹp mắt với hiệu ứng animation
- ✅ Xác thực dữ liệu đầu vào

## 🛠️ Công nghệ sử dụng
- **Backend**: Spring Boot 3.5.6
- **Template Engine**: Thymeleaf
- **Java**: Version 21
- **Build Tool**: Gradle 8.14.3
- **Custom Library**: BigNumber.jar (MyBigNumber class)

## 📋 Yêu cầu hệ thống
- Java 21 hoặc cao hơn
- Gradle 8.x (hoặc sử dụng Gradle Wrapper đã có sẵn)

## 🚀 Cách chạy ứng dụng

### Sử dụng Gradle Wrapper (Khuyến nghị)

#### Trên Windows:
```bash
.\gradlew bootRun
```

#### Trên Linux/Mac:
```bash
./gradlew bootRun
```

### Sử dụng Gradle đã cài đặt:
```bash
gradle bootRun
```

### Build dự án và chạy

#### Build dự án
```bash
./gradlew build -x test
```

#### Chạy dự án trên Windows:
```bash
java -jar .\build\libs\spring-0.0.1-SNAPSHOT.jar
```

#### Chạy dự án trên Linux/Mac:
```bash
java -jar ./build/libs/spring-0.0.1-SNAPSHOT.jar
```

### Sử dụng IntelliJ IDEA:
1. Mở project trong IntelliJ IDEA
2. Chọn file `Application.java`
3. Click chuột phải và chọn **Run 'Application'**

## 🌐 Truy cập ứng dụng
Sau khi chạy thành công, mở trình duyệt và truy cập:
```
http://localhost:8080
```

## 📁 Cấu trúc project
```
spring/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── website/ndlamdev/spring/
│   │   │       ├── Application.java           # Main class
│   │   │       ├── controller/
│   │   │       │   └── CalculatorController.java  # REST Controller
│   │   │       └── dto/
│   │   │           ├── CalculationRequest.java    # Request DTO
│   │   │           └── CalculationResponse.java   # Response DTO
│   │   └── resources/
│   │       ├── templates/
│   │       │   └── index.html             # Giao diện web
│   │       └── application.properties     # Cấu hình Spring Boot
│   └── test/
├── libs/
│   └── BigNumber.jar                      # Custom library
├── build.gradle                           # Gradle build file
├── gradle.properties                      # Gradle properties
└── README.md
```

## 🎨 Giao diện
Giao diện bao gồm:
- **2 ô input**: Nhập số thứ nhất và số thứ hai
- **Nút "Tính toán"**: Thực hiện phép cộng
- **Khu vực hiển thị kết quả**: Hiển thị tổng của 2 số
- **Thời gian thực hiện**: Hiển thị thời gian xử lý (tính bằng milliseconds)
- **Xác thực**: Chỉ cho phép nhập các chữ số 0-9
- **Loading indicator**: Hiển thị khi đang tính toán
- **Error handling**: Thông báo lỗi nếu có

## 🔧 Sửa lỗi Gradle Toolchain
Nếu gặp lỗi về Java Toolchain, file `gradle.properties` đã được cấu hình để:
- Tự động phát hiện Java đã cài đặt trên hệ thống
- Tự động tải xuống Java 21 nếu chưa có

## 📝 API Endpoints

### GET `/`
Hiển thị trang chủ với giao diện calculator

### POST `/calculate`
Tính tổng 2 số lớn

**Request Body:**
```json
{
  "number1": "123456789",
  "number2": "987654321"
}
```

**Response:**
```json
{
  "result": "1111111110",
  "executionTime": 0.123456
}
```

## 👨‍💻 Tác giả
- **Name**: Nguyen Dinh Lam
- **Email**: ndlam.dev@gmail.com
- **Phone**: +84 855354919

## 📄 License
Educational project for learning purposes.

