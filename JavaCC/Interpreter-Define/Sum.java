public class Sum extends Expr {
	Expr mLhs;
	Expr mRhs;
	
	public Sum(Expr lhs, Expr rhs) {
		mLhs = lhs;
		mRhs = rhs;
	}
	public Double eval(Environment e) throws ReturnException {
		return mLhs.eval(e) + mRhs.eval(e);
	}
	public String toString() {
		return mLhs.toString() + " + " + mRhs.toString();
	}
}
