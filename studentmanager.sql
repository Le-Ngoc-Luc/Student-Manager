-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th2 20, 2023 lúc 07:20 PM
-- Phiên bản máy phục vụ: 10.4.24-MariaDB
-- Phiên bản PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `studentmanager`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `class`
--

CREATE TABLE `class` (
  `class_id` int(11) NOT NULL,
  `class_name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `class`
--

INSERT INTO `class` (`class_id`, `class_name`) VALUES
(2, 'C2201L'),
(3, 'C2202L'),
(8, 'C2203L'),
(9, 'C2204L'),
(10, 'C2205L'),
(11, 'C2206L');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `grade`
--

CREATE TABLE `grade` (
  `id_grade` int(11) NOT NULL,
  `id_student` int(11) NOT NULL,
  `math` float NOT NULL,
  `physics` float NOT NULL,
  `chemistry` float NOT NULL,
  `literature` float NOT NULL,
  `english` float NOT NULL,
  `history` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `grade`
--

INSERT INTO `grade` (`id_grade`, `id_student`, `math`, `physics`, `chemistry`, `literature`, `english`, `history`) VALUES
(5, 38, 9, 8, 7, 8, 10, 6),
(7, 40, 5, 6.4, 6, 7, 8, 7),
(11, 47, 0, 0, 0, 0, 0, 0),
(12, 48, 10, 5.6, 4.5, 7.25, 9, 6.4),
(13, 49, 0, 0, 0, 0, 0, 0),
(14, 50, 0, 0, 0, 0, 0, 0),
(15, 51, 0, 0, 0, 0, 0, 0),
(16, 52, 0, 0, 0, 0, 0, 0),
(17, 53, 0, 0, 0, 0, 0, 0),
(18, 54, 0, 0, 0, 0, 0, 0),
(19, 55, 0, 0, 0, 0, 0, 0),
(20, 56, 0, 0, 0, 0, 0, 0),
(21, 57, 0, 0, 0, 0, 0, 0),
(22, 58, 0, 0, 0, 0, 0, 0),
(23, 59, 0, 0, 0, 0, 0, 0),
(24, 60, 0, 0, 0, 0, 0, 0),
(25, 61, 0, 0, 0, 0, 0, 0),
(26, 62, 0, 0, 0, 0, 0, 0),
(27, 63, 0, 0, 0, 0, 0, 0),
(28, 64, 0, 0, 0, 0, 0, 0),
(29, 65, 0, 0, 0, 0, 0, 0),
(30, 66, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `login`
--

CREATE TABLE `login` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `login`
--

INSERT INTO `login` (`id`, `username`, `password`) VALUES
(1, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `student`
--

CREATE TABLE `student` (
  `id_student` int(11) NOT NULL,
  `code_student` varchar(50) NOT NULL,
  `full_name` varchar(100) NOT NULL,
  `date_of_birth` date NOT NULL,
  `gender` varchar(10) NOT NULL,
  `email` varchar(100) NOT NULL,
  `address` varchar(200) NOT NULL,
  `class_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `student`
--

INSERT INTO `student` (`id_student`, `code_student`, `full_name`, `date_of_birth`, `gender`, `email`, `address`, `class_id`) VALUES
(38, 'code1', 'LE NGOC LUC', '2009-02-19', 'Male', 'lengocuc@gmail.com', '54 le thanh nghi', 2),
(40, 'code3', 'NGUYEN THI HOA', '2011-10-07', 'Female', 'nguyenthihoa@gmail.com', '54 le thanh nghi', 9),
(47, 'code2', 'LE VĂN LUYỆN', '2009-02-19', 'Male', 'lengocuc@gmail.com', '54 le thanh nghi', 3),
(48, 'code4', 'HOÀNG VĂN THÁI', '2003-02-04', 'Male', 'lengocuc@gmail.com', '54 le thanh nghi', 8),
(49, 'code5', 'NGUYỄN TUẤN ANH', '2003-02-14', 'Male', 'lengocuc@gmail.com', '54 le thanh nghi', 10),
(50, 'code6', 'PHẠM VĂN BẢO', '1999-02-11', 'Male', 'lengocuc@gmail.com', '54 le thanh nghi', 11),
(51, 'code7', 'HOÀNG THỊ CÚC', '2008-10-12', 'Female', 'phamv@gmail.com', '54 le thanh nghị', 3),
(52, 'code8', 'PHẠM THỊ DUNG', '2003-10-10', 'Female', 'phamv@gmail.com', '54 le thanh nghị', 8),
(53, 'code9', 'PHẠM LƯƠNG DŨNG', '2010-05-07', 'Male', 'phamluongdung@gmail.com', '54 le thanh nghị', 8),
(54, 'code10', 'PHẠM THỊ HƯỜNG', '2005-05-13', 'Female', 'phamluongdung@gmail.com', '54 le thanh nghị', 9),
(55, 'code11', 'LÊ VĂN HƯỞNG', '2003-05-02', 'Female', 'phamluongdung@gmail.com', '54 le thanh nghị', 10),
(56, 'code12', 'HOÀNG CHÍ KIÊN', '2003-01-15', 'Male', 'phamluongdung@gmail.com', '54 le thanh nghị', 11),
(57, 'code13', 'HOÀNG CHÍ KIÊN', '2003-01-15', 'Male', 'phamluongdung@gmail.com', '54 le thanh nghị', 2),
(58, 'code14', 'HOÀNG CHÍ KIÊN', '2003-01-15', 'Male', 'phamluongdung@gmail.com', '54 le thanh nghị', 3),
(59, 'code15', 'HOÀNG CHÍ KIÊN', '2003-01-15', 'Male', 'phamluongdung@gmail.com', '54 le thanh nghị', 3),
(60, 'code16', 'HOÀNG CHÍ KIÊN', '2003-01-15', 'Male', 'phamluongdung@gmail.com', '54 le thanh nghị', 3),
(61, 'code17', 'LÊ XUÂN VIỆT', '2003-01-15', 'Male', 'phamluongdung@gmail.com', '54 le thanh nghị', 8),
(62, 'code18', 'LÊ VĂN HƯNG', '2003-01-04', 'Male', 'phamluongdung@gmail.com', '54 le thanh nghị', 9),
(63, 'code19', 'PHẠM VĂN TỚI', '2002-11-04', 'Male', 'phamluongdung@gmail.com', '54 le thanh nghị', 10),
(64, 'code20', 'CHU LAN ANH', '2007-02-08', 'Female', 'chulananh@gmail.com', '54 lê thanh nghị', 11),
(65, 'code21', 'LÃ QUỐC HUÂN', '2007-02-08', 'Male', 'chulananh@gmail.com', '54 lê thanh nghị', 2),
(66, 'code22', 'LÃ QUỐC HUY', '2006-07-08', 'Male', 'chulananh@gmail.com', '54 lê thanh nghị', 3);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `class`
--
ALTER TABLE `class`
  ADD PRIMARY KEY (`class_id`);

--
-- Chỉ mục cho bảng `grade`
--
ALTER TABLE `grade`
  ADD PRIMARY KEY (`id_grade`),
  ADD KEY `student_id` (`id_student`);

--
-- Chỉ mục cho bảng `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`id_student`),
  ADD KEY `student_class` (`class_id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `class`
--
ALTER TABLE `class`
  MODIFY `class_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT cho bảng `grade`
--
ALTER TABLE `grade`
  MODIFY `id_grade` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT cho bảng `login`
--
ALTER TABLE `login`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT cho bảng `student`
--
ALTER TABLE `student`
  MODIFY `id_student` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=67;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `student`
--
ALTER TABLE `student`
  ADD CONSTRAINT `student_class` FOREIGN KEY (`class_id`) REFERENCES `class` (`class_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
