fun main(){
 var currentAccount=Currentaccount("096738","John Alinda",20000)
 var savingsAccount=SavingsAccount("72984","Laura Alinda",23000)

    var increament=(currentAccount.deposit(3000.0))
    println(currentAccount.balance)
    var decreament=(currentAccount.withdraw(2000.0))
    println(currentAccount.balance)
    currentAccount.details()

    savingsAccount.save(3)

    var product=Product("tomatoes",56,20000,"groceries")
   var things=prdct(listOf("tomatoes","vaseline","irishpotatoes"))

    names("banana")




}
open class Currentaccount(var accountNumber: String,var accountName: String,var balance: Int){


    fun deposit(amount:Double):Double{
        var amount=3000.0
      amount+=balance
      return amount

    }
    fun withdraw(amount:Double):Double{
        var amount=2000.0
       amount-=balance
        return amount

    }
    fun details(){
        println("Account number $accountNumber with balance $balance is operated by $accountName")
    }
}
class SavingsAccount( accountNumber: String, accountName: String, balance: Int):Currentaccount(accountNumber,accountName, balance){
    fun save(withdrawals:Int){
        if(withdrawals<4){
            println(balance)

        }
    }


}
data class Product(var name: String, var weight: Int,var price: Int,var category: String)
 fun prdct(List<String>){

 }
fun names(nam:String):Char{
    var w=0
    nam.forEach{x->
        if((nam.index%2)==0){

        }
    }
    return  w
}