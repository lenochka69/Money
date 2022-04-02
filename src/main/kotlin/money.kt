fun main() {
    val amount = 50000.0
    val minСommission = 35.0
    val commission = if (amount * (0.75 / 100) > minСommission) amount * (0.75 / 100) else minСommission
    println("При переводе: $amount рублей, комиссия составит: $commission рублей")
}