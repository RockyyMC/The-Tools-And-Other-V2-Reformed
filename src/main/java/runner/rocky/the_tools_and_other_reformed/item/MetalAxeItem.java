
package runner.rocky.the_tools_and_other_reformed.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class MetalAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 34000, 54f, 0, 55, TagKey.create(Registries.ITEM, ResourceLocation.parse("the_tools_and_other_v2_reformed:metal_axe_repair_items")));

	public MetalAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 36.91f, 20.97f, properties.fireResistant());
	}
}
