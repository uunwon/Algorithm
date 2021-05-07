# 📖 JAVA STUDY

## 1. for-each 문

**for (변수타입 변수이름 : 배열이름)**  

　for each 문에서는 배열의 항목 수만큼 실행 부분을 반복하는데, 반복이 이루어질 때마다 배열의 항목을 순서대로 꺼내어 변수에 자동으로 대입해준다. 이는 배열의 값을 가져다 사용하는 것만(read)만 가능하며, 수정은(write) 불가능하다.

> **For loop** <br>
> String[] numbers = {"one", "two", "three"};  
> for(int i = 0; i < numbers.length; i++) {  
>　　　System.out.println(numbers[i]);  
> }

> **For-each loop** <br>
> String[] numbers = {"one", "two", "three"};  
> for(String number: numbers) {  
>　　　System.out.println(number);  
> }


## 2. String.format()

　해당 메소드를 사용하면 C언어의 printf 함수처럼 서식 문자열을 사용한 형식 문자열을 만들 수 있다. String 클래스의 format 메소드는 리턴되는 문자열 형태를 지정하는 함수로, 이 함수를 활용하여 Math.round() 함수와 같이 소수점 n번째 자리까지 반올림하여 나타낼 수 있다.

> double pie = 3.14159265;  
> double pie2 = 3.14;  
> System.out.println(String.format("%.2f", pie)); // 3.14  
> System.out.println(String.format("%.2f %.2f", pie, pie2)); // 3.14 3.14


## 3. next() vs nextLine()

　next() : 문자 나 문자열을 공백 기준으로 한 단어 또는 한 문자씩 입력받는다.   
　nextLine() : 문자 또는 문자 한라인 전체를 입력받는다.
  
  
## 4. <a href="https://arabiannight.tistory.com/76" target="_blank">HaspMap</a>

**Map 인터페이스를 구현한 대표적인 Map 컬렉션**  
**HashMap<String, String> hm = new HashMap<String, String>();**  

> hm.put(key, value);  
> hm.get(key);  
> hm.remove(key);  
> hm.clear();  

> hm.comtainsKey(key)  
> hm.hasNext()  

> hm.entrySet(), getKey(), getValue() // key, value 모두 필요시  
> hm.keySet(), get(key) // key 필요  
> hm.getOrDefault(key, defaultValue) // 찾는 키 존재시 찾는 키의 값 반환, 없을 시 기본값 반환  
  
  
## 5. Math.max/min

　Math.max() : 두 인자 값 중 큰 값을 리턴하는 함수  
　Math.min() : 두 인자 값 중 작은 값을 리턴하는 함수
  
  
## 6. <a href="https://jhnyang.tistory.com/92" target="_blank"> BufferedReader BufferedWriter </a>

　버퍼는 데이터를 한 곳에서 다른 한 곳으로 전송하는 동안 일시적으로 그 데이터를 보관하는 임시 메모리 영역으로, 이 함수를 이용하면 입출력 속도가 더욱 향상한다. 입출력에 사용되는 Scanner의 경우 사용하기 편리하지만 속도가 느리다는 치명적인 단점이 있다. 그러므로 많은 데이터를 입력받아야 할 상황에서는 BufferedReader를 활용하자!
 
> import java.io.*;  
> BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
> BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

> br.readLine() // String type  
> bw.write("")  
> bw.flush()  
> bw.close() br.close()  
  
  
## 7. StringTokenizer

　문자열을 지정된 구분자를 기준으로 슬라이싱하는데 사용된다. 해당 클래스는 단 한개의 구분자를 사용해야 한다는 단점이 있으므로 복잡한 형태의 구분자로 문자열을 나눠야 할 때는 Scanner 나 split을 사용해야 한다.

> StringTokenizer stk = new StringTokenizer(string);  
> StringTokenizer stk = new StringTokenizer(string, "-"); // delim 설정  

> stk.countTokens()  
> stk.hasMoreTokens()  
> stk.nextToken()  
  
  
## 8. <a href = "https://gmlwjd9405.github.io/2018/09/06/java-comparable-and-comparator.html">Interface Compararble vs Comparator </a>

