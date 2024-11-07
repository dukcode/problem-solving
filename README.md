# 기억할 문제

## DP

- [부분 수열의 합이 m](https://www.codetree.ai/problems/the-sum-of-the-subsequences-is-m/description)
    - 1번만 적용됨을 보장하기 위해서 바텀업 진행 시 for문 거꾸로 스킬..
    - 탑다운 푸는 방법은 공간복잡도 `O(nm)`으로 소비하는 방법 이외에는 모르겠음 (DFS와 관련있는건지 알아보기)
- [정수 사각형 차이의 최소 2](https://www.codetree.ai/missions/2/problems/minimum-difference-on-the-integer-grid-2/description)
    - 바텀업 순서 중요, 초기값 처리 중요
- [동전 거슬러주기](https://www.codetree.ai/missions/2/problems/coin-change/description)
- [최대 동전 거슬러주기](https://www.codetree.ai/missions/2/problems/max-coin-change/description)
    - `INIT`값이랑 `IMPOSSIBLE`값이랑 잘 구분하기
- [최대 합 분할](https://www.codetree.ai/missions/2/problems/maximum-sum-partition/description)
    - `cache[idx][abs(diff)]`로 잡으면 다음에 대응하지 못함. 상태를 정확히 나타낼 수 있는 걸 찾아야함
    - `2 3 1 1 3 1`
    - `C C C A A A -> A=5, B=0 -> 불가능 처리`
    - `A A         -> A=5, B=0 -> 불가능이라고 처리됨`
- [숫자 전쟁](https://www.codetree.ai/missions/2/problems/number-war/description)
    - 현재의 정보를 이용하면 올라가야함.
- [올바른 등식 만들기](https://www.codetree.ai/missions/2/problems/right-equality/description)
    - 베이스 케이스 처리 중요

## 위상 정렬

- [친구의 키 4](https://www.codetree.ai/missions/9/problems/height-of-friends-4/description)
    - 어디서 모순이 생겼는지 파라메트릭 서치를 통해 확인