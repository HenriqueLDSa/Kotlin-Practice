package com.example.bankaccountapp

class BankAccount (
    private var accountHolder : String,
    private var balance : Double = 0.0)
{

    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount : Double){
        balance += amount
        transactionHistory.add("Deposited $$amount to $accountHolder's account.")
    }

    fun withdraw(amount : Double){
        if(amount <= balance) {
            balance -= amount
            transactionHistory.add("Withdrew $$amount to $accountHolder's account.")
        }
        else
            println("Not enough balance.")
    }

    fun displayTransactionHistory() {
        if (transactionHistory.size > 0){
            println("Transaction history for $accountHolder:")
            for (transaction in transactionHistory) {
                println("\t" + transaction)
            }
        }
        else
            println("No transaction history to show.")
    }
    fun displayBalance(){
        println("Balance: $$balance")
    }
}