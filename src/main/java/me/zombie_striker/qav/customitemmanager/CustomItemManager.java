package me.zombie_striker.qav.customitemmanager;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.io.File;
import java.util.HashMap;
import java.util.Set;

public class CustomItemManager {

	private static final HashMap<String, me.zombie_striker.qav.customitemmanager.AbstractItem> customItemTypes = new HashMap<>();

	public static Set<String> getCustomItemTypes(){return customItemTypes.keySet();}

	public static void registerItemType(String key, me.zombie_striker.qav.customitemmanager.AbstractItem item){
		customItemTypes.put(key,item);
	}
	public static AbstractItem getItemType(String key){
		return customItemTypes.get(key);
	}
	public static boolean isUsingCustomData(){
		try{
			new ItemStack(Material.DIAMOND_BLOCK).getItemMeta().hasCustomModelData();
			return true;
		}catch (Error | Exception ignored){

		}
		return false;
	}


}
