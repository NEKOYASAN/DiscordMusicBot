package me.nekoya3.discord.bot

import com.jagrosh.jdautilities.command.CommandClientBuilder
import io.ktor.application.*
import me.nekoya3.discord.bot.command.HelloCommand
import net.dv8tion.jda.api.JDA
import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.OnlineStatus
import net.dv8tion.jda.api.entities.Activity

private lateinit var jda: JDA
private const val TOKEN = "TOKEN"
private const val COMMAND_PREFIX = "."

fun main(args: Array<String>) {
    val commandClient = CommandClientBuilder()
        .setPrefix(COMMAND_PREFIX)
        .setStatus(OnlineStatus.ONLINE)
        .setActivity(Activity.streaming("music", "https://musicbot.nekoya3.me/"))
        .addCommand(HelloCommand())
        .build()

    jda = JDABuilder.createDefault(TOKEN)
        .addEventListeners(commandClient)
        .build()
    io.ktor.server.netty.EngineMain.main(args)
}


/**
 * Please note that you can use any other name instead of *module*.
 * Also note that you can have more then one modules in your application.
 * */
@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {
}

