package jbox.skillz.digidiary;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PopActivity extends AppCompatActivity {

    private TextView note;
    private TextView noteTitle;
    private TextView noteLoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);

        note = findViewById(R.id.note_show);
        noteTitle = findViewById(R.id.name);
        noteLoc = findViewById(R.id.date);

        String strNote = getIntent().getStringExtra("note_text");
        String strTitle = getIntent().getStringExtra("note_title");
        String strLoc = getIntent().getStringExtra("note_loc");

        note.setText(strNote);
        noteTitle.setText(strTitle);
        noteLoc.setText(strLoc);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
