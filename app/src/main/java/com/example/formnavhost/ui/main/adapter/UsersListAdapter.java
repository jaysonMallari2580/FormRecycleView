package com.example.formnavhost.ui.main.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.formnavhost.R;
import com.example.formnavhost.ui.main.UserProfile;
import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;
import java.util.LinkedList;

public class    UsersListAdapter extends RecyclerView.Adapter<UsersListAdapter.UsersListViewHolder> {

    ArrayList<UserProfile> mUsersList;

    public UsersListAdapter(ArrayList<UserProfile> mUsersList) {
        this.mUsersList = mUsersList;
    }

    @NonNull
    @Override
    public UsersListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UsersListViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.user_info, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull UsersListViewHolder holder, int position) {
        UserProfile userProfile = getItem(position);
        holder.name.setText(userProfile.getName());
        holder.email.setText(userProfile.getEmail());
        holder.schoolName.setText(userProfile.getSchoolName());
    }

    private UserProfile getItem(int position) {
        return mUsersList.get(position);
    }

    @Override
    public int getItemCount() {
        return mUsersList.size();
    }


    public class UsersListViewHolder extends RecyclerView.ViewHolder {
        private MaterialTextView name;
        private MaterialTextView email;
        private MaterialTextView schoolName;

        public UsersListViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name_textview);
            email = itemView.findViewById(R.id.email_textview);
            schoolName = itemView.findViewById(R.id.shcool_textview);
        }
    }
}
