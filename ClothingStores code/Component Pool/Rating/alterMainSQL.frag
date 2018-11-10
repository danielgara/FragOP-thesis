Fragment Rating-AlterSQL { 
   Action: add
   Priority: high
   FragmentationPoints: lline
   PointBracketsLan: sql
   Destinations: DatabaseManagement-MainSQL
   SourceCode: [ALTERCODE-FRAG]ALTER TABLE `product` ADD `num_rates` INT(9) NOT NULL DEFAULT '0' AFTER `img`, ADD `total_rates` INT(9) NOT NULL DEFAULT '0' AFTER `num_rates`;[/ALTERCODE-FRAG]
}