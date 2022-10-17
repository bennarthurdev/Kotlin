fun main(args: Array<String>){
    
    val name = "Ricardo"
    println("Olá $name")
    
    var variableValue = "An value"
    println("variableValue = $variableValue")
    
    variableValue = "New value"
    println("variableValue = $variableValue")
    
    val CONSTANT = "Don't assing new values"
    println("CONSTANT = $CONSTANT")
    
    CONSTANT = "New value" //Val cannot be reassigned
}