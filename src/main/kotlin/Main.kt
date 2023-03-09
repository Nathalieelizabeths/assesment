fun main(){
    any()
    takes()
    some()
    join()

}
//1. Write and invoke a function that takes in any 2 strings and returns the first
//character of the longer string or the first character of the first string if they are
//equal in length.
fun any(){
    var names= arrayOf("nathalie","natasha")
    println(names[1])
}
//2. Write and invoke one function that takes in an array of integers and returns
//these 3 values: smallest, largest and average of all the elements
//}
fun takes(){
    var numbers= arrayOf(78,56,37,19,68,12,3,4,90,7)
    println(numbers.min())
    println(numbers.max())
    println(numbers.average())
}
//3. Write and call a function that takes in a string and splits it into all the
//characters that constitute it. Your function should print out this output.
fun some(){
    var something ="constitute"
    println(something[0])
    println(something[1])
    println(something[2])
    println(something[3])
    println(something[4])
    println(something[5])
    println(something[6])
    println(something[7])
    println(something[8])
    println(something[9])

}
//4. Write and call a function that takes in an array of strings, joins them all into
//one string and returns it.
fun join(){
    var name = arrayOf("nathalie","elizabeth")
    var nameArray= arrayOf("nathalie"+"elizabeth")
    println(nameArray.contentToString())
}