package ClassExample02;
/*
 * < package >
 * 
 * (1) 개념
 * - 자주 사용되는 클래스를 모아 놓은 폴더
 * - 패키지명은 소문자를 사용 -> 관례
 * 
 * (2) 형식
 * - package 패키지명;
 * - package mypackage.utility;
 * 
 * */

/*
 * < import >
 * 
 * (1) 사용
 * - c언어 #include와 유사한 역할
 * - 클래스를 포함하고자 할 경우
 * 
 * (2) 형식
 * - import 패키지명.클래스명;
 * - import 패키지명.*;
 * => 패키지명만 기억하면 됨.
 * */

public class ClassExample06 {
	public static void main(String[] args) {
		System.out.println("mypackage Utility class");
	}
}
 