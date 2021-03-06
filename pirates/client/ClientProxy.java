package nathan.pirates.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraftforge.client.MinecraftForgeClient;
import nathan.pirates.CommonProxy;
import nathan.pirates.EntityPirateMob;
import nathan.pirates.Pirate;
import nathan.pirates.RenderPirateMob;

public class ClientProxy extends CommonProxy {
        
        @Override
        public void registerRenderers() {
                // This is for rendering entities and so forth later on
        	RenderingRegistry.registerEntityRenderingHandler(EntityPirateMob.class, new RenderPirateMob(new Pirate(), 0));
        }
        
}// End class ClientProxy