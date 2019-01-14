package com.example.khris.lesson8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class QuizGameActivity extends QuizActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_game);
    }

    @Override public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        // load the menu layout resource into the options menu
        getMenuInflater().inflate(R.menu.gameoptions, menu);

        // set the appropriate Intent information for each menu item
        menu.findItem(R.id.help_menu_item).setIntent(new Intent(this, QuizHelpActivity.class));
        menu.findItem(R.id.settings_menu_item).setIntent(new Intent(this, QuizSettingsActivity.class));

        return true;
    }
    @Override public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        startActivity(item.getIntent()); return true;
    }
}
