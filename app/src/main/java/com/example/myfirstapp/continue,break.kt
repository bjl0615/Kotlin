package com.example.kotlibasics

fun main() {
    // 11을 2로 나누면 5.5가 나온다 정수형으로 인지되어 소수점이 없다 그래서 11은 코드값은 5로 나온다
    // 10 / 2 = 5
        // 11/2 = 5.5 소스점 무시
    for(i in 1 until 20) {
        print("$i ")
            if(i/2 == 5) {
                continue
            }
    }
    print("Done with the loop")
}