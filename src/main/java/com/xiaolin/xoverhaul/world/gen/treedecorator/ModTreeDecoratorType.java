package com.xiaolin.xoverhaul.world.gen.treedecorator;

import com.mojang.serialization.Codec;
import com.xiaolin.xoverhaul.XOverhaul;
import com.xiaolin.xoverhaul.mixin.TreeDecoratorTypeInvoker;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;

import javax.xml.crypto.dsig.XMLObject;

public class ModTreeDecoratorType implements TreeDecoratorTypeInvoker {

   public static TreeDecoratorType<TreeFungusTreeDecorator> TREE_FUNGUS = register("tree_fungus", TreeFungusTreeDecorator.CODEC);

   private static<P extends TreeDecorator> TreeDecoratorType<P> register(String id, Codec<P> codec) {
      return Registry.register(Registry.TREE_DECORATOR_TYPE, new Identifier(XOverhaul.MOD_ID, id), TreeDecoratorTypeInvoker.invokeTreeDecorator(codec));
   }

   public static void registerModTreeTypes(){
      XOverhaul.LOGGER.info("Registering Mod Tree Types for " + XOverhaul.MOD_ID);
   }



}
