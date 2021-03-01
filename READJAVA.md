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
