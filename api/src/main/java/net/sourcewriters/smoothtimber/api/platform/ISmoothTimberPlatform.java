package net.sourcewriters.smoothtimber.api.platform;

import java.util.UUID;

import net.sourcewriters.smoothtimber.api.platform.event.manager.IPlatformEventAdapter;
import net.sourcewriters.smoothtimber.api.platform.world.IPlatformWorld;
import net.sourcewriters.smoothtimber.api.platform.world.entity.IPlatformPlayer;
import net.sourcewriters.smoothtimber.api.platform.world.inventory.IPlatformInventory;
import net.sourcewriters.smoothtimber.api.platform.world.inventory.IPlatformItem;
import net.sourcewriters.smoothtimber.api.resource.key.ResourceKey;

public interface ISmoothTimberPlatform {

    //
    // Adapters

    /**
     * Gets the platform specific plugin
     * 
     * @return the platform specific plugin
     */
    ISmoothTimberPlugin getPlugin();

    /**
     * Gets the platform specific event adapter
     * 
     * @return the platform specific event adapter
     */
    IPlatformEventAdapter getEventAdapter();

    //
    // Players

    /**
     * Gets all online players
     * 
     * @return the players
     */
    IPlatformPlayer[] getPlayers();

    //
    // Worlds

    /**
     * Gets the amount of worlds that the current platform has loaded
     * 
     * @return the amount of worlds
     */
    int getWorldAmount();

    /**
     * Gets all worlds that the current platform has loaded
     * 
     * @return all worlds
     */
    IPlatformWorld getWorlds();

    /**
     * Gets the world at the specific index
     * 
     * @param  index the index of the world
     * 
     * @return       the world at the index or null if the world doesn't exist
     */
    IPlatformWorld getWorldByIndex(int index);

    /**
     * Gets the world with the specific id
     * 
     * @param  uniqueId the id of the world
     * 
     * @return          the world with the id or null if the world doesn't exist
     */
    IPlatformWorld getWorldById(UUID uniqueId);

    /**
     * Gets the world with the specified name
     * 
     * @param  name the name of the world
     * 
     * @return      the world with the name or null if the world doesn't exist
     */
    IPlatformWorld getWorldByName(String name);

    //
    // Inventory

    /**
     * Create an item from an item type
     * 
     * @param  key the type of the item
     * 
     * @return     the created item
     */
    IPlatformItem buildItem(ResourceKey key);

    /**
     * Creates a inventory
     * 
     * @return the created inventory
     */
    IPlatformInventory buildInventory();

}
