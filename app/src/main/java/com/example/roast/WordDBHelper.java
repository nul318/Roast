package com.example.roast;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class WordDBHelper extends SQLiteOpenHelper {

	public WordDBHelper(Context context) {

		super(context, "Roast_rank.db", null, 1);// 두번째명은 db파일명임 네번째는 버젼

	}

	public void onCreate(SQLiteDatabase db) {

		// 쿼리구문 실행 dic라는 테이블을 만듬 속성은 _id eng han 3개가 있음

		// 주키는 _id고 인스턴스가 추가될때마다 +1씩 증가함

		db.execSQL("CREATE TABLE RoastTBL ( id INTEGER PRIMARY KEY AUTOINCREMENT, " +
		"score INTEGER, name TEXT);");

	}

	// 버젼이 바뀌었을때 처리

	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

		db.execSQL("DROP TABLE IF EXISTS dic");// 기존 테이블을 삭제하고

		onCreate(db);// 다시 만든다

	}

}
