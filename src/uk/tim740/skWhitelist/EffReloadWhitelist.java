package uk.tim740.skWhitelist;

import ch.njol.skript.lang.Effect;
import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser.ParseResult;
import ch.njol.util.Kleenean;
import org.bukkit.Bukkit;
import org.bukkit.event.Event;

import javax.annotation.Nullable;

/**
 * Created by tim740 on 05/04/16
 */
public class EffReloadWhitelist extends Effect {

    @Override
    protected void execute(Event e) {
        Bukkit.reloadWhitelist();
    }

    @Override
    public boolean init(Expression<?>[] e, int i, Kleenean k, ParseResult p) {
        return true;
    }

    @Override
    public String toString(@Nullable Event e, boolean b) {
        return getClass().getName();
    }
}