package com.thebubblenetwork.skyfortress.kit;

import com.thebubblenetwork.api.framework.util.mc.items.ItemStackBuilder;
import com.thebubblenetwork.api.game.kit.Kit;
import com.thebubblenetwork.api.global.java.ArrayBuilder;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

/**
 * The Bubble Network 2016
 * SkyFortress
 * 20/02/2016 {17:50}
 * Created February 2016
 */
public class FarmerKit extends Kit {
    public static ChatColor COLOR = ChatColor.GRAY;

    public static ItemStackBuilder SWORD = new ItemStackBuilder(Material.WOOD_SWORD).withName(COLOR + "A default sword");
    public static ItemStackBuilder SHOVEL = new ItemStackBuilder(Material.WOOD_SPADE).withName(COLOR + "A default shovel");
    public static ItemStackBuilder PICK = new ItemStackBuilder(Material.WOOD_PICKAXE).withName(COLOR + "A default pick");
    public static ItemStackBuilder CARROTS = new ItemStackBuilder(Material.CARROT_ITEM).withAmount(16);
    public static ItemStackBuilder HELM = new ItemStackBuilder(Material.LEATHER_HELMET).withName(COLOR + "A default helm");
    public static ItemStackBuilder CHEST = new ItemStackBuilder(Material.LEATHER_CHESTPLATE).withName(COLOR + "A default chestplate");
    public static ItemStackBuilder PANTS = new ItemStackBuilder(Material.LEATHER_LEGGINGS).withName(COLOR + "Some default pants");
    public static ItemStackBuilder BOOTS = new ItemStackBuilder(Material.LEATHER_BOOTS).withName(COLOR + "Some default boots");

    public static ArrayBuilder<ItemStack> DEFAULTBUILD = newBuilder(4 * 9).withT(0, SWORD.build()).withT(1, SHOVEL.build()).withT(2, PICK.build()).withT(3, CARROTS.build()).withT(5, HELM.build()).withT(6, CHEST.build()).withT(7, PANTS.build()).withT(8, BOOTS.build());

    public static ArrayBuilder<ItemStack> newBuilder(int size) {
        return new ArrayBuilder<>(ItemStack.class, size);
    }

    public FarmerKit() {
        super(Material.STAINED_GLASS_PANE,
                Arrays.asList(
                        DEFAULTBUILD.build(),
                        DEFAULTBUILD.clone()
                                .withT(0, SWORD.clone().withType(Material.STONE_SWORD).build())
                                .withT(3, CARROTS.clone().withAmount(32).build())
                                .build(),
                        DEFAULTBUILD.clone()
                                .withT(0, SWORD.clone().withType(Material.STONE_SWORD).build())
                                .withT(1, SHOVEL.clone().withType(Material.STONE_SPADE).build())
                                .withT(2, PICK.clone().withType(Material.STONE_PICKAXE).build())
                                .withT(3, CARROTS.clone().withAmount(64).build())
                                .build(),
                        DEFAULTBUILD.clone()
                                .withT(0, SWORD.clone().withType(Material.STONE_SWORD).withEnchantment(Enchantment.DAMAGE_ALL, 1).build())
                                .withT(1, SHOVEL.clone().withType(Material.STONE_SPADE).build())
                                .withT(2, PICK.clone().withType(Material.STONE_PICKAXE).build()).withT(3, CARROTS.clone().withAmount(16).build())
                                .build(),
                        DEFAULTBUILD.clone()
                                .withT(0, SWORD.clone().withType(Material.STONE_SWORD).withEnchantment(Enchantment.DAMAGE_ALL, 1).build())
                                .withT(1, SHOVEL.clone().withType(Material.STONE_SPADE).withEnchantment(Enchantment.DAMAGE_ALL, 1).build())
                                .withT(2, PICK.clone().withType(Material.STONE_PICKAXE).withEnchantment(Enchantment.DAMAGE_ALL, 1).build())
                                .withT(3, CARROTS.clone().withAmount(32).build())
                                .build(),
                        DEFAULTBUILD.clone()
                                .withT(0, SWORD.clone().withType(Material.STONE_SWORD).withEnchantment(Enchantment.DAMAGE_ALL, 1).build())
                                .withT(1, SHOVEL.clone().withType(Material.STONE_SPADE).withEnchantment(Enchantment.DAMAGE_ALL, 1).build())
                                .withT(2, PICK.clone().withType(Material.STONE_PICKAXE).withEnchantment(Enchantment.DAMAGE_ALL, 1).build())
                                .withT(3, CARROTS.clone().withAmount(64).build())
                                .withT(4, new ItemStackBuilder(Material.GOLDEN_APPLE).build())
                                .build(),
                        DEFAULTBUILD.clone()
                                .withT(0, SWORD.clone().withType(Material.STONE_SWORD).withEnchantment(Enchantment.DAMAGE_ALL, 1).build())
                                .withT(1, SHOVEL.clone().withType(Material.STONE_SPADE).withEnchantment(Enchantment.DAMAGE_ALL, 1).build())
                                .withT(2, PICK.clone().withType(Material.STONE_PICKAXE).withEnchantment(Enchantment.DAMAGE_ALL, 1).build())
                                .withT(3, CARROTS.clone().withType(Material.GOLDEN_CARROT).build())
                                .withT(4, new ItemStackBuilder(Material.GOLDEN_APPLE).withAmount(4).build())
                                .build())
                ,"Farmer", new String[]{"Consists of leather armor and a set of tools"}, 200);
    }
}