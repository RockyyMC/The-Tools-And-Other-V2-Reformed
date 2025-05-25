
package runner.rocky.the_tools_and_other_reformed.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class AquaDarkShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, 7000, 11f, 0, 13, TagKey.create(Registries.ITEM, ResourceLocation.parse("the_tools_and_other_v2_reformed:aqua_dark_shovel_repair_items")));

	public AquaDarkShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 2f, -3f, properties);
	}
}
