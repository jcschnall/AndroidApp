package josh.myapplication;

/**
 * Created by Josh on 11/30/16.
 */


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Urls_ {



    //@Generated("org.jsonschema2pojo")

        @SerializedName("html")
        @Expose
        private String html;
        @SerializedName("pdf")
        @Expose
        private String pdf;
        @SerializedName("xml")
        @Expose
        private String xml;

        /**
         *
         * @return
         * The html
         */
        public String getHtml() {
            return html;
        }

        /**
         *
         * @param html
         * The html
         */
        public void setHtml(String html) {
            this.html = html;
        }

        /**
         *
         * @return
         * The pdf
         */
        public String getPdf() {
            return pdf;
        }

        /**
         *
         * @param pdf
         * The pdf
         */
        public void setPdf(String pdf) {
            this.pdf = pdf;
        }

        /**
         *
         * @return
         * The xml
         */
        public String getXml() {
            return xml;
        }

        /**
         *
         * @param xml
         * The xml
         */
        public void setXml(String xml) {
            this.xml = xml;
        }

    }


