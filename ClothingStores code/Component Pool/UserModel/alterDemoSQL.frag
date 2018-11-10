Fragment UserModel-AlterSQL { 
   Action: add
   Priority: high
   FragmentationPoints: lline
   PointBracketsLan: sql
   Destinations: DemoData-DemoSQL
   SourceCode: [ALTERCODE-FRAG]INSERT INTO `user` (`id`, `name`, `type`, `user`, `pass`) VALUES
(1, 'Daniel Correa', 'admin', 'daniel', 'daniel'),
(2, 'Raúl Mazo', 'user', 'raul', 'raul'),
(3, 'Gloria Lucia', 'user', 'gloria', 'gloria');[/ALTERCODE-FRAG]
}