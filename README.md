레퍼런스: https://github.com/CodeSoom

# 자료구조와 알고리즘 1주차 과제
1. 총합 구하기
2. 피보나치 수
3. 이진수로 변환하기 
4. 이진수 10진수로 변환하기
5. 유클리드 호제법으로 최대 공약수 구하기
6. 계단 오르기


## week1 - 재귀 함수

1. **일반 재귀 함수:**
    - 일반 재귀 함수는 자신을 호출할 때마다 새로운 스택 프레임을 생성합니다. 이 스택 프레임은 해당 함수 호출에 대한 정보(지역 변수, 매개변수, 반환 주소 등)를 저장함
    - 각 호출이 끝난 후에는, 이전 호출로 되돌아가기 위해 이전 스택 프레임의 정보가 필요함

2. **꼬리 재귀 함수:**
    - 꼬리 재귀 함수에서는 함수의 마지막 작업이 바로 다음 재귀 호출이며, 그 이전에 모든 필요한 계산이 완료됨
    - 이러한 꼬리 재귀의 특성으로 인해, 이전 호출의 스택 프레임 정보를 '기억'할 필요가 없어짐. 그러나 이것만으로는 스택 프레임이 자동으로 재활용되지는 않음

3. **꼬리 재귀 최적화:**
    - 꼬리 재귀 최적화는 꼬리 재귀 함수에 대한 컴파일러 또는 런타임의 특별한 처리 방식을 의미함
    - 최적화란 컴파일러 또는 런타임은 꼬리 재귀 함수 호출을 반복문처럼 처리하여, 새로운 스택 프레임을 생성하는 대신 이전 호출의 스택 프레임을 재활용
    - 결과적으로, 꼬리 재귀 최적화는 메모리 사용을 줄이고, 재귀 함수의 성능을 개선하는 것을 뜻함
    - 자바에서는 그런 최적화가 자동으로 적용되진 않으나 Scala 등에서는 지원함


# 자료구조와 알고리즘 2주차 과제
1-1 백 구현하기
1-2 숫자들의 평균 구하기
2-1 스택 구현하기
2-2 괄호의 짝이 맞는지 확인하기
3-1 큐 구현하기
3-2 요세푸스 문제
