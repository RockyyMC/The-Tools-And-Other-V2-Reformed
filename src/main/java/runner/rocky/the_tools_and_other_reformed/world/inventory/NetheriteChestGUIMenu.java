
package runner.rocky.the_tools_and_other_reformed.world.inventory;

import runner.rocky.the_tools_and_other_reformed.init.TheToolsAndOtherV2ReformedModMenus;

import net.neoforged.neoforge.items.wrapper.InvWrapper;
import net.neoforged.neoforge.items.SlotItemHandler;
import net.neoforged.neoforge.items.ItemStackHandler;
import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class NetheriteChestGUIMenu extends AbstractContainerMenu implements TheToolsAndOtherV2ReformedModMenus.MenuAccessor {
	public final Map<String, Object> menuState = new HashMap<>() {
		@Override
		public Object put(String key, Object value) {
			if (!this.containsKey(key) && this.size() >= 105)
				return null;
			return super.put(key, value);
		}
	};
	public final Level world;
	public final Player entity;
	public int x, y, z;
	private ContainerLevelAccess access = ContainerLevelAccess.NULL;
	private IItemHandler internal;
	private final Map<Integer, Slot> customSlots = new HashMap<>();
	private boolean bound = false;
	private Supplier<Boolean> boundItemMatcher = null;
	private Entity boundEntity = null;
	private BlockEntity boundBlockEntity = null;

	public NetheriteChestGUIMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
		super(TheToolsAndOtherV2ReformedModMenus.NETHERITE_CHEST_GUI.get(), id);
		this.entity = inv.player;
		this.world = inv.player.level();
		this.internal = new ItemStackHandler(103);
		BlockPos pos = null;
		if (extraData != null) {
			pos = extraData.readBlockPos();
			this.x = pos.getX();
			this.y = pos.getY();
			this.z = pos.getZ();
			access = ContainerLevelAccess.create(world, pos);
		}
		if (pos != null) {
			if (extraData.readableBytes() == 1) { // bound to item
				byte hand = extraData.readByte();
				ItemStack itemstack = hand == 0 ? this.entity.getMainHandItem() : this.entity.getOffhandItem();
				this.boundItemMatcher = () -> itemstack == (hand == 0 ? this.entity.getMainHandItem() : this.entity.getOffhandItem());
				IItemHandler cap = itemstack.getCapability(Capabilities.ItemHandler.ITEM);
				if (cap != null) {
					this.internal = cap;
					this.bound = true;
				}
			} else if (extraData.readableBytes() > 1) { // bound to entity
				extraData.readByte(); // drop padding
				boundEntity = world.getEntity(extraData.readVarInt());
				if (boundEntity != null) {
					IItemHandler cap = boundEntity.getCapability(Capabilities.ItemHandler.ENTITY);
					if (cap != null) {
						this.internal = cap;
						this.bound = true;
					}
				}
			} else { // might be bound to block
				boundBlockEntity = this.world.getBlockEntity(pos);
				if (boundBlockEntity instanceof BaseContainerBlockEntity baseContainerBlockEntity) {
					this.internal = new InvWrapper(baseContainerBlockEntity);
					this.bound = true;
				}
			}
		}
		this.customSlots.put(0, this.addSlot(new SlotItemHandler(internal, 0, 60, 22) {
			private final int slot = 0;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(1, this.addSlot(new SlotItemHandler(internal, 1, 78, 22) {
			private final int slot = 1;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(2, this.addSlot(new SlotItemHandler(internal, 2, 96, 22) {
			private final int slot = 2;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(3, this.addSlot(new SlotItemHandler(internal, 3, 114, 22) {
			private final int slot = 3;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(4, this.addSlot(new SlotItemHandler(internal, 4, 132, 22) {
			private final int slot = 4;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(5, this.addSlot(new SlotItemHandler(internal, 5, 150, 22) {
			private final int slot = 5;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(6, this.addSlot(new SlotItemHandler(internal, 6, 168, 22) {
			private final int slot = 6;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(7, this.addSlot(new SlotItemHandler(internal, 7, 186, 22) {
			private final int slot = 7;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(8, this.addSlot(new SlotItemHandler(internal, 8, 204, 22) {
			private final int slot = 8;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(9, this.addSlot(new SlotItemHandler(internal, 9, 60, 40) {
			private final int slot = 9;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(10, this.addSlot(new SlotItemHandler(internal, 10, 78, 40) {
			private final int slot = 10;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(11, this.addSlot(new SlotItemHandler(internal, 11, 96, 40) {
			private final int slot = 11;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(12, this.addSlot(new SlotItemHandler(internal, 12, 114, 40) {
			private final int slot = 12;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(13, this.addSlot(new SlotItemHandler(internal, 13, 132, 40) {
			private final int slot = 13;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(14, this.addSlot(new SlotItemHandler(internal, 14, 150, 40) {
			private final int slot = 14;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(15, this.addSlot(new SlotItemHandler(internal, 15, 168, 40) {
			private final int slot = 15;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(16, this.addSlot(new SlotItemHandler(internal, 16, 186, 40) {
			private final int slot = 16;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(17, this.addSlot(new SlotItemHandler(internal, 17, 204, 40) {
			private final int slot = 17;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(18, this.addSlot(new SlotItemHandler(internal, 18, 60, 58) {
			private final int slot = 18;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(19, this.addSlot(new SlotItemHandler(internal, 19, 78, 58) {
			private final int slot = 19;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(20, this.addSlot(new SlotItemHandler(internal, 20, 96, 58) {
			private final int slot = 20;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(21, this.addSlot(new SlotItemHandler(internal, 21, 114, 58) {
			private final int slot = 21;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(22, this.addSlot(new SlotItemHandler(internal, 22, 132, 58) {
			private final int slot = 22;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(23, this.addSlot(new SlotItemHandler(internal, 23, 150, 58) {
			private final int slot = 23;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(24, this.addSlot(new SlotItemHandler(internal, 24, 168, 58) {
			private final int slot = 24;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(25, this.addSlot(new SlotItemHandler(internal, 25, 186, 58) {
			private final int slot = 25;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(26, this.addSlot(new SlotItemHandler(internal, 26, 204, 58) {
			private final int slot = 26;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(27, this.addSlot(new SlotItemHandler(internal, 27, 60, 76) {
			private final int slot = 27;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(28, this.addSlot(new SlotItemHandler(internal, 28, 78, 76) {
			private final int slot = 28;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(29, this.addSlot(new SlotItemHandler(internal, 29, 96, 76) {
			private final int slot = 29;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(30, this.addSlot(new SlotItemHandler(internal, 30, 114, 76) {
			private final int slot = 30;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(31, this.addSlot(new SlotItemHandler(internal, 31, 132, 76) {
			private final int slot = 31;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(32, this.addSlot(new SlotItemHandler(internal, 32, 150, 76) {
			private final int slot = 32;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(33, this.addSlot(new SlotItemHandler(internal, 33, 168, 76) {
			private final int slot = 33;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(34, this.addSlot(new SlotItemHandler(internal, 34, 186, 76) {
			private final int slot = 34;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(35, this.addSlot(new SlotItemHandler(internal, 35, 204, 76) {
			private final int slot = 35;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(36, this.addSlot(new SlotItemHandler(internal, 36, 42, 22) {
			private final int slot = 36;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(37, this.addSlot(new SlotItemHandler(internal, 37, 42, 40) {
			private final int slot = 37;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(38, this.addSlot(new SlotItemHandler(internal, 38, 42, 58) {
			private final int slot = 38;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(39, this.addSlot(new SlotItemHandler(internal, 39, 42, 76) {
			private final int slot = 39;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(40, this.addSlot(new SlotItemHandler(internal, 40, 222, 22) {
			private final int slot = 40;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(41, this.addSlot(new SlotItemHandler(internal, 41, 222, 40) {
			private final int slot = 41;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(42, this.addSlot(new SlotItemHandler(internal, 42, 222, 58) {
			private final int slot = 42;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(43, this.addSlot(new SlotItemHandler(internal, 43, 222, 76) {
			private final int slot = 43;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(44, this.addSlot(new SlotItemHandler(internal, 44, 42, 94) {
			private final int slot = 44;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(45, this.addSlot(new SlotItemHandler(internal, 45, 222, 94) {
			private final int slot = 45;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(46, this.addSlot(new SlotItemHandler(internal, 46, 42, 112) {
			private final int slot = 46;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(47, this.addSlot(new SlotItemHandler(internal, 47, 222, 111) {
			private final int slot = 47;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(48, this.addSlot(new SlotItemHandler(internal, 48, 222, 130) {
			private final int slot = 48;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(49, this.addSlot(new SlotItemHandler(internal, 49, 42, 130) {
			private final int slot = 49;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(50, this.addSlot(new SlotItemHandler(internal, 50, 42, 148) {
			private final int slot = 50;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(51, this.addSlot(new SlotItemHandler(internal, 51, 222, 148) {
			private final int slot = 51;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(52, this.addSlot(new SlotItemHandler(internal, 52, 238, 161) {
			private final int slot = 52;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(53, this.addSlot(new SlotItemHandler(internal, 53, 7, 161) {
			private final int slot = 53;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(54, this.addSlot(new SlotItemHandler(internal, 54, 240, 22) {
			private final int slot = 54;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(55, this.addSlot(new SlotItemHandler(internal, 55, 258, 22) {
			private final int slot = 55;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(56, this.addSlot(new SlotItemHandler(internal, 56, 24, 22) {
			private final int slot = 56;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(57, this.addSlot(new SlotItemHandler(internal, 57, 6, 22) {
			private final int slot = 57;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(58, this.addSlot(new SlotItemHandler(internal, 58, 24, 40) {
			private final int slot = 58;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(59, this.addSlot(new SlotItemHandler(internal, 59, 6, 40) {
			private final int slot = 59;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(60, this.addSlot(new SlotItemHandler(internal, 60, 24, 58) {
			private final int slot = 60;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(61, this.addSlot(new SlotItemHandler(internal, 61, 6, 58) {
			private final int slot = 61;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(62, this.addSlot(new SlotItemHandler(internal, 62, 24, 76) {
			private final int slot = 62;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(63, this.addSlot(new SlotItemHandler(internal, 63, 6, 76) {
			private final int slot = 63;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(64, this.addSlot(new SlotItemHandler(internal, 64, 24, 94) {
			private final int slot = 64;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(65, this.addSlot(new SlotItemHandler(internal, 65, 6, 94) {
			private final int slot = 65;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(66, this.addSlot(new SlotItemHandler(internal, 66, 240, 94) {
			private final int slot = 66;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(67, this.addSlot(new SlotItemHandler(internal, 67, 258, 94) {
			private final int slot = 67;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(68, this.addSlot(new SlotItemHandler(internal, 68, 240, 76) {
			private final int slot = 68;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(69, this.addSlot(new SlotItemHandler(internal, 69, 258, 76) {
			private final int slot = 69;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(70, this.addSlot(new SlotItemHandler(internal, 70, 240, 58) {
			private final int slot = 70;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(71, this.addSlot(new SlotItemHandler(internal, 71, 258, 58) {
			private final int slot = 71;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(72, this.addSlot(new SlotItemHandler(internal, 72, 240, 40) {
			private final int slot = 72;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(73, this.addSlot(new SlotItemHandler(internal, 73, 258, 40) {
			private final int slot = 73;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(74, this.addSlot(new SlotItemHandler(internal, 74, 24, 111) {
			private final int slot = 74;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(75, this.addSlot(new SlotItemHandler(internal, 75, 6, 110) {
			private final int slot = 75;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(76, this.addSlot(new SlotItemHandler(internal, 76, 23, 127) {
			private final int slot = 76;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(77, this.addSlot(new SlotItemHandler(internal, 77, 6, 127) {
			private final int slot = 77;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(78, this.addSlot(new SlotItemHandler(internal, 78, 7, 144) {
			private final int slot = 78;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(79, this.addSlot(new SlotItemHandler(internal, 79, 24, 144) {
			private final int slot = 79;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(80, this.addSlot(new SlotItemHandler(internal, 80, 6, 4) {
			private final int slot = 80;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(81, this.addSlot(new SlotItemHandler(internal, 81, 24, 4) {
			private final int slot = 81;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(82, this.addSlot(new SlotItemHandler(internal, 82, 42, 4) {
			private final int slot = 82;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(83, this.addSlot(new SlotItemHandler(internal, 83, 59, 4) {
			private final int slot = 83;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(84, this.addSlot(new SlotItemHandler(internal, 84, 77, 4) {
			private final int slot = 84;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(85, this.addSlot(new SlotItemHandler(internal, 85, 96, 4) {
			private final int slot = 85;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(86, this.addSlot(new SlotItemHandler(internal, 86, 114, 4) {
			private final int slot = 86;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(87, this.addSlot(new SlotItemHandler(internal, 87, 132, 4) {
			private final int slot = 87;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(88, this.addSlot(new SlotItemHandler(internal, 88, 150, 4) {
			private final int slot = 88;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(89, this.addSlot(new SlotItemHandler(internal, 89, 168, 4) {
			private final int slot = 89;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(90, this.addSlot(new SlotItemHandler(internal, 90, 186, 4) {
			private final int slot = 90;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(91, this.addSlot(new SlotItemHandler(internal, 91, 204, 4) {
			private final int slot = 91;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(92, this.addSlot(new SlotItemHandler(internal, 92, 222, 4) {
			private final int slot = 92;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(93, this.addSlot(new SlotItemHandler(internal, 93, 240, 4) {
			private final int slot = 93;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(94, this.addSlot(new SlotItemHandler(internal, 94, 258, 4) {
			private final int slot = 94;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(95, this.addSlot(new SlotItemHandler(internal, 95, 239, 111) {
			private final int slot = 95;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(96, this.addSlot(new SlotItemHandler(internal, 96, 258, 111) {
			private final int slot = 96;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(97, this.addSlot(new SlotItemHandler(internal, 97, 239, 128) {
			private final int slot = 97;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(98, this.addSlot(new SlotItemHandler(internal, 98, 256, 128) {
			private final int slot = 98;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(99, this.addSlot(new SlotItemHandler(internal, 99, 239, 145) {
			private final int slot = 99;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(100, this.addSlot(new SlotItemHandler(internal, 100, 256, 145) {
			private final int slot = 100;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(101, this.addSlot(new SlotItemHandler(internal, 101, 256, 161) {
			private final int slot = 101;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		this.customSlots.put(102, this.addSlot(new SlotItemHandler(internal, 102, 24, 161) {
			private final int slot = 102;
			private int x = NetheriteChestGUIMenu.this.x;
			private int y = NetheriteChestGUIMenu.this.y;
		}));
		for (int si = 0; si < 3; ++si)
			for (int sj = 0; sj < 9; ++sj)
				this.addSlot(new Slot(inv, sj + (si + 1) * 9, 53 + 8 + sj * 18, 14 + 84 + si * 18));
		for (int si = 0; si < 9; ++si)
			this.addSlot(new Slot(inv, si, 53 + 8 + si * 18, 14 + 142));
	}

	@Override
	public boolean stillValid(Player player) {
		if (this.bound) {
			if (this.boundItemMatcher != null)
				return this.boundItemMatcher.get();
			else if (this.boundBlockEntity != null)
				return AbstractContainerMenu.stillValid(this.access, player, this.boundBlockEntity.getBlockState().getBlock());
			else if (this.boundEntity != null)
				return this.boundEntity.isAlive();
		}
		return true;
	}

	@Override
	public ItemStack quickMoveStack(Player playerIn, int index) {
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = (Slot) this.slots.get(index);
		if (slot != null && slot.hasItem()) {
			ItemStack itemstack1 = slot.getItem();
			itemstack = itemstack1.copy();
			if (index < 103) {
				if (!this.moveItemStackTo(itemstack1, 103, this.slots.size(), true))
					return ItemStack.EMPTY;
				slot.onQuickCraft(itemstack1, itemstack);
			} else if (!this.moveItemStackTo(itemstack1, 0, 103, false)) {
				if (index < 103 + 27) {
					if (!this.moveItemStackTo(itemstack1, 103 + 27, this.slots.size(), true))
						return ItemStack.EMPTY;
				} else {
					if (!this.moveItemStackTo(itemstack1, 103, 103 + 27, false))
						return ItemStack.EMPTY;
				}
				return ItemStack.EMPTY;
			}
			if (itemstack1.getCount() == 0)
				slot.set(ItemStack.EMPTY);
			else
				slot.setChanged();
			if (itemstack1.getCount() == itemstack.getCount())
				return ItemStack.EMPTY;
			slot.onTake(playerIn, itemstack1);
		}
		return itemstack;
	}

	@Override
	protected boolean moveItemStackTo(ItemStack p_38904_, int p_38905_, int p_38906_, boolean p_38907_) {
		boolean flag = false;
		int i = p_38905_;
		if (p_38907_) {
			i = p_38906_ - 1;
		}
		if (p_38904_.isStackable()) {
			while (!p_38904_.isEmpty() && (p_38907_ ? i >= p_38905_ : i < p_38906_)) {
				Slot slot = this.slots.get(i);
				ItemStack itemstack = slot.getItem();
				if (slot.mayPlace(itemstack) && !itemstack.isEmpty() && ItemStack.isSameItemSameComponents(p_38904_, itemstack)) {
					int j = itemstack.getCount() + p_38904_.getCount();
					int k = slot.getMaxStackSize(itemstack);
					if (j <= k) {
						p_38904_.setCount(0);
						itemstack.setCount(j);
						slot.set(itemstack);
						flag = true;
					} else if (itemstack.getCount() < k) {
						p_38904_.shrink(k - itemstack.getCount());
						itemstack.setCount(k);
						slot.set(itemstack);
						flag = true;
					}
				}
				if (p_38907_) {
					i--;
				} else {
					i++;
				}
			}
		}
		if (!p_38904_.isEmpty()) {
			if (p_38907_) {
				i = p_38906_ - 1;
			} else {
				i = p_38905_;
			}
			while (p_38907_ ? i >= p_38905_ : i < p_38906_) {
				Slot slot1 = this.slots.get(i);
				ItemStack itemstack1 = slot1.getItem();
				if (itemstack1.isEmpty() && slot1.mayPlace(p_38904_)) {
					int l = slot1.getMaxStackSize(p_38904_);
					slot1.setByPlayer(p_38904_.split(Math.min(p_38904_.getCount(), l)));
					slot1.setChanged();
					flag = true;
					break;
				}
				if (p_38907_) {
					i--;
				} else {
					i++;
				}
			}
		}
		return flag;
	}

	@Override
	public void removed(Player playerIn) {
		super.removed(playerIn);
		if (!bound && playerIn instanceof ServerPlayer serverPlayer) {
			if (!serverPlayer.isAlive() || serverPlayer.hasDisconnected()) {
				for (int j = 0; j < internal.getSlots(); ++j) {
					if (j == 0)
						continue;
					if (j == 1)
						continue;
					if (j == 2)
						continue;
					if (j == 3)
						continue;
					if (j == 4)
						continue;
					if (j == 5)
						continue;
					if (j == 6)
						continue;
					if (j == 7)
						continue;
					if (j == 8)
						continue;
					if (j == 9)
						continue;
					if (j == 10)
						continue;
					if (j == 11)
						continue;
					if (j == 12)
						continue;
					if (j == 13)
						continue;
					if (j == 14)
						continue;
					if (j == 15)
						continue;
					if (j == 16)
						continue;
					if (j == 17)
						continue;
					if (j == 18)
						continue;
					if (j == 19)
						continue;
					if (j == 20)
						continue;
					if (j == 21)
						continue;
					if (j == 22)
						continue;
					if (j == 23)
						continue;
					if (j == 24)
						continue;
					if (j == 25)
						continue;
					if (j == 26)
						continue;
					if (j == 27)
						continue;
					if (j == 28)
						continue;
					if (j == 29)
						continue;
					if (j == 30)
						continue;
					if (j == 31)
						continue;
					if (j == 32)
						continue;
					if (j == 33)
						continue;
					if (j == 34)
						continue;
					if (j == 35)
						continue;
					if (j == 36)
						continue;
					if (j == 37)
						continue;
					if (j == 38)
						continue;
					if (j == 39)
						continue;
					if (j == 40)
						continue;
					if (j == 41)
						continue;
					if (j == 42)
						continue;
					if (j == 43)
						continue;
					if (j == 44)
						continue;
					if (j == 45)
						continue;
					if (j == 46)
						continue;
					if (j == 47)
						continue;
					if (j == 48)
						continue;
					if (j == 49)
						continue;
					if (j == 50)
						continue;
					if (j == 51)
						continue;
					if (j == 52)
						continue;
					if (j == 53)
						continue;
					if (j == 54)
						continue;
					if (j == 55)
						continue;
					if (j == 56)
						continue;
					if (j == 57)
						continue;
					if (j == 58)
						continue;
					if (j == 59)
						continue;
					if (j == 60)
						continue;
					if (j == 61)
						continue;
					if (j == 62)
						continue;
					if (j == 63)
						continue;
					if (j == 64)
						continue;
					if (j == 65)
						continue;
					if (j == 66)
						continue;
					if (j == 67)
						continue;
					if (j == 68)
						continue;
					if (j == 69)
						continue;
					if (j == 70)
						continue;
					if (j == 71)
						continue;
					if (j == 72)
						continue;
					if (j == 73)
						continue;
					if (j == 74)
						continue;
					if (j == 75)
						continue;
					if (j == 76)
						continue;
					if (j == 77)
						continue;
					if (j == 78)
						continue;
					if (j == 79)
						continue;
					if (j == 80)
						continue;
					if (j == 81)
						continue;
					if (j == 82)
						continue;
					if (j == 83)
						continue;
					if (j == 84)
						continue;
					if (j == 85)
						continue;
					if (j == 86)
						continue;
					if (j == 87)
						continue;
					if (j == 88)
						continue;
					if (j == 89)
						continue;
					if (j == 90)
						continue;
					if (j == 91)
						continue;
					if (j == 92)
						continue;
					if (j == 93)
						continue;
					if (j == 94)
						continue;
					if (j == 95)
						continue;
					if (j == 96)
						continue;
					if (j == 97)
						continue;
					if (j == 98)
						continue;
					if (j == 99)
						continue;
					if (j == 100)
						continue;
					if (j == 101)
						continue;
					if (j == 102)
						continue;
					playerIn.drop(internal.getStackInSlot(j), false);
					if (internal instanceof IItemHandlerModifiable ihm)
						ihm.setStackInSlot(j, ItemStack.EMPTY);
				}
			} else {
				for (int i = 0; i < internal.getSlots(); ++i) {
					if (i == 0)
						continue;
					if (i == 1)
						continue;
					if (i == 2)
						continue;
					if (i == 3)
						continue;
					if (i == 4)
						continue;
					if (i == 5)
						continue;
					if (i == 6)
						continue;
					if (i == 7)
						continue;
					if (i == 8)
						continue;
					if (i == 9)
						continue;
					if (i == 10)
						continue;
					if (i == 11)
						continue;
					if (i == 12)
						continue;
					if (i == 13)
						continue;
					if (i == 14)
						continue;
					if (i == 15)
						continue;
					if (i == 16)
						continue;
					if (i == 17)
						continue;
					if (i == 18)
						continue;
					if (i == 19)
						continue;
					if (i == 20)
						continue;
					if (i == 21)
						continue;
					if (i == 22)
						continue;
					if (i == 23)
						continue;
					if (i == 24)
						continue;
					if (i == 25)
						continue;
					if (i == 26)
						continue;
					if (i == 27)
						continue;
					if (i == 28)
						continue;
					if (i == 29)
						continue;
					if (i == 30)
						continue;
					if (i == 31)
						continue;
					if (i == 32)
						continue;
					if (i == 33)
						continue;
					if (i == 34)
						continue;
					if (i == 35)
						continue;
					if (i == 36)
						continue;
					if (i == 37)
						continue;
					if (i == 38)
						continue;
					if (i == 39)
						continue;
					if (i == 40)
						continue;
					if (i == 41)
						continue;
					if (i == 42)
						continue;
					if (i == 43)
						continue;
					if (i == 44)
						continue;
					if (i == 45)
						continue;
					if (i == 46)
						continue;
					if (i == 47)
						continue;
					if (i == 48)
						continue;
					if (i == 49)
						continue;
					if (i == 50)
						continue;
					if (i == 51)
						continue;
					if (i == 52)
						continue;
					if (i == 53)
						continue;
					if (i == 54)
						continue;
					if (i == 55)
						continue;
					if (i == 56)
						continue;
					if (i == 57)
						continue;
					if (i == 58)
						continue;
					if (i == 59)
						continue;
					if (i == 60)
						continue;
					if (i == 61)
						continue;
					if (i == 62)
						continue;
					if (i == 63)
						continue;
					if (i == 64)
						continue;
					if (i == 65)
						continue;
					if (i == 66)
						continue;
					if (i == 67)
						continue;
					if (i == 68)
						continue;
					if (i == 69)
						continue;
					if (i == 70)
						continue;
					if (i == 71)
						continue;
					if (i == 72)
						continue;
					if (i == 73)
						continue;
					if (i == 74)
						continue;
					if (i == 75)
						continue;
					if (i == 76)
						continue;
					if (i == 77)
						continue;
					if (i == 78)
						continue;
					if (i == 79)
						continue;
					if (i == 80)
						continue;
					if (i == 81)
						continue;
					if (i == 82)
						continue;
					if (i == 83)
						continue;
					if (i == 84)
						continue;
					if (i == 85)
						continue;
					if (i == 86)
						continue;
					if (i == 87)
						continue;
					if (i == 88)
						continue;
					if (i == 89)
						continue;
					if (i == 90)
						continue;
					if (i == 91)
						continue;
					if (i == 92)
						continue;
					if (i == 93)
						continue;
					if (i == 94)
						continue;
					if (i == 95)
						continue;
					if (i == 96)
						continue;
					if (i == 97)
						continue;
					if (i == 98)
						continue;
					if (i == 99)
						continue;
					if (i == 100)
						continue;
					if (i == 101)
						continue;
					if (i == 102)
						continue;
					playerIn.getInventory().placeItemBackInInventory(internal.getStackInSlot(i));
					if (internal instanceof IItemHandlerModifiable ihm)
						ihm.setStackInSlot(i, ItemStack.EMPTY);
				}
			}
		}
	}

	@Override
	public Map<Integer, Slot> getSlots() {
		return Collections.unmodifiableMap(customSlots);
	}

	@Override
	public Map<String, Object> getMenuState() {
		return menuState;
	}
}
