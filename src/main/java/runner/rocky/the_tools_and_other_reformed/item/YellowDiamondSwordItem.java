
package runner.rocky.the_tools_and_other_reformed.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class YellowDiamondSwordItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 3500, 80f, 0, 49,
			TagKey.create(Registries.ITEM, ResourceLocation.parse("the_tools_and_other_v2_reformed:yellow_diamond_sword_repair_items")));

	public YellowDiamondSwordItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 13.5f, 3f, properties.fireResistant());
	}
}
