package com.example.rockpaperscissors

fun main(){
    var computerChoice : String
    var playerChoice : String
    val choices  = arrayOf("Rock", "Paper", "Scissors")

    do {
        println("Rock, paper, or scissors? (Q to QUIT)")
        println("A. Rock")
        println("B. Paper")
        println("C. Scissors")
        print("\nChoice: ")

        playerChoice = readln().uppercase()
        computerChoice = choices[(1..3).random()]

        playerChoice = when(playerChoice){
            "A" -> "Rock"
            "B" -> "Paper"
            "C" -> "Scissors"
            else -> {
                print("\nINVALID CHOICE! Choose a letter.\n\n")
                continue
            }
        }

        if (playerWins(playerChoice, computerChoice)) {
            print("\nYOU WON!\n\n")
        }
        else if (playerChoice == computerChoice){
            print("\nIT'S A TIE!\n\n")
        }
        else{
            print("\nYOU LOST!\n\n")
        }

    } while (playerChoice != "Q")
}

fun playerWins(playerChoice : String, computerChoice : String): Boolean {
    return (playerChoice == "Rock" && computerChoice == "Scissors") ||
        (playerChoice == "Paper" && computerChoice == "Rock") ||
        (playerChoice == "Scissors" && computerChoice == "Paper")
}