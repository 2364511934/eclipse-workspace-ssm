package test;
/**
 * 
 * @author Administrator
 * SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` int(11) NOT NULL,
  `uname` varchar(20) NOT NULL,
  `upassword` varchar(20) NOT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'zs', '123');
 */
public class Version2 {

	public static void main(String[] args) {
		

	}
	
	//  Ìí¼Ó
	public static int insert(int uid, String name, String pwd) {
		return 0;
	}
	
	// ÐÞ¸Ä
	public static void update() {
		
	}
	
	// É¾³ý
	public static int delete() {
		return 0;
	}
}
