-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 14, 2020 at 04:04 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mybatisdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `mybatistable`
--

CREATE TABLE `mybatistable` (
  `id` int(50) NOT NULL,
  `name` varchar(200) NOT NULL,
  `percentage` int(50) NOT NULL,
  `phone` int(50) NOT NULL,
  `email` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mybatistable`
--

INSERT INTO `mybatistable` (`id`, `name`, `percentage`, `phone`, `email`) VALUES
(1, 'Amir Ansari', 80, 90000000, 'mohamad123@yahoo.com'),
(4, 'Amir Ansari', 80, 5339, 'amiransari.my@gmail.com'),
(5, 'Amir Ansari', 80, 5339, 'amiransari.my@gmail.com'),
(6, 'Amir Ansari', 80, 5339, 'amiransari.my@gmail.com'),
(7, 'Amir Ansari', 80, 5339, 'amiransari.my@gmail.com'),
(8, 'zara', 90, 123412341, 'zara@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `mybatistable`
--
ALTER TABLE `mybatistable`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `mybatistable`
--
ALTER TABLE `mybatistable`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
