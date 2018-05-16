package junit.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.junit.Test;

import junit.tutorial.SnakeCamelUtil;

public class SnakeCamelUtilTest {
	
	@Test
	public void capitalizeでからへ(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = " ";
		String actual = sc.capitalize(" ");
		assertThat(actual, is(expected));
		
	}
	
	public void capitalizeでaからAへ(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "A";
		String actual = sc.capitalize("a");
		assertThat(actual, is(expected));
		
	}
	
	public void capitalizeでxyzからXyzへ(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "Xyz";
		String actual = sc.capitalize("xyz");
		assertThat(actual, is(expected));
		
	}
	
	public void uncapitalizeでからへ(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = " ";
		String actual = sc.uncapitalize(" ");
		assertThat(actual, is(expected));
		
	}
	
	public void uncapitalizeでAからaへ(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "a";
		String actual = sc.uncapitalize("A");
		assertThat(actual, is(expected));
		
	}
	
	public void uncapitalizeでXyzからxyzへ(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "xyz";
		String actual = sc.uncapitalize("Xyz");
		assertThat(actual, is(expected));
		
	}
	
	public void snakeToCamelcaseでabcからAbcへ(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "";
		String actual = sc.snakeToCamelcase("abc");
		assertThat(actual, is(expected));
		
	}
	
	public void snakeToCamelcaseでabc_defからAbcDefへ(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "AbcDef";
		String actual = sc.snakeToCamelcase("abc_def");
		assertThat(actual, is(expected));
		
	}
	
	public void snakeToCamelcaseでabc_def_ghからAbcDefGhへ(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "AbcDefGh";
		String actual = sc.snakeToCamelcase("abc_def_gh");
		assertThat(actual, is(expected));
	
	}
	
	public void snakeToCamelcaseでabc__def___ghからAbcDefGhへ(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "AbcDefGh";
		String actual = sc.snakeToCamelcase("abc__def___gh");
		assertThat(actual, is(expected));
		
	}
	
	public void snakeToCamelcaseで_abc_def__からAbcDefへ(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "AbcDef";
		String actual = sc.snakeToCamelcase("_abc_def__");
		assertThat(actual, is(expected));
		
	}
	
	
	
	public void camelToSnakecaseでAbcからabcへ() {
		SnakeCamelUtil ca = new SnakeCamelUtil();
		String expected = "abc";
		String actual = ca.camelToSnakecase("Abc");
		assertThat(actual, is(expected));
		
	}
	
	public void camelToSnakecaseでAbcDefからabc_defへ() {
		SnakeCamelUtil ca = new SnakeCamelUtil();
		String expected = "abc_def";
		String actual = ca.camelToSnakecase("AbcDef");
		assertThat(actual, is(expected));		
	}
	
	public void camelToSnakecaseでAbcDefGhからabc_def_ghへ() {
		SnakeCamelUtil ca = new SnakeCamelUtil();
		String expected = "abc_def_gh";
		String actual = ca.camelToSnakecase("AbcDefGh");
		assertThat(actual, is(expected));		
	}
	
	
	
	
	public void test() {
		fail("Not yet implemented");
	}

}
