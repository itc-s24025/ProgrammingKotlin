package exam03

import kotlin.math.round
import kotlin.random.Random

abstract class Character (val maxHp: Int, val maxMp: Int, ){
    abstract val attack: Int    // 攻撃力
    abstract val defense: Int   // 防御力

    var hp: Int =  100          // HPの現在値
    var mp: Int = 100           // MPの現在値

//    fun attackTo(target: Character): Int {
//        target 攻撃対象
//        return target.hp - attacked()
//    }
//    fun attacked(power): Int {
//        val power: Int = 10  // 攻撃力
//        var rand: Int = Random.nextInt(28, 36)
//        var damage: Int = (power * 0.5 - (defense * 0.25) * (rand / 32)).toInt()
//        return damage
//    }
}
