/* Generated By:JJTree: Do not edit this line. ASTScalarDataTypeName.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTScalarDataTypeName extends SimpleNode {
  public ASTScalarDataTypeName(int id) {
    super(id);
  }

  public ASTScalarDataTypeName(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=6a84834791c8b219b8b3d49c11b48931 (do not edit this line) */