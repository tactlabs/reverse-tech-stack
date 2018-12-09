-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.1.30-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win32
-- HeidiSQL Version:             9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping structure for table test.employee
DROP TABLE IF EXISTS `employee`;
CREATE TABLE IF NOT EXISTS `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `employer_id` int(11) DEFAULT NULL,
  `linkedin` varchar(500) DEFAULT NULL,
  `skills` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=latin1;

-- Dumping data for table test.employee: ~41 rows (approximately)
DELETE FROM `employee`;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` (`id`, `employer_id`, `linkedin`, `skills`) VALUES
	(1, 1, 'https://www.linkedin.com/in/aravapalli-muralikrishna-a02a78155/', 'Python, Java'),
	(2, 1, 'https://www.linkedin.com/in/sri-vinay-appari-8aa049148/', 'Python, Java'),
	(3, 1, 'https://www.linkedin.com/in/satyadivya-maddipudi-34300b159/', 'Python, AWS'),
	(4, 9, 'https://www.linkedin.com/in/annapurna-talluri-scjp-0694a153/', 'JavaServer pages, Servlets, angularJs, c, C  '),
	(5, 9, 'https://www.linkedin.com/in/vigneshwer-sekar-450823126/', 'Full Stack Developer, Java, c'),
	(6, 9, 'https://www.linkedin.com/in/divya-sree-974a01137/', 'Spring , Mysql, Struts, Hibernate'),
	(7, 8, 'https://www.linkedin.com/in/anu-davis-77554990/', 'JQuery, Javascript'),
	(8, 8, 'https://www.linkedin.com/in/arvind-sharma-8bb1567b/', 'SQL, QTP, Quality Center, Windows'),
	(9, 8, 'https://www.linkedin.com/in/aneesh-devassy-4450b3a4/', 'jQuery, HTML5, JavaScript'),
	(10, 10, 'https://www.linkedin.com/in/anshulbansal2209/', 'ReactJs, jQuer UI, Matlab'),
	(11, 10, 'https://www.linkedin.com/in/bharatghimire/', 'CoreJava, Git, HTML'),
	(12, 10, 'https://www.linkedin.com/in/mayank-negi-673ba772/', 'MYSQL, Docker, Terraform'),
	(13, 6, 'https://www.linkedin.com/in/zainul-abideen-3bb58311/', 'GSM, WiMAX, Cisco Technologies'),
	(14, 6, 'https://www.linkedin.com/in/abarna-sarathy-831b92126/', 'Software Enginner'),
	(15, 6, 'https://www.linkedin.com/in/arul-sophiya-r-17470613a/', 'C, Java, Operating Systems'),
	(16, 7, 'https://www.linkedin.com/in/manikandancs/', 'Eclipse, Python, Github'),
	(17, 7, 'https://www.linkedin.com/in/pramukh-dasari-193851109/', 'SQL, SAS'),
	(18, 7, 'https://www.linkedin.com/in/shubhashis-sinha-69a9b575/', 'Oozie, SQL, Tableau'),
	(19, 5, 'https://www.linkedin.com/in/preethielango/', 'Java, MySQL, Core Java'),
	(20, 5, 'https://www.linkedin.com/in/saundarya-selvaraju-028081127/', 'Java, WebApplicationDevelopment, Android Development'),
	(21, 5, 'https://www.linkedin.com/in/muniyandi-s-5b047445/', 'JavaScript, jQuery, PHP'),
	(22, 12, 'http://www.linkedin.com/in/abhinandan-kumar-44895264', 'java,data structure devloper'),
	(23, 12, 'https://www.linkedin.com/in/anand-kumar-8b4a68172/', 'java,javascript software engineer'),
	(24, 12, 'https://www.linkedin.com/in/jayanthi-r-16023512a/', 'C, Php, asp.net, Software engineer'),
	(25, 11, 'http://www.linkedin.com/in/abhinav-kumar-0a6b9580', 'jquery, html5, javascript developer'),
	(26, 11, 'https://www.linkedin.com/in/vigneshwaran-svw-016477b2/', 'c, html5, jquery, web developer'),
	(27, 11, 'https://www.linkedin.com/in/aparna-jha-96705295/', 'jquery, html5, javascript, web developer'),
	(28, 13, 'http://www.linkedin.com/in/abhinand-anigani-4601a229', 'python, html5, javascript devloper'),
	(29, 13, 'https://www.linkedin.com/in/bhaskar-bharali-b378a192/', 'c, sql, java devloper'),
	(30, 13, 'https://www.linkedin.com/in/aruna-barani-322b4753/', 'jquery, software engineer'),
	(31, 4, 'https://www.linkedin.com/in/aadarsh-jain-a5b85511a', 'java, html, sql, javaScript devloper'),
	(32, 4, 'https://www.linkedin.com/in/abhinav-jaiswal-85722053/', 'ASP.NET, HTML5, microsoftSQL Server devloper'),
	(33, 4, 'https://www.linkedin.com/in/anagha-tondwalkar-56a49210b/', 'HTML, java, jQuery devloper'),
	(35, 20, 'https://www.linkedin.com/in/aakash-goel-006b61bb/', 'AngularJS, SASS, Bootstrap devloper'),
	(36, 20, 'https://www.linkedin.com/in/rajaishbt/', 'AngularJS, SASS, Bootstrap devloper'),
	(37, 20, 'https://www.linkedin.com/in/kamal-kishore-bb532321/', 'JavaScript, ASP.NET devloper'),
	(38, 22, 'https://www.linkedin.com/in/aarti-parmar-6217226b/', 'HTML, ASP.NET, java devloper'),
	(39, 22, 'https://www.linkedin.com/in/rajeshree-gajjar-99967877/', 'ASP.net, sql, html engineer'),
	(40, 22, 'https://www.linkedin.com/in/pratik-vyas-ba110591/', 'sql,mysql,php database engineer'),
	(41, 23, 'https://www.linkedin.com/in/aashish-bhardwaj-892239b2/', 'html, javascript, sql devloper'),
	(42, 23, 'https://www.linkedin.com/in/saurabh-saxena-88496a3a/', 'sql, javaScript, mysql devloper');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;

