package com.example.roast;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Rank extends Activity {
	WordDBHelper mHelper;
	int rank=1;

	@SuppressLint("InflateParams")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		
		this.getActionBar().hide(); //액션바숨기기
		
		
		Intent intent = getIntent();
		
		
		
		
		setContentView(R.layout.rank);
		final int score = intent.getIntExtra("score", -1);
		mHelper = new WordDBHelper(this);

		// TODO Auto-generated method stub
		LayoutInflater vi = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		final LinearLayout titleLayout = (LinearLayout) vi.inflate(R.layout.rank_alert, null);
		

		final Button bt = (Button) findViewById(R.id.RankDelete);
		
		final TextView txt = (TextView) findViewById(R.id.RANK);
		final EditText name = (EditText) titleLayout.findViewById(R.id.name);
		// SharedPreferences user =
		// getSharedPreferences("user",Context.MODE_PRIVATE);
		// final SharedPreferences.Editor editor = user.edit();
		//
		
		
		new AlertDialog.Builder(Rank.this).setTitle("점수 : " + score + "점 \n이름을 입력하세요.").setView(titleLayout)
				.setNeutralButton("확인", new DialogInterface.OnClickListener() {

					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						// 삽입---------------------------
						SQLiteDatabase db;
						ContentValues row;
						db = mHelper.getWritableDatabase();// 디비 오픈
						db.execSQL("INSERT INTO RoastTBL VALUES (null, " + score + ", '" + name.getText().toString() + "');");
						mHelper.close();// 디비 닫음
						// 갱신----------------------------
						db = mHelper.getReadableDatabase();
						Cursor cursor;
						
						cursor = db.rawQuery("SELECT score, name FROM RoastTBL order by score desc", null);
						String Result = "";
						while (cursor.moveToNext() && rank<=10) {// 다음것이 있으면 true
							
							String score = cursor.getString(0);// ColumnIndex = 0
							String _name = cursor.getString(1);
							Result += (rank +"위    "+_name + "    " + score + "점\n");
							rank++;
						}
						if (Result.length() == 0) {
							txt.setText("Empyt Set");
						} else {
							txt.setText(Result);
						}
						cursor.close();// 커서닫고
						mHelper.close();// 디비 닫고
					}
				}).show();

		
		LayoutInflater vi2 = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		final LinearLayout deleteLayout = (LinearLayout) vi2.inflate(R.layout.delete_alelrt, null);
		final EditText pw = (EditText) deleteLayout.findViewById(R.id.pw);
		
		View.OnClickListener listener = new View.OnClickListener(){
			public void onClick(View v) {
				new AlertDialog.Builder(Rank.this).setTitle("관리자 비밀번호를 입력하세요.").setView(deleteLayout)
				.setNeutralButton("확인", new DialogInterface.OnClickListener() {

					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						if(pw.getText().toString().equals("2gksmfwkd2")){
							SQLiteDatabase db;
							ContentValues row;
							db = mHelper.getWritableDatabase();// 디비 오픈
							//삭제
							db.execSQL("DROP TABLE RoastTBL");
							//생성
							db.execSQL("CREATE TABLE RoastTBL ( id INTEGER PRIMARY KEY AUTOINCREMENT, " +
									"score INTEGER, name TEXT);");
							//갱신
						
							db = mHelper.getReadableDatabase();
							Cursor cursor;
							
							cursor = db.rawQuery("SELECT score, name FROM RoastTBL order by score desc", null);
							String Result = "";
							while (cursor.moveToNext() && rank<=10) {// 다음것이 있으면 true
								
								String score = cursor.getString(0);// ColumnIndex = 0
								String _name = cursor.getString(1);
								Result += (rank +"위    "+_name + "    " + score + "점\n");
								rank++;
							}
							if (Result.length() == 0) {
								txt.setText("Emtpy Set");
							} else {
								
									
								txt.setText(Result);
								
								
							}
							cursor.close();// 커서닫고
							mHelper.close();// 디비 닫고
							
						}
					}
				}).show();				
				
			}
		};
		bt.setOnClickListener(listener);
		
		
	}

}
