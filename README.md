A column extractor written using ANTLR.

Example:
	
	make	# builds
	cat Test | make run COL=0	# Reads data from the file Test and extract the column number 0

Assumes the data columns are separated by one or more tab characters. Assumes columns are not empty.

Modify ColumnExtractor.g4 grammar when needed (for instance, columns are separated by a 
character different than the tab).

Modify ReadColumns.java (particularly ReadColumnListener class) for modifying the visiting result.