-- Dumping structure for table test.employer
DROP TABLE IF EXISTS `employer`;
CREATE TABLE IF NOT EXISTS `employer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `linkedin` varchar(500) DEFAULT NULL,
  `website` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=latin1;

-- Dumping data for table test.employer: ~15 rows (approximately)
DELETE FROM `employer`;
/*!40000 ALTER TABLE `employer` DISABLE KEYS */;
INSERT INTO `employer` (`id`, `name`, `linkedin`, `website`) VALUES
	(1, 'TalentAccurate', 'rajacsp@gmail.com', 'https://talentaccurate.com'),
	(4, 'uKnowva', 'https://www.linkedin.com/company/uknowvaplatform/', 'https://uknowva.com/'),
	(5, 'accenture', 'https://www.linkedin.com/company/accenture/', 'http://www.accenture.com/'),
	(6, 'NMSWorks Software (P) Ltd.,', 'https://www.linkedin.com/company/nmsworks-software-p-ltd--/', 'http://www.nmsworks.co.in/'),
	(7, 'HCL', 'https://www.linkedin.com/company/hcl-technologies/', 'http://www.hcltech.com/'),
	(8, 'Braddock infotech p Ltd', 'https://www.linkedin.com/company/braddock-infotech-p-ltd/', 'http://braddockinfotech.com/'),
	(9, 'IBM', 'https://www.linkedin.com/company/ibm/', 'http://www.ibm.com/'),
	(10, 'OLX Group', 'https://www.linkedin.com/company/olx-group/', 'http://www.olxgroup.com/'),
	(11, 'indegene', 'https://www.linkedin.com/company/indegene/', 'https://www.indegene.com/'),
	(12, 'Symantec', 'https://www.linkedin.com/company/symantec/', 'http://www.symantec.com/'),
	(13, 'CGI', 'https://www.linkedin.com/company/cgi/', 'http://www.cgi.com/'),
	(20, 'Sapienet', 'https://www.linkedin.com/company/sapient/', 'http://www.sapient.com/'),
	(22, 'contis', 'https://www.linkedin.com/company/contis-/', 'http://www.contis.com/'),
	(23, 'paramarsh informatics pvt ltd.', 'https://www.linkedin.com/company/paramarsh-informatics-pvt-ltd./', 'http://www.paramarsh.com/'),
	(25, 'CloudAssert', 'https://www.linkedin.com/company/cloud-assert/', 'http://www.cloudassert.com/');
/*!40000 ALTER TABLE `employer` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