　**Comparable** : 정렬 수행 시 기본적으로 적용되는 정렬 기준이 되는 메소드를 정의하는 인터페이스  
　**Comparator** : 정렬 가능한 클래스(Comparable 인터페이스를 구현한 클래스)들의 기본 정렬 기준과 다르게 정렬하고 싶을 때 사용하는 인터페이스, 기본적인 정렬 방법인 오름차순 정렬을 내림차순으로 정렬할 때 많이 사용한다.
 
 > compare() / compareTo() 구현방식  
 > 첫번째 파라미터로 넘어온 객체 < 두번째 파라미터로 넘어온 객체 : 음수 리턴  
 > 첫번째 파라미터로 넘어온 객체 = 두번째 파라미터로 넘어온 객체 : 0 리턴  
 > 첫번째 파라미터로 넘어온 객체 > 두번째 파라미터로 넘어온 객체 : 양수 리턴  
 > 음수 또는 0이면 객체의 자리가 유지되며, 양수인 경우 두 객체의 자리가 변경된다.  
  
  
## 9. Arrays.sort() vs Collections.sort()

　배열 값들이 오름차순으로 숫자 -> 알파벳 -> 한글 순으로 정렬됨  
　Comparator 인터페이스를 이용해 compare 메소드를 오버라이딩하여 메소드를 기능에 맞게 재정의할 수 있음  
 
　**Arrays.sort()**  
   - 배열을 정렬해주는 자바의 패키지
 
　**Collections.sort()**  
   - List Collection(LinkedList, Vector, ArrayList)을 정렬해주는 자바의 패키지
  
  
## 10. <a href="https://gangnam-americano.tistory.com/41"> Collection </a>

　Collection 이란 데이터의 집합ㆍ그룹을 의미하며 JCF(Java Collections Framework)는 이러한 데이터, 자료구조인 컬렉션과 이를 구현하는 클래스를 정의하는 인터페이스를 제공한다. Collection 인터페이스는 크게 List, Set, Queue 3가지 상위 인터페이스로 분류할 수 있다. Map 의 경우 Collection 인터페이스를 상속받고 있지 않지만 Collection 으로 분류된다. 이들은 배열과 다르게 정적 메모리 할당이 아닌 **동적 메모리 할당**을 한다.
 
　① **Set 인터페이스** : 순서가 중요하지 않은 목록, 중복 비허용 (HashSet, TreeSet)  
　② **List 인터페이스** : 순서가 있는 목록, 중복 허용 (ArrayList, Vector, LinkedList)  
　③ **Queue 인터페이스** : 먼저 들어온 것이 먼저 나감 (LinkedList, PriorityQueue)  
　④ **Map 인터페이스** : key-value 형태로 저장, 순서 유지되지 않음, 키 중복 비허용 but 값 중복 허용 (Hashtable, HashMap, TreeMap)  
 

## 11. Iterator

　Iterator 란 자바의 Collection 프레임워크에서 Collection 에 저장되어있는 요소들에 순차적으로 접근하며 읽어오는 방법을 표준화한 것이다.
 
 > hasNext() : 읽어올 요소가 남아있는지 확인  
 > next() : 다음 데이터 반환   
 > remove() : next() 로 읽어온 요소 삭제  


## 12. 배열 출력

　배열이름.toString() : 배열의 주소 값 출력  
　**Arrays.toString(배열이름)** : 배열의 내용 출력


## 13. <a href = "https://codechacha.com/ko/java-sort-map/"> Map 정렬 방법 </a>

　① **LinkedHashMap**  
 　　LinkedHashMap 은 Map 에 입력한 순서가 보장되는 클래스다.  
 　　HashMap 을 원하는 순서대로 정렬하고 이 순서대로 다시 LinkedHashMap 에 입력하면 정렬된 순서대로 출력할 수 있다.  
   
　② **TreeMap**  
 　　TreeMap 은 아이템을 추가할 때 설정한 Comparator 로 정렬되어 저장되도록 구현된 클래스다.  
 　　따라서 값을 추가한 후에 다시 정렬할 필요가 없다.  
 > Comparator<String> comparator = (s1, s2) -> s2.compareTo(s1);  
 > TreeMap<String, String> tmap = new TreeMap<>(comparator);  

