COL?=0

all: clean
	java -cp /usr/local/lib/antlr-4.6-complete.jar org.antlr.v4.Tool ColumnExtractor.g4
	javac *.java

run:

	java ReadColumns ${COL}

clean:
	rm -f *.class
	rm -f ColumnExtractor*.java
	rm -f ColumnExtractor*.tokens

test:
	echo Will read column ${COL}
	cat Test | java ReadColumns ${COL}
