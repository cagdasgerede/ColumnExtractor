import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class ReadColumns {
	public static void main(String[] args) throws Exception {
		ANTLRInputStream tokenStream = new ANTLRInputStream(System.in);
		ColumnExtractorLexer lexer = new ColumnExtractorLexer(tokenStream);
		CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
		ColumnExtractorParser parser = new ColumnExtractorParser(commonTokenStream);
		ParseTree parseTree = parser.root();
		ParseTreeWalker walker = new ParseTreeWalker();
		ReadColumnsListener listener = new ReadColumnsListener(
			Integer.valueOf(args[0]));
		walker.walk(listener, parseTree);
	}
}

class ReadColumnsListener extends ColumnExtractorBaseListener {
	int col;
	public ReadColumnsListener(int col) {
		this.col = col;
	}

	@Override
	public void enterRow(ColumnExtractorParser.RowContext ctx) {
		System.out.println(ctx.STUFF(col).getText());
	}
}