package me.nekoya3.discord.bot.command

import com.jagrosh.jdautilities.command.Command
import com.jagrosh.jdautilities.command.CommandEvent

class HelloCommand : Command() {

    init {
        name = "hello"
        help = "あいさつするだけ"
    }

    override fun execute(event: CommandEvent) {
        event.reply("こんにちは、${event.author.name}さん！")
    }
}