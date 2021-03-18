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

 
## 4. <a href="https://arabiannight.tistory.com/76">HaspMap</a>

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
