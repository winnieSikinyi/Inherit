fun main(){
val car = Car("rollsRoyce","phantom", "emerald", 5)
    val bus = Bus("Greyhound","eboy","scarlet",67)
    car.carry(4)
    car.carry(7)
    car.identity()
    println(car.calculateParkingFees(7))
    //
    println( bus.maxTripFare(100.5))
    println(bus.calculateParkingFee(9))
}
open class Vehicle(var make: String,var model: String,var color: String,var capacity: Int){
    open fun calculateParkingFee(){

}
}

class Car (make: String, model: String, color:String, capacity: Int):Vehicle(make,model,color,capacity){

    fun carry(people: Int){
        val x = people - capacity
        if (capacity>=people)
            println("Carrying $people passengers")
        else
            println("Over capacity by $x people")

    }
fun identity(){
    println("I am an $color $make $model")
}
   fun calculateParkingFees(hours:Int): Int{
        val parkingfees= hours * 20
    return parkingfees

    }
}
//
class Bus(make: String,model: String,color: String, capacity: Int):Vehicle (make,model,color,capacity){
    fun maxTripFare(fare:Double): Double{
        return capacity * fare
    }

    fun calculateParkingFee(hours: Int):Int{
return capacity * hours

    }



}












//Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip. (2 points)
//The bus’ calculateParkingFees method returns the product of hours and
//the capacity of the bus

