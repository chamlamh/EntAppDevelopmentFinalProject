# EntAppDevelopmentFinalProject
Final project in Ent App Development 

## Scripts to import our MySql table
First, create a database named bored_no_more. Then, run the following script
```
--
-- Database: `bored_no_more`
--

-- --------------------------------------------------------

--
-- Table structure for table `activities`
--

DROP TABLE IF EXISTS `activities`;
CREATE TABLE IF NOT EXISTS `activities` (
  `activity_id` int(11) NOT NULL AUTO_INCREMENT,
  `activity` varchar(255) NOT NULL DEFAULT '',
  `type` varchar(255) NOT NULL,
  `price` double NOT NULL,
  `accessibility` double NOT NULL,
  `participants` int(11) NOT NULL,
  `is_finished` bit(1) NOT NULL,
  PRIMARY KEY (`activity_id`)
) ENGINE=MyISAM AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `activities`
--

INSERT INTO `activities` (`activity_id`, `activity`, `type`, `price`, `accessibility`, `participants`, `is_finished`) VALUES
(12, 'test', 'test2', 12, 132, 1, b'0'),
(11, 'jhkl', 'lkhlkjb', 0, 0, 0, b'0'),
(10, 'This is an activity', 'recreational', 2, 1.02, 1, b'0'),
(9, 'a name', 'an id', 1, 1, 12, b'0');
```