　③ **List**  
 　　keySet 또는 values 를 List 로 가져온 후에, 정렬하는 방법이다.  
 　　둘 중에 한 종류만 정렬이 필요한 경우 이 방법을 사용한다.  


## 14. Stack (스택) 클래스 

　자료구조 중 하나인 스택의 사전적 정의는 '쌓다', '더미' 이다. 상자에 물건을 쌓아 올리듯이 데이터를 쌓아 올리는 자료구조다. 스택의 가장 큰 특징은 나중에 들어간 것이 먼저 나오는 LIFO(Last In First Out) 의 형태를 띄는 것이다. 자바에서 Stack 은 java.util.Stack 을 import 하여 사용할 수 있다. 또한 그래프의 **깊이 우선 탐색(DFS)** 과 **재귀적(Recursion) 함수**를 호출 할 때 사용된다.  
 
  > import java.util.Stack;  
  > Stack<String> stack = new Stack<>();  

  > public Element push(Element item);  
  > public Element pop();   
  > public Element peek(); // 가장 상단 값 출력  
  > public boolean empty();  
  > public int search(Object o); // 인자값으로 받은 데이터의 위치 반환  


## 15. Queue (큐) 클래스 

　큐의 사전적 의미는 무엇을 기다리는 사람, 차량 등의 줄 혹은 줄을 서서 기다리는 것을 의미한다. 큐는 데이터를 일시적으로 쌓아두기 위한 자료구조로 스택과는 다르게 FIFO(First In First Out) 의 형태를 가진다. 자바에서 Queue 는 java.util.Queue 를 import 하여 사용할 수 있다. 또한 그래프의 **넓이 우선 탐색(BFS)** 와 **컴퓨터 버퍼** 에서 주로 사용된다.
 
  > import java.util.LinkedList;  
  > import java.util.Queue;  
  > Queue<String> queue = new LinkedList<>();  

  > public void offer(Element data);  
  > public Element poll();   
  > public Element peek(); // 가장 상단 값 출력  
  > public boolean empty();  


## 16. <a href="https://ifuwanna.tistory.com/221"> String vs StringBuffer vs StringBuilder </a>

　String 과 두 클래스의 차이점은 String 은 **불변(immutable)** 의 속성을 갖는다는 점이다. 불변성을 지니기 때문에 변하지 않는 문자열을 자주 읽어들이는 경우 String을 사용하면 좋은 성능을 기대할 수 있다. 그러나 문자열 추가ㆍ수정ㆍ삭제 등의 연산이 빈번하게 발생할 때 String 클래스를 사용하면 힙 메모리(Heap) 메모리에 많은 임시 가비지(Garbage)가 생성되어 성능에 치명적인 영향을 끼친다. 이같은 상황에서 **가변성(mutable)** 을 가지는 StringBuffer/StringBuilder 클래스를 도입하면 동일한 객체 내에서 문자열을 변경하는 것이 가능하다.
 
　StringBuffer 와 StringBuilder 의 차이점은 **동기화의 유무**다. StringBuffer는 동기화를 지원하여 멀티쓰레드 환경에서 안전(thread-safe)하다. 반대로 StringBuilder는 동기화를 지원하지 않아 멀티쓰레드 환경에는 적합하지 않지만, 단일쓰레드에서의 성능은 뛰어나다.
 
  > StringBuffer sb = new StringBuffer("hello");  
  > sb.append(" world");  


## 17. 접근제어자

　① **private** : 변수, 메소드는 해당 클래스에서만 접근 가능  
　② **default** : 접근제어자를 별도로 설정하지 않으면 해당 default 처리되어 해당 패키지 내에서만 접근 가능  
　③ **protected** : 변수, 메소드는 동일 패키지 내의 클래스 또는 해당 클래스를 상속받은 외부 패키지의 클래스에서 접근 가능  
　④ **public** : 변수, 메소드는 어떤 클래스에서라도 접근 가능  


## 18. JVM (Java Virtual Machine)

