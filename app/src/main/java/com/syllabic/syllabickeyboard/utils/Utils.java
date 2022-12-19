package com.syllabic.syllabickeyboard.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.inputmethodservice.Keyboard;

import com.syllabic.syllabickeyboard.R;

import android.inputmethodservice.Keyboard.Key;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;

public class Utils {

    public static void setBackGroundDefault(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 113) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint);
        } else if (key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107
                || key.codes[0] == -10 || key.codes[0] == -11) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == 97) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint);
        } else if (key.codes[0] == -1) {
            setColorButtonOrange(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint);
            drawIconDropRight(key, canvas, context);
        } else if (key.codes[0] == -3) {
            setColorButtonGreen(key, canvas, context);
            drawIconDropLeft(key, canvas, context);
        } else if (key.codes[0] == -2) {
            setColorButtonYellow(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -5) {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint);
            drawIconDelete(key, canvas, context);
        } else {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint);
        }
    }

    public static void setBackGroundEmoji(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 1000 || key.codes[0] == -15) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint);
        } else if (key.codes[0] == 97) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint);
        } else if (key.codes[0] == -1) {
            setColorButtonOrange(key, canvas, context);
            drawIconDropRight(key, canvas, context);
        } else if (key.codes[0] == -3) {
            setColorButtonGreen(key, canvas, context);
            drawIconDropLeft(key, canvas, context);
        } else if (key.codes[0] == -2) {
            setColorButtonYellow(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -5) {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint);
            drawIconDelete(key, canvas, context);
        } else if (key.codes[0] == -16) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint);
        }
    }

    public static void setBackGroundSelectTwoDot(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107
                || key.codes[0] == -18 || key.codes[0] == -19) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == 97) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint);
        } else if (key.codes[0] == -1) {
            setColorButtonOrange(key, canvas, context);
            drawIconDropRight(key, canvas, context);
        } else if (key.codes[0] == -3) {
            setColorButtonGreen(key, canvas, context);
            drawIconDropLeft(key, canvas, context);
        } else if (key.codes[0] == -2) {
            setColorButtonYellow(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -5) {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint);
            drawIconDelete(key, canvas, context);
        } else if (key.codes[0] == 1050) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint);
        } else {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint);
        }
    }

    public static void setBackGroundTwoQwerty(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 2000) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint);
        } else if (key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107
                || key.codes[0] == -20 || key.codes[0] == -21) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == 97) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint);
        } else if (key.codes[0] == -1) {
            setColorButtonOrange(key, canvas, context);
            drawIconDropRight(key, canvas, context);
        } else if (key.codes[0] == -3) {
            setColorButtonGreen(key, canvas, context);
            drawIconDropLeft(key, canvas, context);
        } else if (key.codes[0] == -2) {
            setColorButtonYellow(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -5) {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint);
            drawIconDelete(key, canvas, context);
        } else {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint);
        }
    }

    public static void setBackGroundTwoSelectOneDot(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 2050) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint);
        } else if (key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107
                || key.codes[0] == -26) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == 97 || key.codes[0] == -25) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint);
        } else if (key.codes[0] == -1) {
            setColorButtonOrange(key, canvas, context);
            drawIconDropRight(key, canvas, context);
        } else if (key.codes[0] == -3) {
            setColorButtonGreen(key, canvas, context);
            drawIconDropLeft(key, canvas, context);
        } else if (key.codes[0] == -2) {
            setColorButtonYellow(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -5) {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint);
            drawIconDelete(key, canvas, context);
        } else {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint);
        }
    }

    public static void setBackGroundThreeQwerty(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 3000) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint);
        } else if (key.codes[0] == 97) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint);
        } else if (key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107
                || key.codes[0] == -30 || key.codes[0] == -31) {
            setColorButtonOrange(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -1) {
            setColorButtonOrange(key, canvas, context);
            drawIconDropRight(key, canvas, context);
        } else if (key.codes[0] == -3) {
            setColorButtonGreen(key, canvas, context);
            drawIconDropLeft(key, canvas, context);
        } else if (key.codes[0] == -2) {
            setColorButtonYellow(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -5) {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint);
            drawIconDelete(key, canvas, context);
        } else {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint);
        }
    }

    public static void setBackGroundThreeSelectOneDot(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 3050) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint);
        } else if (key.codes[0] == 97) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint);
        } else if (key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107
                || key.codes[0] == -35 || key.codes[0] == -36) {
            setColorButtonOrange(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -1) {
            setColorButtonOrange(key, canvas, context);
            drawIconDropRight(key, canvas, context);
        } else if (key.codes[0] == -3) {
            setColorButtonGreen(key, canvas, context);
            drawIconDropLeft(key, canvas, context);
        } else if (key.codes[0] == -2) {
            setColorButtonYellow(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -5) {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint);
            drawIconDelete(key, canvas, context);
        } else {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint);
        }
    }

    public static void setBackGroundFourQwerty(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 4000) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint);
        } else if (key.codes[0] == 97) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint);
        } else if (key.codes[0] == -1) {
            setColorButtonOrange(key, canvas, context);
            drawIconDropRight(key, canvas, context);
        } else if (key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107
                || key.codes[0] == 118 || key.codes[0] == 98 || key.codes[0] == 110
                || key.codes[0] == -40 || key.codes[0] == -41) {
            setColorButtonGreen(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -2) {
            setColorButtonYellow(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -3) {
            setColorButtonGreen(key, canvas, context);
            drawIconDropLeft(key, canvas, context);
        } else if (key.codes[0] == -5) {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint);
            drawIconDelete(key, canvas, context);
        } else {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint);
        }
    }

    public static void setBackGroundFourSelectOneDot(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 4050) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint);
        } else if (key.codes[0] == 97) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint);
        } else if (key.codes[0] == -1) {
            setColorButtonOrange(key, canvas, context);
            drawIconDropRight(key, canvas, context);
        } else if (key.codes[0] == -3 || key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107
                || key.codes[0] == 118 || key.codes[0] == 98 || key.codes[0] == 110
                || key.codes[0] == -45 || key.codes[0] == -46) {
            setColorButtonGreen(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
            drawIconDropLeft(key, canvas, context);
        } else if (key.codes[0] == -2) {
            setColorButtonYellow(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -5) {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint);
            drawIconDelete(key, canvas, context);
        } else {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint);
        }
    }

    public static void setBackGroundQwertyNumber(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 5000) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint);
        } else if (key.codes[0] == 97) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint);
        } else if (key.codes[0] == -1) {
            setColorButtonOrange(key, canvas, context);
            drawIconDropRight(key, canvas, context);
        } else if (key.codes[0] == -3) {
            setColorButtonGreen(key, canvas, context);
            drawIconDropLeft(key, canvas, context);
        } else if (key.codes[0] == -2 || key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == -50 || key.codes[0] == -51) {
            setColorButtonYellow(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -5) {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint);
            drawIconDelete(key, canvas, context);
        } else if (key.codes[0] == 106) {
            setColorButtonYellow(key, canvas, context);
            drawIconBack(key, canvas, context);
        } else if (key.codes[0] == 107) {
            setColorButtonYellow(key, canvas, context);
            drawIconNext(key, canvas, context);
        } else {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint);
        }
    }

    public static void setBackGroundQwertyNumberTwo(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 5020) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint);
        } else if (key.codes[0] == 97) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint);
        } else if (key.codes[0] == -1) {
            setColorButtonOrange(key, canvas, context);
            drawIconDropRight(key, canvas, context);
        } else if (key.codes[0] == -3) {
            setColorButtonGreen(key, canvas, context);
            drawIconDropLeft(key, canvas, context);
        } else if (key.codes[0] == -2 || key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107
                || key.codes[0] == 122 || key.codes[0] == 120 || key.codes[0] == 99 || key.codes[0] == 118
                || key.codes[0] == 98 || key.codes[0] == 110 || key.codes[0] == -52 || key.codes[0] == -53) {
            setColorButtonYellow(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -5) {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint);
            drawIconDelete(key, canvas, context);
        } else {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint);
        }
    }

    public static void setBackGroundQwertyNumberThree(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 5030) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint);
        } else if (key.codes[0] == 97) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint);
        } else if (key.codes[0] == -1) {
            setColorButtonOrange(key, canvas, context);
            drawIconDropRight(key, canvas, context);
        } else if (key.codes[0] == -3) {
            setColorButtonGreen(key, canvas, context);
            drawIconDropLeft(key, canvas, context);
        } else if (key.codes[0] == -2 || key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107
                || key.codes[0] == 122 || key.codes[0] == 120 || key.codes[0] == 99 || key.codes[0] == 118
                || key.codes[0] == 98 || key.codes[0] == 110 || key.codes[0] == -54 || key.codes[0] == -55) {
            setColorButtonYellow(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -5) {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint);
            drawIconDelete(key, canvas, context);
        } else {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint);
        }
    }


    private static void setColorButtonWhite(Key key, Canvas canvas, Context context) {
        Drawable dr = (Drawable) context.getResources().getDrawable(R.drawable.custom_back_ground_white);
        dr.setBounds(key.x, key.y, key.x + key.width, key.y + key.height);
        dr.draw(canvas);
    }

    private static void setColorButtonOrange(Keyboard.Key key, Canvas canvas, Context context) {
        Drawable dr = (Drawable) context.getResources().getDrawable(R.drawable.custom_back_ground_orange);
        dr.setBounds(key.x, key.y, key.x + key.width, key.y + key.height);
        dr.draw(canvas);
    }

    private static void setColorButtonBlue(Keyboard.Key key, Canvas canvas, Context context) {
        Drawable dr = (Drawable) context.getResources().getDrawable(R.drawable.custom_back_ground_blue);
        dr.setBounds(key.x, key.y, key.x + key.width, key.y + key.height);
        dr.draw(canvas);
    }

    private static void setColorButtonBlack(Keyboard.Key key, Canvas canvas, Context context) {
        Drawable dr = (Drawable) context.getResources().getDrawable(R.drawable.custom_back_ground_black);
        dr.setBounds(key.x, key.y, key.x + key.width, key.y + key.height);
        dr.draw(canvas);
    }

    private static void setColorButtonGreen(Keyboard.Key key, Canvas canvas, Context context) {
        Drawable dr = (Drawable) context.getResources().getDrawable(R.drawable.custom_back_ground_green);
        dr.setBounds(key.x, key.y, key.x + key.width, key.y + key.height);
        dr.draw(canvas);
    }

    private static void setColorButtonYellow(Keyboard.Key key, Canvas canvas, Context context) {
        Drawable dr = (Drawable) context.getResources().getDrawable(R.drawable.custom_back_ground_yellow);
        dr.setBounds(key.x, key.y, key.x + key.width, key.y + key.height);
        dr.draw(canvas);
    }

    private static void setColorTextWhite(Keyboard.Key key, Canvas canvas, Paint paint) {
        paint.setTypeface(Typeface.create("Arial", Typeface.BOLD));
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(50);
        paint.setColor(Color.WHITE);
        if (key.label != null) {
            canvas.drawText(key.label.toString(), key.x + (key.width / 2), key.y + (key.height / 2) + 20, paint);

        }

    }

    private static void setColorTextWhiteIcon(Keyboard.Key key, Canvas canvas, Paint paint) {
        paint.setTypeface(Typeface.create("Arial", Typeface.BOLD));
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(70);
        paint.setColor(Color.WHITE);
        if (key.label != null) {
            canvas.drawText(key.label.toString(), key.x + (key.width / 2), key.y + (key.height / 2) + 20, paint);
        }
    }

    private static void setColorTextBlack(Keyboard.Key key, Canvas canvas, Paint paint) {
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(50);
        paint.setColor(Color.BLACK);
        if (key.label != null) {
            canvas.drawText(key.label.toString(), key.x + (key.width / 2), key.y + (key.height / 2) + 20, paint);
        }
    }

    private static void setColorTextBlackIcon(Keyboard.Key key, Canvas canvas, Paint paint) {
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(70);
        paint.setColor(Color.BLACK);
        if (key.label != null) {
            canvas.drawText(key.label.toString(), key.x + (key.width / 2), key.y + (key.height / 2) + 20, paint);
        }
    }

    private static void drawIconDelete(Keyboard.Key key, Canvas canvas, Context context) {
        Drawable dr = (Drawable) context.getResources().getDrawable(R.drawable.ic_keyboard_backspace);
        float left = (float) (key.x * (1.15));
        float top = (float) (key.y * (1.12));
        float right = (float) (key.x * (1.24));
        float bottom = (float) (key.y * (1.36));
        dr.setBounds((int) left, (int) top, (int) right, (int) bottom);
        dr.draw(canvas);
    }

    private static void drawIconDropRight(Keyboard.Key key, Canvas canvas, Context context) {
        Drawable dr = (Drawable) context.getResources().getDrawable(R.drawable.right_triangle);
//        float left = (float) (key.x * (1.15));
//        float top = (float) (key.y * (1.12));
//        float right = (float) (key.x * (1.24));
//        float bottom = (float) (key.y * (1.36));
        float left = (float) (key.x + 40);
        float top = (float) (key.y + 45);
        float right = (float) (key.x + key.width) - 30;
        float bottom = (float) (key.y + (key.height / 2) + 25);
        dr.setBounds((int) left, (int) top, (int) right, (int) bottom);
        dr.draw(canvas);
    }

    private static void drawIconDropLeft(Keyboard.Key key, Canvas canvas, Context context) {
        Drawable dr = context.getResources().getDrawable(R.drawable.left_triangle);
//        float left = (float) (key.x * (1.15));
//        float top = (float) (key.y * (1.12));
//        float right = (float) (key.x * (1.24));
//        float bottom = (float) (key.y * (1.36));
        float left = (float) (key.x + 30);
        float top = (float) (key.y + 35);
        float right = (float) (key.x + key.width) - 34;
        float bottom = (float) (key.y + (key.height / 2) + 30);
        dr.setBounds((int) left, (int) top, (int) right, (int) bottom);
        dr.draw(canvas);
    }

    private static void drawIconBack(Keyboard.Key key, Canvas canvas, Context context) {
        Drawable dr = (Drawable) context.getResources().getDrawable(R.drawable.ic_left);
//        float left = (float) (key.x * (1.15));
//        float top = (float) (key.y * (1.12));
//        float right = (float) (key.x * (1.24));
//        float bottom = (float) (key.y * (1.36));
        float left = (float) (key.x) + 10;
        float top = (float) (key.y) + 30;
        float right = (float) (key.x + key.width) - 10;
        float bottom = (float) (key.y + (key.height / 2) + 40);
        dr.setBounds((int) left, (int) top, (int) right, (int) bottom);
        dr.draw(canvas);
    }

    private static void drawIconNext(Keyboard.Key key, Canvas canvas, Context context) {
        Drawable dr = (Drawable) context.getResources().getDrawable(R.drawable.ic_right);
//        float left = (float) (key.x * (1.15));
//        float top = (float) (key.y * (1.12));
//        float right = (float) (key.x * (1.24));
//        float bottom = (float) (key.y * (1.36));
        float left = (float) (key.x) + 10;
        float top = (float) (key.y) + 30;
        float right = (float) (key.x + key.width) - 10;
        float bottom = (float) (key.y + (key.height / 2) + 40);
        dr.setBounds((int) left, (int) top, (int) right, (int) bottom);
        dr.draw(canvas);
    }

    public static void showPopupLongClick(PopupWindow popupWindow, Context context, Key key, TextView tvOne, TextView tvTwo, TextView tvThree) {
        // keyboard 1
        if (key.text.equals("ᐁ")) {
            tvThree.setText(key.text);
            visibleTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowBlack(popupWindow, context);
        } else if (key.text.equals("ᐯ")) {
            tvThree.setText(key.text);
            visibleTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowBlack(popupWindow, context);
        } else if (key.text.equals("ᑌ")) {
            tvThree.setText(key.text);
            visibleTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowBlack(popupWindow, context);
        } else if (key.text.equals("ᑫ")) {
            tvThree.setText(key.text);
            visibleTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowBlack(popupWindow, context);
        } else if (key.text.equals("ᒉ")) {
            tvThree.setText(key.text);
            visibleTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowBlack(popupWindow, context);
        } else if (key.text.equals("ᒣ")) {
            tvThree.setText(key.text);
            visibleTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowBlack(popupWindow, context);
        } else if (key.text.equals("ᓀ")) {
            tvThree.setText(key.text);
            visibleTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowBlack(popupWindow, context);
        } else if (key.text.equals("ᓭ")) {
            tvThree.setText(key.text);
            visibleTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowBlack(popupWindow, context);
        } else if (key.text.equals("ᓓ")) {
            tvThree.setText(key.text);
            visibleTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowBlack(popupWindow, context);
        } else if (key.text.equals("ᔦ")) {
            tvThree.setText(key.text);
            visibleTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowBlack(popupWindow, context);
        } else if (key.text.equals("ᕓ")) {
            tvThree.setText(key.text);
            visibleTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowBlack(popupWindow, context);
        } else if (key.text.equals("ᕂ")) {
            tvThree.setText(key.text);
            visibleTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowBlack(popupWindow, context);
        } else if (key.text.equals("ᙯ")) {
            tvThree.setText(key.text);
            visibleTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowBlack(popupWindow, context);
        } else if (key.text.equals("ᙰ")) {
            tvThree.setText(key.text);
            visibleTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowBlack(popupWindow, context);
        } else if (key.text.equals(".")) {
            tvThree.setText(key.text);
            tvThree.setTextColor(Color.BLACK);
            visibleTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowWhite(popupWindow, context);
        } else if (key.text.equals(",")) {
            tvThree.setText(key.text);
            tvThree.setTextColor(Color.BLACK);
            visibleTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowWhite(popupWindow, context);
        } else if (key.text.equals("?")) {
            tvThree.setText(key.text);
            tvThree.setTextColor(Color.BLACK);
            visibleTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowWhite(popupWindow, context);
        } else if (key.text.equals("!")) {
            tvThree.setText(key.text);
            tvThree.setTextColor(Color.BLACK);
            visibleTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowWhite(popupWindow, context);
        } else if (key.text.equals(";")) {
            tvThree.setText(key.text);
            tvThree.setTextColor(Color.BLACK);
            visibleTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowWhite(popupWindow, context);
        } else if (key.text.equals(":")) {
            tvThree.setText(key.text);
            tvThree.setTextColor(Color.BLACK);
            visibleTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowWhite(popupWindow, context);
        }
            // keyboard 2 blue
        else if (key.text.equals("ᐃ") || key.text.equals("ᐄ")) {
            tvOne.setText("ᐃ");
            tvTwo.setText("ᐄ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowBlue(popupWindow, context);
            //key board 3 orange
        } else if (key.text.equals("ᐅ") || key.text.equals("ᐆ")) {
            tvOne.setText("ᐅ");
            tvTwo.setText("ᐆ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowOrange(popupWindow, context);
        }
    }

    public static void visibleTextViewThree(TextView tvOne, TextView tvTwo, TextView tvThree) {
        tvOne.setVisibility(View.GONE);
        tvTwo.setVisibility(View.GONE);
        tvThree.setVisibility(View.VISIBLE);
    }

    public static void goneTextViewThree(TextView tvOne, TextView tvTwo, TextView tvThree) {
        tvOne.setVisibility(View.VISIBLE);
        tvTwo.setVisibility(View.VISIBLE);
        tvThree.setVisibility(View.GONE);
    }

    public static void setBackGroundPopupWindowBlue(PopupWindow popupWindow, Context context) {
        if (popupWindow.isShowing()){
            popupWindow.dismiss();
        }
        popupWindow.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.background_popup_blue));
    }

    public static void setBackGroundPopupWindowBlack(PopupWindow popupWindow, Context context) {
        if (popupWindow.isShowing()){
            popupWindow.dismiss();
        }
        popupWindow.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.background_popup_black));
    }

    public static void setBackGroundPopupWindowYellow(PopupWindow popupWindow, Context context) {
        if (popupWindow.isShowing()){
            popupWindow.dismiss();
        }
        popupWindow.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.background_popup_yellow));
    }

    public static void setBackGroundPopupWindowGreen(PopupWindow popupWindow, Context context) {
        if (popupWindow.isShowing()){
            popupWindow.dismiss();
        }
        popupWindow.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.background_popup_green));
    }

    public static void setBackGroundPopupWindowOrange(PopupWindow popupWindow, Context context) {
        if (popupWindow.isShowing()){
            popupWindow.dismiss();
        }
        popupWindow.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.background_popup_orange));
    }

    public static void setBackGroundPopupWindowWhite(PopupWindow popupWindow, Context context) {
        if (popupWindow.isShowing()){
            popupWindow.dismiss();
        }
        popupWindow.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.background_popup_white));
    }


    public static String[] list = {
            "ᐁᑉᐸᖓᓐᓂ", "ᐁᑉᐸ", "ᐁᑦᑑᑎ", "ᐁᑦᑕ", "ᐁᑦᑕᐅᑐ", "ᐁᑦᓯ", "ᐁᑦᓯᕋᐅᑎᒃ", "ᐁᑯᓗ", "ᐁᒎᖅ", "ᐁᓚᖓ",
            "ᐁᕆᓕ", "ᐯᐯ", "ᐯᓯᑰ", "ᐯᔪᖓ", "ᐯᕈᓐᓇᕿ", "ᐯᖕᖑᐳᖓ", "ᐯᖕᖑᐹ", "ᑌᑦᓱᒪ", "ᑌᑦᓱᒪᓂ", "ᑌᒃᑯᐊ",
            "ᑌᒣᒻᒪᑦ", "ᑌᒪᖕᖓ", "ᑌᒫ", "ᑌᒫᑦᓯᐊᖅ", "ᑌᒫᖑᖕᖏᑐᖅ", "ᑌᓐᓇ", "ᑌᓗᒍ", "ᑫᐱᒍᑎ", "ᑫᐱᖓᔪ", "ᑫᑦᑕᖅ",
            "ᑫᒥᑦᓯ", "ᑫᓪᓗᕿ", "ᑫᓪᓘᒥᑕ", "ᑫᓪᓚᑐᐃ", "ᑫᕙᓗᐊᖅ", "ᒣᑦᑐᖅ", "ᒣᓪᓕᐅ", "ᓀᐱᑕ", "ᓀᐱᑦᓯᑫᓐᓇ", "ᓀᑦᑐ",
            "ᓀᑫᓐᓇ", "ᓀᒪᔪ", "ᓓᕐᑐᖅ", "ᓓᕐᑐᖓ", "ᓭᒨ", "ᓭᒪᔪ", "ᓭᒻᒪᑎᑕᐅ", "ᓭᒻᒪᖃᔦ", "ᓭᓃᓯ", "ᔦᖕᖑᐊᑐᑦ", "ᔦᖕᖑᐊᑐᖅ",
            "ᔦᖕᖑᐊᑑᒃ", "ᐃᐱ", "ᐃᑉᐸᓴ", "ᐃᑉᐸᓵᓂ", "ᐃᒥᕈᑎ", "ᐃᒥᕐᑕᐅᑎ", "ᐃᒪᕐᓗᑯᓐᓂᐊᕈᑎ", "ᐃᒪᑦᓯᐊ", "ᐃᓄᐃᑦ",
            "ᐃᓄᑦᑎᑐᑦ", "ᐃᓄᒃᔪᐊᒃ", "ᐃᓄᒃᔪᐊᒥ", "ᐃᓅᖃᑎ", "ᐃᓇᑦᓯᓚᐅ", "ᐃᓛᓕ", "ᐃᓱᐃᑦᑐ", "ᐃᓱᐊᕐᑐ", "ᐃᕗᔨᕕᒃ",
            "ᐃᕗᔨᕕᒻᒥ", "ᐃᕿᐊᓇ", "ᐃᖃᓗ", "ᐃᖃᓗᐃᑦ", "ᐃᖃᓗᑉᐱ", "ᐃᖃᓗᓐᓂ", "ᐃᖃᓪᓕᐊ", "ᐄᒃᑭᑮ", "ᐱᐅᓯᑐ", "ᐱᑑᑎ",
            "ᐱᑭᐅ", "ᐱᒋᐊᑦᓯᐊ", "ᐱᒻᒪᕆ", "ᐱᓐᓂᐊ", "ᐱᓗᑲ", "ᐱᓯᑎ", "ᐱᓱᑦᑐ", "ᐱᓱᖃᑎ", "ᐱᕈᑦᓯᐊ", "ᐱᕙᓪᓕᐊ", "ᐱᖃᑎ",
            "ᐱᖃᓐᓈ", "ᐱᖃᓗᔭ", "ᐱᖓᔪᐊᓐᓂ", "ᐱᖕᖑᐊ", "ᑎᐸᐅᑎᒃ", "ᑎᑭᓚᖓᕕ", "ᑎᑭᕐᖁᒍ", "ᑎᑭᕐᖁᖓ", "ᑎᒥᓐᓂᐊ", "ᑎᒻᒥᔫᖅ",
            "ᑎᓇᑉᐳᖓ", "ᑎᓇᒐᒪ", "ᑎᓇᓐᓇᑐᖅ", "ᑎᓯᐱᕆ", "ᑎᔭᓚᖓ", "ᑏᑑᑎ", "ᑏᑐᖃᑎᒌ", "ᑭᑭᐊ", "ᑭᒍᑎ", "ᑭᒍᑕᖏᓐᓀᑦ",
            "ᑭᒻᒥᓀᑦ", "ᑭᒻᒥᓇ", "ᑭᒻᒥᕈ", "ᑭᒻᒥᕈᒻᒥ", "ᑭᒻᒪᐅᑏᒃ", "ᑭᓇᒃᑯ", "ᑭᖑᕙ", "ᑭᖕᙰᑦ", "ᑭᖕᖓᓂ", "ᑮᑕᓗᐊᓗ", "ᑮᓇᐅᔭ",
            "ᑮᓇᑉᐸ", "ᑮᓐᓇᓴ", "ᑮᓯᓲ", "ᒥᑐᐃᔭ", "ᒥᑦᓯᒪᑕᓕ", "ᒥᓇᓐᓂᐊ", "ᒥᓇᓚᖓ", "ᒥᓐᓂ", "ᒥᓚᖓᓯᔪ", "ᒥᓯᕋ", "ᒥᕐᖁ",
            "ᒥᕝᕕᒥ", "ᒥᖕᖏᒪ", "ᓂᐯᑦᑐ", "ᓂᑦᑕᔪ", "ᓂᑦᔭᓗᑦᑖ", "ᓂᑯᕐᕋ", "ᓂᓐᓂᐅ", "ᓂᓪᓛ", "ᓂᕆᑫᓐᓇ", "ᓂᕈᑐᔪ", "ᓂᕈᑭᑦᑐ",
            "ᓂᕈᒥᑦᑐ", "ᓂᕿᑦᓯᕕ", "ᓂᕿᑦᓯᕕᒻᒥ", "ᓂᖏᐅ", "ᓂᖓᐅ", "ᓂᖕᖓᐅᒪ", "ᓕᐅᑎᔫᒃ", "ᓕᓂᐅᖕᖏᑐ", "ᓕᓂᑐᖃ", "ᓕᕇᒥᔪ",
            "ᓕᕐᓕ", "ᓯᐅᐱᕈ", "ᓯᐅᓯᕆ", "ᓯᐅᕋ", "ᓯᑎᐱᕆ", "ᓯᑐᕋᐅᑏᒃ", "ᓯᑦᔭᓕᐊ", "ᓯᑯᖕᖏ", "ᓯᒃᑭᑕ", "ᓯᒃᑭᑕᑯᑖ", "ᓯᓂᓐᓇᓯ",
            "ᓯᓂᓐᓇᓯᒻᒪᑦ", "ᓯᓂᓕᕆ", "ᓯᓂᕇᕈᑦᑕ", "ᓯᓇᕐᔪᑑ", "ᓯᓈᓂ", "ᓯᓚᑉᐱᐊ", "ᓯᓚᑐᔪ", "ᓯᓚᑦᓯᐊ", "ᓯᓚᕐᔪᐊ", "ᓯᓛᐱ",
            "ᓯᓪᓗᔪ", "ᓯᕐᓈ", "ᓯᕿᓂ", "ᓯᕿᖕᖑᔭ", "ᓰᑦᑕᑐ", "ᓰᕐᓇᑐ", "ᓰᕐᖂ", "ᔨᐊᓕᒃ", "ᔨᐊᕗ", "ᔨᐊᖓ", "ᕆᐊᑐᔪᖅ",
            "ᕆᐊᑐᖕᖏᑐᖅ", "ᕆᐊᖃᖕᖏᑐᖅ", "ᕇᑐᐊᕐᐸ", "ᕇᓚᐅᔪᖅ", "ᕇᓚᐅᕐᑐᖅ", "ᕇᕐᖃᐅᔪᖅ", "ᕕᕈᐊᕆ", "ᕿᐊᒃᑲᑕᐅ",
            "ᕿᐊᔪ", "ᕿᐱᓗᑦᑐ", "ᕿᑐᕐᖓ", "ᕿᑭᕐᑕ", "ᕿᑲᕐᑐ", "ᕿᒥᕆᐊ", "ᕿᓂᓚᐅᒍ", "ᕿᓂᕐᑕᐅᔪ", "ᕿᓂᕐᑕᒐ", "ᕿᓚᓗᒐ",
            "ᕿᓯᔭᖅ", "ᕿᖓᑯᑦᑖᓕ", "ᖏᓐᓂᐅᔭᑦᔭᖏᓪᓚ", "ᖏᓪᓚᒍ", "ᖏᓪᓚᖓ", "ᐅᐃᒍᐃᑎᑐᑦ", "ᐅᐃᒍᐃᑦ", "ᐅᐱᓐᓇᕋᓂ",
            "ᐅᑉᐱᓕᕐᖃᐅ", "ᐅᑉᐱᓵ", "ᐅᑦᑐᐱᕆ", "ᐅᒥᐅᔭᒻᒥ", "ᐅᒥᐅᔭᖅ", "ᐅᓂᒃᑲᐅᓯ", "ᐅᓪᓚᓗᑎᑦ", "ᐅᓪᓚᓱᓂ", "ᐅᓰᒻᒪᓗ",
            "ᐅᕐᖂ", "ᐅᕝᕙᓘᓐᓃᑦ", "ᐅᕐᖂᔪ", "ᐅᖁᒣ", "ᐅᖓᓯᑦᑐ", "ᐅᖓᓯᓗᐊᕐᑐ", "ᐆᒪᔪ", "ᐆᒻᒪᑎᒐ", "ᐳᐃᔨ", "ᐳᐊᓘᒃ",
            "ᐳᑐᒍ", "ᐳᑦᔪᓯᐅᑎ", "ᐳᓪᓕᑐ", "ᐳᕕᔫ", "ᐳᕕᕐᓂᑐᒥ", "ᐳᕕᕐᓂᑐᖅ", "ᐴᑯᓗ", "ᐴᕐᓗᒍ", "ᑐᐸᑐᐃᕈᒪ", "ᑐᐸᕋᑖ",
            "ᑐᑭᓯᕖ?", "ᑐᑭᓯᕗᖓ", "ᑐᓱᐹ", "ᑐᓱᔪᖓ", "ᑐᓴᐅᑎ", "ᑐᔪᕐᒥᐊ", "ᑐᖑᔪᐊᖓᔪ", "ᑐᖑᔪᕐᑕ", "ᑯᑕᑦᑐ", "ᑯᑭᑕᐸᐅᑎ",
            "ᑯᑭᑦᓯᐅᑎ", "ᑯᕕᓗᒍ", "ᑯᕕᕐᖃᐅᔪ", "ᑰᑦᔪᐊᒥ", "ᑰᑦᔪᐊᕌᐱᒃ", "ᑰᑦᔪᐊᕌᐱᒻᒥ", "ᑰᑦᔪᐊᖅ", "ᒧᒥᓪᓗᒍ", "ᒧᒥᖕᖓᔪ", "ᓄᐃᓚ",
            "ᓄᑖ", "ᓄᑖᕕᓂᖅ", "ᓄᑭᒃᑲ", "ᓄᑲᒐ", "ᓄᑳᐱᒐ", "ᓄᓂᕙᕆᐊ", "ᓄᓂᕚᑦᓭᑦ", "ᓄᓇᑦᓯᐊᕗᑦ", "ᓄᓇᒥ", "ᓄᓇᓕ",
            "ᓄᓇᓕᑦᑎᓂ", "ᓄᓇᕕᒃ", "ᓄᓇᕗᑦ", "ᓄᕕᐱᕆ", "ᓄᕗᑦᓯᓴᕐᑐᖅ", "ᓄᕗᑦᓯᔪᖅ", "ᓄᕗᔦᑦ", "ᓄᕙᑦᑐᖓ", "ᓄᖑᑦᑐ",
            "ᓄᖑᒪᔪ", "ᓄᖑᒪᔪᑦ", "ᓅᓚᖓᕕ", "ᓗᑐᕐᕿ", "ᓗᑯᐊᓗ", "ᓗᑳᓗ", "ᓱᑲᑦᑐ", "ᓱᓇᐅᓈ?", "ᓱᓕᕖᑦ?", "ᓱᓕᕗᖓ",
            "ᓱᓕᖕᖏᓇᕕᑦ", "ᓱᓚᖓᕕ", "ᓱᔪᖃᓕᕐᖃ?", "ᓱᕕᓯ", "ᓱᖃᑦᓯᕕᓯ", "ᓱᖏᐅᓐᓀ", "ᓱᖏᐅᓐᓂ", "ᓲᖑᔪ", "ᔪᑐᐊᖅ",
            "ᔪᑐᖄᓗᖅ", "ᔪᓓ", "ᔫᓂ", "ᔫᔮᕐᑐᖅ", "ᕈᒪᔭᕐᓱ", "ᕈᓇᐅᑦᓱᓂ", "ᕈᓇᐅᖕᖏᑐᖅ", "ᕈᓐᓇᖁᑎ", "ᕈᓐᓇᖁᓯ",
            "ᕗᒍᓪᓕ", "ᖁᐊᕐᑕᒥ", "ᖁᐊᕐᑕᖅ", "ᖁᐱᕐᕈ", "ᖁᑎᒍᓘ", "ᖁᒥᐅᑫᓐᓇᖃᒋ", "ᖁᒥᐅᖕᖓ", "ᖁᔨᒍᕕᑦ", "ᖁᔨᖕᖏᓇᒪ",
            "ᖁᔭᐅᖕᖏᓚᖓ", "ᖑᐊᓲ", "ᐊᐅᐸᓗᒃ", "ᐊᐅᐸᓗᒻᒥ", "ᐊᐅᑯᓯᑎ", "ᐊᐅᑲ", "ᐊᑕᐅᑦᓯᑯᑦ", "ᐊᑕᐅᓯ", "ᐊᑭᒋᐊ",
            "ᐊᑭᖓ", "ᐊᑯᓕᕕᒃ", "ᐊᑯᓕᕕᒻᒥ", "ᐊᒥᓱᑦ", "ᐊᓪᓕᑐᓂ", "ᐊᓯᐅᔪ", "ᐊᓯᕙᓚᖓ", "ᐊᓯᕙᕐᖃᐅ", "ᐊᓱᒎᒃ", "ᐊᕐᖁᑎ",
            "ᐊᖏᔪᐊᓗ", "ᐊᖏᕐᐳᖓ", "ᐋᑕᑖ", "ᐋᑦᓲ", "ᐋᓐᓂᐊ", "ᐋᓐᓂᓇᕐᑐ", "ᐋᓗᒻᒥ", "ᐋᓚᓖᓐᓇ", "ᐋᕐᕿᐳᖓ",
            "ᐸᐅᕐᖓᑐᕈᒪᐹ", "ᐸᐅᕐᙰᑦ", "ᐸᐱᕈ", "ᐸᓂᒐ", "ᐸᓂᕐᑎᑕ", "ᐸᓂᕐᑐ", "ᐸᓃᑦ", "ᐸᓐᓂᑑᖅ", "ᐸᖓᓕ", "ᐹᓂᐊᓗ",
            "ᐹᓐᓂᓴᖃᑦᑕᓇ", "ᐹᓪᓚᓱᖓ", "ᑕᑭᔪ", "ᑕᑯᑫᓐᓇ", "ᑕᑯᓚᐅᕋᓴᕐᑌ?", "ᑕᑯᕚ", "ᑕᒪᐅᓇ", "ᑕᓯᐅᔭᒥ", "ᑕᓯᐅᔭᖅ",
            "ᑕᓯᐊᓗᒃ", "ᑕᓯᐊᓗᒻᒥ", "ᑕᓯᑯᑖᒃ", "ᑕᓯᑯᑖᒥ", "ᑕᓯᑲᓪᓚᒃ", "ᑕᓯᑲᓪᓚᒥ", "ᑖᒃᑯᓂᖓᑦᓭᓇ", "ᑖᒃᑯᓭᓐᓀᑦ", "ᑖᓂᓯ",
            "ᑲᑎᒪ", "ᑲᒃᑭᐅᕗᖓ", "ᑲᒃᑭᓕᔪᖅ", "ᑲᒃᑭᓕᕗᖓ", "ᑲᒥᓪᓛ", "ᑲᒪᑦᓴᓇ", "ᑲᓇᑕ", "ᑲᓇᑕᒥ", "ᑲᓲᒪ", "ᑲᖏᕐᓱᐊᓗᑦᔪᐊᒥ",
            "ᑲᖏᕐᓱᐊᓗᑦᔪᐊᖅ", "ᑲᖏᕐᓱᑲᓪᓚᒃ", "ᑲᖏᕐᓱᑲᓪᓚᒥ", "ᑲᖏᕐᓱᒃ", "ᑲᖏᕐᓱᒥ", "ᑲᖏᕐᓱᔪᐊᒥ", "ᑲᖏᕐᓱᔪᐊᖅ", "ᑲᖕᖑᒋ", "ᑲᖕᖑᓱ",
            "ᑳᐱᑐ", "ᑳᐱᑐᕈᒪᕕ", "ᑳᐹ", "ᒪᑭᑕ", "ᒪᒣᑦᑐᖁᑏᑦ", "ᒪᒣᑦᑐᖅ", "ᒪᒥᑦᓯᐊᕋ", "ᒪᒥᕐᖁ", "ᒪᒪᕐᑐ", "ᒪᒪᕐᑯᖅ", "ᒪᒪᕐᖄ?",
            "ᒪᓃᑦᑐ", "ᒪᓕᒉᑦ", "ᒪᓕᕈᒪᐹ", "ᒪᓕᕈᒪᕖ", "ᒪᔪᕋ", "ᒪᖏᑦᑕ", "ᒪᙯ", "ᒪᙯᓈᖅ", "ᒫᔨ", "ᓇᑦᓯᕕᓂ", "ᓇᑭᖕᖔᑐ",
            "ᓇᑯᕐᒦᒃ", "ᓇᒧᖕᖓᓚᖓᕕ", "ᓇᒻᒪᒑ", "ᓇᓂᒥᐅᖑᕕ", "ᓇᓗᐹ", "ᓇᓗᓇᕿ", "ᓇᓪᓕᒋᕙᒋᑦ", "ᓇᖏᐊ", "ᓈᒻᒪᑐ", "ᓈᒻᒪᖏᑦᑐ",
            "ᓈᓚᐅᑎ", "ᓈᓚᑦᓯᐊ", "ᓚᐅᕐᖁᖓ", "ᓚᕆᒻᒥ", "ᓚᖓᓯᕗᖓ", "ᓚᖓᕗᖓ", "ᓛᕐᑐᐊᓗᒃ", "ᓴᑭᒐ", "ᓴᓂᑦᑎᓂ", "ᓴᓂᑦᓯᓂ",
            "ᓴᓂᒃᑯᕕ", "ᓴᓐᓂᑐᖓ", "ᓴᓐᓂᖓᔪ", "ᓴᓪᓗᐃᑦ", "ᓴᓪᓗᓂ", "ᓵᓚᖃ", "ᔭᓄᐊᕆ", "ᔭᖏᓪᓚ", "ᔮᐸᓃᓯ", "ᕋᓗᐊᕐᐸᑦ", "ᕋᓛᐱ",
            "ᕋᓱᐊᒻᒪᕆ", "ᕋᓱᓪᓗᑎ", "ᕙᒻᒪᑕ", "ᕙᓗᒻᒪᑕ", "ᕙᓗᒻᒪᑦ", "ᖃᐅᑉᐸᑦ", "ᖃᐅᑉᐸᓵ", "ᖃᐅᑉᐸᓵᑦᓵ", "ᖃᐅᑕᒣᑕ", "ᖃᐅᑕᒫᑦ",
            "ᖃᑕᖕᖑᑏᙰ", "ᖃᑦᓯᖑᑐᐊᕐᐸᑦ?", "ᖃᓄᐃᑉᐲᑦ?", "ᖃᓄᐃᑉᐳᖓ", "ᖃᓄᐃᖕᖏᓚᑏᑦ?", "ᖃᓄᐃᖕᖏᓚᖓ", "ᖃᓪᓗᓈᑎᑐᑦ",
            "ᖃᓪᓗᓈᑦ", "ᖃᕆᑕᐅᔮᕈ", "ᖃᖓ?", "ᖃᖓᑐᐃᓐᓇ"

    };

}
