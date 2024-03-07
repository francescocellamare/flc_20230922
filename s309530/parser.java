
//----------------------------------------------------
// The following code was generated by CUP v0.11b beta 20140226
//----------------------------------------------------

import java_cup.runtime.*;
import java.util.*;
import java.io.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b beta 20140226 generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\027\000\002\002\004\000\002\002\005\000\002\003" +
    "\014\000\002\003\014\000\002\003\014\000\002\003\011" +
    "\000\002\003\011\000\002\004\005\000\002\004\002\000" +
    "\002\005\006\000\002\005\005\000\002\006\007\000\002" +
    "\006\013\000\002\006\007\000\002\006\005\000\002\010" +
    "\005\000\002\010\007\000\002\007\005\000\002\007\005" +
    "\000\002\007\005\000\002\007\005\000\002\007\005\000" +
    "\002\007\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\114\000\010\005\ufff9\006\ufff9\007\ufff9\001\002\000" +
    "\004\002\116\001\002\000\010\005\066\006\065\007\064" +
    "\001\002\000\004\004\007\001\002\000\010\021\013\022" +
    "\012\023\010\001\002\000\004\017\053\001\002\000\012" +
    "\002\000\021\013\022\012\023\010\001\002\000\004\017" +
    "\040\001\002\000\004\017\020\001\002\000\010\021\013" +
    "\022\012\023\010\001\002\000\010\021\013\022\012\023" +
    "\010\001\002\000\010\021\013\022\012\023\010\001\002" +
    "\000\012\002\ufff8\021\ufff8\022\ufff8\023\ufff8\001\002\000" +
    "\006\015\021\025\023\001\002\000\006\015\021\025\023" +
    "\001\002\000\014\011\027\012\025\013\030\014\024\020" +
    "\026\001\002\000\016\011\uffeb\012\uffeb\013\uffeb\014\uffeb" +
    "\016\uffeb\020\uffeb\001\002\000\006\015\021\025\023\001" +
    "\002\000\006\015\021\025\023\001\002\000\004\010\033" +
    "\001\002\000\006\015\021\025\023\001\002\000\006\015" +
    "\021\025\023\001\002\000\016\011\uffed\012\uffed\013\uffed" +
    "\014\uffed\016\uffed\020\uffed\001\002\000\016\011\uffef\012" +
    "\uffef\013\030\014\024\016\uffef\020\uffef\001\002\000\012" +
    "\002\ufff6\021\ufff6\022\ufff6\023\ufff6\001\002\000\016\011" +
    "\ufff0\012\ufff0\013\030\014\024\016\ufff0\020\ufff0\001\002" +
    "\000\016\011\uffee\012\uffee\013\uffee\014\uffee\016\uffee\020" +
    "\uffee\001\002\000\014\011\027\012\025\013\030\014\024" +
    "\016\037\001\002\000\016\011\uffec\012\uffec\013\uffec\014" +
    "\uffec\016\uffec\020\uffec\001\002\000\006\015\021\025\023" +
    "\001\002\000\014\011\027\012\025\013\030\014\024\020" +
    "\042\001\002\000\006\010\044\024\043\001\002\000\004" +
    "\017\045\001\002\000\012\002\ufff4\021\ufff4\022\ufff4\023" +
    "\ufff4\001\002\000\006\015\021\025\023\001\002\000\014" +
    "\011\027\012\025\013\030\014\024\020\047\001\002\000" +
    "\004\010\050\001\002\000\012\002\ufff5\021\ufff5\022\ufff5" +
    "\023\ufff5\001\002\000\010\021\013\022\012\023\010\001" +
    "\002\000\012\002\ufff7\021\ufff7\022\ufff7\023\ufff7\001\002" +
    "\000\006\015\021\025\023\001\002\000\006\010\056\024" +
    "\055\001\002\000\004\017\057\001\002\000\012\002\ufff3" +
    "\021\ufff3\022\ufff3\023\ufff3\001\002\000\006\015\021\025" +
    "\023\001\002\000\014\011\027\012\025\013\030\014\024" +
    "\020\061\001\002\000\006\010\ufff1\024\ufff1\001\002\000" +
    "\014\011\027\012\025\013\030\014\024\020\063\001\002" +
    "\000\006\010\ufff2\024\ufff2\001\002\000\004\010\115\001" +
    "\002\000\004\010\077\001\002\000\004\010\067\001\002" +
    "\000\006\006\ufff9\007\ufff9\001\002\000\006\006\071\007" +
    "\064\001\002\000\004\010\072\001\002\000\010\004\ufff9" +
    "\006\ufff9\007\ufff9\001\002\000\010\004\ufffb\006\074\007" +
    "\064\001\002\000\004\010\075\001\002\000\006\004\ufff9" +
    "\007\ufff9\001\002\000\006\004\uffff\007\064\001\002\000" +
    "\010\005\ufff9\006\ufff9\007\ufff9\001\002\000\010\005\102" +
    "\006\101\007\064\001\002\000\004\010\110\001\002\000" +
    "\004\010\103\001\002\000\010\004\ufff9\006\ufff9\007\ufff9" +
    "\001\002\000\010\004\ufffc\006\105\007\064\001\002\000" +
    "\004\010\106\001\002\000\006\004\ufff9\007\ufff9\001\002" +
    "\000\006\004\ufffe\007\064\001\002\000\006\005\ufff9\007" +
    "\ufff9\001\002\000\006\005\112\007\064\001\002\000\004" +
    "\010\113\001\002\000\006\004\ufff9\007\ufff9\001\002\000" +
    "\006\004\ufffd\007\064\001\002\000\012\004\ufffa\005\ufffa" +
    "\006\ufffa\007\ufffa\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\114\000\010\002\003\003\005\004\004\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\005\010\006\013\001\001\000\004\010\053\001\001\000" +
    "\004\006\050\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\006\014\001\001\000\004\006\015\001\001\000" +
    "\004\006\016\001\001\000\002\001\001\000\004\007\021" +
    "\001\001\000\004\007\035\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\007\034\001\001\000\004\007\033" +
    "\001\001\000\002\001\001\000\004\007\031\001\001\000" +
    "\004\007\030\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\007\040\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\007\045\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\006\051\001" +
    "\001\000\002\001\001\000\004\007\061\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\007" +
    "\057\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\004\067\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\004\072\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\004\075\001\001" +
    "\000\002\001\001\000\004\004\077\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\004\103" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\004" +
    "\106\001\001\000\002\001\001\000\004\004\110\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\004\113\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {

    //classHash = new HashMap<String, HashMap<String, Integer>>();
    //classHash = new HashMap();
    //list = new LinkedList<Integer>();

 Tree = new DisegnaAlbero();   }public static DisegnaAlbero Tree;

  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 Symbol s=_scanner.next_token(); Tree.push(s.toString(), 0); return s;   }


    public void report_error(String message, Object info) {
        StringBuffer m = new StringBuffer(message);
        if (info instanceof Symbol) {
            if (((Symbol)info).left != 1 && ((Symbol)info).right != 1) {
                if (((Symbol)info).left != -1 && ((Symbol)info).right != -1) {
                    int line = (((Symbol)info).left) + 1;
                    int column = (((Symbol)info).right) + 1;
                    m.append(" (line " + line + " column " + column + ")");
                }
            }
            System.err.println(m);
        }
    }

    // public static HashMap<String, HashMap<String, Integer>> classHash;
    //public static HashMap classHash;
    //public static LinkedList list;
    /* Return semantic value of symbol in position (position) */
    public Object stack(int position) {
        return (((Symbol)stack.elementAt(tos + position)).value);
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= prog EOF 
            { 
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // prog ::= header SEP commands 
            { parser.Tree.reduce(3,"prog",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("prog",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // header ::= placeholder TOKEN1 SC placeholder TOKEN2 SC placeholder TOKEN2 SC placeholder 
            { parser.Tree.reduce(10,"header",1);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("header",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-9)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // header ::= placeholder TOKEN2 SC placeholder TOKEN1 SC placeholder TOKEN2 SC placeholder 
            { parser.Tree.reduce(10,"header",1);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("header",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-9)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // header ::= placeholder TOKEN2 SC placeholder TOKEN2 SC placeholder TOKEN1 SC placeholder 
            { parser.Tree.reduce(10,"header",1);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("header",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-9)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // header ::= placeholder TOKEN2 SC placeholder TOKEN1 SC placeholder 
            { parser.Tree.reduce(7,"header",1);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("header",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // header ::= placeholder TOKEN1 SC placeholder TOKEN2 SC placeholder 
            { parser.Tree.reduce(7,"header",1);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("header",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // placeholder ::= placeholder TOKEN3 SC 
            { parser.Tree.reduce(3,"placeholder",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("placeholder",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // placeholder ::= 
            { parser.Tree.reduce(0,"placeholder",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("placeholder",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // commands ::= command command command command 
            { parser.Tree.reduce(4,"commands",0);
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
            Integer[] com = new Integer[2];
            com[1] = (Integer)a;
            com[0] = (Integer)b;
            RESULT = com;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("commands",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // commands ::= commands command command 
            { parser.Tree.reduce(3,"commands",0);
              Object RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
            Integer[] com = new Integer[2];
            com[1] = (Integer)c;
            com[0] = (Integer)d;
            RESULT = com;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("commands",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // command ::= INS_WD OS math_exp CS SC 
            { parser.Tree.reduce(5,"command",0);
              Object RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		
                System.out.println(val);
                RESULT = (Integer)val;
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("command",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // command ::= CMP_WD OS math_exp CS CM OS math_exp CS SC 
            { parser.Tree.reduce(9,"command",0);
              Object RESULT =null;
		int val1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).right;
		Object val1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-6)).value;
		int val2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int val2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object val2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		
                Integer val1_c, val2_c;
                if(parser.stack(-9) instanceof Integer[]){
                    Integer[] com = (Integer[])parser.stack(-9);
                    val1_c = (Integer)com[0];
                    val2_c = (Integer)com[1];
                }
                else if(parser.stack(-10) instanceof Integer[]){
                    val1_c = (Integer)parser.stack(-9);
                    Integer[] com = (Integer[])parser.stack(-10);
                    val2_c = (Integer)com[1];
                }
                else{
                    val1_c = (Integer)parser.stack(-9);
                    val2_c = (Integer)parser.stack(-10);
                }


                if(val1_c == val2_c){
                    System.out.println(val1);
                    RESULT = (Integer)val1 ;
                }
                else {
                    System.out.println(val2);
                    RESULT = (Integer)val2 ;
                }
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("command",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // command ::= CMP_WD OS math_exp CS SC 
            { parser.Tree.reduce(5,"command",0);
              Object RESULT =null;
		int val1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object val1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		
                Integer val1_c, val2_c;
                if(parser.stack(-5) instanceof Integer[]){
                    Integer[] com = (Integer[])parser.stack(-5);
                    val1_c = (Integer)com[0];
                    val2_c = (Integer)com[1];
                }
                else if(parser.stack(-6) instanceof Integer[]){
                    val1_c = (Integer)parser.stack(-5);
                    Integer[] com = (Integer[])parser.stack(-6);
                    val2_c = (Integer)com[1];
                }
                else{
                    val1_c = (Integer)parser.stack(-5);
                    val2_c = (Integer)parser.stack(-6);
                }

                if(val1_c == val2_c){
                    System.out.println(val1);
                    RESULT = (Integer)val1 ;
                }
                else {
                    System.out.println(0);
                    RESULT = (Integer)0 ;
                }
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("command",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // command ::= SUM_WD exp_list SC 
            { parser.Tree.reduce(3,"command",0);
              Object RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
                System.out.println(val);
                RESULT = (Integer)val;
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("command",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // exp_list ::= OS math_exp CS 
            { parser.Tree.reduce(3,"exp_list",0);
              Object RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
                Integer count = (Integer)val;
                RESULT = (Integer)count;
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp_list",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // exp_list ::= exp_list CM OS math_exp CS 
            { parser.Tree.reduce(5,"exp_list",0);
              Object RESULT =null;
		int sumleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int sumright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Object sum = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
                RESULT = (Integer)sum + (Integer)val;
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp_list",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // math_exp ::= math_exp PLUS math_exp 
            { parser.Tree.reduce(3,"math_exp",0);
              Object RESULT =null;
		int res1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int res1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object res1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int res2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int res2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object res2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                RESULT = (Integer)res1 + (Integer)res2;
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("math_exp",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // math_exp ::= math_exp MINUS math_exp 
            { parser.Tree.reduce(3,"math_exp",0);
              Object RESULT =null;
		int res1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int res1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object res1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int res2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int res2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object res2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                RESULT = (Integer)res1 - (Integer)res2;
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("math_exp",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // math_exp ::= math_exp STAR math_exp 
            { parser.Tree.reduce(3,"math_exp",0);
              Object RESULT =null;
		int res1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int res1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object res1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int res2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int res2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object res2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                RESULT = (Integer)res1 * (Integer)res2;
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("math_exp",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // math_exp ::= math_exp DIV math_exp 
            { parser.Tree.reduce(3,"math_exp",0);
              Object RESULT =null;
		int res1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int res1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object res1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int res2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int res2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object res2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                RESULT = (Integer)res1 / (Integer)res2;
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("math_exp",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // math_exp ::= OB math_exp CB 
            { parser.Tree.reduce(3,"math_exp",0);
              Object RESULT =null;
		int resleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int resright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object res = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
                RESULT = (Integer)res;
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("math_exp",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // math_exp ::= UINT 
            { parser.Tree.reduce(1,"math_exp",0);
              Object RESULT =null;
		int resleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int resright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer res = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                RESULT = (Integer)res;
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("math_exp",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
