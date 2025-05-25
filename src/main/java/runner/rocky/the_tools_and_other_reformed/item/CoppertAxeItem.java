
package runner.rocky.the_tools_and_other_reformed.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class CoppertAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 7890, 12f, 0, 16, TagKey.create(Registries.ITEM, ResourceLocation.parse("the_tools_and_other_v2_reformed:coppert_axe_repair_items")));

	public CoppertAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 18.3f, -2.01f, properties);
	}
}
