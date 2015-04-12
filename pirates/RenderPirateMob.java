package nathan.pirates;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderPirateMob extends RenderLiving{
	
	public static final ResourceLocation mobTextures = new ResourceLocation("pirates", "textures/entity/Pirate.png");

	public RenderPirateMob(ModelBase modelBase, float par2) {
		super(modelBase, par2);
		
	}

	protected ResourceLocation getEntityTexture(EntityPirateMob entity) {
		
		return mobTextures;
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {

		return this.getEntityTexture((EntityPirateMob)entity);
	}
	

}
