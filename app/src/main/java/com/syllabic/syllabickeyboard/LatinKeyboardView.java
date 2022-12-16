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
}
