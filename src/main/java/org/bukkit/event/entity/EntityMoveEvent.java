package org.bukkit.event.entity;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

/**
 * Raised when an entity moves.
 */
public class EntityMoveEvent extends EntityEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;
    private final Location from;
    private final Location to;

    public EntityMoveEvent(final Entity entity, final Location from, final Location to) {
        super(entity);

        this.from = from;
        this.to = to;
        
        this.cancelled = false;
    }

    /**
     * Get the previous position.
     *
     * @return Old position.
     */
    public Location getFrom() {
        return from;
    }

    /**
     * Get the next position.
     *
     * @return New position.
     */
    public Location getTo() {
        return to;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancel) {
        cancelled = cancel;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
