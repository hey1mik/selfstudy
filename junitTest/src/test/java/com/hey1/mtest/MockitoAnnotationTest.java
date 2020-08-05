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

@RunWith(MockitoJUnitRunner.class) //��Ű�� JUnitRunner Ŭ������ �̿��Ͽ� JUnit �׽�Ʈ�� �ϱ� ���� ������̼�!
public class MockitoAnnotationTest {

	@Before //��Ű�� ������̼��� ���α׷� ��ü���� ����ϱ� ���ؼ� ��� �׽�Ʈ �޼ҵ� �տ� ����ǰ� �ϴ� �޼ҵ�
	public void init() {
		MockitoAnnotations.initMocks(this); // ��Ű�� ������̼��� ����ϰڴٴ� ǥ��
	}
	
	@Rule
	public MockitoRule initRule = MockitoJUnit.rule(); // ��Ű�� junit���� ����ϴ� ���. 
	// ���������ڸ� public���� �ؾ��Ѵٴ� ���� ����صα�!
	
	
	@Mock
	List<String> mockedList; // ������ ������� ListŬ���� mockedList�� ����. ������ ���� ����.
	
	@Test //������ �׽�Ʈ�� ������ �޼ҵ� �տ� ���� ������̼�
	public void testMockSize() {
		mockedList.add("one"); // �񸮽�Ʈ�� "one"�̶�� String�� �ϳ� �߰��� ����.
		Mockito.verify(mockedList).add("one"); // "one"�� ����� �߰��Ǿ����� Ȯ��
		// �׷��� �̰� �޸𸮻󿡼� ������ mockedList��� ��ü�� one�� �߰��Ǵ� �� �ƴϴ�.
		// ���� one�� �߰��ȴٴ� "����"�� ����� �����ϴ����� Ȯ���ϴ� ��.
		// �׷��� mocekdList �ȿ� ������ "one"�̶�� String�� �߰��� ���� �ƴ�..!!
		assertEquals(0, mockedList.size());
		// �� ���Ű� �̰�. mockedList.size()�� 0�̴�.
		// ������ �̷�����ٰ� ���������� ���� "one"�� �޸𸮿� �߰��� ���� �ƴѰ�.
		//----------------------������� �׽�Ʈ �ϳ� �Ϸ�-----------------------------//
		Mockito.when(mockedList.size()).thenReturn(100); //mocekdList.size��� �޼ҵ尡 100�� ��ȯ�Ѵٸ�
		assertEquals(100, mockedList.size()); //mocekdList.size�� 100�ϰ��̴�.
	}
	
	
	 @Spy List<String> spiedList = new ArrayList<String>(); // ������ ������̼��� ���� Ŭ������ 
	 // ������ ������ �ȵǰ� ���� ��ü ������ �ؾ���. �׸��� mock��ü�ʹ� �ٸ��� ���� �޸𸮻� Ŭ������ �����ϰ� ���� �Ҵ���.
	 
	 @Test
	 public void testSpy() { 
	  spiedList.add("one"); // "one"�̶�� ��Ʈ���� �迭�� �߰�
	  spiedList.add("two"); // "two" ���� �߰�
	 
	 Mockito.verify(spiedList).add("one"); // �߰��ϴ� ������ �ߴ��� ����
	 Mockito.verify(spiedList).add("two"); // �������� 2
	 
	 assertEquals(2, spiedList.size()); // �޸𸮻� ���� ������ �Ҵ�Ʊ⶧���� �����̸���Ʈ ���� 2�� ��. }
	 }
	
	 @Mock
	 List mockList;
	 
	 @Captor
	 ArgumentCaptor argCaptor; // ���� �����͸� Ȯ���ϱ� ���� ���Ǵ� Ŭ����
	 
	 @Test
	 public void testCaptor() {
		 mockList.add("one");
		 Mockito.verify(mockList).add(argCaptor.capture());// �ѹ��� ���� �� ����.
		 
		 assertEquals("one", argCaptor.getValue()); // � ���� ������ Ȯ��
	 }
	
}
