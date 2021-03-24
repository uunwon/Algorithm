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
 
 > compare() or compareTo() 구현방식  
 > 첫번째 파라미터로 넘어온 객체 < 두번째 파라미터로 넘어온 객체 : 음수 리턴  
 > 첫번째 파라미터로 넘어온 객체 = 두번째 파라미터로 넘어온 객체 : 0 리턴  
 > 첫번째 파라미터로 넘어온 객체 > 두번째 파라미터로 넘어온 객체 : 양수 리턴  
 > 음수 또는 0이면 객체의 자리가 유지되며, 양수인 경우 두 객체의 자리가 변경된다.  
