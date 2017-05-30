package com.deflatedpickle.justjunk;

public class Reference {
    public static final String MOD_ID = "dpjjm";
    public static final String NAME = "JustJunk";
    public static final String VERSION = "1.26.0";
    public static final String ACCEPTED_VERSIONS = "[1.11.2]";

    public static final String CLIENT_PROXY_CLASS = "com.deflatedpickle.justjunk.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "com.deflatedpickle.justjunk.proxy.ServerProxy";

    public static enum JustJunkItems{
        EMPTYTINCAN("emptytincan", "ItemEmptytincan"),
        TINCAN("tincan", "ItemTincan"),
        TOOTHBRUSH("toothbrush", "ItemToothbrush"),
        BROKENTOOTHBRUSH("brokentoothbrush", "ItemBrokentoothbrush"),
        TOOTHBRUSHSHIV("toothbrushshiv", "ItemToothbrushshiv"),
        TINFOIL("tinfoil", "ItemTinfoil"),
        EMPTYSURSTROMMINGCAN("emptysurstrommingcan", "ItemEmptysurstrommingcan"),
        DUCTTAPE("ducttape", "ItemDucttape"),
        BROKENSTICK("brokenstick", "ItemBrokenstick"),
        WOODENCHUNK("woodenchunk", "ItemWoodenchunk"),
        CRACKEDDIAMOND("crackeddiamond", "ItemCrackeddiamond"),

        TININGOT("tiningot", "ItemTiningot"),
        COPPERINGOT("copperingot", "ItemCopperingot"),
        PYRITEINGOT("pyriteingot", "ItemPyriteingot"),

        ROTTINGFISH("rottingfish", "ItemRottingfish"),
        SURSTROMMING("surstromming", "ItemSurstromming"),
        APPLECORE("applecore", "ItemApplecore"),
        APPLESEEDS("appleseeds", "ItemAppleseeds");

        private String unlocalizedName;
        private String registryName;

        JustJunkItems(String unlocalizedName, String registryName){
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;
        }

        public String getUnlocalizedName(){
            return unlocalizedName;
        }

        public String getRegistryName(){
            return registryName;
        }
    }

    public static enum JustJunkBlocks{
        PILEOFGARBAGE("pileofgarbage", "BlockPileofgarbage"),

        TINORE("tinore", "BlockTinore"),
        COPPERORE("copperore", "BlockCopperore"),
        PYRITEORE("pyriteore", "BlockPyriteore"),

        TINBLOCK("tinblock", "BlockTinblock"),
        COPPERBLOCK("copperblock", "BlockCopperblock"),
        PYRITEBLOCK("pyriteblock", "BlockPyriteblock");

        private String unlocalizedName;
        private String registryName;

        JustJunkBlocks(String unlocalizedName, String registryName){
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;
        }

        public String getUnlocalizedName(){
            return unlocalizedName;
        }

        public String getRegistryName(){
            return registryName;
        }
    }
}
