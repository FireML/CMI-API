package com.Zrips.CMI.Modules.BungeeCord;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.Bukkit;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.BungeeCord.ServerListPing.StatusResponse;

import net.Zrips.CMILib.Colors.CMIChatColor;
import net.Zrips.CMILib.Logs.CMIDebug;
import net.Zrips.CMILib.Version.Schedulers.CMIScheduler;

public class BungeeCordServer {

    private String name;
    private String ip;
    private Integer port;
    private String motd = "";
    private int maxPlayers = 0;
    private int currentPlayers = 0;
    private Long nextCheck = 0L;
    private boolean online = false;

    private ConcurrentHashMap<String, BungeePlayer> playersMapUUID = new ConcurrentHashMap<String, BungeePlayer>();
    private ConcurrentHashMap<String, BungeePlayer> playersMapName = new ConcurrentHashMap<String, BungeePlayer>();

    public BungeeCordServer(String name, String ip, Integer port) {
        this.name = name;
        this.ip = ip;
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getMotd() {
        return motd;
    }

    public void setMotd(String motd) {
        this.motd = motd;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public int getCurrentPlayers() {
        int total = 0;
        Iterator<Entry<String, BungeePlayer>> iter = playersMapName.entrySet().iterator();
        while (iter.hasNext()) {
            BungeePlayer user = iter.next().getValue();
            if (user.getVanished())
                continue;
            total++;
        }
        return total;
    }

//    public void setCurrentPlayers(int currentPlayers) {
//	this.currentPlayers = currentPlayers;
//    }

    public Long getNextCheck() {
        return nextCheck;
    }

    public void setNextCheck(Long nextCheck) {
        this.nextCheck = nextCheck;
    }

    public void update() {

    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public ConcurrentHashMap<String, BungeePlayer> getPlayersMapUUID() {
        return playersMapUUID;
    }

    public BungeePlayer getPlayer(UUID uuid) {
        return playersMapUUID.get(uuid.toString());
    }

    public BungeePlayer getPlayer(String name) {
        return null;
    }

    public void addPlayer(BungeePlayer player) {
        if (player.getUniqueId() != null)
            this.playersMapUUID.put(player.getUniqueId().toString(), player);
        if (player.getName() != null)
            this.playersMapName.put(player.getName().toLowerCase(), player);
    }

    public void removePlayer(UUID uuid, String name) {
        this.playersMapUUID.remove(uuid.toString());
        this.playersMapName.remove(name.toLowerCase());
    }

    public void clearPlayers() {
        if (playersMapUUID != null)
            this.playersMapUUID.clear();
        if (playersMapName != null)
            this.playersMapName.clear();
    }

    public ConcurrentHashMap<String, BungeePlayer> getPlayersMapName() {
        return playersMapName;
    }
}
