-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Apr 23, 2019 at 07:21 AM
-- Server version: 5.7.24
-- PHP Version: 7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `examonline`
--

-- --------------------------------------------------------

--
-- Table structure for table `adminlogin`
--

DROP TABLE IF EXISTS `adminlogin`;
CREATE TABLE IF NOT EXISTS `adminlogin` (
  `id` int(50) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `mobile_num` bigint(20) NOT NULL,
  `email` varchar(100) NOT NULL,
  `gender` varchar(50) NOT NULL,
  `date` datetime(6) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `unique` (`email`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `adminlogin`
--

INSERT INTO `adminlogin` (`id`, `username`, `password`, `address`, `mobile_num`, `email`, `gender`, `date`) VALUES
(1111, 'ABC', '1234', 'mundawa', 8459879079, 'abc3266@gmail.com', 'Female', '2019-04-18 15:28:25.000000');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE IF NOT EXISTS `login` (
  `id` int(10) NOT NULL,
  `name` varchar(100) NOT NULL,
  `password` int(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `mobile_num` bigint(20) NOT NULL,
  `email` varchar(100) NOT NULL,
  `gender` varchar(50) NOT NULL,
  `date` datetime(6) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `unique` (`email`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `name`, `password`, `address`, `mobile_num`, `email`, `gender`, `date`) VALUES
(6601, 'jyoti', 1234, 'keshav nagar', 8459879079, 'jyotib3266@gmail.com', 'Female', '2019-04-18 13:24:32.000000'),
(6602, 'suraj', 1999, 'saravali', 9156167236, 'suraj@gmail.com', 'Male', '2019-04-18 13:46:32.000000');

-- --------------------------------------------------------

--
-- Table structure for table `question`
--

DROP TABLE IF EXISTS `question`;
CREATE TABLE IF NOT EXISTS `question` (
  `Question_no` int(100) NOT NULL,
  `Question` varchar(100) NOT NULL,
  `option_1` varchar(100) NOT NULL,
  `option_2` varchar(100) NOT NULL,
  `option_3` varchar(100) NOT NULL,
  `option_4` varchar(100) NOT NULL,
  `select_option` int(100) NOT NULL,
  PRIMARY KEY (`Question_no`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `question`
--

INSERT INTO `question` (`Question_no`, `Question`, `option_1`, `option_2`, `option_3`, `option_4`, `select_option`) VALUES
(1, 'what is java?', 'java is not oop language.', 'java is a oop language.', 'it is not robust.', 'low performance', 2),
(2, 'Which one of the following is correct?', '	Java applets can not be written in any programming language', 'An applet is not a small program', 'An applet can be run on its own', 'Applets are embedded in another applications', 4),
(3, 'Which of the following is not an operator in Java?', 'instanceof', 'sizeof', 'new', '>>>=', 2),
(4, 'An expression involving byte, int, and literal numbers is promoted to which of these?', ' int', 'long', 'byte', 'float', 1),
(5, 'Which data type value is returned by all transcendental math functions?', 'int', 'float', 'double', 'long', 3);

-- --------------------------------------------------------

--
-- Table structure for table `result`
--

DROP TABLE IF EXISTS `result`;
CREATE TABLE IF NOT EXISTS `result` (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `stud_id` int(8) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Total_mark` int(100) NOT NULL,
  `Date` datetime(6) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6613 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `result`
--

INSERT INTO `result` (`id`, `stud_id`, `Name`, `Total_mark`, `Date`) VALUES
(6001, 0, 'jyoti', 3, '2019-04-22 15:37:40.000000'),
(6602, 6601, 'jyoti', 2, '2019-04-22 15:51:58.000000'),
(6603, 6601, 'jyoti', 2, '2019-04-22 15:53:50.000000'),
(6604, 6601, 'jyoti', 2, '2019-04-22 17:12:56.000000'),
(6605, 6601, 'jyoti', 1, '2019-04-22 17:17:27.000000'),
(6606, 6601, 'jyoti', 2, '2019-04-22 17:23:16.000000'),
(6607, 6601, 'jyoti', 1, '2019-04-22 17:25:44.000000'),
(6608, 6601, 'jyoti', 2, '2019-04-22 17:48:15.000000'),
(6609, 6601, 'jyoti', 0, '2019-04-22 17:51:51.000000'),
(6610, 6601, 'jyoti', 0, '2019-04-22 17:52:39.000000'),
(6611, 6601, 'jyoti', 5, '2019-04-23 12:18:30.000000'),
(6612, 6601, 'jyoti', 2, '2019-04-23 12:18:50.000000');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
