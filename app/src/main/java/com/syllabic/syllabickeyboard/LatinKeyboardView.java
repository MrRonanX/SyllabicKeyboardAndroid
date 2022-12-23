/*
 * Copyright (C) 2008-2009 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.syllabic.syllabickeyboard;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.Keyboard.Key;
import android.inputmethodservice.KeyboardView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodSubtype;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;


import com.syllabic.syllabickeyboard.utils.Utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LatinKeyboardView extends KeyboardView implements View.OnClickListener{

    static final int KEYCODE_OPTIONS = -100;
    Context context;
    private View mMiniKeyboardContainer;
    private Map<Key, View> mMiniKeyboardCache;
    private int mPopupLayout;
    private LatinKeyboardView mMiniKeyboard;
    private final int[] mCoordinates = new int[2];
    private int mPopupX;
    private int mPopupY;
    private PopupWindow mPopupKeyboard;
    private boolean mMiniKeyboardOnScreen;
    private TextView tvPressOne,tvPressTwo,tvPressThree;


    private View mTopKey;
    private PopupWindow mPopupWindow;
    private View mPopupView;
    private LatinKeyboardView latinKeyboardView;
    private PassDataLongPress passDataLongPress;

    @SuppressLint("MissingInflatedId")
    public LatinKeyboardView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        mPopupKeyboard = new PopupWindow(context);
        mPopupKeyboard.setContentView(inflater.inflate(R.layout.layout_custom, null));
    }

    public LatinKeyboardView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.context = context;
    }

    public void passDataLongPress(PassDataLongPress passDataLongPress){
        this.passDataLongPress = passDataLongPress;
    }

    @Override
    protected boolean onLongPress(Key key) {
        if (key.codes[0] == Keyboard.KEYCODE_CANCEL) {
            getOnKeyboardActionListener().onKey(KEYCODE_OPTIONS, null);
            return true;
        }
        else if (key.codes[0] == 113 || key.codes[0] == 1000 ||key.codes[0] == 1050 ||key.codes[0] == 2000 ||
                key.codes[0] == 2050 ||key.codes[0] == 3000 ||key.codes[0] == 3050 ||key.codes[0] == 4000 ||
                key.codes[0] == 4050 ||key.codes[0] == 5000 ||key.codes[0] == 5020 ||key.codes[0] == 5030 ||
                key.codes[0] == 97 ||key.codes[0] == -1  ||key.codes[0] == 10 ||
                key.codes[0] == -2 ||key.codes[0] == -10 ||key.codes[0] == -11 ||key.codes[0] == -40 ||
                key.codes[0] == -41 ||key.codes[0] == -45 ||key.codes[0] == -46 ||key.codes[0] == -15 ||
                key.codes[0] == -16 ||key.codes[0] == -50 ||key.codes[0] == -51 ||key.codes[0] == -54 ||
                key.codes[0] == -55 ||key.codes[0] == -5 ||key.codes[0] == -52 ||key.codes[0] == -53 ||
                key.codes[0] == -18 ||key.codes[0] == -19 ||key.codes[0] == -30 ||key.codes[0] == -31 ||
                key.codes[0] == -35 ||key.codes[0] == -36 ||key.codes[0] == -20 ||key.codes[0] == -21 ||
                key.codes[0] == -25 || key.codes[0] == -26|| key.codes[0] == 32) {
            return true;
        }
        else {
//            return super.onLongPress(key);
//            return setUpPopup(key);
            return customPopup(key);
//            return customPopupTrue();
        }
    }

    public boolean customPopup(Key popupKey) {
        Utils.showPopupLongClick(mPopupKeyboard,context,popupKey,
                mPopupKeyboard.getContentView().findViewById(R.id.tvLongPressOne),
                mPopupKeyboard.getContentView().findViewById(R.id.tvLongPressTwo),
                mPopupKeyboard.getContentView().findViewById(R.id.tvLongPressThree));
        if (mPopupKeyboard.getContentView().findViewById(R.id.tvLongPressOne).getVisibility()== View.VISIBLE){
            mPopupX = popupKey.x ;
        }else {
            mPopupX = popupKey.x  ;
        }
        mPopupY = popupKey.y ;

        mPopupKeyboard.setClippingEnabled(false);
        mPopupKeyboard.showAtLocation(this, Gravity.NO_GRAVITY, (popupKey.x) +10, popupKey.y + (popupKey.height / 2)+10);
        mPopupKeyboard.getContentView().findViewById(R.id.tvLongPressOne).setOnClickListener(this);
        mPopupKeyboard.getContentView().findViewById(R.id.tvLongPressThree).setOnClickListener(this);
        mPopupKeyboard.getContentView().findViewById(R.id.tvLongPressTwo).setOnClickListener(this);
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvLongPressOne:
                passDataLongPress.passDataLongPress(((TextView) mPopupKeyboard.getContentView()
                        .findViewById(R.id.tvLongPressOne)).getText().toString());
                break;
            case R.id.tvLongPressTwo:
                passDataLongPress.passDataLongPress(((TextView) mPopupKeyboard.getContentView()
                        .findViewById(R.id.tvLongPressTwo)).getText().toString());
                break;
            case R.id.tvLongPressThree:
                passDataLongPress.passDataLongPress(((TextView) mPopupKeyboard.getContentView()
                        .findViewById(R.id.tvLongPressThree)).getText().toString());
                break;
        }

    }

    public boolean setUpPopup(Key popupKey) {
        int popupKeyboardId = popupKey.popupResId;

        if (popupKeyboardId != 0) {
            mMiniKeyboardContainer = mMiniKeyboardCache.get(popupKey);
            if (mMiniKeyboardContainer == null) {
                LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(
                        Context.LAYOUT_INFLATER_SERVICE);
                mMiniKeyboardContainer = inflater.inflate(mPopupLayout, null);
                mMiniKeyboard = mMiniKeyboardContainer.findViewById(R.id.keyboard2);
//                View closeButton = mMiniKeyboardContainer.findViewById(
//                        com.android.internal.R.id.closeButton);
//                if (closeButton != null) closeButton.setOnClickListener(this);
                mMiniKeyboard.setOnKeyboardActionListener(new OnKeyboardActionListener() {
                    public void onKey(int primaryCode, int[] keyCodes) {
                        Log.d("TAG", "onKey: ");
//                        mKeyboardActionListener.onKey(primaryCode, keyCodes);
//                        dismissPopupKeyboard();
                    }

                    public void onText(CharSequence text) {
                        Log.d("TAG", "onKey: ");
//                        mKeyboardActionListener.onText(text);
//                        dismissPopupKeyboard();
                    }

                    public void swipeLeft() {
                    }

                    public void swipeRight() {
                    }

                    public void swipeUp() {
                    }

                    public void swipeDown() {
                    }

                    public void onPress(int primaryCode) {
                        Log.d("TAG", "onKey: ");
//                        mKeyboardActionListener.onPress(primaryCode);
                    }

                    public void onRelease(int primaryCode) {
                        Log.d("TAG", "onKey: ");
//                        mKeyboardActionListener.onRelease(primaryCode);
                    }
                });
                Keyboard keyboard;
                if (popupKey.popupCharacters != null) {
                    keyboard = new Keyboard(getContext(), popupKeyboardId,
                            popupKey.popupCharacters, -1, getPaddingLeft() + getPaddingRight());
                } else {
                    keyboard = new Keyboard(getContext(), popupKeyboardId);
                }
                mMiniKeyboard.setKeyboard(keyboard);
                mMiniKeyboard.setPopupParent(this);
                mMiniKeyboardContainer.measure(
                        MeasureSpec.makeMeasureSpec(getWidth(), MeasureSpec.AT_MOST),
                        MeasureSpec.makeMeasureSpec(getHeight(), MeasureSpec.AT_MOST));
                mMiniKeyboardCache.put(popupKey, mMiniKeyboardContainer);
            } else {
                mMiniKeyboard = mMiniKeyboardContainer.findViewById(R.id.keyboard2);
            }

                mPopupX = popupKey.x +30;
                mPopupY = popupKey.y;
                mPopupX = mPopupX + popupKey.width - mMiniKeyboardContainer.getMeasuredWidth() + 20;
                mPopupY = mPopupY - mMiniKeyboardContainer.getMeasuredHeight();
                final int x = mPopupX + mMiniKeyboardContainer.getPaddingRight();
                final int y = (int) ((mPopupY + mMiniKeyboardContainer.getPaddingBottom()) * (-0.78));
//            mMiniKeyboard.setPopupOffset(Math.max(x, 0), y);
//            mMiniKeyboard.setShifted(isShifted());
                LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(
                        Context.LAYOUT_INFLATER_SERVICE);
              mPopupKeyboard = new PopupWindow(context);
//            mPopupKeyboard.setContentView(inflater.inflate(R.layout.layout_custom, null));
                mPopupKeyboard.setWidth((mMiniKeyboardContainer.getMeasuredWidth()));
                mPopupKeyboard.setHeight((mMiniKeyboardContainer.getMeasuredHeight()));
                mPopupKeyboard.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.background_popup_black));
                mPopupKeyboard.setContentView(inflater.inflate(R.layout.layout_custom, null));

                mPopupKeyboard.showAtLocation(this, Gravity.NO_GRAVITY, x, y);
//            mMiniKeyboard.setBackgroundDrawable(getResources().getDrawable(R.drawable.background_blue));
//            mMiniKeyboardOnScreen = true;
                //mMiniKeyboard.onTouchEvent(getTranslatedEvent(me));
//            invalidateAllKeys();
                return true;
            }
            return false;

    }

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        @SuppressLint("DrawAllocation")
        Paint paint = new Paint();
        List<Key> keys = getKeyboard().getKeys();
        int checkType;
        for (Key key : keys) {
            checkType = keys.get(0).codes[0];
            if (checkType == 113) {
                Utils.setBackGroundDefault(key, canvas, paint, context);
            } else if (checkType == 1000) {
                Utils.setBackGroundEmoji(key, canvas, paint, context);
            } else if (checkType == 1050) {
                Utils.setBackGroundSelectTwoDot(key, canvas, paint, context);
            } else if (checkType == 2000) {
                Utils.setBackGroundTwoQwerty(key, canvas, paint, context);
            } else if (checkType == 2050) {
                Utils.setBackGroundTwoSelectOneDot(key, canvas, paint, context);
            } else if (checkType == 3000) {
                Utils.setBackGroundThreeQwerty(key, canvas, paint, context);
            } else if (checkType == 3050) {
                Utils.setBackGroundThreeSelectOneDot(key, canvas, paint, context);
            } else if (checkType == 4000) {
                Utils.setBackGroundFourQwerty(key, canvas, paint, context);
            } else if (checkType == 4050) {
                Utils.setBackGroundFourSelectOneDot(key, canvas, paint, context);
            } else if (checkType == 5000) {
                Utils.setBackGroundQwertyNumber(key, canvas, paint, context);
            } else if (checkType == 5020) {
                Utils.setBackGroundQwertyNumberTwo(key, canvas, paint, context);
            } else if (checkType == 5030) {
                Utils.setBackGroundQwertyNumberThree(key, canvas, paint, context);
            }
        }
    }



    void setSubtypeOnSpaceKey(final InputMethodSubtype subtype) {
        final com.syllabic.syllabickeyboard.LatinKeyboard keyboard = (com.syllabic.syllabickeyboard.LatinKeyboard) getKeyboard();
        keyboard.setSpaceIcon(getResources().getDrawable(subtype.getIconResId()));
        invalidateAllKeys();
    }

    public void dismissPopup() {
        if (mPopupKeyboard.isShowing()) {
            mPopupKeyboard.dismiss();
        }
    }
    interface PassDataLongPress{
        void passDataLongPress(String text);
    }
}
