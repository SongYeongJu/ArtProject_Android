package com.example.artproject.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.artproject.Adapter.ListViewAdapter;
import com.example.artproject.Client.ClientInfoManager;
import com.example.artproject.R;

public class CheckTasteActivity extends AppCompatActivity {
    private ClientInfoManager clientInfoManager=ClientInfoManager.getInstance();

    private ListView listView;
    private ListViewAdapter adapter;

    private Button finishButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_taste);


        listView=(ListView)findViewById(R.id.myItemListView);
        adapter = new ListViewAdapter(CheckTasteActivity.this, R.layout.taste, clientInfoManager.getTastes());    // 데이터
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            }
        });

        finishButton=(Button)findViewById(R.id.tasteFinishButton);
        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CheckTasteActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
