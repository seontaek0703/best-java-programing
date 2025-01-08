# best-java-programing

[유데미 강의] 완전 초보자를 위한 Java 프로그래밍:단기간에 Java 완전 정복에 대한 강의 영상 정리입니다.

## 2025 - 01 - 03

Section 06 - steop 07 강의 내용중 유용한 내용이 있어 아래 내용을 작성함.

### Eclipse 유용한 단축키
1. ctrl + N            새로운 프로젝트 및 클래스 생성
2. ctrl + SpaceBar     축약어를 통해 생성할 수 있는 후보 코드군 표시
3. ctrl + Shift + R    생성한 클래스 중 제목을 통한 검색

### JShell, Eclipse 중요한 차이점
|JShell|Eclipse|
|-----|-----|
|식을 입력하면 값을 호출하고 변수 배정|직접 변수를 생성한 후 값을 할당해야 함|
|선언한 변수를 타입을 붙여 재선언할 수 있음|이미 선언한 변수를 재선언시 컴파일 에러|
|할당하지 않은 변수 호출 시 0을 반환|초기화하지 않은 변수를 호출하면 컴파일 에러|

### My 10 Rules for Happy Programmers
> Embrace the challenge
> 
> It's okay to fail
>  
> Practice makes perfect
>  
> Be Patient
> 
> Have fun
> 
> Do not give up
> 
> Break it down
>  
> Be persistent
>  
> Celebrate progress
>  
> Stay Curios

## 2025-01-08

### 데이터는 반드시 메서드를 거쳐서 외부에 노출되어야 하는 이유(캡슐화)

캡슐화의 주된 목적은 데이터 유효성 검사를 진행하여 예측 범위를 벗어난 데이터가 클래스에 접근하는 것을 막음.

### 캡슐화의 단계?

  1. Generate getters and setters using Eclipse. (Right-click -> Source -> Generate Getters and Setters... and select the method to generate getters and setters.) This is the first step.
  2. Create a method to handle repetitive or complex patterns and identical validation to avoid excessive typing. This is the second step.



