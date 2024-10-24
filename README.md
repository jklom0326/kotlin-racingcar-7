# kotlin-racingcar-precourse

# 기능 요구 사항

- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
- 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 무작위 값을 구한 후 무작위 값이 4 이상일 경우이다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.
- 우승자가 여러 명일 경우 쉼표(,)를 이용하여 구분한다.
- 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시킨 후 애플리케이션은 종료되어야 한다.


# 기능 목록

> 초간단 자동차 경주 게임을 구현한다

### Application

- [ ] 자동차 경주 게임을 시작한다.

### RacingGame

- [ ] 자동차 생성하기
- [ ] 라운드 횟수 입력 받기

### Car

- [ ] 이름 입력 받기
- [ ] 이동하기

### Computer

- [ ] 결과를 출력하기
- [ ] 이동 횟수 만큼 출력하기
- [ ] 우승자 판단

### 예외 처리

- 자동차 이름 예외
    - 자동차 이름이 5자 초과일 때
    - 이름이 비어있을 때
    - 같은 이름이 있을 때
- 횟수 예외
    - 횟수는 숫자여야 한다.
    - 0보다 큰 숫자여야 한다.