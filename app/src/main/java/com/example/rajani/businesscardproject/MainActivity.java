package com.example.rajani.businesscardproject;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Spannable;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CollapsingToolbarLayout collapsingToolbarLayout = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        View cardView = findViewById(R.id.card);
        TextView phoneNumber = cardView.findViewById(R.id.tv_phone);
        TextView emailAddress = cardView.findViewById(R.id.tv_email);

        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbarLayout.setTitle(getResources().getString(R.string.title));

        toolbarTextAppearance();

        if (phoneNumber != null) {
            StringUtil.stripUnderlines((Spannable) phoneNumber.getText());
        }

        if (emailAddress != null) {
            StringUtil.stripUnderlines((Spannable) emailAddress.getText());
        }
    }

    private void toolbarTextAppearance() {
        collapsingToolbarLayout.setCollapsedTitleTextAppearance(R.style.collapsedappbar);
        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(android.R.color.transparent));
    }
}
