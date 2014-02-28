import java.util.*;

/**
 * This class implements various forms of statements.  It is the superclass
 * following classes.
 *    Assign
 *    Block
 *    Declaration
 *    ExprStatement
 *    IfThen
 *    IfThenElse
 *    Return
 *    While
 */
public abstract class Statement {
	public abstract List<AssemblerCmd> compile();
}
