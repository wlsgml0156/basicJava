package oop1210;

public class Test01_variable {
	public static void main(String[] args) {
		//값 value
		//1. 상수 constant
		//-> 고정 불변의 값
		/*
		System.out.println(3);
		System.out.println(2.4);
		System.out.println("A");
		System.out.println("가");
		*/
//-----------------------------------------		

		//2. 변수 variable
		//-> 변하는 값
		//-> 변수선언형식   : 자료형 변수명;
		//-> 변수에 값 저장 : = 대입연산자
		
		//  1)정수형
		/*
		byte a;     //1byte 할당
		short b;    //2byte 할당
		int c;      //4byte 할당
		long d;     //8byte 할당
		
		a=3; //대입연산자
		b=5;
		c=7;
		d=9;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		*/
//-------------------------------------------
		
		//  2)실수형
		/*
		//접미사 f 반드시 추가. 4byte
		float a=1.2f;
		//접미사 d 생략가능. 8byte
		double b=3.4d; 
		
		System.out.println(a);
		System.out.println(b);
		
		b=5.6;
		System.out.println(b);
		*/
//------------------------------------		
		
		//  3)문자형
		/*
		char ch='A'; //2byte 할당
		System.out.println(ch);
		ch='가';
		System.out.println(ch);
		*/
//------------------------------------		
		//기본자료형
		//->byte,short,int,long,float,double,char,boolean	
		//참조자료형(클래스)
		
		//  4)문자열형
		/*
		String str="KOREA";
		System.out.println(str);
		*/
//-------------------------------------		
		
		//  5)논리형
		//  ->맞다(true), 틀리다(false)
	  /*
		boolean b=true;
		System.out.println(b);
		b=false;
		System.out.println(b);
		
	  System.out.println("true");//String
	  */
//-------------------------------------		
	  String name="홍길동";
	  int kor=80, eng=85, mat=100;
	  
	  //평균구하기
	  double aver=(kor+eng+mat)/3;
	  
	  //출력하기
    System.out.println(name);
    System.out.println(kor);
    System.out.println(eng);
    System.out.println(mat);
    System.out.println(aver);
	  
	  
	  
	  
	  
	  
	  
	}//main() end
}//class end
