package com.xiaolin.xoverhaul.client.armor;

import com.xiaolin.xoverhaul.item.VillageCrownItem;
import net.minecraft.client.render.entity.EntityRendererFactory;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class VillageCrownArmorRenderer extends GeoArmorRenderer<VillageCrownItem> {

    public VillageCrownArmorRenderer() {
        super(new VillageCrownArmorModel());
    }

}
