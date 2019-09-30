grammar VarLang;

import ArithLang; //Import all rules from Arithlang grammar.
 
 // New elements in the Grammar of this Programming Language
 //  - grammar rules start with lowercase

 defdeclare returns [DefDeclare ast]:
         '(' Define id=Identifier e=exp { $ast = new DefDeclare($id.text, $e.ast); } ')'
        ;

 exp returns [Exp ast]:
        el=encletexp { $ast = $el.ast; }
        | q=decexp { $ast = $q.ast; }
		| v=varexp { $ast = $v.ast; }
		| n=numexp { $ast = $n.ast; }
        | a=addexp { $ast = $a.ast; }
        | s=subexp { $ast = $s.ast; }
        | m=multexp { $ast = $m.ast; }
        | d=divexp { $ast = $d.ast; }
        | l=letexp { $ast = $l.ast; }
        ;

 encletexp returns [EncLetExp ast]
        locals [ArrayList<String> names, ArrayList<Exp> value_exps, double key]:
        { $names = new ArrayList<String>(); $value_exps = new ArrayList<Exp>(); }
        '(' Lete n=Number
            '(' ( '(' id=Identifier e=exp ')' { $names.add($id.text); $value_exps.add($e.ast);
            $key = Integer.parseInt($n.text); } )+ ')'
            body=exp
            ')' { $ast = new EncLetExp($names, $value_exps, $body.ast, $key); }
        ;

 decexp returns [DecExp ast]:
        '(' dec n=Number e=exp
         { $ast = new DecExp(Integer.parseInt($n.text), $e.ast); } ')'
        ;

 varexp returns [VarExp ast]: 
 		id=Identifier { $ast = new VarExp($id.text); }
 		;

 letexp  returns [LetExp ast] 
        locals [ArrayList<String> names, ArrayList<Exp> value_exps]
 		@init { $names = new ArrayList<String>(); $value_exps = new ArrayList<Exp>(); } :
 		'(' Let 
 			'(' ( '(' id=Identifier e=exp ')' { $names.add($id.text); $value_exps.add($e.ast); } )+  ')'
 			body=exp 
 			')' { $ast = new LetExp($names, $value_exps, $body.ast); }
 		;

 // Lexical Specification of this Programming Language
 //  - lexical specification rules start with uppercase
 