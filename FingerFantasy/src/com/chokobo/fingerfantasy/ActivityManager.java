package com.chokobo.fingerfantasy;

import android.content.Intent;
import android.graphics.Color;
import android.widget.TextView;

public class ActivityManager {
	static BattleActivity origin_activity;

	static public void setActivity(BattleActivity activity) {
		origin_activity = activity;
	}

	static public void intentActivity() {
		Intent i = new Intent(origin_activity,
				com.chokobo.fingerfantasy.ReesultActivity.class);
		origin_activity.startActivityForResult(i, 1);
	}

	static public void setTurn(int turn) {
		TextView turnText = (TextView) origin_activity
				.findViewById(R.id.turn_text);
		turnText.setText(Integer.toString(turn));
		if (turn == 1)
			turnText.setTextColor(Color.RED);
		else
			turnText.setTextColor(Color.BLACK);
	}

	static public void showContinue() {
		origin_activity.showContinue();
	}
}