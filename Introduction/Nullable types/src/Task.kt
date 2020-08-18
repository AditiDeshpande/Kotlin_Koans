fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
) {
    val email = client?.personalInfo?.email
 if(email!=null && message!=null) {
     mailer.sendMessage(email, message)
 }
}

class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}

/*
fun main(){
     val pInfo = PersonalInfo("aditid11@gmail.com")
     val clientM = Client(pInfo)
    sendMessageToClient(clientM ,"Learning Kotlin",Mailer())

    Above is incomplete didn't have knowledge of
    Interfaces in kotlin yet. Will revisit and
    modify the code accordingly
}*/