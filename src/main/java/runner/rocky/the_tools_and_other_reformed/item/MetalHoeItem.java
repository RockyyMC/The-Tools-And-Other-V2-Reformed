
package runner.rocky.the_tools_and_other_reformed.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class MetalHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 34000, 51f, 0, 42, TagKey.create(Registries.ITEM, ResourceLocation.parse("the_tools_and_other_v2_reformed:metal_hoe_repair_items")));

	public MetalHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 4f, 3f, properties.fireResistant());
	}
}
