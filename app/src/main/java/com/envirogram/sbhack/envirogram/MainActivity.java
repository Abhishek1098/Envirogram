package com.envirogram.sbhack.envirogram;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listViewMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.id_main_NavigtationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.id_NavigationView_feed:
                        setViewFeed();
                        return true;
                    case R.id.id_NavigationView_leaderboard:
                        setViewLeaderBoard();
                        return true;
                    case R.id.id_NavigationView_profile:
                        setViewProfile();
                        return true;
                }
                return false;
            }
        });
    }

    public void setViewFeed(){
        listViewMain = findViewById(R.id.id_main_ListView);
        ArrayList<Post> postArrayList = new ArrayList<>();
        //POPULATE THIS ARRAY LIST with posts
        //postArrayList.add(new Post(likeCount, int imageviewresource, caption, username));
        FeedAdapter feedAdapter = new FeedAdapter(this, R.layout.layout_list_feed, postArrayList);
        listViewMain.setAdapter(feedAdapter);
    }

    public void setViewLeaderBoard(){
        listViewMain = findViewById(R.id.id_main_ListView);
        ArrayList<User> userArrayList = new ArrayList<>();
        //POPULATE THIS ARRAY with users
        //userArrayList.add(new User(username))
        UserAdapter userAdapter = new UserAdapter(this, R.layout.layout_user, userArrayList);
        listViewMain.setAdapter(userAdapter);
    }

    public void setViewProfile(){

    }

}
