package josh.myapplication;

/**
 * Created by Josh on 11/28/16.
 */



import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Legislators {


        @SerializedName("results")
        @Expose
        private List<Results> results = new ArrayList<Results>();
        @SerializedName("count")
        @Expose
        private Integer count;
        @SerializedName("page")



        /**
         *
         * @return
         * The results
         */
        public List<Results> getResults() {
            return results;
        }

        /**
         *
         * @param results
         * The results
         */
        public void setResults(List<Results> results) {
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













