
package runner.rocky.the_tools_and_other_reformed.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class MetalSwordItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 34000, 56f, 0, 67, TagKey.create(Registries.ITEM, ResourceLocation.parse("the_tools_and_other_v2_reformed:metal_sword_repair_items")));

	public MetalSwordItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 44.9f, 19f, properties.fireResistant());
	}
}