　JVM은 자바 가상 머신의 약자이다. (가상머신이란 프로그램 실행을 위해 물리적 머신과 유사한 머신을 소프트웨어로 구현한 것) JVM 역할은 자바 애플리케이션을 클래스 로더를 통해 읽어 들여 자바 API와 함께 실행하는 것이다. 이는 자바와 운영체제 사이의 중개자 역할을 수행하여 자바가 **운영체제에 구애받지 않고 재사용**할 수 있게 해준다. JVM 은 다음과 같은 역할을 한다.
 
  > 바이너리 코드를 읽는다.  
  > 바이너리 코드를 검증한다.  
  > 바이너리 코드를 실행한다.  
  > 실행환경(Runtime Environment)의 규격을 제공한다. (필요한 라이브러리 및 기타파일)


## 19. Wrapper 클래스

　자바의 자료형은 크게 기본 타입(primitive type)과 참조 타입(reference type)으로 나눠진다. 자바는 기본적으로 객체 지향 언어이므로 객체를 대상으로 처리하는 경우가 많다. 이럴 때 기본 자료 타입을 객체로 다루기 위해서 사용하는 클래스들을 Wrapper 클래스라고 한다. Byte, Short, Integer, Long, Character, Double, Float, Boolean 클래스 등이 기본 데이터 타입에 해당되는 Wrapper 클래스이다. Wrapper 클래스들은 java.lang 패키지에서 제공된다.

 > Integer i = new Integer(10);  
 > Boolean b = new Boolean(true);

　기본 데이터 타입을 Wrapper 클래스로 변환하는 것을 **박싱(boxing)** 이라 하고, 반대의 경우를 **언박싱(unboxing)** 이라고 칭한다. 이는 JDK 1.5 부터 자동으로 이루어지며, 자동 박싱ㆍ자동 언박싱이라고 부른다.
 
 > Integer ten = new Integer(10); // 박싱  
 > int i = ten.intValue(); // 언박싱  


## 20. 객체 지향 언어의 특성

- 캡슐화 (Encapsulation)  
　캡슐화란 객체를 캡슐로 싸서 그 내부를 보호하고 볼 수 없게 하는 것을 말한다. 실세계와 달리 자바에서 객체는 메소드(함수)와 필드(데이터 변수)로 구성된다. 클래스(class)라는 캡슐을 사용하여 객체를 표현하며 메소드(method)와 필드(field)를 클래스 내에 구현한다. 몇몇 메소드와 필드는 객체 외부와의 인터페이스를 위해 노출한다. 캡슐화의 궁극적인 목적은 객체 내 데이터에 대한 보안, 보호, 외부 접근 제한 등을 위한 것이다. 외부에서 클래스 내부의 데이터 접근을 금지하는 것을 **정보 은닉화** 라고 한다.  
- 상속 (Inheritance)  
　상속은 상위 개체의 속성이 하위 개체에 물려져서, 하위 개체가 상위 개체의 속성을 모두 가지고 있음을 의미하는 관계이다. 자바에서 상속은 부모 클래스(super class)의 속성을 자식 클래스(sub class)가 물려받는 개념이다. 상속은 이미 만들어진 클래스의 필드와 메소드를 물려받게 함으로써 자바 코드르이 중복 작성을 방지하여 코드 작성에 드는 시간과 비용을 줄일 수 있게 한다. 즉, 상속은 **코드의 재사용** 을 가능케 한다.  
- 다형성 (Polymorphism)  
　다형성은 같은 이름의 메소드 호출에 대해 객체에 따라 다른 동작을 할 수 있도록 구현되는 것을 의미한다.   


## 21. 동기적 vs 비동기적 프로그래밍

　동기적(Synchronous) 프로그래밍은 요청과 그에 따른 결과가 동시에 일어나는 것으로, 특정 작업을 완료한 후 다음 작업으로 넘어간다. 따라서 서브 루틴 간에 명확한 실행 순서가 존재한다. 이는 설계가 간단하고 직관적이지만 결과가 나올 때까지 대기해야 한다는 단점이 있다.
 
　비동기적(Asynchronous) 프로그래밍은 요청과 그에 따른 결과가 동시에 일어나지 않는 것으로, 특정 작업을 수행하는 도중에도 다음 작업으로 계속 내려가며 수행한다. 이러한 방식은 동기적 프로그래밍보다 복잡하지만 결과가 주어지는데 시간이 걸리더라도 동시에 다른 작업을 수행할 수 있기에 자원을 효율적으로 사용할 수 있다는 장점이 있다.
