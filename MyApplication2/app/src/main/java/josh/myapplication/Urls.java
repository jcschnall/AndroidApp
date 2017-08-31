package josh.myapplication;

/**
 * Created by Josh on 11/30/16.
 */


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Urls {



    //@Generated("org.jsonschema2pojo")

        @SerializedName("congress")
        @Expose
        private String congress;
        @SerializedName("govtrack")
        @Expose
        private String govtrack;
        @SerializedName("opencongress")
        @Expose
        private String opencongress;

        /**
         *
         * @return
         * The congress
         */
        public String getCongress() {
            return congress;
        }

        /**
         *
         * @param congress
         * The congress
         */
        public void setCongress(String congress) {
            this.congress = congress;
        }

        /**
         *
         * @return
         * The govtrack
         */
        public String getGovtrack() {
            return govtrack;
        }

        /**
         *
         * @param govtrack
         * The govtrack
         */
        public void setGovtrack(String govtrack) {
            this.govtrack = govtrack;
        }

        /**
         *
         * @return
         * The opencongress
         */
        public String getOpencongress() {
            return opencongress;
        }

        /**
         *
         * @param opencongress
         * The opencongress
         */
        public void setOpencongress(String opencongress) {
            this.opencongress = opencongress;
        }

    }



