# BackEnd-SpringBoot-Deploy-To-Heroku-With-PostgreSQL
Phiên bản được dùng để deploy backend dự án đặt vé phim online(Booking Movie Ticket)

🚀 GIỚI THIỆU KHÁI QUÁT:

- Bối cảnh: 
 Với sự phát triển về lĩnh vực điện ảnh, ngày càng có nhiều phim chiếu rạp hấp dẫn , đặc sắc được ra mắt. Cùng với đó, nhu cầu xem phim của người dùng ngày càng tăng cao. Từ đó, 
rất nhiều hình thức mua bán vé xem phim đã được áp dụng. Hiện nay, Internet đã trở thành dịch vụ phổ biến và thiết yếu và có ảnh hưởng xâu rộng đến thói 
quen sinh hoạt của con người và hình thức mua bán online đã trở nên phổ biến. Chính vì vậy, em quyết định thiết kế một trang web giúp người dùng có thể đặt vé phim online
ngay tại nhà mà không cần phải ra Rạp Chiếu.
- Tên website: 
 MovieStar - cái tên này được sinh do quá trình tìm kiếm một cái logo cho trang web, vô tình em nhìn thấy logo movie có tên "MovieStar" này rất đặc sắc và lúc đó
 em quyết định lấy tên này làm tên của website của mình 🔥
- Chức năng chính:
  1) Người dùng (Role : CUSTOMER): 
	- 🔥Cho phép đăng ký thành viên, đăng nhập, reset lại password.
	- 🔥Quản lý thông tin cá nhân, xem thông tin phim và lịch chiếu phim.
	- 🔥Cho phép đặt vé phim online real-time.
	
  2) Admin (Role: ADMIN):
	- 🔥Quản lý hệ thống phim, rạp chiếu phim
	- 🔥Quản lý phim và thông tin lịch chiếu phim
	- 🔥Quản lý người dùng trong hệ thông
- Thời gian bắt đầu: 
	- 09-04-2022 -> 29-07-2022
	- Link gốc: 
	
	Backend: https://github.com/vinh-nd2002/backend-booking-movies-tickets
	
	Frontend: https://github.com/vinh-nd2002/frontend-booking-movies-tickets
	
- Vai trò trong dự án: FULLSTACK DEVELOPER (Là dự án cá nhân nên mọi công việc đều do em xử lý)
	- Thiết kế database
	- Thiết kế api, xử lý backend
	- Thiết kế giao diện, xử lý frontend
	

🔥🔥🔥 LINK API: 	https://booking-movie-made-by-vinh.herokuapp.com/swagger-ui/index.html

🔥🔥🔥 LINK WEB: 	https://moviesstar.herokuapp.com

🚀 CÔNG NGHỆ SỬ DỤNG:

I>  Mô hình: Client - Server

II>  BackEnd: Spring Framework 
  1. Spring Mail
	
	- Sau khi người dùng đăng ký tài khoản mới thành công sẽ gửi mail confirm
	
	- Sau khi người dùng quên mật khẩu sẽ gửi mail kèm token uuid đổi mật khẩu mới
	
	- Sau khi người dùng đặt vé phim thành công sẽ gửi mail bao gồm các mã code của vé phim, người dùng sau đó có thể dùng mã để đổi vé tại Rạp
	
  2. Spring Data JPA 
	
	- Kết nối database và thực hiện các truy vấn 
  3. Spring Security
	
	- Xác thực và phân quyền người dùng
	
  4. Socket
	
	- Cho phép người dùng có thể đặt vé real-time ( 2 người dùng trở lên cùng vào đặt vé tại cùng 1 lịch chiếu phim sẽ có thể nhìn 
	
	thấy người khác đang chọn ghế )
  5. Lombok 
	
	- Getter, Setter, Contructor ...
	
  6. PostgreSQL (Dùng cho phiên bản deploy)
	
	- Phiên bản chính dùng MySQL
	
	- Lý do chuyển sang PostgreSQL là vì heroku yêu cầu có thẻ visa cho add on MySQL, đối với Postgre thì miễn phí, nhiều data hơn ...
	
  7. Google Drive Cloud 
	
	- Ứng dụng bên thứ 3, sử dụng để lưu trữ ảnh , file 
	
III> FrontEnd: ReactJS
  1. axios
	
	- Call API
  2. redux, redux-thunk
	
	- Quản lý state của web
	
	
  3. lodash
	
	- Xử lý object, array của web
  4. formik, yup
	
	- Xử lý form + validate
  5. ant-design
	
	- Sử dụng các template, component được cung cấp sẵn
	
	- Tiết kiệm thời gian, giao diện đẹp mắt, dễ sử dụng
	
  6. tailwind CSS
	
	- Thư viện CSS, ngắn gọn, dễ sử dụng
	
  7. socketJS
	
	- Kết nối tới socket của BackEnd, cho phép người dùng đặt vé phim real-time
	
	
  
  
 


