-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 04, 2019 at 05:50 PM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `inv_hima`
--

-- --------------------------------------------------------

--
-- Table structure for table `form_barang`
--

CREATE TABLE `form_barang` (
  `no` int(5) UNSIGNED NOT NULL,
  `nama` varchar(50) NOT NULL,
  `jumlah` int(5) UNSIGNED NOT NULL,
  `terbilang` varchar(10) NOT NULL,
  `keterangan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `form_barang`
--

INSERT INTO `form_barang` (`no`, `nama`, `jumlah`, `terbilang`, `keterangan`) VALUES
(1, 'Bantalan Stempel', 1, 'Buah', ''),
(2, 'Cap HIMATIF (Kayu)', 1, 'Buah', ''),
(3, 'Cap Panpel - HIMATIF (Kayu)', 1, 'Buah', ''),
(4, 'Cap IT EXPO (Kayu)', 1, 'Buah', ''),
(5, 'Bendera Himpunan 100 x 80 cm', 1, 'Buah', ''),
(6, 'Bendera Himpunan Besar 150 x 100 cm', 1, 'Buah', ''),
(7, 'Piring Plastik dan Kaleng', 4, 'Lusin', 'Sebagian Di Gudang Dan Hilang'),
(8, 'Gelas Plastik', 1, 'Lusin', 'Sebagian Hilang'),
(9, 'Papan Tulis', 1, 'Buah', ''),
(10, 'Sound System & Mic', 1, 'Buah', 'Mic Rusak'),
(11, 'Wireless Mic', 1, 'Buah', 'Rusak'),
(12, 'Sofa', 3, 'Buah', ''),
(13, 'Meja Besar', 2, 'Buah', '1 Rusak'),
(14, 'Dispenser dan Galon', 2, 'Buah', 'Pemanas Air Rusak, Galon Hilang'),
(15, 'Kipas Angin Miyako', 1, 'Buah', ''),
(16, 'Printer HP', 1, 'Unit', ''),
(17, 'Piala Juara Lomba', 1, 'Set', ''),
(18, 'Kursi Besi', 4, 'Buah', '2 Hilang'),
(19, 'Sapu', 1, 'Buah', ''),
(20, 'Toak', 1, 'Buah', 'Hilang'),
(21, 'Cap Himatif (Otomatis)', 1, 'Buah', ''),
(22, 'Cap Panpel - HIMATIF (Otomatis)', 1, 'Buah', ''),
(23, 'Cap IT EXPO (Otomatis)', 1, 'Buah', ''),
(24, 'Dispenser dan Galon', 2, 'Buah', ''),
(25, 'Rak Piring', 2, 'Buah', ''),
(26, 'Palu Sidang + Pataka', 1, 'Set', 'Bagus'),
(27, 'Tiang Bendera', 1, 'Buah', 'Bagus');

-- --------------------------------------------------------

--
-- Table structure for table `form_br`
--

CREATE TABLE `form_br` (
  `no_barang` int(5) UNSIGNED NOT NULL,
  `nama` varchar(50) NOT NULL,
  `jumlah` int(5) UNSIGNED NOT NULL,
  `terbilang` varchar(10) NOT NULL,
  `keterangan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `form_br`
--

INSERT INTO `form_br` (`no_barang`, `nama`, `jumlah`, `terbilang`, `keterangan`) VALUES
(10, 'Mic', 1, 'Buah', ''),
(11, 'Wireless Mic', 1, 'Buah', ''),
(13, 'Meja Besar', 1, 'Buah', ''),
(14, 'Dispenser', 2, 'Buah', 'Pemanas Air Rusak');

-- --------------------------------------------------------

--
-- Table structure for table `from_admin`
--

CREATE TABLE `from_admin` (
  `username` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `from_admin`
--

INSERT INTO `from_admin` (`username`, `password`) VALUES
('agung', 'agung4'),
('annisa', 'annisa4'),
('arsyi', 'arsyi4'),
('fitri', 'fitri4'),
('rinda', 'rinda4');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `form_barang`
--
ALTER TABLE `form_barang`
  ADD PRIMARY KEY (`no`);

--
-- Indexes for table `form_br`
--
ALTER TABLE `form_br`
  ADD PRIMARY KEY (`no_barang`);

--
-- Indexes for table `from_admin`
--
ALTER TABLE `from_admin`
  ADD PRIMARY KEY (`username`) USING BTREE;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `form_br`
--
ALTER TABLE `form_br`
  ADD CONSTRAINT `form_br_ibfk_1` FOREIGN KEY (`no_barang`) REFERENCES `form_barang` (`no`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
