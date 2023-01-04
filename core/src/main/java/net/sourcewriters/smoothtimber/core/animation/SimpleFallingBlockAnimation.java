package net.sourcewriters.smoothtimber.core.animation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import net.sourcewriters.smoothtimber.api.module.SmoothTimberModule;
import net.sourcewriters.smoothtimber.api.platform.world.entity.IPlatformPlayer;
import net.sourcewriters.smoothtimber.api.platform.world.inventory.IPlatformItem;
import net.sourcewriters.smoothtimber.api.tree.ITree;
import net.sourcewriters.smoothtimber.api.tree.IBlockType;
import net.sourcewriters.smoothtimber.api.tree.TreeAnimation;
import net.sourcewriters.smoothtimber.api.util.math.Vector3i;

public final class SimpleFallingBlockAnimation extends TreeAnimation {

    public SimpleFallingBlockAnimation(SmoothTimberModule module) {
        super(module, "simple_falling_block");
    }

    @Override
    public Map<IBlockType, Integer> cutTree(IPlatformPlayer player, IPlatformItem item, ITree tree, Vector3i relative) {
        HashMap<IBlockType, Integer> map = new HashMap<>();
        tree.getBlocks(relative, 0);
        
        return Collections.unmodifiableMap(map);
    }

}