package mcjty.meecreeps.actions;

import mcjty.meecreeps.MeeCreeps;
import mcjty.meecreeps.proxy.GuiProxy;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ClientActionManager {

    public static ActionOptions lastOptions = null;

    public static void showActionOptions(ActionOptions options) {
        EntityPlayer player = MeeCreeps.proxy.getClientPlayer();
        World worldIn = MeeCreeps.proxy.getClientWorld();
        BlockPos pos = options.getPos();
        lastOptions = options;
        player.openGui(MeeCreeps.instance, GuiProxy.GUI_MEECREEP_QUESTION, worldIn, pos.getX(), pos.getY(), pos.getZ());
    }
}
