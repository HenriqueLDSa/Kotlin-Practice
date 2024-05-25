package com.example.bankaccountapp

import kotlin.system.exitProcess

fun main(){

    print("Would you like to open a new account [YES/NO]? ")
    var choice : String = readln()
    val newAccount : BankAccount

    if (choice.lowercase() == "yes"){
        print("Enter your name: ")
        choice = readln()
        choice = choice[0].uppercase() + choice.substring(1).lowercase()
        newAccount = BankAccount(choice)
    }
    else{
        println("Sad to see you go. Goodbye!")
        exitProcess(0)
    }

    println("\n" + "Select a transaction: ")

    while (choice.lowercase() !in listOf("5", "quit")){
        displayTransactionOptions()
        choice = readln()
        when (choice.lowercase()){
            "1", "deposit" -> {
                print("Enter amount: ")
                val amount : Double = readln().toDouble()
                newAccount.deposit(amount)
            }
            "2", "withdraw" -> {
                println("Enter amount: ")
                val amount : Double = readln().toDouble()
                newAccount.withdraw(amount)
            }
            "3", "check balance" -> {
                newAccount.displayBalance()
            }
            "4", "transaction history" -> {
                newAccount.displayTransactionHistory()
            }
            "5", "quit" -> {
                println("Goodbye!")
                exitProcess(0)
            }
            else ->{
                println("Invalid choice!")
            }

        }
    }
}

fun displayTransactionOptions(){
    println("1. Deposit")
    println("2. Withdraw")
    println("3. Check balance")
    println("4. Show transaction history")
    println("5. Quit")
}