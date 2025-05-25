
package runner.rocky.the_tools_and_other_reformed.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class RedAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 14700, 44f, 0, 44, TagKey.create(Registries.ITEM, ResourceLocation.parse("the_tools_and_other_v2_reformed:red_axe_repair_items")));

	public RedAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 32f, 1f, properties);
	}
}
