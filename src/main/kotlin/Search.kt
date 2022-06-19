
var counter = 0

fun main(args: Array<String>){

    val input = arrayOf(1,2,3,4,5,6,7,8,9)
    val lookingFor = 8

    println(binarSerchWhile(input, lookingFor))



}


fun lineSearch(input: Array<Int>, lookingFor: Int){
    for (i in input){
        counter++
        if (i == lookingFor){
            println("Element = $lookingFor counter = $counter")
        }
    }

}

fun binarSerchWhile(input: Array<Int>, lookingFor: Int) : String {

    var low = 0
    var high = input.size-1

    while (low <= high){
        val mid = low+(high-low)/2

        if (lookingFor < input[mid]){
            high = mid -1
        } else if(lookingFor > input[mid]){
            low = mid + 1
        } else {
            return "Found ${input[mid]}"
        }
    }
    return "Not found"

}