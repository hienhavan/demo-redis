#  demo Sử Dụng Redis Cache Trong Spring Boot

##  Giới Thiệu  
Dự án minh họa cách sử dụng Redis làm cache trong Spring Boot bằng `spring-boot-starter-cache` và `spring-data-redis`.

##  Công Nghệ Sử Dụng  
- **Spring Boot 3.3.0**  
- **Spring Cache (`starter-cache`)**  
- **Spring Data Redis**  
- **Redis**  

##  Cấu Hình Redis Cache  

###  Thêm Dependencies  
Dự án sử dụng các thư viện cần thiết cho Redis và Spring Cache.

###  Cấu Hình Redis  
- **Cấu hình kết nối Redis**: Xác định Redis host, port, và các tham số kết nối.  
- **Cấu hình CacheManager**:  
  - Định nghĩa thời gian sống của cache (TTL).  
  - Cấu hình kiểu serialization cho dữ liệu cache.

 **Lưu ý:**  
- Nếu **KHÔNG** dùng `GenericJackson2JsonRedisSerializer`, dữ liệu cache sẽ lưu dưới dạng **Java Serialization** (không đọc được trực tiếp).  

##  Controller & Service  

###  Service  
- Áp dụng **@Cacheable** để cache kết quả trả về từ API.  
- Sử dụng `key` động dựa vào tham số đầu vào.  
- Nếu dữ liệu có trong cache, nó sẽ được trả về ngay mà không cần gọi service bên ngoài.  

 **Lưu ý quan trọng:**  
- **@Cacheable** chỉ áp dụng với phương thức **không thay đổi dữ liệu**.  
- Nếu có logic cập nhật, cần sử dụng **@CachePut** hoặc **@CacheEvict** để làm mới dữ liệu trong cache.  

##  Chạy Dự Án  

- Khởi động Redis server bằng Docker hoặc cài đặt thủ công.  
- Chạy ứng dụng Spring Boot.  
- Gửi request đến API để kiểm tra cache.  


