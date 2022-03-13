package com.example.fragmentlifecycle;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment_1 extends Fragment {

    private static final String TAG = "Fragment_1";

    public Fragment_1() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        Log.d(TAG, "onAttach: Fragment_1");

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // The very first method to be called when the fragment has
        // been associated with the activity. This method executes
        // only once during the lifetime of a fragment.

        Log.d(TAG, "onCreate: Fragment_1");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        // This method initializes the fragment by adding all the required attributes and components.

        View view = inflater.inflate(R.layout.fragment_1, container, false);

        Log.d(TAG, "onCreateView: Fragment_1");

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // It indicates that the activity has been created in which the
        // fragment exists. View hierarchy of the fragment
        // also instantiated before this function call.

        Log.d(TAG, "onActivityCreated: Fragment_1");

    }

    @Override
    public void onStart() {
        super.onStart();

        // The system invokes this method to make the fragment visible on the user’s device.

        Log.d(TAG, "onStart: Fragment_1");

    }

    @Override
    public void onResume() {
        super.onResume();

        // This method is called to make the visible fragment interactive.

        Log.d(TAG, "onResume: Fragment_1");

    }

    @Override
    public void onPause() {
        super.onPause();

        // It indicates that the user is leaving the fragment.
        // System call this method to commit the changes made to the fragment.

        Log.d(TAG, "onPause: Fragment_1");

    }

    @Override
    public void onStop() {
        super.onStop();

        // Method to terminate the functioning and visibility
        // of fragment from the user’s screen.

        Log.d(TAG, "onStop: Fragment_1");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        // System calls this method to clean up all kinds of
        // resources as well as view hierarchy associated with the fragment.

        Log.d(TAG, "onDestroyView: Fragment_1");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        // It is called to perform the final clean up of fragment’s
        //  state and its lifecycle.

        Log.d(TAG, "onDestroy: Fragment_1");

    }

    @Override
    public void onDetach() {
        super.onDetach();

        // The system executes this method to disassociate
        // the fragment from its host activity.

        Log.d(TAG, "onDetach: Fragment_1");

    }
}