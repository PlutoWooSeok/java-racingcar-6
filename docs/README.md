# 미션 - 자동차 경주
****
## 미션 내용 정리
###  🚀 게임 시작
- 경주할 자동차 이름 부여 
  - 이름은  5자 이하만 가능
  - 주어진 자동차는 쉼표(,)를 기준으로 구분 
<br><br>
  
- 이동을 시도할 횟수 입력
  - 사용자의 이동 횟수를 정한다
  - 자동차는 전진 또는 정지를 할 수 있다.
    - 전진하는 조건 : 0~9 사이의 무작위 값을 구한 후 무작위 값이 4이상일 경우
    - 무작위의 값은  <B><I> " - "</I> </B> 로 표현된다.
<br><br>

- 게임 종료
    - 자동차 경주 게임 종료 시 우승자 발표
    - 우승자는 1명 이상일 수 있으며. 쉼표(,)를 이용하여 구분한다.


```
🚨 비정상적인 종료 발생
    : 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException 을 발생시킨 후 애플리케이션 종료
```

---
## 구현 기능
###### MVC 방식을 최대한 활용할 예정이다.

### MVC 기반의 기능
****
#### 1. Model

- carName(자동차 이름)에 대한 데이터 저장
 <br><br>
- moveNumber(이동 횟수)에 대한 데이터 저장
  <br><br>
- moveValidationNumber (전진과 멈춤을 판단하는 랜던 값)에 대한 데이터 저장
  <br><br>
****
#### 2. View
- OutputView
  - " 경주 할 자동차 이름(이름은 쉼표(,) 기준으로 구분)" 이라는 메세지 출력
  - 각 차수별 실행 결과 출력
    - 실행결과는 <B><I> " - "</I> </B> 로 표현한다.
  - 우승자 안내 문구 출력
  <br><br>
- InputView
  - 자동차 이름 입력
  - 이동을 시도할 횟수 입력
  <br><br>
****
#### 3. Controller
- RacingController
  -camp.nextstep.edu.missionutils에서 제공하는 Randoms API 사용<br>
    : Random 값 추출은 camp.nextstep.edu.missionutils.Randoms의 pickNumberInRange()를 활용

  - 우승자 판단하기
    : 1. 단독 우승일 경우 : 단독 우승자만 출력되게 한다.
    : 2. 공동 우승자일 경우 : 쉼표를 활요한다.<br>
        -> 이동한 거리가 같은 경우를 판단하여 가장 멀리간 거리가 같은 경우를 판단

  - 숫자의 유효성 판단 -> 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시킨 후 애플리케이션은 종료
    - 유효한 경우 ( 유효하지 않은 경우 )
        : 1. 0~9 사이의 수 입력
        : 2. 우승자가 없는 경우 - 모든 자동차가 출발하지 못한경우