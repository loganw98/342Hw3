package varlang;
import static varlang.AST.*;
import static varlang.Value.*;

import java.util.List;
import java.util.ArrayList;

import varlang.AST.AddExp;
import varlang.AST.NumExp;
import varlang.AST.DivExp;
import varlang.AST.MultExp;
import varlang.AST.Program;
import varlang.AST.SubExp;
import varlang.AST.VarExp;
import varlang.AST.Visitor;
import varlang.Env.EmptyEnv;
import varlang.Env.ExtendEnv;

public class Evaluator implements Visitor<Value> {
	private Env initEnv = new EmptyEnv();
	
	Value valueOf(Program p) {
		// Value of a program in this language is the value of the expression
		return (Value) p.accept(this, initEnv);
	}
	
	@Override
	public Value visit(AddExp e, Env env) {
		List<Exp> operands = e.all();
		double result = 0;
		for(Exp exp: operands) {
			NumVal intermediate = (NumVal) exp.accept(this, env); // Dynamic type-checking
			result += intermediate.v(); //Semantics of AddExp in terms of the target language.
		}
		return new NumVal(result);
	}

	@Override
	public Value visit(NumExp e, Env env) {
		return new NumVal(e.v());
	}

	@Override
	public Value visit(DivExp e, Env env) {
		List<Exp> operands = e.all();
		NumVal lVal = (NumVal) operands.get(0).accept(this, env);
		double result = lVal.v(); 
		for(int i=1; i<operands.size(); i++) {
			NumVal rVal = (NumVal) operands.get(i).accept(this, env);
			result = result / rVal.v();
		}
		return new NumVal(result);
	}

	@Override
	public Value visit(MultExp e, Env env) {
		List<Exp> operands = e.all();
		double result = 1;
		for(Exp exp: operands) {
			NumVal intermediate = (NumVal) exp.accept(this, env); // Dynamic type-checking
			result *= intermediate.v(); //Semantics of MultExp.
		}
		return new NumVal(result);
	}

	@Override
	public Value visit(Program p, Env env) {
		for(DefDeclare d : p.get_defDeclares()) {
			d.accept(this, initEnv);
		}
		return (Value) p.e().accept(this, initEnv);
	}

	@Override
	public Value visit(SubExp e, Env env) {
		List<Exp> operands = e.all();
		NumVal lVal = (NumVal) operands.get(0).accept(this, env);
		double result = lVal.v();
		for(int i=1; i<operands.size(); i++) {
			NumVal rVal = (NumVal) operands.get(i).accept(this, env);
			result = result - rVal.v();
		}
		return new NumVal(result);
	}

	@Override
	public Value visit(VarExp e, Env env) {
		// Previously, all variables had value 42. New semantics.
		return env.get(e.name());
	}	

	@Override
	public Value visit(LetExp e, Env env) { // New for varlang.
		List<String> names = e.names();
		List<Exp> value_exps = e.value_exps();
		List<Value> values = new ArrayList<Value>(value_exps.size());

		Env new_env = initEnv;
		for(int i = 0; i < names.size(); i++){
			values.add((Value) value_exps.get(i).accept(this, new_env));
			initEnv = new ExtendEnv(new_env, names.get(i), values.get(i));
		}

		return (Value) e.body().accept(this, initEnv);
	}
	@Override
	public Value visit(EncLetExp e, Env env){
		List<String> names = e._names;
		List<Exp> value_exps = e._value_exp;
		double key = e._key;
		List<Value> values = new ArrayList<>(value_exps.size());
		Env new_env = initEnv;
		for(int i = 0; i < names.size(); i++){
			NumVal val = (NumVal) value_exps.get(i).accept(this, new_env);
			val.setV(key);
			values.add((Value) val);
		}
		return (Value) e._body.accept(this, new_env);
	}

	@Override
	public Value visit(DecExp d, Env env) {
		NumVal temp = (NumVal) d._e.accept(this, env);
		temp.setV(-d._number);
		return temp;
	}

	@Override
	public Value visit(DefDeclare d, Env env) {
	    String name = d.name();
	    Exp value = d.value();
	    Value val = (Value) value.accept(this, initEnv);
	    initEnv = new Env.GlobalEnv(initEnv, name, val);
		return (Value) d.accept(this, initEnv);
	}


}
