
package runner.rocky.the_tools_and_other_reformed.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class OptiniumPickaxeItem extends PickaxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2900, 49f, 0, 45, TagKey.create(Registries.ITEM, ResourceLocation.parse("the_tools_and_other_v2_reformed:optinium_pickaxe_repair_items")));

	public OptiniumPickaxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 3f, 5f, properties.fireResistant());
	}
}
