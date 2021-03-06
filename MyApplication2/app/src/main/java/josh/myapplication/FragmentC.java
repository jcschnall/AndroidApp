package josh.myapplication;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentC.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentC#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentC extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public FragmentC() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentC.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentC newInstance(String param1, String param2) {
        FragmentC fragment = new FragmentC();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        //JsonObjectRequest
        Sunlight jsonData = new Sunlight();
        String tokenData = jsonData.fetchJSON("https://congress.api.sunlightfoundation.com/legislators?chamber=house&apikey=52bf01e9cad0422c8e3c1faa809ad959&per_page=all");

        //parse json
        Gson gson = new Gson();
        Legislators response = gson.fromJson(tokenData, Legislators.class);



        //add selected json results to textview
        Results listOfResults = response.getResults().get(0);



        //assign data to text
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_fragment_c, container, false);



        // Set the Text to try this out
        //TextView t = (TextView) myInflatedView.findViewById(R.id.fragBText);
        //t.setText(listOfResults.getChamber());  //tokenData


        // try to set the listView
        AndroidListAdapter androidListAdapter = new AndroidListAdapter(this.getActivity(), response.getResults());
        final ListView androidListView = (ListView) myInflatedView.findViewById(R.id.custom_listview_exampleC);
        androidListView.setAdapter(androidListAdapter);


        androidListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long arg)
            {
                Intent intent = new Intent(getActivity(), Detail3.class);
                //EditText editText = (EditText) findViewById(R.id.edit_message);
                //String message = editText.getText().toString();
                Results selectedFromList = (Results)(androidListView.getItemAtPosition(position));

                intent.putExtra("STRING_I_NEED",selectedFromList.getLastName()+", "+selectedFromList.getFirstName());
                intent.putExtra("STRING_I_NEED1",selectedFromList.getOcEmail());
                intent.putExtra("STRING_I_NEED2",selectedFromList.getChamber());
                intent.putExtra("STRING_I_NEED3",selectedFromList.getPhone());
                intent.putExtra("STRING_I_NEED4",selectedFromList.getTermStart());
                intent.putExtra("STRING_I_NEED5",selectedFromList.getTermEnd()); //Active for now.....json
                intent.putExtra("STRING_I_NEED6",selectedFromList.getTermStart());
                intent.putExtra("STRING_I_NEED7",selectedFromList.getOffice());
                intent.putExtra("STRING_I_NEED8",selectedFromList.getState());
                intent.putExtra("STRING_I_NEED9",selectedFromList.getFax());
                intent.putExtra("STRING_I_NEED10",selectedFromList.getBirthday());
                intent.putExtra("STRING_I_NEED11",selectedFromList.getBioguideId());
                intent.putExtra("STRING_I_NEED12",selectedFromList.getFacebookId());
                intent.putExtra("STRING_I_NEED13",selectedFromList.getTwitterId());
                intent.putExtra("STRING_I_NEED14",selectedFromList.getWebsite());

                startActivity(intent);

            }
        });




        // Inflate the layout for this fragment
        return myInflatedView;



    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
