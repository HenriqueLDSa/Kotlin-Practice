package com.example.trycatchfinally

fun main(){

    print("Please enter a number: ")

    try{
        val number = readln().toInt()
        print("\nUser entered number: $number")
    } catch (e : Exception){
        print("Error: $e")
    } finally {
        println("\nThis will be printed regardless of error or no error.")
    }


}