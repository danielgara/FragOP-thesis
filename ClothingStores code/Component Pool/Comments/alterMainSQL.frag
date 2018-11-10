Fragment Comments-AlterSQL { 
   Action: add
   Priority: high
   FragmentationPoints: fline
   PointBracketsLan: sql
   Destinations: DatabaseManagement-MainSQL
   SourceCode: [ALTERCODE-FRAG]DROP TABLE IF EXISTS `comment`;
CREATE TABLE IF NOT EXISTS `comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product` int(11) NOT NULL,
  `description` varchar(100) NOT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;[/ALTERCODE-FRAG]
}