package com.example.roast;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class START extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.getActionBar().hide();
		setContentView(R.layout.start);
		
		
		
		
		final TextView txt1 = (TextView) findViewById(R.id.TextView01);
		final TextView txt2 = (TextView) findViewById(R.id.TextView02);
		final TextView txt3 = (TextView) findViewById(R.id.TextView03);
		final TextView txt4 = (TextView) findViewById(R.id.TextView04);
		final TextView txt5 = (TextView) findViewById(R.id.TextView05);
		final TextView txt6 = (TextView) findViewById(R.id.TextView06);
		final TextView txt7 = (TextView) findViewById(R.id.TextView07);
		final TextView txt8 = (TextView) findViewById(R.id.TextView08);
		final TextView txt9 = (TextView) findViewById(R.id.TextView09);
		final TextView txt10 = (TextView) findViewById(R.id.TextView10);
		final TextView txt11 = (TextView) findViewById(R.id.TextView11);
		final TextView txt12 = (TextView) findViewById(R.id.TextView12);
		final TextView txt13 = (TextView) findViewById(R.id.TextView13);
		final TextView txt14 = (TextView) findViewById(R.id.TextView14);
		final TextView txt15 = (TextView) findViewById(R.id.TextView15);
		final TextView txt16 = (TextView) findViewById(R.id.TextView16);
		final TextView txt17 = (TextView) findViewById(R.id.TextView17);
		final TextView txt18 = (TextView) findViewById(R.id.TextView18);
		final TextView txt19 = (TextView) findViewById(R.id.TextView19);
		final TextView txt20 = (TextView) findViewById(R.id.TextView20);
		final TextView txt21 = (TextView) findViewById(R.id.TextView21);
		final TextView txt22 = (TextView) findViewById(R.id.TextView22);
		final TextView txt23 = (TextView) findViewById(R.id.TextView23);
		final TextView txt24 = (TextView) findViewById(R.id.TextView24);
		final TextView txt25 = (TextView) findViewById(R.id.TextView25);
		final TextView txt26 = (TextView) findViewById(R.id.TextView26);
		final TextView txt27 = (TextView) findViewById(R.id.TextView27);
		final TextView txt28 = (TextView) findViewById(R.id.TextView28);
		final TextView txt29 = (TextView) findViewById(R.id.TextView29);
		final TextView txt30 = (TextView) findViewById(R.id.TextView30);
		final TextView txt31 = (TextView) findViewById(R.id.TextView31);
		final TextView txt32 = (TextView) findViewById(R.id.TextView32);
		final TextView txt33 = (TextView) findViewById(R.id.TextView33);
		final TextView txt34 = (TextView) findViewById(R.id.TextView34);
		final TextView txt35 = (TextView) findViewById(R.id.TextView35);
		final TextView txt36 = (TextView) findViewById(R.id.TextView36);
		final TextView txt37 = (TextView) findViewById(R.id.TextView37);
		final TextView txt38 = (TextView) findViewById(R.id.TextView38);
		final TextView txt39 = (TextView) findViewById(R.id.TextView39);
		final TextView txt40 = (TextView) findViewById(R.id.TextView40);

		txt1.setVisibility(txt1.INVISIBLE);
		txt2.setVisibility(txt2.INVISIBLE);
		txt3.setVisibility(txt3.INVISIBLE);
		txt4.setVisibility(txt4.INVISIBLE);
		txt5.setVisibility(txt5.INVISIBLE);
		txt6.setVisibility(txt6.INVISIBLE);
		txt7.setVisibility(txt7.INVISIBLE);
		txt8.setVisibility(txt8.INVISIBLE);
		txt9.setVisibility(txt9.INVISIBLE);
		txt10.setVisibility(txt10.INVISIBLE);
		txt11.setVisibility(txt11.INVISIBLE);
		txt12.setVisibility(txt12.INVISIBLE);
		txt13.setVisibility(txt13.INVISIBLE);
		txt14.setVisibility(txt14.INVISIBLE);
		txt15.setVisibility(txt15.INVISIBLE);
		txt16.setVisibility(txt16.INVISIBLE);
		txt17.setVisibility(txt17.INVISIBLE);
		txt18.setVisibility(txt18.INVISIBLE);
		txt19.setVisibility(txt19.INVISIBLE);
		txt20.setVisibility(txt20.INVISIBLE);
		txt21.setVisibility(txt21.INVISIBLE);
		txt22.setVisibility(txt22.INVISIBLE);
		txt23.setVisibility(txt23.INVISIBLE);
		txt24.setVisibility(txt24.INVISIBLE);
		txt25.setVisibility(txt25.INVISIBLE);
		txt26.setVisibility(txt26.INVISIBLE);
		txt27.setVisibility(txt27.INVISIBLE);
		txt28.setVisibility(txt28.INVISIBLE);
		txt29.setVisibility(txt29.INVISIBLE);
		txt30.setVisibility(txt30.INVISIBLE);
		txt31.setVisibility(txt31.INVISIBLE);
		txt32.setVisibility(txt32.INVISIBLE);
		txt33.setVisibility(txt33.INVISIBLE);
		txt34.setVisibility(txt34.INVISIBLE);
		txt35.setVisibility(txt35.INVISIBLE);
		txt36.setVisibility(txt36.INVISIBLE);
		txt37.setVisibility(txt37.INVISIBLE);
		txt38.setVisibility(txt38.INVISIBLE);
		txt39.setVisibility(txt39.INVISIBLE);
		txt40.setVisibility(txt40.INVISIBLE);

		final AnimationSet animSet = new AnimationSet(true);
		Animation scaleZoom = AnimationUtils.loadAnimation(START.this, R.anim.fade);
		animSet.addAnimation(scaleZoom);
		
		final Handler handler = new Handler();

		// 여기서부터 애니메이션

		// R
		new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				handler.post(new Runnable() {
					@Override
					public void run() {
						// TODO Auto-generated method stub
						txt8.setBackgroundColor(Color.RED);
						txt8.startAnimation(animSet);
						txt8.setVisibility(txt8.VISIBLE);
						txt6.setBackgroundColor(Color.RED);
						txt6.startAnimation(animSet);
						txt6.setVisibility(txt6.VISIBLE);
						txt4.setBackgroundColor(Color.RED);
						txt4.startAnimation(animSet);
						txt4.setVisibility(txt4.VISIBLE);
						txt1.setBackgroundColor(Color.RED);
						txt1.startAnimation(animSet);
						txt1.setVisibility(txt1.VISIBLE);
						txt2.setBackgroundColor(Color.RED);
						txt2.startAnimation(animSet);
						txt2.setVisibility(txt2.VISIBLE);
						txt3.setBackgroundColor(Color.RED);
						txt3.startAnimation(animSet);
						txt3.setVisibility(txt3.VISIBLE);
						txt5.setBackgroundColor(Color.RED);
						txt5.startAnimation(animSet);
						txt5.setVisibility(txt5.VISIBLE);
						txt7.setBackgroundColor(Color.RED);
						txt7.startAnimation(animSet);
						txt7.setVisibility(txt7.VISIBLE);
						txt9.setBackgroundColor(Color.RED);
						txt9.startAnimation(animSet);
						txt9.setVisibility(txt9.VISIBLE);
					}
				});

			}
		}.start();

		// try {
		// Thread.sleep(100);
		// } catch (InterruptedException e1) {
		// // TODO Auto-generated catch block
		// e1.printStackTrace();
		// }
		//
		// O
		new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(1200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				handler.post(new Runnable() {
					@Override
					public void run() {
						// TODO Auto-generated method stub
						txt10.setBackgroundColor(Color.BLACK);
						txt10.startAnimation(animSet);
						txt10.setVisibility(txt10.VISIBLE);
						txt11.setBackgroundColor(Color.BLACK);
						txt11.startAnimation(animSet);
						txt11.setVisibility(txt11.VISIBLE);
						txt12.setBackgroundColor(Color.BLACK);
						txt12.startAnimation(animSet);
						txt12.setVisibility(txt12.VISIBLE);
						txt13.setBackgroundColor(Color.BLACK);
						txt13.startAnimation(animSet);
						txt13.setVisibility(txt13.VISIBLE);
						txt14.setBackgroundColor(Color.BLACK);
						txt14.startAnimation(animSet);
						txt14.setVisibility(txt14.VISIBLE);
						txt15.setBackgroundColor(Color.BLACK);
						txt15.startAnimation(animSet);
						txt15.setVisibility(txt15.VISIBLE);
						txt16.setBackgroundColor(Color.BLACK);
						txt16.startAnimation(animSet);
						txt16.setVisibility(txt16.VISIBLE);
						txt17.setBackgroundColor(Color.BLACK);
						txt17.startAnimation(animSet);
						txt17.setVisibility(txt17.VISIBLE);
					}
				});
			}
		}.start();
		// try {
		// Thread.sleep(100);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// A--------------------------------------------------------------------------------------
		new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(1900);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				handler.post(new Runnable() {
					@Override
					public void run() {
						// TODO Auto-generated method stub
						txt18.setBackgroundColor(Color.DKGRAY);
						txt18.startAnimation(animSet);
						txt18.setVisibility(txt18.VISIBLE);
						txt19.setBackgroundColor(Color.DKGRAY);
						txt19.startAnimation(animSet);
						txt19.setVisibility(txt19.VISIBLE);
						txt20.setBackgroundColor(Color.DKGRAY);
						txt20.startAnimation(animSet);
						txt20.setVisibility(txt20.VISIBLE);
						txt21.setBackgroundColor(Color.DKGRAY);
						txt21.startAnimation(animSet);
						txt21.setVisibility(txt21.VISIBLE);
						txt22.setBackgroundColor(Color.DKGRAY);
						txt22.startAnimation(animSet);
						txt22.setVisibility(txt22.VISIBLE);
						txt23.setBackgroundColor(Color.DKGRAY);
						txt23.startAnimation(animSet);
						txt23.setVisibility(txt23.VISIBLE);
						txt24.setBackgroundColor(Color.DKGRAY);
						txt24.startAnimation(animSet);
						txt24.setVisibility(txt24.VISIBLE);
						txt25.setBackgroundColor(Color.DKGRAY);
						txt25.startAnimation(animSet);
						txt25.setVisibility(txt25.VISIBLE);
						txt26.setBackgroundColor(Color.DKGRAY);
						txt26.startAnimation(animSet);
						txt26.setVisibility(txt26.VISIBLE);
						txt27.setBackgroundColor(Color.DKGRAY);
						txt27.startAnimation(animSet);
						txt27.setVisibility(txt27.VISIBLE);
					}
				});
			}
		}.start();
		// S-------------------------------------------------------------------------
		// try {
		// Thread.sleep(100);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(2600);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				handler.post(new Runnable() {
					@Override
					public void run() {
						// TODO Auto-generated method stub
						txt28.setBackgroundColor(Color.BLUE);
						txt28.startAnimation(animSet);
						txt28.setVisibility(txt28.VISIBLE);
						txt29.setBackgroundColor(Color.BLUE);
						txt29.startAnimation(animSet);
						txt29.setVisibility(txt29.VISIBLE);
						txt30.setBackgroundColor(Color.BLUE);
						txt30.startAnimation(animSet);
						txt30.setVisibility(txt30.VISIBLE);
						txt31.setBackgroundColor(Color.BLUE);
						txt31.startAnimation(animSet);
						txt31.setVisibility(txt31.VISIBLE);
						txt32.setBackgroundColor(Color.BLUE);
						txt32.startAnimation(animSet);
						txt32.setVisibility(txt32.VISIBLE);
						txt33.setBackgroundColor(Color.BLUE);
						txt33.startAnimation(animSet);
						txt33.setVisibility(txt33.VISIBLE);

					}
				});
			}
		}.start();
		// T------------------------------------------------------------------------
		// try {
		// Thread.sleep(100);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(3300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				handler.post(new Runnable() {
					@Override
					public void run() {
						// TODO Auto-generated method stub

						txt34.setBackgroundColor(Color.GRAY);
						txt34.startAnimation(animSet);
						txt34.setVisibility(txt34.VISIBLE);
						txt35.setBackgroundColor(Color.GRAY);
						txt35.startAnimation(animSet);
						txt35.setVisibility(txt35.VISIBLE);
						txt36.setBackgroundColor(Color.GRAY);
						txt36.startAnimation(animSet);
						txt36.setVisibility(txt36.VISIBLE);
						txt37.setBackgroundColor(Color.GRAY);
						txt37.startAnimation(animSet);
						txt37.setVisibility(txt37.VISIBLE);
						txt38.setBackgroundColor(Color.GRAY);
						txt38.startAnimation(animSet);
						txt38.setVisibility(txt38.VISIBLE);
						txt39.setBackgroundColor(Color.GRAY);
						txt39.startAnimation(animSet);
						txt39.setVisibility(txt39.VISIBLE);
						txt40.setBackgroundColor(Color.GRAY);
						txt40.startAnimation(animSet);
						txt40.setVisibility(txt40.VISIBLE);

					}
				});
			}
		}.start();

		// try {
		// Thread.sleep(100);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		View.OnClickListener listener = new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent(START.this, MainActivity.class);
				startActivity(intent);
				
			}
		};
		final Button bt = (Button) findViewById(R.id.MainStart1);
		bt.setVisibility(bt.INVISIBLE);
		bt.setOnClickListener(listener);

		new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				handler.post(new Runnable() {
					@Override
					public void run() {
						// TODO Auto-generated method stub
						bt.startAnimation(animSet);
						bt.setVisibility(txt8.VISIBLE);
					}
				});

			}
		}.start();

		final RadioButton bt2 = (RadioButton) findViewById(R.id.Wave1);
		bt2.setVisibility(bt2.INVISIBLE);

		final AnimationSet animSet2 = new AnimationSet(true);
		Animation scaleZoom2 = AnimationUtils.loadAnimation(START.this, R.anim.wave);
		animSet2.addAnimation(scaleZoom2);

		new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(4500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				handler.post(new Runnable() {
					@Override
					public void run() {
						// TODO Auto-generated method stub
						bt2.startAnimation(animSet2);
					}
				});

			}
		}.start();

		final AnimationSet animSet3 = new AnimationSet(true);
		final AnimationSet animSet4 = new AnimationSet(true);
		final AnimationSet animSet5 = new AnimationSet(true);

		Animation scaleZoom3 = AnimationUtils.loadAnimation(START.this, R.anim.jump);
		Animation scaleZoom4 = AnimationUtils.loadAnimation(START.this, R.anim.jump2);
		Animation scaleZoom5 = AnimationUtils.loadAnimation(START.this, R.anim.wave_scale);

		animSet3.addAnimation(scaleZoom3);
		animSet4.addAnimation(scaleZoom4);
		animSet5.addAnimation(scaleZoom5);
		// R jump
		new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				handler.post(new Runnable() {
					@Override
					public void run() {
						// TODO Auto-generated method stub
						txt8.setBackgroundColor(Color.RED);
						txt8.startAnimation(animSet3);
						txt8.setVisibility(txt8.VISIBLE);
						txt6.setBackgroundColor(Color.RED);
						txt6.startAnimation(animSet3);
						txt6.setVisibility(txt6.VISIBLE);
						txt4.setBackgroundColor(Color.RED);
						txt4.startAnimation(animSet3);
						txt4.setVisibility(txt4.VISIBLE);
						txt1.setBackgroundColor(Color.RED);
						txt1.startAnimation(animSet3);
						txt1.setVisibility(txt1.VISIBLE);
						txt2.setBackgroundColor(Color.RED);
						txt2.startAnimation(animSet3);
						txt2.setVisibility(txt2.VISIBLE);
						txt3.setBackgroundColor(Color.RED);
						txt3.startAnimation(animSet3);
						txt3.setVisibility(txt3.VISIBLE);
						txt5.setBackgroundColor(Color.RED);
						txt5.startAnimation(animSet3);
						txt5.setVisibility(txt5.VISIBLE);
						txt7.setBackgroundColor(Color.RED);
						txt7.startAnimation(animSet3);
						txt7.setVisibility(txt7.VISIBLE);
						txt9.setBackgroundColor(Color.RED);
						txt9.startAnimation(animSet3);
						txt9.setVisibility(txt9.VISIBLE);
					}
				});

			}
		}.start();

		// A--------------------------------------------------------------------------------------
		// jump
		new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(7100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				handler.post(new Runnable() {
					@Override
					public void run() {
						// TODO Auto-generated method stub
						txt18.setBackgroundColor(Color.DKGRAY);
						txt18.startAnimation(animSet4);
						txt18.setVisibility(txt18.VISIBLE);
						txt19.setBackgroundColor(Color.DKGRAY);
						txt19.startAnimation(animSet4);
						txt19.setVisibility(txt19.VISIBLE);
						txt20.setBackgroundColor(Color.DKGRAY);
						txt20.startAnimation(animSet4);
						txt20.setVisibility(txt20.VISIBLE);
						txt21.setBackgroundColor(Color.DKGRAY);
						txt21.startAnimation(animSet4);
						txt21.setVisibility(txt21.VISIBLE);
						txt22.setBackgroundColor(Color.DKGRAY);
						txt22.startAnimation(animSet4);
						txt22.setVisibility(txt22.VISIBLE);
						txt23.setBackgroundColor(Color.DKGRAY);
						txt23.startAnimation(animSet4);
						txt23.setVisibility(txt23.VISIBLE);
						txt24.setBackgroundColor(Color.DKGRAY);
						txt24.startAnimation(animSet4);
						txt24.setVisibility(txt24.VISIBLE);
						txt25.setBackgroundColor(Color.DKGRAY);
						txt25.startAnimation(animSet4);
						txt25.setVisibility(txt25.VISIBLE);
						txt26.setBackgroundColor(Color.DKGRAY);
						txt26.startAnimation(animSet4);
						txt26.setVisibility(txt26.VISIBLE);
						txt27.setBackgroundColor(Color.DKGRAY);
						txt27.startAnimation(animSet4);
						txt27.setVisibility(txt27.VISIBLE);
					}
				});
			}
		}.start();
		// T-------------------------------------------
		new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(12000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				handler.post(new Runnable() {
					@Override
					public void run() {
						// TODO Auto-generated method stub

						txt8.setBackgroundColor(Color.RED);
						txt8.startAnimation(animSet5);
						txt8.setVisibility(txt8.VISIBLE);
						txt6.setBackgroundColor(Color.RED);
						txt6.startAnimation(animSet5);
						txt6.setVisibility(txt6.VISIBLE);
						txt4.setBackgroundColor(Color.RED);
						txt4.startAnimation(animSet5);
						txt4.setVisibility(txt4.VISIBLE);
						txt1.setBackgroundColor(Color.RED);
						txt1.startAnimation(animSet5);
						txt1.setVisibility(txt1.VISIBLE);
						txt2.setBackgroundColor(Color.RED);
						txt2.startAnimation(animSet5);
						txt2.setVisibility(txt2.VISIBLE);
						txt3.setBackgroundColor(Color.RED);
						txt3.startAnimation(animSet5);
						txt3.setVisibility(txt3.VISIBLE);
						txt5.setBackgroundColor(Color.RED);
						txt5.startAnimation(animSet5);
						txt5.setVisibility(txt5.VISIBLE);
						txt7.setBackgroundColor(Color.RED);
						txt7.startAnimation(animSet5);
						txt7.setVisibility(txt7.VISIBLE);
						txt9.setBackgroundColor(Color.RED);
						txt9.startAnimation(animSet5);
						txt9.setVisibility(txt9.VISIBLE);
						txt10.setBackgroundColor(Color.BLACK);
						txt10.startAnimation(animSet5);
						txt10.setVisibility(txt10.VISIBLE);
						txt11.setBackgroundColor(Color.BLACK);
						txt11.startAnimation(animSet5);
						txt11.setVisibility(txt11.VISIBLE);
						txt12.setBackgroundColor(Color.BLACK);
						txt12.startAnimation(animSet5);
						txt12.setVisibility(txt12.VISIBLE);
						txt13.setBackgroundColor(Color.BLACK);
						txt13.startAnimation(animSet5);
						txt13.setVisibility(txt13.VISIBLE);
						txt14.setBackgroundColor(Color.BLACK);
						txt14.startAnimation(animSet5);
						txt14.setVisibility(txt14.VISIBLE);
						txt15.setBackgroundColor(Color.BLACK);
						txt15.startAnimation(animSet5);
						txt15.setVisibility(txt15.VISIBLE);
						txt16.setBackgroundColor(Color.BLACK);
						txt16.startAnimation(animSet5);
						txt16.setVisibility(txt16.VISIBLE);
						txt17.setBackgroundColor(Color.BLACK);
						txt17.startAnimation(animSet5);
						txt17.setVisibility(txt17.VISIBLE);
						txt18.setBackgroundColor(Color.DKGRAY);
						txt18.startAnimation(animSet5);
						txt18.setVisibility(txt18.VISIBLE);
						txt19.setBackgroundColor(Color.DKGRAY);
						txt19.startAnimation(animSet5);
						txt19.setVisibility(txt19.VISIBLE);
						txt20.setBackgroundColor(Color.DKGRAY);
						txt20.startAnimation(animSet5);
						txt20.setVisibility(txt20.VISIBLE);
						txt21.setBackgroundColor(Color.DKGRAY);
						txt21.startAnimation(animSet5);
						txt21.setVisibility(txt21.VISIBLE);
						txt22.setBackgroundColor(Color.DKGRAY);
						txt22.startAnimation(animSet5);
						txt22.setVisibility(txt22.VISIBLE);
						txt23.setBackgroundColor(Color.DKGRAY);
						txt23.startAnimation(animSet5);
						txt23.setVisibility(txt23.VISIBLE);
						txt24.setBackgroundColor(Color.DKGRAY);
						txt24.startAnimation(animSet5);
						txt24.setVisibility(txt24.VISIBLE);
						txt25.setBackgroundColor(Color.DKGRAY);
						txt25.startAnimation(animSet5);
						txt25.setVisibility(txt25.VISIBLE);
						txt26.setBackgroundColor(Color.DKGRAY);
						txt26.startAnimation(animSet5);
						txt26.setVisibility(txt26.VISIBLE);
						txt27.setBackgroundColor(Color.DKGRAY);
						txt27.startAnimation(animSet5);
						txt27.setVisibility(txt27.VISIBLE);
						txt28.setBackgroundColor(Color.BLUE);
						txt28.startAnimation(animSet5);
						txt28.setVisibility(txt28.VISIBLE);
						txt29.setBackgroundColor(Color.BLUE);
						txt29.startAnimation(animSet5);
						txt29.setVisibility(txt29.VISIBLE);
						txt30.setBackgroundColor(Color.BLUE);
						txt30.startAnimation(animSet5);
						txt30.setVisibility(txt30.VISIBLE);
						txt31.setBackgroundColor(Color.BLUE);
						txt31.startAnimation(animSet5);
						txt31.setVisibility(txt31.VISIBLE);
						txt32.setBackgroundColor(Color.BLUE);
						txt32.startAnimation(animSet5);
						txt32.setVisibility(txt32.VISIBLE);
						txt33.setBackgroundColor(Color.BLUE);
						txt33.startAnimation(animSet5);
						txt33.setVisibility(txt33.VISIBLE);
						txt34.setBackgroundColor(Color.GRAY);
						txt34.startAnimation(animSet5);
						txt34.setVisibility(txt34.VISIBLE);
						txt35.setBackgroundColor(Color.GRAY);
						txt35.startAnimation(animSet5);
						txt35.setVisibility(txt35.VISIBLE);
						txt36.setBackgroundColor(Color.GRAY);
						txt36.startAnimation(animSet5);
						txt36.setVisibility(txt36.VISIBLE);
						txt37.setBackgroundColor(Color.GRAY);
						txt37.startAnimation(animSet5);
						txt37.setVisibility(txt37.VISIBLE);
						txt38.setBackgroundColor(Color.GRAY);
						txt38.startAnimation(animSet5);
						txt38.setVisibility(txt38.VISIBLE);
						txt39.setBackgroundColor(Color.GRAY);
						txt39.startAnimation(animSet5);
						txt39.setVisibility(txt39.VISIBLE);
						txt40.setBackgroundColor(Color.GRAY);
						txt40.startAnimation(animSet5);
						txt40.setVisibility(txt40.VISIBLE);

					}
				});
			}
		}.start();

	}
}
