
package runner.rocky.the_tools_and_other_reformed.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class MagnePickaxeItem extends PickaxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 5700, 11f, 0, 14, TagKey.create(Registries.ITEM, ResourceLocation.parse("the_tools_and_other_v2_reformed:magne_pickaxe_repair_items")));

	public MagnePickaxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 2.55f, -1f, properties);
	}
}
