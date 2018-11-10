Fragment Comments-AlterSQL { 
   Action: add
   Priority: high
   FragmentationPoints: lline
   PointBracketsLan: sql
   Destinations: DemoData-DemoSQL
   SourceCode: [ALTERCODE-FRAG]INSERT INTO `comment` (`id`, `product`, `description`, `date`) VALUES
(1, 1, 'Best product in the world', '2018-02-24 23:04:30'),
(2, 1, 'This suit is awesome', '2018-02-24 23:11:44'),
(4, 3, 'Great product', '2018-02-25 13:06:44');
[/ALTERCODE-FRAG]
}