
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

public class FridgeGUIMenu extends AbstractContainerMenu implements TheToolsAndOtherV2ReformedModMenus.MenuAccessor {
	public final Map<String, Object> menuState = new HashMap<>() {
		@Override
		public Object put(String key, Object value) {
			if (!this.containsKey(key) && this.size() >= 30)
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

	public FridgeGUIMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
		super(TheToolsAndOtherV2ReformedModMenus.FRIDGE_GUI.get(), id);
		this.entity = inv.player;
		this.world = inv.player.level();
		this.internal = new ItemStackHandler(27);
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
		this.customSlots.put(0, this.addSlot(new SlotItemHandler(internal, 0, 8, 10) {
			private final int slot = 0;
			private int x = FridgeGUIMenu.this.x;
			private int y = FridgeGUIMenu.this.y;
		}));
		this.customSlots.put(1, this.addSlot(new SlotItemHandler(internal, 1, 23, 10) {
			private final int slot = 1;
			private int x = FridgeGUIMenu.this.x;
			private int y = FridgeGUIMenu.this.y;
		}));
		this.customSlots.put(2, this.addSlot(new SlotItemHandler(internal, 2, 41, 10) {
			private final int slot = 2;
			private int x = FridgeGUIMenu.this.x;
			private int y = FridgeGUIMenu.this.y;
		}));
		this.customSlots.put(3, this.addSlot(new SlotItemHandler(internal, 3, 58, 10) {
			private final int slot = 3;
			private int x = FridgeGUIMenu.this.x;
			private int y = FridgeGUIMenu.this.y;
		}));
		this.customSlots.put(4, this.addSlot(new SlotItemHandler(internal, 4, 75, 10) {
			private final int slot = 4;
			private int x = FridgeGUIMenu.this.x;
			private int y = FridgeGUIMenu.this.y;
		}));
		this.customSlots.put(5, this.addSlot(new SlotItemHandler(internal, 5, 94, 10) {
			private final int slot = 5;
			private int x = FridgeGUIMenu.this.x;
			private int y = FridgeGUIMenu.this.y;
		}));
		this.customSlots.put(6, this.addSlot(new SlotItemHandler(internal, 6, 111, 10) {
			private final int slot = 6;
			private int x = FridgeGUIMenu.this.x;
			private int y = FridgeGUIMenu.this.y;
		}));
		this.customSlots.put(7, this.addSlot(new SlotItemHandler(internal, 7, 129, 10) {
			private final int slot = 7;
			private int x = FridgeGUIMenu.this.x;
			private int y = FridgeGUIMenu.this.y;
		}));
		this.customSlots.put(8, this.addSlot(new SlotItemHandler(internal, 8, 147, 10) {
			private final int slot = 8;
			private int x = FridgeGUIMenu.this.x;
			private int y = FridgeGUIMenu.this.y;
		}));
		this.customSlots.put(9, this.addSlot(new SlotItemHandler(internal, 9, 7, 33) {
			private final int slot = 9;
			private int x = FridgeGUIMenu.this.x;
			private int y = FridgeGUIMenu.this.y;
		}));
		this.customSlots.put(10, this.addSlot(new SlotItemHandler(internal, 10, 25, 33) {
			private final int slot = 10;
			private int x = FridgeGUIMenu.this.x;
			private int y = FridgeGUIMenu.this.y;
		}));
		this.customSlots.put(11, this.addSlot(new SlotItemHandler(internal, 11, 43, 33) {
			private final int slot = 11;
			private int x = FridgeGUIMenu.this.x;
			private int y = FridgeGUIMenu.this.y;
		}));
		this.customSlots.put(12, this.addSlot(new SlotItemHandler(internal, 12, 61, 33) {
			private final int slot = 12;
			private int x = FridgeGUIMenu.this.x;
			private int y = FridgeGUIMenu.this.y;
		}));
		this.customSlots.put(13, this.addSlot(new SlotItemHandler(internal, 13, 78, 33) {
			private final int slot = 13;
			private int x = FridgeGUIMenu.this.x;
			private int y = FridgeGUIMenu.this.y;
		}));
		this.customSlots.put(14, this.addSlot(new SlotItemHandler(internal, 14, 95, 33) {
			private final int slot = 14;
			private int x = FridgeGUIMenu.this.x;
			private int y = FridgeGUIMenu.this.y;
		}));
		this.customSlots.put(15, this.addSlot(new SlotItemHandler(internal, 15, 112, 33) {
			private final int slot = 15;
			private int x = FridgeGUIMenu.this.x;
			private int y = FridgeGUIMenu.this.y;
		}));
		this.customSlots.put(16, this.addSlot(new SlotItemHandler(internal, 16, 129, 33) {
			private final int slot = 16;
			private int x = FridgeGUIMenu.this.x;
			private int y = FridgeGUIMenu.this.y;
		}));
		this.customSlots.put(17, this.addSlot(new SlotItemHandler(internal, 17, 146, 33) {
			private final int slot = 17;
			private int x = FridgeGUIMenu.this.x;
			private int y = FridgeGUIMenu.this.y;
		}));
		this.customSlots.put(18, this.addSlot(new SlotItemHandler(internal, 18, 8, 58) {
			private final int slot = 18;
			private int x = FridgeGUIMenu.this.x;
			private int y = FridgeGUIMenu.this.y;
		}));
		this.customSlots.put(19, this.addSlot(new SlotItemHandler(internal, 19, 25, 58) {
			private final int slot = 19;
			private int x = FridgeGUIMenu.this.x;
			private int y = FridgeGUIMenu.this.y;
		}));
		this.customSlots.put(20, this.addSlot(new SlotItemHandler(internal, 20, 42, 58) {
			private final int slot = 20;
			private int x = FridgeGUIMenu.this.x;
			private int y = FridgeGUIMenu.this.y;
		}));
		this.customSlots.put(21, this.addSlot(new SlotItemHandler(internal, 21, 59, 58) {
			private final int slot = 21;
			private int x = FridgeGUIMenu.this.x;
			private int y = FridgeGUIMenu.this.y;
		}));
		this.customSlots.put(22, this.addSlot(new SlotItemHandler(internal, 22, 77, 58) {
			private final int slot = 22;
			private int x = FridgeGUIMenu.this.x;
			private int y = FridgeGUIMenu.this.y;
		}));
		this.customSlots.put(23, this.addSlot(new SlotItemHandler(internal, 23, 95, 58) {
			private final int slot = 23;
			private int x = FridgeGUIMenu.this.x;
			private int y = FridgeGUIMenu.this.y;
		}));
		this.customSlots.put(24, this.addSlot(new SlotItemHandler(internal, 24, 113, 58) {
			private final int slot = 24;
			private int x = FridgeGUIMenu.this.x;
			private int y = FridgeGUIMenu.this.y;
		}));
		this.customSlots.put(25, this.addSlot(new SlotItemHandler(internal, 25, 130, 58) {
			private final int slot = 25;
			private int x = FridgeGUIMenu.this.x;
			private int y = FridgeGUIMenu.this.y;
		}));
		this.customSlots.put(26, this.addSlot(new SlotItemHandler(internal, 26, 147, 58) {
			private final int slot = 26;
			private int x = FridgeGUIMenu.this.x;
			private int y = FridgeGUIMenu.this.y;
		}));
		for (int si = 0; si < 3; ++si)
			for (int sj = 0; sj < 9; ++sj)
				this.addSlot(new Slot(inv, sj + (si + 1) * 9, 0 + 8 + sj * 18, 0 + 84 + si * 18));
		for (int si = 0; si < 9; ++si)
			this.addSlot(new Slot(inv, si, 0 + 8 + si * 18, 0 + 142));
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
			if (index < 27) {
				if (!this.moveItemStackTo(itemstack1, 27, this.slots.size(), true))
					return ItemStack.EMPTY;
				slot.onQuickCraft(itemstack1, itemstack);
			} else if (!this.moveItemStackTo(itemstack1, 0, 27, false)) {
				if (index < 27 + 27) {
					if (!this.moveItemStackTo(itemstack1, 27 + 27, this.slots.size(), true))
						return ItemStack.EMPTY;
				} else {
					if (!this.moveItemStackTo(itemstack1, 27, 27 + 27, false))
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
