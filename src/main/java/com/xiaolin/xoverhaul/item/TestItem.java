package com.xiaolin.xoverhaul.item;

import com.xiaolin.xoverhaul.mixin.ZombieVillagerConversionMixin;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.ZombieVillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.apache.logging.log4j.core.jmx.Server;

import java.util.HashMap;
import java.util.Objects;

public class TestItem extends Item {
    public TestItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        MinecraftClient.getInstance().player.sendChatMessage("Test Item in action");


        return super.use(world, user, hand);
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {

        if (entity instanceof ZombieVillagerEntity zombieVillagerEntity) {
            if(!user.getWorld().isClient){
                ServerWorld serverWorld = (ServerWorld) zombieVillagerEntity.getWorld();
                ((ZombieVillagerConversionMixin)zombieVillagerEntity).invokeFinishConversion(serverWorld);
            }
        }

        return super.useOnEntity(stack, user, entity, hand);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockpos = context.getBlockPos();
        world.setBlockState(blockpos, Blocks.MAGMA_BLOCK.getDefaultState());
        return ActionResult.SUCCESS;
    }



    @Override
    public void onCraft(ItemStack stack, World world, PlayerEntity player) {
        super.onCraft(stack, world, player);

        // Enchantment HashMap
        HashMap<Enchantment, Integer> enchantments = new HashMap<>();

        // Putting an enchantment on the map
        enchantments.put(Enchantments.EFFICIENCY, 1); // Efficiency 1 for testing, can be any enchantment.

        // If the item doesn't have already the enchantments
        if(!stack.getEnchantments().contains(enchantments)){

            // Enchant
            EnchantmentHelper.set(enchantments, stack);
        }

    }
}
