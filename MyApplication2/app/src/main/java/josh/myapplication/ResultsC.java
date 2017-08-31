package josh.myapplication;

/**
 * Created by Josh on 11/30/16.
 */



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResultsC {


    //@Generated("org.jsonschema2pojo")


        @SerializedName("chamber")
        @Expose
        private String chamber;
        @SerializedName("committee_id")
        @Expose
        private String committeeId;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("office")
        @Expose
        private String office;
        @SerializedName("phone")
        @Expose
        private String phone;
        @SerializedName("subcommittee")
        @Expose
        private Boolean subcommittee;
        @SerializedName("parent_committee_id")
        @Expose
        private String parentCommitteeId;

        /**
         *
         * @return
         * The chamber
         */
        public String getChamber() {
            return chamber;
        }

        /**
         *
         * @param chamber
         * The chamber
         */
        public void setChamber(String chamber) {
            this.chamber = chamber;
        }

        /**
         *
         * @return
         * The committeeId
         */
        public String getCommitteeId() {
            return committeeId;
        }

        /**
         *
         * @param committeeId
         * The committee_id
         */
        public void setCommitteeId(String committeeId) {
            this.committeeId = committeeId;
        }

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         *
         * @return
         * The office
         */
        public String getOffice() {
            return office;
        }

        /**
         *
         * @param office
         * The office
         */
        public void setOffice(String office) {
            this.office = office;
        }

        /**
         *
         * @return
         * The phone
         */
        public String getPhone() {
            return phone;
        }

        /**
         *
         * @param phone
         * The phone
         */
        public void setPhone(String phone) {
            this.phone = phone;
        }

        /**
         *
         * @return
         * The subcommittee
         */
        public Boolean getSubcommittee() {
            return subcommittee;
        }

        /**
         *
         * @param subcommittee
         * The subcommittee
         */
        public void setSubcommittee(Boolean subcommittee) {
            this.subcommittee = subcommittee;
        }

        /**
         *
         * @return
         * The parentCommitteeId
         */
        public String getParentCommitteeId() {
            return parentCommitteeId;
        }

        /**
         *
         * @param parentCommitteeId
         * The parent_committee_id
         */
        public void setParentCommitteeId(String parentCommitteeId) {
            this.parentCommitteeId = parentCommitteeId;
        }

    }



