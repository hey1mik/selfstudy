package com.hey1.mtest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class) //모키토 JUnitRunner 클래스를 이용하여 JUnit 테스트를 하기 위한 어노테이션!
public class MockitoAnnotationTest {

	@Before //모키토 어노테이션을 프로그램 전체에서 사용하기 위해서 모든 테스트 메소드 앞에 선행되게 하는 메소드
	public void init() {
		MockitoAnnotations.initMocks(this); // 모키토 어노테이션을 사용하겠다는 표식
	}
	
	@Rule
	public MockitoRule initRule = MockitoJUnit.rule(); // 모키토 junit룰을 사용하는 방법. 
	// 접근제한자를 public으로 해야한다는 것을 기억해두기!
	
	
	@Mock
	List<String> mockedList; // 목으로 만들어진 List클래스 mockedList를 선언. 의존성 주입 가능.
	
	@Test //실제로 테스트를 수행할 메소드 앞에 붙일 어노테이션
	public void testMockSize() {
		mockedList.add("one"); // 목리스트에 "one"이라는 String을 하나 추가할 것임.
		Mockito.verify(mockedList).add("one"); // "one"이 제대로 추가되었는지 확인
		// 그런데 이게 메모리상에서 실제로 mockedList라는 개체에 one이 추가되는 건 아니다.
		// 그저 one이 추가된다는 "행위"를 제대로 수행하는지만 확인하는 것.
		// 그래서 mocekdList 안에 실제로 "one"이라는 String이 추가된 것은 아님..!!
		assertEquals(0, mockedList.size());
		// 그 증거가 이것. mockedList.size()는 0이다.
		// 행위는 이루어졌다고 검증됐지만 실제 "one"이 메모리에 추가된 것이 아닌것.
		//----------------------여기까지 테스트 하나 완료-----------------------------//
		Mockito.when(mockedList.size()).thenReturn(100); //mocekdList.size라는 메소드가 100을 반환한다면
		assertEquals(100, mockedList.size()); //mocekdList.size는 100일것이다.
	}
	
	
	 @Spy List<String> spiedList = new ArrayList<String>(); // 스파이 어노테이션이 붙은 클래스는 
	 // 의존성 주입이 안되고 직접 객체 생성을 해야함. 그리고 mock개체와는 다르게 실제 메모리상에 클래스를 선언하고 값을 할당함.
	 
	 @Test
	 public void testSpy() { 
	  spiedList.add("one"); // "one"이라는 스트링을 배열에 추가
	  spiedList.add("two"); // "two" 또한 추가
	 
	 Mockito.verify(spiedList).add("one"); // 추가하는 행위를 했는지 검증
	 Mockito.verify(spiedList).add("two"); // 행위검증 2
	 
	 assertEquals(2, spiedList.size()); // 메모리상에 값이 실제로 할당됐기때문에 스파이리스트 값은 2가 됨. }
	 }
	
	 @Mock
	 List mockList;
	 
	 @Captor
	 ArgumentCaptor argCaptor; // 내부 데이터를 확인하기 위해 사용되는 클래스
	 
	 @Test
	 public void testCaptor() {
		 mockList.add("one");
		 Mockito.verify(mockList).add(argCaptor.capture());// 한번만 쓰일 수 있음.
		 
		 assertEquals("one", argCaptor.getValue()); // 어떤 값이 들어갔는지 확인
	 }
	
}
