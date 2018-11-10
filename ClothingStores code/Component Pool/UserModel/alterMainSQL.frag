Fragment UserModel-AlterSQL { 
   Action: add
   Priority: high
   FragmentationPoints: fline
   PointBracketsLan: sql
   Destinations: DatabaseManagement-MainSQL
   SourceCode: [ALTERCODE-FRAG]DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `type` varchar(100) NOT NULL,
  `user` varchar(100) NOT NULL,
  `pass` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;[/ALTERCODE-FRAG]
}