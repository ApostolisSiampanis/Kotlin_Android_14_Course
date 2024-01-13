package com.example.rockpaperscissors

fun main(){

    var computerChoice = ""
    var playerChoice = ""
    println("Rock, Paper or Scissors? Enter your choice!")
    playerChoice = readln()

    val randomNumber = (1..3).random()

    when (randomNumber) {
        1 -> {
            computerChoice = "Rock"
        }
        2 -> {
            computerChoice = "Paper"
        }
        3 -> {
            computerChoice = "Scissors"
        }
    }
    println(computerChoice)

    val winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }

    if(winner == "Tie"){
        println("It's a tie!")
    } else {
        println("$winner won!")
    }

}