
var counter = 0

fun main(args: Array<String>){
    val input = arrayOf(1,2,3,4,5,6,7,8,9)
    val lookingFor = 2


    binarSearchRecursion(input, lookingFor, 0, high = input.size-1)

}


fun lineSearch(input: Array<Int>, lookingFor: Int){
    for (i in input){
        counter++
        if (i == lookingFor){
            println("Element = $lookingFor counter = $counter")
        }
    }

}

fun binarSearchWhile(input: Array<Int>, lookingFor: Int) : String {

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


fun binarSearchWhile2(input: Array<Int>, lookingFor: Int){
    var low = 0
    var high = input.size-1

    while (low<=high){
        val middle = low+(high-low)/2

        if (input[middle] == lookingFor){
            println("Found index $middle")
            return
        }

        if (input[middle]>lookingFor){
            high = middle-1
        } else {
            low = middle +1
        }
    }
    println("Not found")

}

fun binarSearchRecursion(input: Array<Int>, lookingFor: Int, low: Int, high: Int){

    val mid = low+(high-low)/2

    if (input[mid] == lookingFor){
        println("Index found $mid")
        return
    }

    if (low>=high){
        println("Not found")
        return
    }

    if (input[mid]>lookingFor){
        binarSearchRecursion(input, lookingFor, low, mid-1)
    } else {
        binarSearchRecursion(input, lookingFor, mid+1, high)
    }

}