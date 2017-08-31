package josh.myapplication; /**
 * Created by Josh on 11/28/16.
 */


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import josh.myapplication.Results;


public class Bills {


        @SerializedName("results")
        @Expose
        private List<ResultsB> results = new ArrayList<ResultsB>();
        @SerializedName("count")
        @Expose
        private Integer count;
        @SerializedName("page")



        /**
         *
         * @return
         * The results
         */
        public List<ResultsB> getResults() {
            return results;
        }

        /**
         *
         * @param results
         * The results
         */
        public void setResults(List<ResultsB> results) {
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









