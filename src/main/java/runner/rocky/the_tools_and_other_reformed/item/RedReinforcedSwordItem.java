
package runner.rocky.the_tools_and_other_reformed.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class RedReinforcedSwordItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, 13900, 23f, 0, 23, TagKey.create(Registries.ITEM, ResourceLocation.parse("the_tools_and_other_v2_reformed:red_reinforced_sword_repair_items")));

	public RedReinforcedSwordItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 19f, 16f, properties);
	}
}
