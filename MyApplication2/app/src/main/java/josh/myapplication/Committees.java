package josh.myapplication;

/**
 * Created by Josh on 11/28/16.
 */


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class Committees {


        @SerializedName("results")
        @Expose
        private List<ResultsC> results = new ArrayList<ResultsC>();
        @SerializedName("count")
        @Expose
        private Integer count;
        @SerializedName("page")



        /**
         *
         * @return
         * The results
         */
        public List<ResultsC> getResults() {
            return results;
        }

        /**
         *
         * @param results
         * The results
         */
        public void setResults(List<ResultsC> results) {
            this.results = results;
        }

        /**
         *
         * @return
         * The count
         */
        public Integer getCount() {
            return count;
        }

        /**
         *
         * @param count
         * The count
         */
        public void setCount(Integer count) {
            this.count = count;
        }



    }













