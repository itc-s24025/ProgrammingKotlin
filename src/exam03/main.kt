package exam03

fun main() {
    val player = Character.Human(50, 50, 5, 5)
    val goblin = Character.Enemy(10, 10, 1, 1)

    val damageFromPlayerToGoblin = player.attackTo(goblin)
    val damageFromGoblinToPlayer = goblin.attackTo(player)

    println("初期状態")
    println("プレイヤーHP: ${player.maxHp} 　| ゴブリンHP: ${goblin.maxHp}")
    println("プレイヤー攻撃力: ${player.attack} | ゴブリン攻撃力: ${goblin.attack}")
    println("プレイヤー防御力: ${player.defense} | ゴブリン防御力: ${goblin.defense}")

    println("--------------------------")
    println("プレイヤーがゴブリンに${damageFromPlayerToGoblin}のダメージを与えた")
    println("ゴブリンHP: ${goblin.hp}")

    println("--------------------------")
    println("ゴブリンにプレイヤーが${damageFromGoblinToPlayer}のダメージを与えた")
    println("プレイヤーHP:　${player.hp}")

}



