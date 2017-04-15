package com.deflatedpickle.justjunk;

public class Reference {
    public static final String MOD_ID = "dpjjm";
    public static final String NAME = "JustJunk";
    public static final String VERSION = "1.8.0";
    public static final String ACCEPTED_VERSIONS = "[1.11.2]";

    public static final String CLIENT_PROXY_CLASS = "com.deflatedpickle.justjunk.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "com.deflatedpickle.justjunk.proxy.ServerProxy";

    public static enum JustJunkItems{
        EMPTYTINCAN("emptytincan", "ItemEmptytincan"),
        TININGOT("tiningot", "ItemTiningot"),
        TINCAN("tincan", "ItemTincan"),
        ROTTINGFISH("rottingfish", "ItemRottingfish");

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
        TINBLOCK("tinblock", "BlockTinblock"),
        TINORE("tinore", "BlockTinore");

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
