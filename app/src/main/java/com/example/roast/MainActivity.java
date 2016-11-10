package com.example.roast;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
	int i = 0;
	int j = 20;
	int check = 0 ; //콤보를 위 해 이전에 무슨 색깔을 터치 했는지 저장하는 변수
	int count = 0; // 콤보 카운트
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.getActionBar().hide();
		setContentView(R.layout.activity_main);
		
		
		
		
		
		final GridLayout layout = (GridLayout) findViewById(R.id.GridLayout1); //레이아웃
		
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
		
		final TextView cmb = (TextView) findViewById(R.id.ComboView1);
		
		final Thread thread;
		final Handler handler = new Handler();
		
		final TextView score = (TextView) findViewById(R.id.SCORE);
		final TextView time = (TextView) findViewById(R.id.TimeView1);
		
		Button exit = (Button) findViewById(R.id.exit);
	
		View.OnClickListener listenerExit = new View.OnClickListener() {
			
			@Override
			public void onClick(final View v) {
				// TODO Auto-generated method stub
				j=-1;
				finish();
			};
		};

		
		exit.setOnClickListener(listenerExit);

		View.OnClickListener listener1 = new View.OnClickListener() {

			int col = Color.GRAY;
			boolean cnt = false;

			@Override
			public void onClick(final View v) {
				// TODO Auto-generated method stub
				if (col != Color.BLACK) {

					if (cnt == false || col == Color.GRAY) {
						if (col == Color.YELLOW) {
							v.setBackgroundColor(Color.RED);
							col = Color.RED;
						} else if (col == Color.RED) {
							v.setBackgroundColor(Color.BLACK);
							col = Color.BLACK;
						} else if (col == Color.GRAY) {
							v.setBackgroundColor(Color.YELLOW);
							col = Color.YELLOW;
						}
						cnt = true;
					} else {
						if (col == Color.RED) {
							
							check = Color.RED;
							i += 10;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade);	animSet.addAnimation(scaleZoom);txt1.startAnimation(animSet);
							if(check == 0 || check == Color.RED){
								AnimationSet animSet2 = new AnimationSet(true);								
								Animation scaleZoom3 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade2);
								
								animSet2.addAnimation(scaleZoom3);if(count%5==0){j++;}								
								
								if(count>=20){
									cmb.setTextColor(Color.BLUE);
									i+=10;									
									
									layout.setBackgroundColor(Color.RED);
									if(count==20){layout.setAnimation(animSet);}
									
								}
								if(count<20){
									cmb.setTextColor(Color.RED);
									layout.setBackgroundColor(Color.WHITE);
																		
								}
								
								i+=10;
								count++;							
								cmb.setText("Combo " + count);
								
								
								cmb.startAnimation(animSet2);
								
							}
							
							
								
							score.setText("Score : " + i);
						} else if (col == Color.YELLOW) {
							i -= 5;j-=1;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade);animSet.addAnimation(scaleZoom);txt1.startAnimation(animSet);
							
							count=0;
							cmb.setText("");
							
							check = Color.YELLOW;
							
							score.setText("Score : " + i);
						}

						v.setBackgroundColor(Color.GRAY);
						col = Color.GRAY;
					}

					if (col == Color.BLACK || col == Color.GRAY) {
						cnt = false;
					} else {
						new Thread() {
							@Override
							public void run() {
								// TODO Auto-generated method stub
								try {
									// col=Color.GRAY;
									// cnt=true;
									Thread.sleep(3000);
									// col=Color.YELLOW;
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								cnt = false;
								handler.post(new Runnable() {
									@Override
									public void run() {
										// TODO Auto-generated method stub
										if (col == Color.GRAY) {
										} else if (col == Color.YELLOW) {
											onClick(v);
										} else if (col == Color.RED) {
											onClick(v);
										}
									}
								});

							}
						}.start();
					}

				} // 여기까지 이프?
				else {

					i -= 10;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.hyperspace_out);animSet.addAnimation(scaleZoom);txt1.startAnimation(animSet);
					check = Color.BLACK;
					count=0; //콤보초기화
					cmb.setText("");
					score.setText("Score : " + i); // 검은거는 -10점
					v.setBackgroundColor(Color.GRAY);
					col = Color.GRAY;
				}
			}
		};
		View.OnClickListener listener2 = new View.OnClickListener() {

			int col = Color.GRAY;
			boolean cnt = false;

			@Override
			public void onClick(final View v) {
				// TODO Auto-generated method stub
				if (col != Color.BLACK) {

					if (cnt == false || col == Color.GRAY) {
						if (col == Color.YELLOW) {
							v.setBackgroundColor(Color.RED);
							col = Color.RED;
						} else if (col == Color.RED) {
							v.setBackgroundColor(Color.BLACK);
							col = Color.BLACK;
						} else if (col == Color.GRAY) {
							v.setBackgroundColor(Color.YELLOW);
							col = Color.YELLOW;
						}
						cnt = true;
					} else {
						if (col == Color.RED) {
							
							check = Color.RED;
							i += 10;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade);	animSet.addAnimation(scaleZoom);txt2.startAnimation(animSet);
							if(check == 0 || check == Color.RED){
								AnimationSet animSet2 = new AnimationSet(true);								
								Animation scaleZoom3 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade2);
								
								animSet2.addAnimation(scaleZoom3);if(count%5==0){j++;}								
								
								if(count>=20){
									cmb.setTextColor(Color.BLUE);
									i+=10;									
									layout.setBackgroundColor(Color.RED);
									if(count==20){layout.setAnimation(animSet);}
									
								}
								if(count<20){
									cmb.setTextColor(Color.RED);
									layout.setBackgroundColor(Color.WHITE);
																		
								}
								
								i+=10;
								count++;							
								cmb.setText("Combo " + count);
								
								
								cmb.startAnimation(animSet2);
								
							}
							
							
								
							score.setText("Score : " + i);
						} else if (col == Color.YELLOW) {
							i -= 5;j-=1;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade);animSet.addAnimation(scaleZoom);txt2.startAnimation(animSet);
							count=0;
							cmb.setText("");
							
							check = Color.YELLOW;
							
							score.setText("Score : " + i);
						}

						v.setBackgroundColor(Color.GRAY);
						col = Color.GRAY;
					}

					if (col == Color.BLACK || col == Color.GRAY) {
						cnt = false;
					} else {
						new Thread() {
							@Override
							public void run() {
								// TODO Auto-generated method stub
								try {
									// col=Color.GRAY;
									// cnt=true;
									Thread.sleep(3000);
									// col=Color.YELLOW;
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								cnt = false;
								handler.post(new Runnable() {
									@Override
									public void run() {
										// TODO Auto-generated method stub
										if (col == Color.GRAY) {
										} else if (col == Color.YELLOW) {
											onClick(v);
										} else if (col == Color.RED) {
											onClick(v);
										}
									}
								});

							}
						}.start();
					}

				} // 여기까지 이프?
				else {

					i -= 10;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.hyperspace_out);animSet.addAnimation(scaleZoom);txt2.startAnimation(animSet);
					check = Color.BLACK;
					count=0; //콤보초기화
					cmb.setText("");
					score.setText("Score : " + i); // 검은거는 -10점
					v.setBackgroundColor(Color.GRAY);
					col = Color.GRAY;
				}
			}
		};		View.OnClickListener listener3 = new View.OnClickListener() {

			int col = Color.GRAY;
			boolean cnt = false;

			@Override
			public void onClick(final View v) {
				// TODO Auto-generated method stub
				if (col != Color.BLACK) {

					if (cnt == false || col == Color.GRAY) {
						if (col == Color.YELLOW) {
							v.setBackgroundColor(Color.RED);
							col = Color.RED;
						} else if (col == Color.RED) {
							v.setBackgroundColor(Color.BLACK);
							col = Color.BLACK;
						} else if (col == Color.GRAY) {
							v.setBackgroundColor(Color.YELLOW);
							col = Color.YELLOW;
						}
						cnt = true;
					} else {
						if (col == Color.RED) {
							
							check = Color.RED;
							i += 10;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade);	animSet.addAnimation(scaleZoom);txt3.startAnimation(animSet);
							if(check == 0 || check == Color.RED){
								AnimationSet animSet2 = new AnimationSet(true);								
								Animation scaleZoom3 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade2);
								
								animSet2.addAnimation(scaleZoom3);if(count%5==0){j++;}								
								
								if(count>=20){
									cmb.setTextColor(Color.BLUE);
									i+=10;									
									layout.setBackgroundColor(Color.RED);
									if(count==20){layout.setAnimation(animSet);}
									
								}
								if(count<20){
									cmb.setTextColor(Color.RED);
									layout.setBackgroundColor(Color.WHITE);
																		
								}
								
								i+=10;
								count++;							
								cmb.setText("Combo " + count);
								
								
								cmb.startAnimation(animSet2);
								
							}
							
							
								
							score.setText("Score : " + i);
						} else if (col == Color.YELLOW) {
							i -= 5;j-=1;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade);animSet.addAnimation(scaleZoom);txt3.startAnimation(animSet);
							count=0;
							cmb.setText("");
							
							check = Color.YELLOW;
							
							score.setText("Score : " + i);
						}

						v.setBackgroundColor(Color.GRAY);
						col = Color.GRAY;
					}

					if (col == Color.BLACK || col == Color.GRAY) {
						cnt = false;
					} else {
						new Thread() {
							@Override
							public void run() {
								// TODO Auto-generated method stub
								try {
									// col=Color.GRAY;
									// cnt=true;
									Thread.sleep(3000);
									// col=Color.YELLOW;
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								cnt = false;
								handler.post(new Runnable() {
									@Override
									public void run() {
										// TODO Auto-generated method stub
										if (col == Color.GRAY) {
										} else if (col == Color.YELLOW) {
											onClick(v);
										} else if (col == Color.RED) {
											onClick(v);
										}
									}
								});

							}
						}.start();
					}

				} // 여기까지 이프?
				else {

					i -= 10;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.hyperspace_out);animSet.addAnimation(scaleZoom);txt3.startAnimation(animSet);
					check = Color.BLACK;
					count=0; //콤보초기화
					cmb.setText("");
					score.setText("Score : " + i); // 검은거는 -10점
					v.setBackgroundColor(Color.GRAY);
					col = Color.GRAY;
				}
			}
		};		View.OnClickListener listener4 = new View.OnClickListener() {

			int col = Color.GRAY;
			boolean cnt = false;

			@Override
			public void onClick(final View v) {
				// TODO Auto-generated method stub
				if (col != Color.BLACK) {

					if (cnt == false || col == Color.GRAY) {
						if (col == Color.YELLOW) {
							v.setBackgroundColor(Color.RED);
							col = Color.RED;
						} else if (col == Color.RED) {
							v.setBackgroundColor(Color.BLACK);
							col = Color.BLACK;
						} else if (col == Color.GRAY) {
							v.setBackgroundColor(Color.YELLOW);
							col = Color.YELLOW;
						}
						cnt = true;
					} else {
						if (col == Color.RED) {
							
							check = Color.RED;
							i += 10;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade);	animSet.addAnimation(scaleZoom);txt4.startAnimation(animSet);
							if(check == 0 || check == Color.RED){
								AnimationSet animSet2 = new AnimationSet(true);								
								Animation scaleZoom3 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade2);
								
								animSet2.addAnimation(scaleZoom3);if(count%5==0){j++;}								
								
								if(count>=20){
									cmb.setTextColor(Color.BLUE);
									i+=10;									
									layout.setBackgroundColor(Color.RED);
									if(count==20){layout.setAnimation(animSet);}
									
								}
								if(count<20){
									cmb.setTextColor(Color.RED);
									layout.setBackgroundColor(Color.WHITE);
																		
								}
								
								i+=10;
								count++;							
								cmb.setText("Combo " + count);
								
								
								cmb.startAnimation(animSet2);
								
							}
							
							
								
							score.setText("Score : " + i);
						} else if (col == Color.YELLOW) {
							i -= 5;j-=1;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade);animSet.addAnimation(scaleZoom);txt4.startAnimation(animSet);
							count=0;
							cmb.setText("");
							
							check = Color.YELLOW;
							
							score.setText("Score : " + i);
						}

						v.setBackgroundColor(Color.GRAY);
						col = Color.GRAY;
					}

					if (col == Color.BLACK || col == Color.GRAY) {
						cnt = false;
					} else {
						new Thread() {
							@Override
							public void run() {
								// TODO Auto-generated method stub
								try {
									// col=Color.GRAY;
									// cnt=true;
									Thread.sleep(3000);
									// col=Color.YELLOW;
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								cnt = false;
								handler.post(new Runnable() {
									@Override
									public void run() {
										// TODO Auto-generated method stub
										if (col == Color.GRAY) {
										} else if (col == Color.YELLOW) {
											onClick(v);
										} else if (col == Color.RED) {
											onClick(v);
										}
									}
								});

							}
						}.start();
					}

				} // 여기까지 이프?
				else {

					i -= 10;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.hyperspace_out);animSet.addAnimation(scaleZoom);txt4.startAnimation(animSet);
					check = Color.BLACK;
					count=0; //콤보초기화
					cmb.setText("");
					score.setText("Score : " + i); // 검은거는 -10점
					v.setBackgroundColor(Color.GRAY);
					col = Color.GRAY;
				}
			}
		};		View.OnClickListener listener5 = new View.OnClickListener() {

			int col = Color.GRAY;
			boolean cnt = false;

			@Override
			public void onClick(final View v) {
				// TODO Auto-generated method stub
				if (col != Color.BLACK) {

					if (cnt == false || col == Color.GRAY) {
						if (col == Color.YELLOW) {
							v.setBackgroundColor(Color.RED);
							col = Color.RED;
						} else if (col == Color.RED) {
							v.setBackgroundColor(Color.BLACK);
							col = Color.BLACK;
						} else if (col == Color.GRAY) {
							v.setBackgroundColor(Color.YELLOW);
							col = Color.YELLOW;
						}
						cnt = true;
					} else {
						if (col == Color.RED) {
							
							check = Color.RED;
							i += 10;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade);	animSet.addAnimation(scaleZoom);txt5.startAnimation(animSet);
							if(check == 0 || check == Color.RED){
								AnimationSet animSet2 = new AnimationSet(true);								
								Animation scaleZoom3 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade2);
								
								animSet2.addAnimation(scaleZoom3);if(count%5==0){j++;}								
								
								if(count>=20){
									cmb.setTextColor(Color.BLUE);
									i+=10;									
									layout.setBackgroundColor(Color.RED);
									if(count==20){layout.setAnimation(animSet);}
									
								}
								if(count<20){
									cmb.setTextColor(Color.RED);
									layout.setBackgroundColor(Color.WHITE);
																		
								}
								
								i+=10;
								count++;							
								cmb.setText("Combo " + count);
								
								
								cmb.startAnimation(animSet2);
								
							}
							
							
								
							score.setText("Score : " + i);
						} else if (col == Color.YELLOW) {
							i -= 5;j-=1;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade);animSet.addAnimation(scaleZoom);txt5.startAnimation(animSet);
							count=0;
							cmb.setText("");
							
							check = Color.YELLOW;
							
							score.setText("Score : " + i);
						}

						v.setBackgroundColor(Color.GRAY);
						col = Color.GRAY;
					}

					if (col == Color.BLACK || col == Color.GRAY) {
						cnt = false;
					} else {
						new Thread() {
							@Override
							public void run() {
								// TODO Auto-generated method stub
								try {
									// col=Color.GRAY;
									// cnt=true;
									Thread.sleep(1500);
									// col=Color.YELLOW;
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								cnt = false;
								handler.post(new Runnable() {
									@Override
									public void run() {
										// TODO Auto-generated method stub
										if (col == Color.GRAY) {
										} else if (col == Color.YELLOW) {
											onClick(v);
										} else if (col == Color.RED) {
											onClick(v);
										}
									}
								});

							}
						}.start();
					}

				} // 여기까지 이프?
				else {

					i -= 10;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.hyperspace_out);animSet.addAnimation(scaleZoom);txt5.startAnimation(animSet);
					check = Color.BLACK;
					count=0; //콤보초기화
					cmb.setText("");
					score.setText("Score : " + i); // 검은거는 -10점
					v.setBackgroundColor(Color.GRAY);
					col = Color.GRAY;
				}
			}
		};		View.OnClickListener listener6 = new View.OnClickListener() {

			int col = Color.GRAY;
			boolean cnt = false;

			@Override
			public void onClick(final View v) {
				// TODO Auto-generated method stub
				if (col != Color.BLACK) {

					if (cnt == false || col == Color.GRAY) {
						if (col == Color.YELLOW) {
							v.setBackgroundColor(Color.RED);
							col = Color.RED;
						} else if (col == Color.RED) {
							v.setBackgroundColor(Color.BLACK);
							col = Color.BLACK;
						} else if (col == Color.GRAY) {
							v.setBackgroundColor(Color.YELLOW);
							col = Color.YELLOW;
						}
						cnt = true;
					} else {
						if (col == Color.RED) {
							
							check = Color.RED;
							i += 10;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade);	animSet.addAnimation(scaleZoom);txt6.startAnimation(animSet);
							if(check == 0 || check == Color.RED){
								AnimationSet animSet2 = new AnimationSet(true);								
								Animation scaleZoom3 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade2);
								
								animSet2.addAnimation(scaleZoom3);if(count%5==0){j++;}								
								
								if(count>=20){
									cmb.setTextColor(Color.BLUE);
									i+=10;									
									layout.setBackgroundColor(Color.RED);
									if(count==20){layout.setAnimation(animSet);}
									
								}
								if(count<20){
									cmb.setTextColor(Color.RED);
									layout.setBackgroundColor(Color.WHITE);
																		
								}
								
								i+=10;
								count++;							
								cmb.setText("Combo " + count);
								
								
								cmb.startAnimation(animSet2);
								
							}
							
							
								
							score.setText("Score : " + i);
						} else if (col == Color.YELLOW) {
							i -= 5;j-=1;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade);animSet.addAnimation(scaleZoom);txt6.startAnimation(animSet);
							count=0;
							cmb.setText("");
							
							check = Color.YELLOW;
							
							score.setText("Score : " + i);
						}

						v.setBackgroundColor(Color.GRAY);
						col = Color.GRAY;
					}

					if (col == Color.BLACK || col == Color.GRAY) {
						cnt = false;
					} else {
						new Thread() {
							@Override
							public void run() {
								// TODO Auto-generated method stub
								try {
									// col=Color.GRAY;
									// cnt=true;
									Thread.sleep(3000);
									// col=Color.YELLOW;
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								cnt = false;
								handler.post(new Runnable() {
									@Override
									public void run() {
										// TODO Auto-generated method stub
										if (col == Color.GRAY) {
										} else if (col == Color.YELLOW) {
											onClick(v);
										} else if (col == Color.RED) {
											onClick(v);
										}
									}
								});

							}
						}.start();
					}

				} // 여기까지 이프?
				else {

					i -= 10;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.hyperspace_out);animSet.addAnimation(scaleZoom);txt6.startAnimation(animSet);
					check = Color.BLACK;
					count=0; //콤보초기화
					cmb.setText("");
					score.setText("Score : " + i); // 검은거는 -10점
					v.setBackgroundColor(Color.GRAY);
					col = Color.GRAY;
				}
			}
		};		View.OnClickListener listener7 = new View.OnClickListener() {

			int col = Color.GRAY;
			boolean cnt = false;

			@Override
			public void onClick(final View v) {
				// TODO Auto-generated method stub
				if (col != Color.BLACK) {

					if (cnt == false || col == Color.GRAY) {
						if (col == Color.YELLOW) {
							v.setBackgroundColor(Color.RED);
							col = Color.RED;
						} else if (col == Color.RED) {
							v.setBackgroundColor(Color.BLACK);
							col = Color.BLACK;
						} else if (col == Color.GRAY) {
							v.setBackgroundColor(Color.YELLOW);
							col = Color.YELLOW;
						}
						cnt = true;
					} else {
						if (col == Color.RED) {
							
							check = Color.RED;
							i += 10;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade);	animSet.addAnimation(scaleZoom);txt7.startAnimation(animSet);
							if(check == 0 || check == Color.RED){
								AnimationSet animSet2 = new AnimationSet(true);								
								Animation scaleZoom3 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade2);
								
								animSet2.addAnimation(scaleZoom3);if(count%5==0){j++;}								
								
								if(count>=20){
									cmb.setTextColor(Color.BLUE);
									i+=10;									
									layout.setBackgroundColor(Color.RED);
									if(count==20){layout.setAnimation(animSet);}
									
								}
								if(count<20){
									cmb.setTextColor(Color.RED);
									layout.setBackgroundColor(Color.WHITE);
																		
								}
								
								i+=10;
								count++;							
								cmb.setText("Combo " + count);
								
								
								cmb.startAnimation(animSet2);
								
							}
							
							
								
							score.setText("Score : " + i);
						} else if (col == Color.YELLOW) {
							i -= 5;j-=1;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade);animSet.addAnimation(scaleZoom);txt7.startAnimation(animSet);
							count=0;
							cmb.setText("");
							
							check = Color.YELLOW;
							
							score.setText("Score : " + i);
						}

						v.setBackgroundColor(Color.GRAY);
						col = Color.GRAY;
					}

					if (col == Color.BLACK || col == Color.GRAY) {
						cnt = false;
					} else {
						new Thread() {
							@Override
							public void run() {
								// TODO Auto-generated method stub
								try {
									// col=Color.GRAY;
									// cnt=true;
									Thread.sleep(3000);
									// col=Color.YELLOW;
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								cnt = false;
								handler.post(new Runnable() {
									@Override
									public void run() {
										// TODO Auto-generated method stub
										if (col == Color.GRAY) {
										} else if (col == Color.YELLOW) {
											onClick(v);
										} else if (col == Color.RED) {
											onClick(v);
										}
									}
								});

							}
						}.start();
					}

				} // 여기까지 이프?
				else {

					i -= 10;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.hyperspace_out);animSet.addAnimation(scaleZoom);txt7.startAnimation(animSet);
					check = Color.BLACK;
					count=0; //콤보초기화
					cmb.setText("");
					score.setText("Score : " + i); // 검은거는 -10점
					v.setBackgroundColor(Color.GRAY);
					col = Color.GRAY;
				}
			}
		};		View.OnClickListener listener8 = new View.OnClickListener() {

			int col = Color.GRAY;
			boolean cnt = false;

			@Override
			public void onClick(final View v) {
				// TODO Auto-generated method stub
				if (col != Color.BLACK) {

					if (cnt == false || col == Color.GRAY) {
						if (col == Color.YELLOW) {
							v.setBackgroundColor(Color.RED);
							col = Color.RED;
						} else if (col == Color.RED) {
							v.setBackgroundColor(Color.BLACK);
							col = Color.BLACK;
						} else if (col == Color.GRAY) {
							v.setBackgroundColor(Color.YELLOW);
							col = Color.YELLOW;
						}
						cnt = true;
					} else {
						if (col == Color.RED) {
							
							check = Color.RED;
							i += 10;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade);	animSet.addAnimation(scaleZoom);txt8.startAnimation(animSet);
							if(check == 0 || check == Color.RED){
								AnimationSet animSet2 = new AnimationSet(true);								
								Animation scaleZoom3 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade2);
								
								animSet2.addAnimation(scaleZoom3);if(count%5==0){j++;}								
								
								if(count>=20){
									cmb.setTextColor(Color.BLUE);
									i+=10;									
									layout.setBackgroundColor(Color.RED);
									if(count==20){layout.setAnimation(animSet);}
									
								}
								if(count<20){
									cmb.setTextColor(Color.RED);
									layout.setBackgroundColor(Color.WHITE);
																		
								}
								
								i+=10;
								count++;							
								cmb.setText("Combo " + count);
								
								
								cmb.startAnimation(animSet2);
								
							}
							
							
								
							score.setText("Score : " + i);
						} else if (col == Color.YELLOW) {
							i -= 5;j-=1;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade);animSet.addAnimation(scaleZoom);txt8.startAnimation(animSet);
							count=0;
							cmb.setText("");
							
							check = Color.YELLOW;
							
							score.setText("Score : " + i);
						}

						v.setBackgroundColor(Color.GRAY);
						col = Color.GRAY;
					}

					if (col == Color.BLACK || col == Color.GRAY) {
						cnt = false;
					} else {
						new Thread() {
							@Override
							public void run() {
								// TODO Auto-generated method stub
								try {
									// col=Color.GRAY;
									// cnt=true;
									Thread.sleep(1500);
									// col=Color.YELLOW;
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								cnt = false;
								handler.post(new Runnable() {
									@Override
									public void run() {
										// TODO Auto-generated method stub
										if (col == Color.GRAY) {
										} else if (col == Color.YELLOW) {
											onClick(v);
										} else if (col == Color.RED) {
											onClick(v);
										}
									}
								});

							}
						}.start();
					}

				} // 여기까지 이프?
				else {

					i -= 10;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.hyperspace_out);animSet.addAnimation(scaleZoom);txt8.startAnimation(animSet);
					check = Color.BLACK;
					count=0; //콤보초기화
					cmb.setText("");
					score.setText("Score : " + i); // 검은거는 -10점
					v.setBackgroundColor(Color.GRAY);
					col = Color.GRAY;
				}
			}
		};		View.OnClickListener listener9 = new View.OnClickListener() {

			int col = Color.GRAY;
			boolean cnt = false;

			@Override
			public void onClick(final View v) {
				// TODO Auto-generated method stub
				if (col != Color.BLACK) {

					if (cnt == false || col == Color.GRAY) {
						if (col == Color.YELLOW) {
							v.setBackgroundColor(Color.RED);
							col = Color.RED;
						} else if (col == Color.RED) {
							v.setBackgroundColor(Color.BLACK);
							col = Color.BLACK;
						} else if (col == Color.GRAY) {
							v.setBackgroundColor(Color.YELLOW);
							col = Color.YELLOW;
						}
						cnt = true;
					} else {
						if (col == Color.RED) {
							
							check = Color.RED;
							i += 10;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade);	animSet.addAnimation(scaleZoom);txt9.startAnimation(animSet);
							if(check == 0 || check == Color.RED){
								AnimationSet animSet2 = new AnimationSet(true);								
								Animation scaleZoom3 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade2);
								
								animSet2.addAnimation(scaleZoom3);if(count%5==0){j++;}								
								
								if(count>=20){
									cmb.setTextColor(Color.BLUE);
									i+=10;									
									layout.setBackgroundColor(Color.RED);
									if(count==20){layout.setAnimation(animSet);}
									
								}
								if(count<20){
									cmb.setTextColor(Color.RED);
									layout.setBackgroundColor(Color.WHITE);
																		
								}
								
								i+=10;
								count++;							
								cmb.setText("Combo " + count);
								
								
								cmb.startAnimation(animSet2);
								
							}
							
							
								
							score.setText("Score : " + i);
						} else if (col == Color.YELLOW) {
							i -= 5;j-=1;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade);animSet.addAnimation(scaleZoom);txt9.startAnimation(animSet);
							count=0;
							cmb.setText("");
							
							check = Color.YELLOW;
							
							score.setText("Score : " + i);
						}

						v.setBackgroundColor(Color.GRAY);
						col = Color.GRAY;
					}

					if (col == Color.BLACK || col == Color.GRAY) {
						cnt = false;
					} else {
						new Thread() {
							@Override
							public void run() {
								// TODO Auto-generated method stub
								try {
									// col=Color.GRAY;
									// cnt=true;
									Thread.sleep(3000);
									// col=Color.YELLOW;
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								cnt = false;
								handler.post(new Runnable() {
									@Override
									public void run() {
										// TODO Auto-generated method stub
										if (col == Color.GRAY) {
										} else if (col == Color.YELLOW) {
											onClick(v);
										} else if (col == Color.RED) {
											onClick(v);
										}
									}
								});

							}
						}.start();
					}

				} // 여기까지 이프?
				else {

					i -= 10;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.hyperspace_out);animSet.addAnimation(scaleZoom);txt9.startAnimation(animSet);
					check = Color.BLACK;
					count=0; //콤보초기화
					cmb.setText("");
					score.setText("Score : " + i); // 검은거는 -10점
					v.setBackgroundColor(Color.GRAY);
					col = Color.GRAY;
				}
			}
		};		View.OnClickListener listener10 = new View.OnClickListener() {

			int col = Color.GRAY;
			boolean cnt = false;

			@Override
			public void onClick(final View v) {
				// TODO Auto-generated method stub
				if (col != Color.BLACK) {

					if (cnt == false || col == Color.GRAY) {
						if (col == Color.YELLOW) {
							v.setBackgroundColor(Color.RED);
							col = Color.RED;
						} else if (col == Color.RED) {
							v.setBackgroundColor(Color.BLACK);
							col = Color.BLACK;
						} else if (col == Color.GRAY) {
							v.setBackgroundColor(Color.YELLOW);
							col = Color.YELLOW;
						}
						cnt = true;
					} else {
						if (col == Color.RED) {
							
							check = Color.RED;
							i += 10;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade);	animSet.addAnimation(scaleZoom);txt10.startAnimation(animSet);
							if(check == 0 || check == Color.RED){
								AnimationSet animSet2 = new AnimationSet(true);								
								Animation scaleZoom3 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade2);
								
								animSet2.addAnimation(scaleZoom3);if(count%5==0){j++;}								
								
								if(count>=20){
									cmb.setTextColor(Color.BLUE);
									i+=10;									
									layout.setBackgroundColor(Color.RED);
									if(count==20){layout.setAnimation(animSet);}
									
								}
								if(count<20){
									cmb.setTextColor(Color.RED);
									layout.setBackgroundColor(Color.WHITE);
																		
								}
								
								i+=10;
								count++;							
								cmb.setText("Combo " + count);
								
								
								cmb.startAnimation(animSet2);
								
							}
							
							
								
							score.setText("Score : " + i);
						} else if (col == Color.YELLOW) {
							i -= 5;j-=1;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade);animSet.addAnimation(scaleZoom);txt10.startAnimation(animSet);
							count=0;
							cmb.setText("");
							
							check = Color.YELLOW;
							
							score.setText("Score : " + i);
						}

						v.setBackgroundColor(Color.GRAY);
						col = Color.GRAY;
					}

					if (col == Color.BLACK || col == Color.GRAY) {
						cnt = false;
					} else {
						new Thread() {
							@Override
							public void run() {
								// TODO Auto-generated method stub
								try {
									// col=Color.GRAY;
									// cnt=true;
									Thread.sleep(3000);
									// col=Color.YELLOW;
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								cnt = false;
								handler.post(new Runnable() {
									@Override
									public void run() {
										// TODO Auto-generated method stub
										if (col == Color.GRAY) {
										} else if (col == Color.YELLOW) {
											onClick(v);
										} else if (col == Color.RED) {
											onClick(v);
										}
									}
								});

							}
						}.start();
					}

				} // 여기까지 이프?
				else {

					i -= 10;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.hyperspace_out);animSet.addAnimation(scaleZoom);txt10.startAnimation(animSet);
					check = Color.BLACK;
					count=0; //콤보초기화
					cmb.setText("");
					score.setText("Score : " + i); // 검은거는 -10점
					v.setBackgroundColor(Color.GRAY);
					col = Color.GRAY;
				}
			}
		};		View.OnClickListener listener11 = new View.OnClickListener() {

			int col = Color.GRAY;
			boolean cnt = false;

			@Override
			public void onClick(final View v) {
				// TODO Auto-generated method stub
				if (col != Color.BLACK) {

					if (cnt == false || col == Color.GRAY) {
						if (col == Color.YELLOW) {
							v.setBackgroundColor(Color.RED);
							col = Color.RED;
						} else if (col == Color.RED) {
							v.setBackgroundColor(Color.BLACK);
							col = Color.BLACK;
						} else if (col == Color.GRAY) {
							v.setBackgroundColor(Color.YELLOW);
							col = Color.YELLOW;
						}
						cnt = true;
					} else {
						if (col == Color.RED) {
							
							check = Color.RED;
							i += 10;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade);	animSet.addAnimation(scaleZoom);txt11.startAnimation(animSet);
							if(check == 0 || check == Color.RED){
								AnimationSet animSet2 = new AnimationSet(true);								
								Animation scaleZoom3 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade2);
								
								animSet2.addAnimation(scaleZoom3);if(count%5==0){j++;}								
								
								if(count>=20){
									cmb.setTextColor(Color.BLUE);
									i+=10;									
									layout.setBackgroundColor(Color.RED);
									if(count==20){layout.setAnimation(animSet);}
									
								}
								if(count<20){
									cmb.setTextColor(Color.RED);
									layout.setBackgroundColor(Color.WHITE);
																		
								}
								
								i+=10;
								count++;							
								cmb.setText("Combo " + count);
								
								
								cmb.startAnimation(animSet2);
								
							}
							
							
								
							score.setText("Score : " + i);
						} else if (col == Color.YELLOW) {
							i -= 5;j-=1;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade);animSet.addAnimation(scaleZoom);txt11.startAnimation(animSet);
							count=0;
							cmb.setText("");
							
							check = Color.YELLOW;
							
							score.setText("Score : " + i);
						}

						v.setBackgroundColor(Color.GRAY);
						col = Color.GRAY;
					}

					if (col == Color.BLACK || col == Color.GRAY) {
						cnt = false;
					} else {
						new Thread() {
							@Override
							public void run() {
								// TODO Auto-generated method stub
								try {
									// col=Color.GRAY;
									// cnt=true;
									Thread.sleep(3000);
									// col=Color.YELLOW;
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								cnt = false;
								handler.post(new Runnable() {
									@Override
									public void run() {
										// TODO Auto-generated method stub
										if (col == Color.GRAY) {
										} else if (col == Color.YELLOW) {
											onClick(v);
										} else if (col == Color.RED) {
											onClick(v);
										}
									}
								});

							}
						}.start();
					}

				} // 여기까지 이프?
				else {

					
					i -= 10;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.hyperspace_out);animSet.addAnimation(scaleZoom);txt11.startAnimation(animSet);
					check = Color.BLACK;
					count=0; //콤보초기화
					cmb.setText("");
					score.setText("Score : " + i); // 검은거는 -10점
					v.setBackgroundColor(Color.GRAY);
					col = Color.GRAY;
				}
			}
		};		View.OnClickListener listener12 = new View.OnClickListener() {

			int col = Color.GRAY;
			boolean cnt = false;

			@Override
			public void onClick(final View v) {
				// TODO Auto-generated method stub
				if (col != Color.BLACK) {

					if (cnt == false || col == Color.GRAY) {
						if (col == Color.YELLOW) {
							v.setBackgroundColor(Color.RED);
							col = Color.RED;
						} else if (col == Color.RED) {
							v.setBackgroundColor(Color.BLACK);
							col = Color.BLACK;
						} else if (col == Color.GRAY) {
							v.setBackgroundColor(Color.YELLOW);
							col = Color.YELLOW;
						}
						cnt = true;
					} else {
						if (col == Color.RED) {
							
							check = Color.RED;
							i += 10;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade);	animSet.addAnimation(scaleZoom);txt12.startAnimation(animSet);
							if(check == 0 || check == Color.RED){
								AnimationSet animSet2 = new AnimationSet(true);								
								Animation scaleZoom3 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade2);
								
								
								animSet2.addAnimation(scaleZoom3);if(count%5==0){j++;}								
								
								if(count>=20){
									cmb.setTextColor(Color.BLUE);
									i+=10;									
									layout.setBackgroundColor(Color.RED);
									
									
									if(count==20){layout.setAnimation(animSet);}
								}
								if(count<20){
									cmb.setTextColor(Color.RED);
									layout.setBackgroundColor(Color.WHITE);
																		
								}
								
								i+=10;
								count++;							
								cmb.setText("Combo " + count);
								
								
								cmb.startAnimation(animSet2);
								
							}
							
							
								
							score.setText("Score : " + i);
						} else if (col == Color.YELLOW) {
							i -= 5;j-=1;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade);animSet.addAnimation(scaleZoom);txt12.startAnimation(animSet);
							count=0;
							cmb.setText("");
							
							check = Color.YELLOW;
							
							score.setText("Score : " + i);
						}

						v.setBackgroundColor(Color.GRAY);
						col = Color.GRAY;
					}

					if (col == Color.BLACK || col == Color.GRAY) {
						cnt = false;
					} else {
						new Thread() {
							@Override
							public void run() {
								// TODO Auto-generated method stub
								try {
									// col=Color.GRAY;
									// cnt=true;
									Thread.sleep(3000);
									// col=Color.YELLOW;
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								cnt = false;
								handler.post(new Runnable() {
									@Override
									public void run() {
										// TODO Auto-generated method stub
										if (col == Color.GRAY) {
										} else if (col == Color.YELLOW) {
											onClick(v);
										} else if (col == Color.RED) {
											onClick(v);
										}
									}
								});

							}
						}.start();
					}

				} // 여기까지 이프?
				else {

					i -= 10;AnimationSet animSet = new AnimationSet(true);Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.hyperspace_out);animSet.addAnimation(scaleZoom);txt12.startAnimation(animSet);
					check = Color.BLACK;
					count=0; //콤보초기화
					cmb.setText("");
					score.setText("Score : " + i); // 검은거는 -10점
					v.setBackgroundColor(Color.GRAY);
					col = Color.GRAY;
				}
			}
		};
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		LayoutInflater vi = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		final LinearLayout limit = (LinearLayout) vi.inflate(R.layout.timelimit, null);
		
		
		
		new Thread() {			
			@Override
			public void run() {
				final AnimationSet animSet = new AnimationSet(true);
				final AnimationSet animSet2 = new AnimationSet(true);
				Animation scaleZoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade2);
				animSet.addAnimation(scaleZoom);
				Animation scaleZoom2 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade);
				animSet2.addAnimation(scaleZoom2);
				for (j = 20; j >= 0; j--) {
					handler.post(new Runnable() {
						@Override
						public void run() {
							time.setText("Time : " + j);
							if(j<=10 && j>5)
								time.startAnimation(animSet2);
							else if(j<=5)
								time.startAnimation(animSet);
						}
					});
					try {
						Thread.sleep(1000);
						if(j==-1){
							break;
						}
						else if(j<=0 && j!=-1){
							Intent intent = new Intent(MainActivity.this, Wait.class);
							intent.putExtra("score", i);			
							startActivity(intent);
							finish();
						}
												
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
					
					
				}
				
//				handler.post(new Runnable() {
//					@Override
//					public void run() {
//						Intent intent = new Intent(MainActivity.this, Wait.class);
//						intent.putExtra("score", i);			
//						startActivity(intent);
//						finish();
//					}
//				});
				
			}
		}.start();

		// start.setOnClickListener(START);
		

		
		txt1.setOnClickListener(listener1);		
		txt2.setOnClickListener(listener2);
		txt3.setOnClickListener(listener3);		
		txt4.setOnClickListener(listener4);	
		txt5.setOnClickListener(listener5);		
		txt6.setOnClickListener(listener6);		
		txt7.setOnClickListener(listener7);
		txt8.setOnClickListener(listener8);
		txt9.setOnClickListener(listener9);		
		txt10.setOnClickListener(listener10);		
		txt11.setOnClickListener(listener11);		
		txt12.setOnClickListener(listener12);
		
	}
	 	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		if(keyCode == KeyEvent.KEYCODE_BACK){
			j=-1;			
		}
		
		return super.onKeyDown(keyCode, event);
		
	}
	
	
}
