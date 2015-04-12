package nathan.pirates;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraftforge.client.MinecraftForgeClient;
import nathan.generic.CommonProxy;

public class ClientProxy extends CommonProxy {
        
        @Override
        public void registerRenderers() {
        	RenderingRegistry.registerEntityRenderingHandler(EntityPirateMob.class, new RenderPirateMob(new Pirate(), 0));
                // This is for rendering entities and so forth later on
        }
        
}// End class ClientProxy