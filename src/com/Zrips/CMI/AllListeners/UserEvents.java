package com.Zrips.CMI.AllListeners;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerTeleportEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.events.CMIUserBalanceChangeEvent;

public class UserEvents implements Listener {
    private CMI plugin;

    public UserEvents(CMI plugin) {
        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onCMIUserBalanceChangeEvent(CMIUserBalanceChangeEvent event) {

    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onPlayerLoginNameCheck(PlayerLoginEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerLoginNewNameCheck(PlayerLoginEvent event) {

    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onPlayerLogin(PlayerLoginEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerLoginIpRecord(final PlayerLoginEvent event) {

    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onPlayerDeath(PlayerDeathEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void teleportBack(PlayerTeleportEvent event) {

    }

    private HashMap<UUID, Long> weMap = new HashMap<UUID, Long>();

    @EventHandler(priority = EventPriority.LOWEST)
    public void teleportBackWECompasss(PlayerInteractEvent event) {

    }

    HashMap<UUID, Long> roofTeleporterDelay = new HashMap<UUID, Long>();

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerDeath(PlayerMoveEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerMoveBelow(PlayerMoveEvent event) {

    }

    HashMap<UUID, Long> informer = new HashMap<UUID, Long>();

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onPlayerFlyToHigh(PlayerMoveEvent event) {

    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onPlayerQuit(PlayerQuitEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void removeFromRankCheck(PlayerQuitEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerLogin(PlayerJoinEvent event) {

    }
}
