spl(calculator).

domainRequirement(radd).
domainRequirement(rsubtract).

domainComponent(add).
domainComponent(subtract).

:- dynamic(applicationFile/4).
:- dynamic(isPartOfPS/2).
:- dynamic(isPartOfAFP/2).

domainFile(add-calculator,"calculator.java","package calculator;

import java.util.Scanner;

public class Calculator {
    
    public static double add(double a, double b){
        return a+b;
    }

    calculator-functions

    public static void main(String[] args) {
    	application-name
        System.out.println('Welcome to XXX');
        application-name

        int break_while = 1;
        while(break_while == 1){
           System.out.println('0. Exit');
           System.out.println('1. Add two numbers');
           
           calculator-messages

           Scanner scanner = new Scanner(System. in); 
           String texto = scanner.nextLine();
           int op = Integer.parseInt(texto);
           switch(op){
               case 0:
                   break_while = 0;
                   break;
               case 1:
                   System.out.println('Enter two numbers:');
                   double a = Double.parseDouble(scanner.nextLine());
                   double b = Double.parseDouble(scanner.nextLine());
                   double total=Calculator.add(a,b);
                   System.out.println('Total:' + total);
                   break;
               
               calculator-cases
           }
       }
    }
}
","/").
domainFile(add-test,"test.java","additional test

cp-point1
customize it
cp-point1

replace-area

replace it

replace-area

xxxx
	","/").

fragmentationPoint(replace-area).
fragmentationPoint(calculator-cases).
fragmentationPoint(calculator-messages).
fragmentationPoint(calculator-function).

fragment(subtract-subtract3,"alterSubtract3.frag","case 2:
                   System.out.println('Enter two numbers:');
                   a = Double.parseDouble(scanner.nextLine());
                   b = Double.parseDouble(scanner.nextLine());
                   total=Calculator.subtract(a,b);
                   System.out.println('Total:' + total);
                   break;").
fragment(subtract-subtract2,"alterSubtract2.frag","System.out.println('2. Subtract two numbers');").
fragment(subtract-subtract,"alterSubtract.frag","public static double subtract(double a, double b){
        return a-b;
    }").
fragment(subtract-testrep,"alterTestRep.frag","- REP1 -").
fragment(subtract-testhid,"alterTestHid.frag","").

fragmentTypeAdd(subtract-subtract3).
fragmentTypeAdd(subtract-subtract2).
fragmentTypeAdd(subtract-subtract).
fragmentTypeReplace(subtract-testrep).
fragmentTypeHide(subtract-testhid).

customizationPoint(cp-point1).
customizationPoint(application-name).
customizationFile(add-customization).

isPartOf(radd,calculator).
isPartOf(rsubtract,calculator).

isPartOf(add-test,add).
isPartOf(add-calculator,add).

isPartOf(replace-area,add-test).
isPartOf(calculator-cases,add-calculator).
isPartOf(calculator-messages,add-calculator).
isPartOf(calculator-function,add-calculator).

isPartOf(subtract-subtract3,subtract).
isPartOf(subtract-subtract2,subtract).
isPartOf(subtract-subtract,subtract).

isPartOf(application-name,add-calculator).
isPartOf(add-customization,add).

isPartOf(subtract-testrep,subtract).
isPartOf(subtract-testhid,subtract).
isPartOf(cp-point1,add-test).

isAssociatedWith(calculator-cases,subtract-subtract3).
isAssociatedWith(calculator-messages,subtract-subtract2).
isAssociatedWith(calculator-function,subtract-subtract).

isAssociatedWith(application-name,add-customization).

isAssociatedWith(replace-area,subtract-testrep).
isAssociatedWith(replace-area,subtract-testhid).
isAssociatedWith(cp-point1,add-customization).

setSelected(radd).
setSelected(rsubtract).

isBoundTo(add,radd).
isBoundTo(subtract,rsubtract).

add(FRCODE,FP,F,FCODE) :- 
retract(applicationFile(F,FNAME,FCODE,FDEST)),
term_string(FP,FPS),
sub_string(FCODE, Before, L, After, FPS),
sub_string(FCODE, _, After, 0, Value2),
Initial is Before+L,
sub_string(FCODE, 0, (Initial), _, Value1),
string_concat(Value1,FRCODE,New1),
string_concat(New1,Value2,New2),
assert(applicationFile(F,FNAME,New2,FDEST)).

hide(FP,F,FCODE) :- 
retract(applicationFile(F,FNAME,FCODE,FDEST)),
term_string(FP,FPS),
sub_string(FCODE, Before, L, After, FPS),
sub_string(FCODE, _, After, 0, Value2),
Initial is Before+L,
sub_string(FCODE, 0, Initial, _, Value1),
string_concat(Value1,"/*",New1),
sub_string(Value2, Before2, L2, After2, FPS),
sub_string(Value2, 0, Before2, _, Value4),
string_concat(New1,Value4,New2),
string_concat(New2,"*/",New3),
Initial2 is After2+L,
sub_string(FCODE, _, Initial2, 0, Value3),
string_concat(New3,Value3,New4),
assert(applicationFile(F,FNAME,New4,FDEST)).

replace(FRCODE,FP,F,FCODE) :- 
retract(applicationFile(F,FNAME,FCODE,FDEST)),
term_string(FP,FPS),
sub_string(FCODE, Before, L, After, FPS),
sub_string(FCODE, _, After, 0, Value2),
Initial is Before+L,
sub_string(FCODE, 0, Initial, _, Value1),
string_concat(Value1,FRCODE,New1),
sub_string(Value2, Before2, L2, After2, FPS),
Initial2 is After2+L,
sub_string(FCODE, _, Initial2, 0, Value3),
string_concat(New1,Value3,New2),
assert(applicationFile(F,FNAME,New2,FDEST)).

customize(CP,F,FCODE) :- 
write('enter new customized code for:'),
write(CP),
read(USERCODE),
retract(applicationFile(F,FNAME,FCODE,FDEST)),
term_string(CP,CPS),
sub_string(FCODE, Before, L, After, CPS),
sub_string(FCODE, _, After, 0, Value2),
Initial is Before+L,
sub_string(FCODE, 0, Initial, _, Value1),
string_concat(Value1,USERCODE,New1),
sub_string(Value2, Before2, L2, After2, CPS),
Initial2 is After2+L,
sub_string(FCODE, _, Initial2, 0, Value3),
string_concat(New1,Value3,New2),
assert(applicationFile(F,FNAME,New2,FDEST)).

executeAddFragment(FR) :- forall((fragment(FR,FRNAME,FRCODE),
				fragmentTypeAdd(FR),
				fragmentationPoint(FP),
				applicationFile(F,FNAME,FCODE,FDEST),
				isAssociatedWith(FP,FR),
		           isPartOf(FP,F)),(add(FRCODE,FP,F,FCODE))).

executeReplaceFragment(FR) :- forall((fragment(FR,FRNAME,FRCODE),
				fragmentTypeReplace(FR),
				fragmentationPoint(FP),
				applicationFile(F,FNAME,FCODE,FDEST),
				isAssociatedWith(FP,FR),
		           isPartOf(FP,F)),(replace(FRCODE,FP,F,FCODE))).

executeHideFragment(FR) :- forall((fragment(FR,FRNAME,FRCODE),
				fragmentTypeHide(FR),
				fragmentationPoint(FP),
				applicationFile(F,FNAME,FCODE,FDEST),
				isAssociatedWith(FP,FR),
		           isPartOf(FP,F)),(hide(FP,F,FCODE))).

executeDerivation(SPL,PNAME) :- spl(SPL),
				assert(product(PNAME)),
				assert(isPartOfPS(PNAME,SPL)),
				executeCopy(SPL,PNAME),executeFragments(SPL).

executeCopy(SPL,PNAME) :- forall((spl(SPL),
				domainRequirement(R),
				domainComponent(C),
				product(PNAME),
				domainFile(F,FNAME,FCODE,FDEST),
				isPartOf(R,SPL),
				isBoundTo(C,R),
				isPartOf(F,C),
				setSelected(R)),(assert(applicationFile(F,FNAME,FCODE,FDEST)),assert(isPartOfAFP(F,PNAME)))).

executeFragments(SPL) :- forall((spl(SPL),
				domainRequirement(R),
				domainComponent(C),
				fragment(FR,_,_),
				isPartOf(R,SPL),
				isBoundTo(C,R),
				isPartOf(FR,C),
				setSelected(R)),(executeReplaceFragment(FR),executeAddFragment(FR),executeHideFragment(FR))).

executeCustomization(CF) :- forall((customizationFile(CF),
				customizationPoint(CP),
				applicationFile(F,FNAME,FCODE,FDEST),
				isAssociatedWith(CP,CF),
		           isPartOf(CP,F)),customize(CP,F,FCODE)).

customizeDerivation(SPL) :- forall((spl(SPL),
				domainRequirement(R),
				domainComponent(C),
				customizationFile(CF),
				isPartOf(R,SPL),
				isBoundTo(C,R),
				isPartOf(CF,C),
				setSelected(R)),(executeCustomization(CF))).

showDerivedFiles(PNAME,AF,AFCODE) :- (spl(SPL),
				product(PNAME),
				applicationFile(AF,AFNAME,AFCODE,AFDEST),
				isPartOfPS(PNAME,SPL),
				isPartOfAFP(AF,PNAME)).

/*
verifyDerivation(SPL,PNAME) :- forall(
					(
						spl(SPL),
						product(PNAME),
						applicationFile(F),
						isPartOfPS(PNAME,SPL),
						isPartOfAFP(F,PNAME)
					),
					(verify(F))
					).
*/