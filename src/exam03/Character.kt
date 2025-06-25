package exam03

import kotlin.random.Random

abstract class Character (val maxHp: Int = 100, val maxMp: Int = 100){
    abstract val attack: Int    // 攻撃力
    abstract val defense: Int   // 防御力

    var hp: Int =  maxHp          // HPの現在値
    var mp: Int = maxMp           // MPの現在値

    // 攻撃者がターゲットにダメージを与える
    fun attackTo(target: Character): Int {
        // ダメージ量を計算する
        val calculationDamage = target.attacked(this.attack)
        target.hp -= calculationDamage

        // HPが0以下にならないようにする
        if (target.hp <= 0) {
            target.hp = 0
        }
        return calculationDamage
    }
    // ダメージを受ける処理
    fun attacked(power: Int): Int {
        var rand: Int = Random.nextInt(28, 36)
        var damage: Int = (power * 0.5 - (defense * 0.25) * (rand / 32)).toInt()
        // ダメージがマイナスにならないようにする
        if (damage <= 0) {
            damage = 0
        }
        return damage
    }
    class Human (val strength: Int, val stamina: Int, val weapons: Int, val armor: Int): Character() {
        override val attack: Int
            get() = strength + weapons
        override val defense: Int
            get() = stamina + armor
    }

    class Enemy(val Estrength: Int, val Estamina: Int, val Eweapons: Int, val Earmor: Int): Character() {
        override val attack: Int
            get() = Estrength + Eweapons
        override val defense: Int
        get() = Estamina + Earmor
    }
}
