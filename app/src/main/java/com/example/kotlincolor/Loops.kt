package com.example.kotlincolor

class Loops {

    public fun getResult() : String {

        var num = 2
        var pow = 3

        var sum = 1
        for(i in 1..pow){
            sum  *= num
        }


        return sum.toString()
    }
}