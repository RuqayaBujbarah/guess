fun main(){
    val num = (1..9).random()
    var num2 = 0

    try
    {print("Guess a number between 0 and 10: ")
        num2 = readLine()!!.toInt()
        if(num2<=0||num2>=10){
            println("Please enter numbers between 0 and 10 only.")
        }
    else if(num2==num){
        println("You got it!")
    }
        else{
        println("Wrong guess! The number was $num")
        }
    }
    catch(e: Exception){
        println("Please enter numbers only.")
    }
    println("Game Over")
}