fun main(){
    var r: Int = 1
    
    while(r <= 100){
    	
        if(r % 3 == 0 && r % 5 == 0){
        	
            println("FizzBuzz")
            
        }
        
        else if(r % 3 == 0){
        	
            println("Fizz")
            
        }
        
        else if(r % 5 == 0){
        	
            println("Buzz")
        }
        
        else {
        	
            println(r)
        }

        r++
    }
}
    
