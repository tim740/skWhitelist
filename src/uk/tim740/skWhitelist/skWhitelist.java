package uk.tim740.skWhitelist;

import ch.njol.skript.Skript;
import ch.njol.skript.lang.ExpressionType;
import org.bukkit.OfflinePlayer;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by tim740 on 03/10/2016
 */
public class skWhitelist extends JavaPlugin {

    @Override
    public void onEnable() {
        Skript.registerAddon(this);
        Skript.registerEffect(EffReloadWhitelist.class, "reload whitelist");
        Skript.registerExpression(SExprWhitelist.class, OfflinePlayer.class, ExpressionType.PROPERTY, "whitelist");
        Skript.registerCondition(CondServerWhitelist.class, "server is whitelisted", "server is(n'| no)t whitelisted");
        Skript.registerCondition(CondPlayerWhitelist.class, "%player% is whitelisted", "%player% is(n'| no)t whitelisted");
    }
}
