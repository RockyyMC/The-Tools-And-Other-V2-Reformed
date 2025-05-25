
package runner.rocky.the_tools_and_other_reformed.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class GreenDiamondAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 27900, 70f, 0, 67, TagKey.create(Registries.ITEM, ResourceLocation.parse("the_tools_and_other_v2_reformed:green_diamond_axe_repair_items")));

	public GreenDiamondAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 4f, 5f, properties.fireResistant());
	}
}
