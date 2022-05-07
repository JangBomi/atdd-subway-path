<p align="center">
    <img width="200px;" src="https://raw.githubusercontent.com/woowacourse/atdd-subway-admin-frontend/master/images/main_logo.png"/>
</p>
<p align="center">
  <a href="https://techcourse.woowahan.com/c/Dr6fhku7" alt="woowacourse subway">
    <img alt="Website" src="https://img.shields.io/website?url=https%3A%2F%2Fedu.nextstep.camp%2Fc%2FR89PYi5H">
  </a>
  <img alt="GitHub" src="https://img.shields.io/github/license/woowacourse/atdd-subway-map">
</p>

<br>

# 지하철 노선도 미션
스프링 과정 실습을 위한 지하철 노선도 애플리케이션  

## 3단계 도메인 기능 요구사항  
- [ ] `상/하행 종착역`을 갖는 `구간`의 집합인 `노선`을 생성한다  
  - [ ] 새로운 `노선`은 새로운 `구간`에 속하므로, `구간`이 자동 생성된다  
- [ ] `노선`에서 `상/하행 종착역`을 구할 수 있다  

- [x] 두 `구간` 간의 관계를 구한다
  - [x] 한 `구간`은 다른 하나를 포함하거나, 서로 연장 관계거나, 무관한 관계다  

- [ ] `노선`에 `구간`을 추가한다  
  - [ ] 새로운 `구간`의 `역` 하나의 방향과 `노선`의 해당 방향 `종착역`이 일치하다면, `노선`이 연장된다  
    - ex : 노선 A-B-C + 구간 C-D => 노선 A-B-C-D
  - [ ] 새로운 `구간`의 `역` 하나가 일치하다면, 일치하지 않는 `역`을 끼인 `역`으로, 기존 `구간` 하나가 나눠진다  
    - ex : 노선 A-B-C + 구간 D-C => 노선 A-B-D-C  
  - [ ] 새로운 `구간`의 두 `역`이 이미 `노선`에 존재한다면 추가할 수 없다  
  - [ ] 새로운 `구간`의 두 `역`이 모두 `노선`에 존재하지 않는다면 추가할 수 없다

- [ ] `노선`에 `구간`을 `역` 기준으로 제거한다    
  - [ ] 해당 `역`이 `상/하행 종점역`이라면 해당 `역`을 포함한 `구간`이 삭제된다   
    - ex : 노선 A-B-C-D - 역 A => 노선 B-C-D, 구간 B-C, C-D   
  - [ ] 해당 `역`이 `상/하행 종점역`이 **아니라면**, 해당 `역`을 포함했던 두 `구간`이 삭제된다  
    - ex : 노선 A-B-C-D - 역 B => 노선 A-C-D, 구간 A-C, C-D  


<br>

## 🚀 Getting Started
### Usage
#### application 구동
```
./gradlew bootRun
```
<br>

## ✏️ Code Review Process
[텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

<br>

## 🐞 Bug Report

버그를 발견한다면, [Issues](https://github.com/woowacourse/atdd-subway-map/issues) 에 등록해주세요 :)

<br>

## 📝 License

This project is [MIT](https://github.com/woowacourse/atdd-subway-map/blob/master/LICENSE) licensed.
