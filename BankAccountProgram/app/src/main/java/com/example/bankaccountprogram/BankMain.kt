package com.example.bankaccountprogram

fun main() {

    val apostolisesBankAccount = BankAccount("Apostolis Siampanis", 10000.20)

    apostolisesBankAccount.deposit(200.0)
    apostolisesBankAccount.withdraw(1200.0)
    apostolisesBankAccount.deposit(3000.0)
    apostolisesBankAccount.deposit(2000.0)
    apostolisesBankAccount.withdraw(1000.50)

    apostolisesBankAccount.displayTransactionHistory()
    println("${apostolisesBankAccount.accountHolder}'s balance is ${apostolisesBankAccount.balance}")

}