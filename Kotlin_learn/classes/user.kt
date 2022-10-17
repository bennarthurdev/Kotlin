class User{
    var name:String? = null
    var id:Int? = null
    var email:String? = null
    var cellphone:String? = null

    fun SendEmail(name : String?){
        
        println("Email should be sended to $name")
    }
    fun defineUserId(){
        id = Random.nextInt(0 , 100)
    }
    fun showUserId(){
        println("$id")
    }
    fun showUserStatus(){
        //code
    }
    fun messageVerification(){
        println("Should send aleatory code to user smartphone")
    }
}