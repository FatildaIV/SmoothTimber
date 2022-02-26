package net.sourcewriters.smoothtimber.api.tree;

import java.util.Objects;

import net.sourcewriters.smoothtimber.api.module.SmoothTimberModule;
import net.sourcewriters.smoothtimber.api.platform.world.IPlatformWorld;
import net.sourcewriters.smoothtimber.api.resource.key.ResourceKey;
import net.sourcewriters.smoothtimber.api.util.math.Vector3i;

public abstract class TreeDetector {

    private final ResourceKey key;

    public TreeDetector(SmoothTimberModule module, String name) {
        this.key = Objects.requireNonNull(module.key(name));
    }

    /**
     * Gets the id of the tree detector
     * 
     * @return the id key
     */
    public final ResourceKey getKey() {
        return key;
    }

    /**
     * Detects if there is a tree at the given location
     * 
     * @param  world    the world that the tree is in
     * @param  location the location that the tree is at
     * 
     * @return          the tree or null
     */
    public abstract ITree detect(IPlatformWorld world, Vector3i location);

}