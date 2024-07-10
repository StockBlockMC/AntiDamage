package uk.co.hopperelec.mc.antidamage;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public final class AntiDamagePlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this,this);
    }

    @EventHandler
    public void onEntityDamage(@NotNull EntityDamageEvent event) {
        event.setCancelled(true);
    }

    @EventHandler
    public void onEntityHunger(@NotNull FoodLevelChangeEvent event) {
        event.setCancelled(true);
    }
}
