
package runner.rocky.the_tools_and_other_reformed.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class ObsidianShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 12500, 24f, 0, 25, TagKey.create(Registries.ITEM, ResourceLocation.parse("the_tools_and_other_v2_reformed:obsidian_shovel_repair_items")));

	public ObsidianShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 4f, 96f, properties);
	}
}
