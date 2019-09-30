// Generated from varlang/parser/VarLang.g by ANTLR 4.5
package varlang.parser; import static varlang.AST.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VarLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, Define=8, Let=9, 
		Lete=10, Dot=11, Number=12, Identifier=13, Letter=14, LetterOrDigit=15, 
		AT=16, ELLIPSIS=17, WS=18, Comment=19, Line_Comment=20;
	public static final int
		RULE_defdeclare = 0, RULE_exp = 1, RULE_encletexp = 2, RULE_decexp = 3, 
		RULE_varexp = 4, RULE_letexp = 5, RULE_program = 6, RULE_numexp = 7, RULE_addexp = 8, 
		RULE_subexp = 9, RULE_multexp = 10, RULE_divexp = 11, RULE_dec = 12;
	public static final String[] ruleNames = {
		"defdeclare", "exp", "encletexp", "decexp", "varexp", "letexp", "program", 
		"numexp", "addexp", "subexp", "multexp", "divexp", "dec"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'-'", "'+'", "'*'", "'/'", "'dec'", "'define'", "'let'", 
		"'lete'", "'.'", null, null, null, null, "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "Define", "Let", "Lete", 
		"Dot", "Number", "Identifier", "Letter", "LetterOrDigit", "AT", "ELLIPSIS", 
		"WS", "Comment", "Line_Comment"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "VarLang.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VarLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DefdeclareContext extends ParserRuleContext {
		public DefDeclare ast;
		public Token id;
		public ExpContext e;
		public TerminalNode Define() { return getToken(VarLangParser.Define, 0); }
		public TerminalNode Identifier() { return getToken(VarLangParser.Identifier, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DefdeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defdeclare; }
	}

	public final DefdeclareContext defdeclare() throws RecognitionException {
		DefdeclareContext _localctx = new DefdeclareContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_defdeclare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__0);
			setState(27);
			match(Define);
			setState(28);
			((DefdeclareContext)_localctx).id = match(Identifier);
			setState(29);
			((DefdeclareContext)_localctx).e = exp();
			 ((DefdeclareContext)_localctx).ast =  new DefDeclare((((DefdeclareContext)_localctx).id!=null?((DefdeclareContext)_localctx).id.getText():null), ((DefdeclareContext)_localctx).e.ast); 
			setState(31);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public Exp ast;
		public EncletexpContext el;
		public DecexpContext q;
		public VarexpContext v;
		public NumexpContext n;
		public AddexpContext a;
		public SubexpContext s;
		public MultexpContext m;
		public DivexpContext d;
		public LetexpContext l;
		public EncletexpContext encletexp() {
			return getRuleContext(EncletexpContext.class,0);
		}
		public DecexpContext decexp() {
			return getRuleContext(DecexpContext.class,0);
		}
		public VarexpContext varexp() {
			return getRuleContext(VarexpContext.class,0);
		}
		public NumexpContext numexp() {
			return getRuleContext(NumexpContext.class,0);
		}
		public AddexpContext addexp() {
			return getRuleContext(AddexpContext.class,0);
		}
		public SubexpContext subexp() {
			return getRuleContext(SubexpContext.class,0);
		}
		public MultexpContext multexp() {
			return getRuleContext(MultexpContext.class,0);
		}
		public DivexpContext divexp() {
			return getRuleContext(DivexpContext.class,0);
		}
		public LetexpContext letexp() {
			return getRuleContext(LetexpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_exp);
		try {
			setState(60);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				((ExpContext)_localctx).el = encletexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).el.ast; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				((ExpContext)_localctx).q = decexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).q.ast; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				((ExpContext)_localctx).v = varexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).v.ast; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				((ExpContext)_localctx).n = numexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).n.ast; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				((ExpContext)_localctx).a = addexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).a.ast; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(48);
				((ExpContext)_localctx).s = subexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).s.ast; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(51);
				((ExpContext)_localctx).m = multexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).m.ast; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(54);
				((ExpContext)_localctx).d = divexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).d.ast; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(57);
				((ExpContext)_localctx).l = letexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).l.ast; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EncletexpContext extends ParserRuleContext {
		public EncLetExp ast;
		public ArrayList<String> names;
		public ArrayList<Exp> value_exps;
		public double key;
		public Token n;
		public Token id;
		public ExpContext e;
		public ExpContext body;
		public TerminalNode Lete() { return getToken(VarLangParser.Lete, 0); }
		public TerminalNode Number() { return getToken(VarLangParser.Number, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> Identifier() { return getTokens(VarLangParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(VarLangParser.Identifier, i);
		}
		public EncletexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encletexp; }
	}

	public final EncletexpContext encletexp() throws RecognitionException {
		EncletexpContext _localctx = new EncletexpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_encletexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((EncletexpContext)_localctx).names =  new ArrayList<String>(); ((EncletexpContext)_localctx).value_exps =  new ArrayList<Exp>(); 
			setState(63);
			match(T__0);
			setState(64);
			match(Lete);
			setState(65);
			((EncletexpContext)_localctx).n = match(Number);
			setState(66);
			match(T__0);
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				match(T__0);
				setState(68);
				((EncletexpContext)_localctx).id = match(Identifier);
				setState(69);
				((EncletexpContext)_localctx).e = exp();
				setState(70);
				match(T__1);
				 _localctx.names.add((((EncletexpContext)_localctx).id!=null?((EncletexpContext)_localctx).id.getText():null)); _localctx.value_exps.add(((EncletexpContext)_localctx).e.ast);
				            ((EncletexpContext)_localctx).key =  Integer.parseInt((((EncletexpContext)_localctx).n!=null?((EncletexpContext)_localctx).n.getText():null)); 
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(77);
			match(T__1);
			setState(78);
			((EncletexpContext)_localctx).body = exp();
			setState(79);
			match(T__1);
			 ((EncletexpContext)_localctx).ast =  new EncLetExp(_localctx.names, _localctx.value_exps, ((EncletexpContext)_localctx).body.ast, _localctx.key); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecexpContext extends ParserRuleContext {
		public DecExp ast;
		public Token n;
		public ExpContext e;
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public TerminalNode Number() { return getToken(VarLangParser.Number, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DecexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decexp; }
	}

	public final DecexpContext decexp() throws RecognitionException {
		DecexpContext _localctx = new DecexpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__0);
			setState(83);
			dec();
			setState(84);
			((DecexpContext)_localctx).n = match(Number);
			setState(85);
			((DecexpContext)_localctx).e = exp();
			 ((DecexpContext)_localctx).ast =  new DecExp(Integer.parseInt((((DecexpContext)_localctx).n!=null?((DecexpContext)_localctx).n.getText():null)), ((DecexpContext)_localctx).e.ast); 
			setState(87);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarexpContext extends ParserRuleContext {
		public VarExp ast;
		public Token id;
		public TerminalNode Identifier() { return getToken(VarLangParser.Identifier, 0); }
		public VarexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varexp; }
	}

	public final VarexpContext varexp() throws RecognitionException {
		VarexpContext _localctx = new VarexpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			((VarexpContext)_localctx).id = match(Identifier);
			 ((VarexpContext)_localctx).ast =  new VarExp((((VarexpContext)_localctx).id!=null?((VarexpContext)_localctx).id.getText():null)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetexpContext extends ParserRuleContext {
		public LetExp ast;
		public ArrayList<String> names;
		public ArrayList<Exp> value_exps;
		public Token id;
		public ExpContext e;
		public ExpContext body;
		public TerminalNode Let() { return getToken(VarLangParser.Let, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> Identifier() { return getTokens(VarLangParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(VarLangParser.Identifier, i);
		}
		public LetexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letexp; }
	}

	public final LetexpContext letexp() throws RecognitionException {
		LetexpContext _localctx = new LetexpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_letexp);
		 ((LetexpContext)_localctx).names =  new ArrayList<String>(); ((LetexpContext)_localctx).value_exps =  new ArrayList<Exp>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__0);
			setState(93);
			match(Let);
			setState(94);
			match(T__0);
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(95);
				match(T__0);
				setState(96);
				((LetexpContext)_localctx).id = match(Identifier);
				setState(97);
				((LetexpContext)_localctx).e = exp();
				setState(98);
				match(T__1);
				 _localctx.names.add((((LetexpContext)_localctx).id!=null?((LetexpContext)_localctx).id.getText():null)); _localctx.value_exps.add(((LetexpContext)_localctx).e.ast); 
				}
				}
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(105);
			match(T__1);
			setState(106);
			((LetexpContext)_localctx).body = exp();
			setState(107);
			match(T__1);
			 ((LetexpContext)_localctx).ast =  new LetExp(_localctx.names, _localctx.value_exps, ((LetexpContext)_localctx).body.ast); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public ArrayList<DefDeclare> def;
		public Exp expression;
		public DefdeclareContext d;
		public ExpContext e;
		public List<DefdeclareContext> defdeclare() {
			return getRuleContexts(DefdeclareContext.class);
		}
		public DefdeclareContext defdeclare(int i) {
			return getRuleContext(DefdeclareContext.class,i);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			 ((ProgramContext)_localctx).def =  new ArrayList<DefDeclare>(); 
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(111);
					((ProgramContext)_localctx).d = defdeclare();
					_localctx.def.add(((ProgramContext)_localctx).d.ast); 
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(122);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << Number) | (1L << Identifier))) != 0)) {
				{
				setState(119);
				((ProgramContext)_localctx).e = exp();
				((ProgramContext)_localctx).expression = ((ProgramContext)_localctx).e.ast; 
				}
			}

			 ((ProgramContext)_localctx).ast =  new Program(_localctx.def, _localctx.expression); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumexpContext extends ParserRuleContext {
		public NumExp ast;
		public Token n0;
		public Token n1;
		public List<TerminalNode> Number() { return getTokens(VarLangParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(VarLangParser.Number, i);
		}
		public TerminalNode Dot() { return getToken(VarLangParser.Dot, 0); }
		public NumexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numexp; }
	}

	public final NumexpContext numexp() throws RecognitionException {
		NumexpContext _localctx = new NumexpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_numexp);
		try {
			setState(140);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				((NumexpContext)_localctx).n0 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(Integer.parseInt((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null))); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(T__2);
				setState(129);
				((NumexpContext)_localctx).n0 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(-Integer.parseInt((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null))); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				((NumexpContext)_localctx).n0 = match(Number);
				setState(132);
				match(Dot);
				setState(133);
				((NumexpContext)_localctx).n1 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(Double.parseDouble((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null)+"."+(((NumexpContext)_localctx).n1!=null?((NumexpContext)_localctx).n1.getText():null))); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				match(T__2);
				setState(136);
				((NumexpContext)_localctx).n0 = match(Number);
				setState(137);
				match(Dot);
				setState(138);
				((NumexpContext)_localctx).n1 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(Double.parseDouble("-" + (((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null)+"."+(((NumexpContext)_localctx).n1!=null?((NumexpContext)_localctx).n1.getText():null))); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddexpContext extends ParserRuleContext {
		public AddExp ast;
		public ArrayList<Exp> list;
		public ExpContext e;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public AddexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addexp; }
	}

	public final AddexpContext addexp() throws RecognitionException {
		AddexpContext _localctx = new AddexpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_addexp);
		 ((AddexpContext)_localctx).list =  new ArrayList<Exp>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__0);
			setState(143);
			match(T__3);
			setState(144);
			((AddexpContext)_localctx).e = exp();
			 _localctx.list.add(((AddexpContext)_localctx).e.ast); 
			setState(149); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(146);
				((AddexpContext)_localctx).e = exp();
				 _localctx.list.add(((AddexpContext)_localctx).e.ast); 
				}
				}
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << Number) | (1L << Identifier))) != 0) );
			setState(153);
			match(T__1);
			 ((AddexpContext)_localctx).ast =  new AddExp(_localctx.list); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubexpContext extends ParserRuleContext {
		public SubExp ast;
		public ArrayList<Exp> list;
		public ExpContext e;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public SubexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subexp; }
	}

	public final SubexpContext subexp() throws RecognitionException {
		SubexpContext _localctx = new SubexpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_subexp);
		 ((SubexpContext)_localctx).list =  new ArrayList<Exp>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__0);
			setState(157);
			match(T__2);
			setState(158);
			((SubexpContext)_localctx).e = exp();
			 _localctx.list.add(((SubexpContext)_localctx).e.ast); 
			setState(163); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(160);
				((SubexpContext)_localctx).e = exp();
				 _localctx.list.add(((SubexpContext)_localctx).e.ast); 
				}
				}
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << Number) | (1L << Identifier))) != 0) );
			setState(167);
			match(T__1);
			 ((SubexpContext)_localctx).ast =  new SubExp(_localctx.list); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultexpContext extends ParserRuleContext {
		public MultExp ast;
		public ArrayList<Exp> list;
		public ExpContext e;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public MultexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multexp; }
	}

	public final MultexpContext multexp() throws RecognitionException {
		MultexpContext _localctx = new MultexpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_multexp);
		 ((MultexpContext)_localctx).list =  new ArrayList<Exp>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__0);
			setState(171);
			match(T__4);
			setState(172);
			((MultexpContext)_localctx).e = exp();
			 _localctx.list.add(((MultexpContext)_localctx).e.ast); 
			setState(177); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(174);
				((MultexpContext)_localctx).e = exp();
				 _localctx.list.add(((MultexpContext)_localctx).e.ast); 
				}
				}
				setState(179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << Number) | (1L << Identifier))) != 0) );
			setState(181);
			match(T__1);
			 ((MultexpContext)_localctx).ast =  new MultExp(_localctx.list); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DivexpContext extends ParserRuleContext {
		public DivExp ast;
		public ArrayList<Exp> list;
		public ExpContext e;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public DivexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divexp; }
	}

	public final DivexpContext divexp() throws RecognitionException {
		DivexpContext _localctx = new DivexpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_divexp);
		 ((DivexpContext)_localctx).list =  new ArrayList<Exp>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(T__0);
			setState(185);
			match(T__5);
			setState(186);
			((DivexpContext)_localctx).e = exp();
			 _localctx.list.add(((DivexpContext)_localctx).e.ast); 
			setState(191); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(188);
				((DivexpContext)_localctx).e = exp();
				 _localctx.list.add(((DivexpContext)_localctx).e.ast); 
				}
				}
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << Number) | (1L << Identifier))) != 0) );
			setState(195);
			match(T__1);
			 ((DivexpContext)_localctx).ast =  new DivExp(_localctx.list); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecContext extends ParserRuleContext {
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\26\u00cb\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3?\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\6\4L\n\4\r\4\16\4M\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7h\n\7\r"+
		"\7\16\7i\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7\bu\n\b\f\b\16\bx\13\b\3"+
		"\b\3\b\3\b\5\b}\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u008f\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u0098\n\n"+
		"\r\n\16\n\u0099\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\6\13\u00a6"+
		"\n\13\r\13\16\13\u00a7\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\6\f"+
		"\u00b4\n\f\r\f\16\f\u00b5\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r"+
		"\u00c2\n\r\r\r\16\r\u00c3\3\r\3\r\3\r\3\16\3\16\3\16\2\2\17\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\2\2\u00d0\2\34\3\2\2\2\4>\3\2\2\2\6@\3\2\2\2\b"+
		"T\3\2\2\2\n[\3\2\2\2\f^\3\2\2\2\16p\3\2\2\2\20\u008e\3\2\2\2\22\u0090"+
		"\3\2\2\2\24\u009e\3\2\2\2\26\u00ac\3\2\2\2\30\u00ba\3\2\2\2\32\u00c8\3"+
		"\2\2\2\34\35\7\3\2\2\35\36\7\n\2\2\36\37\7\17\2\2\37 \5\4\3\2 !\b\2\1"+
		"\2!\"\7\4\2\2\"\3\3\2\2\2#$\5\6\4\2$%\b\3\1\2%?\3\2\2\2&\'\5\b\5\2\'("+
		"\b\3\1\2(?\3\2\2\2)*\5\n\6\2*+\b\3\1\2+?\3\2\2\2,-\5\20\t\2-.\b\3\1\2"+
		".?\3\2\2\2/\60\5\22\n\2\60\61\b\3\1\2\61?\3\2\2\2\62\63\5\24\13\2\63\64"+
		"\b\3\1\2\64?\3\2\2\2\65\66\5\26\f\2\66\67\b\3\1\2\67?\3\2\2\289\5\30\r"+
		"\29:\b\3\1\2:?\3\2\2\2;<\5\f\7\2<=\b\3\1\2=?\3\2\2\2>#\3\2\2\2>&\3\2\2"+
		"\2>)\3\2\2\2>,\3\2\2\2>/\3\2\2\2>\62\3\2\2\2>\65\3\2\2\2>8\3\2\2\2>;\3"+
		"\2\2\2?\5\3\2\2\2@A\b\4\1\2AB\7\3\2\2BC\7\f\2\2CD\7\16\2\2DK\7\3\2\2E"+
		"F\7\3\2\2FG\7\17\2\2GH\5\4\3\2HI\7\4\2\2IJ\b\4\1\2JL\3\2\2\2KE\3\2\2\2"+
		"LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\7\4\2\2PQ\5\4\3\2QR\7\4\2\2"+
		"RS\b\4\1\2S\7\3\2\2\2TU\7\3\2\2UV\5\32\16\2VW\7\16\2\2WX\5\4\3\2XY\b\5"+
		"\1\2YZ\7\4\2\2Z\t\3\2\2\2[\\\7\17\2\2\\]\b\6\1\2]\13\3\2\2\2^_\7\3\2\2"+
		"_`\7\13\2\2`g\7\3\2\2ab\7\3\2\2bc\7\17\2\2cd\5\4\3\2de\7\4\2\2ef\b\7\1"+
		"\2fh\3\2\2\2ga\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\4\2"+
		"\2lm\5\4\3\2mn\7\4\2\2no\b\7\1\2o\r\3\2\2\2pv\b\b\1\2qr\5\2\2\2rs\b\b"+
		"\1\2su\3\2\2\2tq\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w|\3\2\2\2xv\3\2"+
		"\2\2yz\5\4\3\2z{\b\b\1\2{}\3\2\2\2|y\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177"+
		"\b\b\1\2\177\17\3\2\2\2\u0080\u0081\7\16\2\2\u0081\u008f\b\t\1\2\u0082"+
		"\u0083\7\5\2\2\u0083\u0084\7\16\2\2\u0084\u008f\b\t\1\2\u0085\u0086\7"+
		"\16\2\2\u0086\u0087\7\r\2\2\u0087\u0088\7\16\2\2\u0088\u008f\b\t\1\2\u0089"+
		"\u008a\7\5\2\2\u008a\u008b\7\16\2\2\u008b\u008c\7\r\2\2\u008c\u008d\7"+
		"\16\2\2\u008d\u008f\b\t\1\2\u008e\u0080\3\2\2\2\u008e\u0082\3\2\2\2\u008e"+
		"\u0085\3\2\2\2\u008e\u0089\3\2\2\2\u008f\21\3\2\2\2\u0090\u0091\7\3\2"+
		"\2\u0091\u0092\7\6\2\2\u0092\u0093\5\4\3\2\u0093\u0097\b\n\1\2\u0094\u0095"+
		"\5\4\3\2\u0095\u0096\b\n\1\2\u0096\u0098\3\2\2\2\u0097\u0094\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u009c\7\4\2\2\u009c\u009d\b\n\1\2\u009d\23\3\2\2\2\u009e\u009f"+
		"\7\3\2\2\u009f\u00a0\7\5\2\2\u00a0\u00a1\5\4\3\2\u00a1\u00a5\b\13\1\2"+
		"\u00a2\u00a3\5\4\3\2\u00a3\u00a4\b\13\1\2\u00a4\u00a6\3\2\2\2\u00a5\u00a2"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\7\4\2\2\u00aa\u00ab\b\13\1\2\u00ab\25\3\2\2"+
		"\2\u00ac\u00ad\7\3\2\2\u00ad\u00ae\7\7\2\2\u00ae\u00af\5\4\3\2\u00af\u00b3"+
		"\b\f\1\2\u00b0\u00b1\5\4\3\2\u00b1\u00b2\b\f\1\2\u00b2\u00b4\3\2\2\2\u00b3"+
		"\u00b0\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\7\4\2\2\u00b8\u00b9\b\f\1\2\u00b9"+
		"\27\3\2\2\2\u00ba\u00bb\7\3\2\2\u00bb\u00bc\7\b\2\2\u00bc\u00bd\5\4\3"+
		"\2\u00bd\u00c1\b\r\1\2\u00be\u00bf\5\4\3\2\u00bf\u00c0\b\r\1\2\u00c0\u00c2"+
		"\3\2\2\2\u00c1\u00be\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\7\4\2\2\u00c6\u00c7\b\r"+
		"\1\2\u00c7\31\3\2\2\2\u00c8\u00c9\7\t\2\2\u00c9\33\3\2\2\2\f>Miv|\u008e"+
		"\u0099\u00a7\u00b5\u00c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}