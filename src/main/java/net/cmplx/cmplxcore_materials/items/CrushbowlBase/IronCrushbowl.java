package net.cmplx.cmplxcore_materials.items.CrushbowlBase;

import net.cmplx.cmplxcore_materials.CMPLXCoreMaterials;
import net.cmplx.cmplxcore_materials.tooltypes.CrushbowlItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;

public class IronCrushbowl extends CrushbowlItem{
	public IronCrushbowl() {
		super(ItemTier.IRON, -2, 0.0F, (new Item.Properties()).group(CMPLXCoreMaterials.CMPLXCORE_MATERIALS_TAB));
	}
}