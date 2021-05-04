# 자동차 경주 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 구현계획 
1. 자동차 클래스를 만들고 테스트한다. 
    - create : 생성자 - 이름   
    - property : 이름, 전진 횟수, randomValue
    - method : 
        - 랜덤 값 찾기 : 1-9 사이의 값 중, 1개의 숫자를 뽑는다.
        - 전진하기 : randomValue 값 검증, 4이상 전진, 3이하 멈춘다 => x > 3 => 전진     
        - 결과 출력 : 전진횟수만큼 String을 append 하여 출력한다.     
        
2. inputNumber 클래스를 만들고 테스트한다. 
    - create : 생성자 - 숫자형 문자열 
    - property : 게임 진행 횟수 
    - method : 
        - 숫자형 문자열 검증 : 입력받은 문자형이 숫자형으로 parse 되는지 검증 
        - 0 초과 테스트 : 입력받은 값이 0을 초과하는지 검증 
        
3. inputCarName 클래스를 만들고 테스트한다. 
    - create : 생성자 - ,로 구분되는 String 
    - property : 검증 여부, 이름을 담을 array 
    - method : 
        - 이름 배열 생성 : ","를 구분자로 입력받은 문자열을 분리하여 String Array 생성
        - 5자 이하 테스트 : 분리된 각 문자열이 5자 이하 인지 검증
         
4. Cars 클래스를 만들고 테스트한다. - 일급 콜렉션 사용 
    - create : 생성자 - List<Car> 게임에 참여하는 자동차 리스트 
    - property : 자동차 리스트, 승자 리스트 
    - method :
        - 전진 : 각 자동차의 전진 메서드를 call  
        - 전진 횟수 check : 각 자동차의 전진 횟수와 게임 진행 횟수를 비교한다. for 안에서 진행횟수 i--로 내려오면서 횟수 i만큼 전진한 자동차를 찾는다. 
        - 승자 리스트 추가 : 위 메서드에서 카운트가 일치하는 자동차를 승자 리스트에 담는다.
        - 승자 이름 출력 : 승자 리스트의 이름을 String에 담아 return 

5. Game 클래스를 만들고 테스트한다. 
    - create : 생성자 - 총 게임진행횟수
    - property : 총 게임진행횟수, 현재진행횟수
    - method : 
        - 게임 진행 : 총 게임진행횟수와 현재진행횟수가 같아질 때까지 게임을 진행시킨다. 각 회차가 종료될 때 현재진행횟수는 1씩 증가한다.
        - 게임 종료 : 총 게임진행횟수와 현재진행횟수가 같아지면 게임을 종료하고, 최종 승자의 이름을 출력한다.
        
6. RacingGame 클래스를 만든다. 
    - create : x
    - property : x
    - method : 
        - main : 프로그램을 실행하고 scanner를 통해 입력값을 받는다. 
      