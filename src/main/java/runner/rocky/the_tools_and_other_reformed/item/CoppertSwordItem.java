
package runner.rocky.the_tools_and_other_reformed.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class CoppertSwordItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 7890, 14f, 0, 18, TagKey.create(Registries.ITEM, ResourceLocation.parse("the_tools_and_other_v2_reformed:coppert_sword_repair_items")));

	public CoppertSwordItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 186f, 5f, properties);
	}
}
