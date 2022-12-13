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
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.Keyboard.Key;
import android.inputmethodservice.KeyboardView;
import android.util.AttributeSet;
import android.view.inputmethod.InputMethodSubtype;


import com.syllabic.syllabickeyboard.utils.Utils;

import java.util.List;

public class LatinKeyboardView extends KeyboardView  {

    static final int KEYCODE_OPTIONS = -100;
    Context context;


    public LatinKeyboardView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    public LatinKeyboardView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.context = context;
    }

    @Override
    protected boolean onLongPress(Key key) {
        if (key.codes[0] == Keyboard.KEYCODE_CANCEL) {
            getOnKeyboardActionListener().onKey(KEYCODE_OPTIONS, null);
            return true;
        } else {
            return super.onLongPress(key);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        @SuppressLint("DrawAllocation")
        Paint paint = new Paint();
        List<Key> keys = getKeyboard().getKeys();
        int checkType;
        for (Key key : keys) {
            checkType = keys.get(0).codes[0];
            if (checkType==113){
                Utils.setBackGroundDefault(key,canvas,paint,context);
            }else if (checkType==1000){
                Utils.setBackGroundEmoji(key,canvas,paint,context);
            }else if (checkType==1050){
                Utils.setBackGroundSelectTwoDot(key,canvas,paint,context);
            }else if (checkType==2000){
                Utils.setBackGroundTwoQwerty(key,canvas,paint,context);
            }else if (checkType==2050){
                Utils.setBackGroundTwoSelectOneDot(key,canvas,paint,context);
            }else if (checkType==3000){
                Utils.setBackGroundThreeQwerty(key,canvas,paint,context);
            }else if (checkType==3050){
                Utils.setBackGroundThreeSelectOneDot(key,canvas,paint,context);
            }else if (checkType==4000){
                Utils.setBackGroundFourQwerty(key,canvas,paint,context);
            }else if (checkType==4050){
                Utils.setBackGroundFourSelectOneDot(key,canvas,paint,context);
            }else if (checkType==5000){
                Utils.setBackGroundQwertyNumber(key,canvas,paint,context);
            }else if (checkType==5020){
                Utils.setBackGroundQwertyNumberTwo(key,canvas,paint,context);
            }else if (checkType==5030){
                Utils.setBackGroundQwertyNumberThree(key,canvas,paint,context);
            }
        }

    }

    void setSubtypeOnSpaceKey(final InputMethodSubtype subtype) {
        final com.syllabic.syllabickeyboard.LatinKeyboard keyboard = (com.syllabic.syllabickeyboard.LatinKeyboard) getKeyboard();
        keyboard.setSpaceIcon(getResources().getDrawable(subtype.getIconResId()));
        invalidateAllKeys();
    }



//    public  void setBackGroundDefault(Key key, Canvas canvas, Paint paint) {
//        if (key.codes[0] == 113 || key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
//                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
//                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
//                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107
//                || key.codes[0] == -10 || key.codes[0] == -11) {
//            setColorButtonBlack(key, canvas);
//            setColorTextWhite(key, canvas, paint);
//        } else if (key.codes[0] == 97) {
//            setColorButtonBlue(key, canvas);
//            setColorTextWhite(key, canvas, paint);
//        } else if (key.codes[0] == -1) {
//            setColorButtonOrange(key, canvas);
//            setColorTextWhite(key, canvas, paint);
//        } else if (key.codes[0] == -3) {
//            setColorButtonGreen(key, canvas);
//            setColorTextWhite(key, canvas, paint);
//        } else if (key.codes[0] == -2) {
//            setColorButtonYellow(key, canvas);
//            setColorTextWhite(key, canvas, paint);
//        } else {
//            setColorButtonWhite(key, canvas);
//            setColorTextBlack(key, canvas, paint);
//        }
//    }
//
//    public  void setBackGroundEmoji(Key key, Canvas canvas, Paint paint) {
//        if (key.codes[0] == 1000 || key.codes[0] == -15 || key.codes[0] == -16) {
//            setColorButtonBlack(key, canvas);
//            setColorTextWhite(key, canvas, paint);
//        } else if (key.codes[0] == 97 ) {
//            setColorButtonBlue(key, canvas);
//            setColorTextWhite(key, canvas, paint);
//        } else if (key.codes[0] == -1) {
//            setColorButtonOrange(key, canvas);
//            setColorTextWhite(key, canvas, paint);
//        } else if (key.codes[0] == -3) {
//            setColorButtonGreen(key, canvas);
//            setColorTextWhite(key, canvas, paint);
//        } else if (key.codes[0] == -2) {
//            setColorButtonYellow(key, canvas);
//            setColorTextWhite(key, canvas, paint);
//        } else {
//            setColorButtonWhite(key, canvas);
//            setColorTextBlack(key, canvas, paint);
//        }
//    }
//
//    public  void setBackGroundSelectTwoDot(Key key, Canvas canvas, Paint paint) {
//        if (key.codes[0] == 1050 || key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
//                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
//                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
//                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107
//                || key.codes[0] == -18 || key.codes[0] == -19) {
//            setColorButtonBlack(key, canvas);
//            setColorTextWhite(key, canvas, paint);
//        } else if (key.codes[0] == 97) {
//            setColorButtonBlue(key, canvas);
//            setColorTextWhite(key, canvas, paint);
//        } else if (key.codes[0] == -1) {
//            setColorButtonOrange(key, canvas);
//            setColorTextWhite(key, canvas, paint);
//        } else if (key.codes[0] == -3) {
//            setColorButtonGreen(key, canvas);
//            setColorTextWhite(key, canvas, paint);
//        } else if (key.codes[0] == -2) {
//            setColorButtonYellow(key, canvas);
//            setColorTextWhite(key, canvas, paint);
//        } else {
//            setColorButtonWhite(key, canvas);
//            setColorTextBlack(key, canvas, paint);
//        }
//    }
//
//    public  void setBackGround(Key key, Canvas canvas, Paint paint) {
//        if (key.codes[0] == 1000 || key.codes[0] == -15 || key.codes[0] == -16) {
//            setColorButtonBlack(key, canvas);
//            setColorTextWhite(key, canvas, paint);
//        } else if (key.codes[0] == 97 ) {
//            setColorButtonBlue(key, canvas);
//            setColorTextWhite(key, canvas, paint);
//        } else if (key.codes[0] == -1) {
//            setColorButtonOrange(key, canvas);
//            setColorTextWhite(key, canvas, paint);
//        } else if (key.codes[0] == -3) {
//            setColorButtonGreen(key, canvas);
//            setColorTextWhite(key, canvas, paint);
//        } else if (key.codes[0] == -2) {
//            setColorButtonYellow(key, canvas);
//            setColorTextWhite(key, canvas, paint);
//        } else {
//            setColorButtonWhite(key, canvas);
//            setColorTextBlack(key, canvas, paint);
//        }
//    }
//    private void setColorButtonWhite(Keyboard.Key key, Canvas canvas) {
//        Drawable dr = (Drawable) context.getResources().getDrawable(R.drawable.custom_back_ground_white);
//        dr.setBounds(key.x, key.y, key.x + key.width, key.y + key.height);
//        dr.draw(canvas);
//    }
//
//    private void setColorButtonOrange(Keyboard.Key key, Canvas canvas) {
//        Drawable dr = (Drawable) context.getResources().getDrawable(R.drawable.custom_back_ground_orange);
//        dr.setBounds(key.x, key.y, key.x + key.width, key.y + key.height);
//        dr.draw(canvas);
//    }
//
//    private void setColorButtonBlue(Keyboard.Key key, Canvas canvas) {
//        Drawable dr = (Drawable) context.getResources().getDrawable(R.drawable.custom_back_ground_blue);
//        dr.setBounds(key.x, key.y, key.x + key.width, key.y + key.height);
//        dr.draw(canvas);
//    }
//
//    private void setColorButtonBlack(Keyboard.Key key, Canvas canvas) {
//        Drawable dr = (Drawable) context.getResources().getDrawable(R.drawable.custom_back_ground_black);
//        dr.setBounds(key.x, key.y, key.x + key.width, key.y + key.height);
//        dr.draw(canvas);
//    }
//
//    private void setColorButtonGreen(Keyboard.Key key, Canvas canvas) {
//        Drawable dr = (Drawable) context.getResources().getDrawable(R.drawable.custom_back_ground_green);
//        dr.setBounds(key.x, key.y, key.x + key.width, key.y + key.height);
//        dr.draw(canvas);
//    }
//
//    private void setColorButtonYellow(Keyboard.Key key, Canvas canvas) {
//        Drawable dr = (Drawable) context.getResources().getDrawable(R.drawable.custom_back_ground_yellow);
//        dr.setBounds(key.x, key.y, key.x + key.width, key.y + key.height);
//        dr.draw(canvas);
//    }
//    private void setColorTextWhite(Keyboard.Key key, Canvas canvas, Paint paint) {
//        paint.setTextAlign(Paint.Align.CENTER);
//        paint.setTextSize(50);
//        paint.setColor(Color.WHITE);
//        if (key.label != null) {
//            canvas.drawText(key.label.toString(), key.x + (key.width / 2), key.y + (key.height / 2) + 20, paint);
//        }
//    }
//
//    private void setColorTextBlack(Keyboard.Key key, Canvas canvas, Paint paint) {
//        paint.setTextAlign(Paint.Align.CENTER);
//        paint.setTextSize(50);
//        paint.setColor(Color.BLACK);
//        if (key.label != null) {
//            canvas.drawText(key.label.toString(), key.x + (key.width / 2), key.y + (key.height / 2) + 20, paint);
//        }
//    }

}
