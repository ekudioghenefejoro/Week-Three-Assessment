

   
var reverse : String = ""

fun reverseString(str: String): String {

    if (str.length == 1) {
       
        return str
    } 
    
    else {
        
        reverse += str[str.length - 1] + reverseString(str.substring(0, str.length - 1))
       
        return reverse
    }
}

fun main(args: Array<String>) {
   
    var str = "Good food"
   
    println("Original string : "+str)
    
    println("Reversed string : " + reverseString(str))
}


    
