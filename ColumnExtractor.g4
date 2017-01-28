grammar ColumnExtractor;

root : row+ ;

row : STUFF+ NL ;

TAB : '\t' -> skip ;

NL : '\r'? '\n' ;

STUFF : ~[\r\n\t]+ ;