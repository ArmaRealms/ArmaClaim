package com.griefprevention.events;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;

public class PlayerTradeClaimBlocksEvent extends PlayerEvent
{

    private final int amount;
    private final double price;
    private final TradeType type;

    /**
     * Event called when a player trades claim blocks.
     *
     * @param player the player who trades the claim blocks
     * @param amount the amount of claim blocks traded
     * @param price the total price of the trade
     * @param type the trade type
     */
    public PlayerTradeClaimBlocksEvent(
            @NotNull Player player,
            int amount,
            double price,
            @NotNull TradeType type
    )
    {
        super(player);
        this.amount = amount;
        this.price = price;
        this.type = type;
    }

    public int getBlockAmount()
    {
        return amount;
    }

    public double getPrice()
    {
        return price;
    }

    public TradeType getTradeType()
    {
        return type;
    }

    public enum TradeType
    {
        BUY,
        SELL
    }

    private static final HandlerList HANDLERS = new HandlerList();

    public static HandlerList getHandlerList()
    {
        return HANDLERS;
    }

    @Override
    public @NotNull HandlerList getHandlers()
    {
        return HANDLERS;
    }
}
