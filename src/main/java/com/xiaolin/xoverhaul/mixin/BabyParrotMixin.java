package com.xiaolin.xoverhaul.mixin;

import com.xiaolin.xoverhaul.XOverhaul;
import net.minecraft.entity.EntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.goal.AnimalMateGoal;
import net.minecraft.entity.passive.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Set;

@Mixin(ParrotEntity.class)
public abstract class BabyParrotMixin extends TameableEntity {

    @Shadow
    @Final
    private static Set<Item> TAMING_INGREDIENTS;

    @Shadow
    public abstract int getVariant();

    @Shadow public abstract void setVariant(int variant);

    protected BabyParrotMixin(EntityType<? extends TameableEntity> entityType, World world) {
        super(entityType, world);
    }


    ///////////////////////////////////////////////////////////////////////////

    @Inject(method = "createChild", at = @At("RETURN"), cancellable = true)
    public void createChild(ServerWorld world, PassiveEntity entity, @NotNull CallbackInfoReturnable<PassiveEntity> cir) {
        cir.setReturnValue(createChildMixin(world, entity));
    }

    private PassiveEntity createChildMixin(ServerWorld world, PassiveEntity entity) {
        ParrotEntity parrotEntity = (ParrotEntity) EntityType.PARROT.create(world);
        if (entity instanceof ParrotEntity) {
            if (this.random.nextBoolean()) {
                parrotEntity.setVariant(this.getVariant());
            }
            else {
                parrotEntity.setVariant(((ParrotEntity) entity).getVariant());
            }
        }

            if (this.isTamed()) {
                parrotEntity.setOwnerUuid(this.getOwnerUuid());
                parrotEntity.setTamed(true);
            }
            return parrotEntity;
    }

        ///////////////////////////////////////////////////////////////////////////

        @Inject(method = "isBreedingItem", at = @At("RETURN"), cancellable = true)
        public void isBreedingItem (ItemStack itemStack, CallbackInfoReturnable <Boolean> cir){
            cir.setReturnValue(isBreedingItemMixin(itemStack));
        }

        private boolean isBreedingItemMixin (@NotNull ItemStack stack){
            return TAMING_INGREDIENTS.contains(stack.getItem());
        }

        ///////////////////////////////////////////////////////////////////////////

        @Inject(method = "isBaby", at = @At("RETURN"), cancellable = true)
        public void isBaby (CallbackInfoReturnable <Boolean> cir) {
            cir.setReturnValue(isBabyMixin());
        }

        private boolean isBabyMixin () {
            return ((ParrotEntity) (Object) this).getBreedingAge() < 0;
        }

        ///////////////////////////////////////////////////////////////////////////

        @Inject(method = "canBreedWith", at = @At("RETURN"), cancellable = true)
        public void canBreedWith (AnimalEntity other, CallbackInfoReturnable <Boolean> cir){
            cir.setReturnValue(canBreedWithMixin(other));
        }

        private boolean canBreedWithMixin (AnimalEntity other){
            if (!((ParrotEntity) (Object) this).isTamed()) {
                return false;
            } else if (!(other instanceof ParrotEntity)) {
                return false;
            } else {
                ParrotEntity parrotEntity = (ParrotEntity) other;
                return parrotEntity.isTamed() && super.canBreedWith(other);
            }
        }

        ///////////////////////////////////////////////////////////////////////////

        @Inject(method = "initGoals", at = @At("TAIL"))
        public void initGoals (CallbackInfo ci){
            this.goalSelector.add(10, new AnimalMateGoal(this, 0.8D));
        }


}
