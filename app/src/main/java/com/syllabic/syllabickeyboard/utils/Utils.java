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
import android.view.Gravity;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;

public class Utils {

    public static void setBackGroundDefault(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 113) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint, context);
        } else if (key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107
                || key.codes[0] == -10 || key.codes[0] == -11) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhite(key, canvas, paint,context);
        } else if (key.codes[0] == 97) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhiteIconTwo(key, canvas, paint, context);
        } else if (key.codes[0] == -1) {
            setColorButtonOrange(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint, context);
            drawIconDropRight(key, canvas, context);
        } else if (key.codes[0] == -3) {
            setColorButtonGreen(key, canvas, context);
            drawIconDropLeft(key, canvas, context);
        } else if (key.codes[0] == -2) {
            setColorButtonYellow(key, canvas, context);
            setColorTextWhite(key, canvas, paint,context);
        } else if (key.codes[0] == -5) {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint, context);
            drawIconDelete(key, canvas, context);
        } else {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint, context);
        }
    }

    public static void setBackGroundEmoji(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 1000 || key.codes[0] == -15) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint, context);
        } else if (key.codes[0] == 97) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhiteIconTwo(key, canvas, paint, context);
        } else if (key.codes[0] == -1) {
            setColorButtonOrange(key, canvas, context);
            drawIconDropRight(key, canvas, context);
        } else if (key.codes[0] == -3) {
            setColorButtonGreen(key, canvas, context);
            drawIconDropLeft(key, canvas, context);
        } else if (key.codes[0] == -2) {
            setColorButtonYellow(key, canvas, context);
            setColorTextWhite(key, canvas, paint,context);
        } else if (key.codes[0] == -5) {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint, context);
            drawIconDelete(key, canvas, context);
        } else if (key.codes[0] == -16) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhite(key, canvas, paint,context);
        } else {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint, context);
        }
    }

    public static void setBackGroundSelectTwoDot(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107
                || key.codes[0] == -18 || key.codes[0] == -19) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhite(key, canvas, paint,context);
        } else if (key.codes[0] == 97) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhiteIconTwo(key, canvas, paint, context);
        } else if (key.codes[0] == -1) {
            setColorButtonOrange(key, canvas, context);
            drawIconDropRight(key, canvas, context);
        } else if (key.codes[0] == -3) {
            setColorButtonGreen(key, canvas, context);
            drawIconDropLeft(key, canvas, context);
        } else if (key.codes[0] == -2) {
            setColorButtonYellow(key, canvas, context);
            setColorTextWhite(key, canvas, paint,context);
        } else if (key.codes[0] == -5) {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint, context);
            drawIconDelete(key, canvas, context);
        } else if (key.codes[0] == 1050) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint, context);
        } else {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint, context);
        }
    }

    public static void setBackGroundTwoQwerty(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 2000) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint, context);
        } else if (key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107
                || key.codes[0] == -20 || key.codes[0] == -21) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhite(key, canvas, paint,context);
        } else if (key.codes[0] == 97) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhiteIconTwo(key, canvas, paint, context);
        } else if (key.codes[0] == -1) {
            setColorButtonOrange(key, canvas, context);
            drawIconDropRight(key, canvas, context);
        } else if (key.codes[0] == -3) {
            setColorButtonGreen(key, canvas, context);
            drawIconDropLeft(key, canvas, context);
        } else if (key.codes[0] == -2) {
            setColorButtonYellow(key, canvas, context);
            setColorTextWhite(key, canvas, paint,context);
        } else if (key.codes[0] == -5) {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint, context);
            drawIconDelete(key, canvas, context);
        } else {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint, context);
        }
    }

    public static void setBackGroundTwoSelectOneDot(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 2050) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint, context);
        } else if (key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107
                || key.codes[0] == -26) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhite(key, canvas, paint,context);
        } else if ( key.codes[0] == -25) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhiteIconTwoDot(key, canvas, paint, context);
        }  else if (key.codes[0] == 97) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhiteIconTwo(key, canvas, paint, context);
        } else if (key.codes[0] == -1) {
            setColorButtonOrange(key, canvas, context);
            drawIconDropRight(key, canvas, context);
        } else if (key.codes[0] == -3) {
            setColorButtonGreen(key, canvas, context);
            drawIconDropLeft(key, canvas, context);
        } else if (key.codes[0] == -2) {
            setColorButtonYellow(key, canvas, context);
            setColorTextWhite(key, canvas, paint,context);
        } else if (key.codes[0] == -5) {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint, context);
            drawIconDelete(key, canvas, context);
        } else {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint, context);
        }
    }

    public static void setBackGroundThreeQwerty(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 3000) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint, context);
        } else if (key.codes[0] == 97) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhiteIconTwo(key, canvas, paint, context);
        } else if (key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107
                || key.codes[0] == -30 || key.codes[0] == -31) {
            setColorButtonOrange(key, canvas, context);
            setColorTextWhite(key, canvas,paint, context);
        } else if (key.codes[0] == -1) {
            setColorButtonOrange(key, canvas, context);
            drawIconDropRight(key, canvas, context);
        } else if (key.codes[0] == -3) {
            setColorButtonGreen(key, canvas, context);
            drawIconDropLeft(key, canvas, context);
        } else if (key.codes[0] == -2) {
            setColorButtonYellow(key, canvas, context);
            setColorTextWhite(key, canvas, paint,context);
        } else if (key.codes[0] == -5) {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint, context);
            drawIconDelete(key, canvas, context);
        } else {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint, context);
        }
    }

    public static void setBackGroundThreeSelectOneDot(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 3050) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint, context);
        } else if (key.codes[0] == 97) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhiteIconTwo(key, canvas, paint, context);
        } else if (key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107
                ||  key.codes[0] == -36) {
            setColorButtonOrange(key, canvas, context);
            setColorTextWhite(key, canvas, paint,context);
        } else if (key.codes[0] == -1) {
            setColorButtonOrange(key, canvas, context);
            drawIconDropRight(key, canvas, context);
        }else if (key.codes[0] == -35) {
            setColorButtonOrange(key, canvas, context);
            setColorTextWhite(key, canvas, paint,context);
            drawIconDropRightFinal(key, canvas, context);
        } else if (key.codes[0] == -3) {
            setColorButtonGreen(key, canvas, context);
            drawIconDropLeft(key, canvas, context);
        } else if (key.codes[0] == -2) {
            setColorButtonYellow(key, canvas, context);
            setColorTextWhite(key, canvas, paint,context);
        } else if (key.codes[0] == -5) {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint, context);
            drawIconDelete(key, canvas, context);
        } else {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint, context);
        }
    }

    public static void setBackGroundFourQwerty(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 4000) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint, context);
        } else if (key.codes[0] == 97) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhiteIconTwo(key, canvas, paint, context);
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
            setColorTextWhite(key, canvas, paint,context);
        } else if (key.codes[0] == -2) {
            setColorButtonYellow(key, canvas, context);
            setColorTextWhite(key, canvas, paint,context);
        } else if (key.codes[0] == -3) {
            setColorButtonGreen(key, canvas, context);
            drawIconDropLeft(key, canvas, context);
        } else if (key.codes[0] == -5) {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint, context);
            drawIconDelete(key, canvas, context);
        } else {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint, context);
        }
    }

    public static void setBackGroundFourSelectOneDot(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 4050) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint, context);
        } else if (key.codes[0] == 97) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhiteIconTwo(key, canvas, paint, context);
        } else if (key.codes[0] == -1) {
            setColorButtonOrange(key, canvas, context);
            drawIconDropRight(key, canvas, context);
        } else if (key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107
                || key.codes[0] == 118 || key.codes[0] == 98 || key.codes[0] == 110
                || key.codes[0] == -46) {
            setColorButtonGreen(key, canvas, context);
            setColorTextWhite(key, canvas, paint,context);
        }else if (key.codes[0] == -3 ){
            setColorButtonGreen(key, canvas, context);
            setColorTextWhite(key, canvas, paint,context);
            drawIconDropLeft(key, canvas, context);
        }else if (key.codes[0] == -2) {
            setColorButtonYellow(key, canvas, context);
            setColorTextWhite(key, canvas, paint,context);
        } else if (key.codes[0] == -5) {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint, context);
            drawIconDelete(key, canvas, context);
        } else if (key.codes[0] == -45) {
            setColorButtonGreen(key, canvas, context);
            setColorTextWhite(key, canvas, paint,context);
            drawIconDropLeftFinal(key, canvas, context);
        } else {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint, context);
        }
    }

    public static void setBackGroundQwertyNumber(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 5000) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint, context);
        } else if (key.codes[0] == 97) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhiteIconTwo(key, canvas, paint, context);
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
            setColorTextWhite(key, canvas, paint,context);
        } else if (key.codes[0] == -5) {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint, context);
            drawIconDelete(key, canvas, context);
        } else if (key.codes[0] == 106) {
            setColorButtonYellow(key, canvas, context);
            drawIconBack(key, canvas, context);
        } else if (key.codes[0] == 107) {
            setColorButtonYellow(key, canvas, context);
            drawIconNext(key, canvas, context);
        } else {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint, context);
        }
    }

    public static void setBackGroundQwertyNumberTwo(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 5020) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint, context);
        } else if (key.codes[0] == 97) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhiteIconTwo(key, canvas, paint, context);
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
            setColorTextWhite(key, canvas, paint,context);
        } else if (key.codes[0] == -5) {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint, context);
            drawIconDelete(key, canvas, context);
        } else {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint, context);
        }
    }

    public static void setBackGroundQwertyNumberThree(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 5030) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhiteIcon(key, canvas, paint, context);
        } else if (key.codes[0] == 97) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhiteIconTwo(key, canvas, paint, context);
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
            setColorTextWhite(key, canvas, paint,context);
        } else if (key.codes[0] == -5) {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint, context);
            drawIconDelete(key, canvas, context);
        } else {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint, context);
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

    private static void setColorTextWhite(Keyboard.Key key, Canvas canvas, Paint paint,Context context) {
        int textSize = context.getResources().getDimensionPixelSize(R.dimen.text_size_keyboard);
        paint.setTypeface(Typeface.create("Ilisarniq", Typeface.BOLD));
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(textSize);
        paint.setColor(Color.WHITE);
        if (key.label != null) {
            canvas.drawText(key.label.toString(), key.x + (key.width / 2), (float)((key.y + (key.height / 2)) +30), paint);
        }

    }

    private static void setColorTextWhiteIcon(Keyboard.Key key, Canvas canvas, Paint paint,Context context) {
        int textSize = context.getResources().getDimensionPixelSize(R.dimen.text_size_icon_keyboard);
        paint.setTypeface(Typeface.create("Ilisarniq", Typeface.BOLD));
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(textSize);
        paint.setColor(Color.WHITE);
        if (key.label != null) {
            canvas.drawText(key.label.toString(),  (key.x + (key.width / 2)), (float)((key.y + (key.height / 2)) * 1.2941176471), paint);
        }
    }

    private static void setColorTextWhiteIconTwo(Keyboard.Key key, Canvas canvas, Paint paint,Context context) {
        int textSize = context.getResources().getDimensionPixelSize(R.dimen.text_size_icon_keyboard);
        paint.setTypeface(Typeface.create("Ilisarniq", Typeface.BOLD));
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(textSize);
        paint.setColor(Color.WHITE);
        if (key.label != null) {
            canvas.drawText(key.label.toString(),  (key.x + (key.width / 2)), (float)((key.y + (key.height / 2)) * 1.0975609756), paint);
        }
    }

    private static void setColorTextWhiteIconTwoDot(Keyboard.Key key, Canvas canvas, Paint paint,Context context) {
        int textSize = context.getResources().getDimensionPixelSize(R.dimen.text_size_icon_keyboard);
        paint.setTypeface(Typeface.create("Ilisarniq", Typeface.BOLD));
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(textSize);
        paint.setColor(Color.WHITE);
        if (key.label != null) {
            canvas.drawText(key.label.toString(),  (key.x + (key.width / 2)), (float)((key.y + (key.height / 2)) * 1.3), paint);
        }
    }

    private static void setColorTextBlack(Keyboard.Key key, Canvas canvas, Paint paint,Context context) {
        int textSize = context.getResources().getDimensionPixelSize(R.dimen.text_size_keyboard);
        paint.setTypeface(Typeface.create("Ilisarniq", Typeface.BOLD));
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(textSize);
        paint.setColor(Color.BLACK);
        if (key.label != null) {
            canvas.drawText(key.label.toString(), key.x + (key.width / 2), (float)((key.y + (key.height / 2)) +30), paint);
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
        float left = (float) (key.x + 40);
        float top = (float) ((key.y) * (1.1642335766));
        float right = (float) ((key.x + key.width)* (0.75));
        float bottom = (float) ((key.y + (key.height / 2)) * (1.0730994152));
//        float top = (float) (key.y + 45);
//        float right = (float) (key.x + key.width) - 30;
//        float bottom = (float) (key.y + (key.height / 2) + 25);
        dr.setBounds((int) left, (int) top, (int) right, (int) bottom);
        dr.draw(canvas);
    }

    private static void drawIconDropRightFinal(Keyboard.Key key, Canvas canvas, Context context) {
        Drawable dr = (Drawable) context.getResources().getDrawable(R.drawable.right_triangle);
        float left = (float) (key.x * 1.041666667);
        float top = (float) ((key.y) + (45));
        float right = (float) ((key.x + key.width)* (0.9722222222));
        float bottom = (float) ((key.y + (key.height / 2)) * (1.3676470588));
//        float top = (float) (key.y + 45);
//        float right = (float) (key.x + key.width) - 30;
//        float bottom = (float) (key.y + (key.height / 2) + 25);
        dr.setBounds((int) left, (int) top, (int) right, (int) bottom);
        dr.draw(canvas);
    }

    private static void drawIconDropLeft(Keyboard.Key key, Canvas canvas, Context context) {
        Drawable dr = context.getResources().getDrawable(R.drawable.left_triangle);
        float left = (float) (key.x + 30);
        float top = (float) (key.y * (1.0851581509));
        float right = (float) ((key.x + key.width) * (0.7166666667));
        float bottom = (float) ((key.y + (key.height / 2)) * (1.0626304802));
//        float top = (float) (key.y + 35);
//        float right = (float) (key.x + key.width) - 34;
//        float bottom = (float) (key.y + (key.height / 2) + 30);
        dr.setBounds((int) left, (int) top, (int) right, (int) bottom);
        dr.draw(canvas);
    }

    private static void drawIconDropLeftFinal(Keyboard.Key key, Canvas canvas, Context context) {
        Drawable dr = context.getResources().getDrawable(R.drawable.left_triangle);
        float left = (float) (key.x * 1.03125);
        float top = (float) (key.y + 35);
        float right = (float) ((key.x + key.width) * (0.9685185185));
        float bottom = (float) ((key.y + (key.height / 2)) * (1.4411764706));
        dr.setBounds((int) left, (int) top, (int) right, (int) bottom);
        dr.draw(canvas);
    }

    private static void drawIconBack(Keyboard.Key key, Canvas canvas, Context context) {
        Drawable dr = (Drawable) context.getResources().getDrawable(R.drawable.ic_left);
        float left = (float) (key.x * (1.0138888889));
        float top = (float) (key.y * (1.2189781022));
        float right = (float) ((key.x + key.width) *  (0.9880952381));
        float bottom = (float) ((key.y + (key.height / 2)) * (1.1951219512));
//        float left = (float) (key.x) + 10;
//        float top = (float) (key.y) + 30;
//        float right = (float) (key.x + key.width) - 10;
//        float bottom = (float) (key.y + (key.height / 2) + 40);
        dr.setBounds((int) left, (int) top, (int) right, (int) bottom);
        dr.draw(canvas);
    }

    private static void drawIconNext(Keyboard.Key key, Canvas canvas, Context context) {
        Drawable dr = (Drawable) context.getResources().getDrawable(R.drawable.ic_right);
        float left = (float) (key.x * (1.0119047619));
        float top = (float) (key.y * (1.2189781022));
        float right = (float) ((key.x + key.width) * (0.9895833333));
        float bottom = (float) ((key.y + (key.height / 2)) * (1.1951219512));
//        float left = (float) (key.x) + 10;
//        float top = (float) (key.y) + 30;
//        float right = (float) (key.x + key.width) - 10;
//        float bottom = (float) (key.y + (key.height / 2) + 40);
        dr.setBounds((int) left, (int) top, (int) right, (int) bottom);
        dr.draw(canvas);
    }

    public static void showPopupLongClick(PopupWindow popupWindow, Context context, Key key, TextView tvOne, TextView tvTwo, TextView tvThree) {
        // keyboard 1
        if (key.text.equals("ᐁ") || key.text.equals("ᐯ") || key.text.equals("ᑌ") ||
                key.text.equals("ᑫ") || key.text.equals("ᒉ") || key.text.equals("ᒣ") ||
                key.text.equals("ᓀ") || key.text.equals("ᓭ") || key.text.equals("ᓓ") ||
                key.text.equals("ᔦ") || key.text.equals("ᕓ") || key.text.equals("ᕂ") ||
                key.text.equals("ᙯ") || key.text.equals("ᙰ") || key.text.equals("ᖖ") ||
                key.text.equals("ᑉ") || key.text.equals("ᑦ") ||
                key.text.equals("ᒃ") || key.text.equals("ᒡ") || key.text.equals("ᒻ") ||
                key.text.equals("ᓐ") || key.text.equals("ᕻ") || key.text.equals("ᔅ") ||
                key.text.equals("ᓪ") || key.text.equals("ᔾ") || key.text.equals("ᕝ") ||
                key.text.equals("ᕐ") || key.text.equals("ᖅ") || key.text.equals("ᖕ") ||
                key.text.equals("ᖦ")) {
            tvThree.setText(key.text);
            visibleTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowBlack(popupWindow, context);
        } else if (key.text.equals(".") || key.text.equals(",") || key.text.equals("?") ||
                key.text.equals("!") || key.text.equals(";") || key.text.equals(":")) {
            tvThree.setText(key.text);
            tvThree.setTextColor(Color.BLACK);
            visibleTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowWhite(popupWindow, context);
            // keyboard emoji

        } else if (key.text.equals("\uD83C\uDF1A") || key.text.equals("\uD83C\uDF1D") || key.text.equals("\uD83C\uDF1E") ||
                key.text.equals("\uD83C\uDF1F") || key.text.equals("\uD83C\uDF25") || key.text.equals("\uD83C\uDF27") ||
                key.text.equals("\uD83C\uDF28") || key.text.equals("\uD83C\uDF2C") || key.text.equals("\uD83C\uDF89") ||
                key.text.equals("\uD83C\uDF7D") || key.text.equals("\uD83D\uDC15") || key.text.equals("\uD83D\uDC4B") ||
                key.text.equals("\uD83D\uDC4D") || key.text.equals("\uD83E\uDDE1") || key.text.equals("\uD83D\uDE42") ||
                key.text.equals("\uD83D\uDE41") || key.text.equals("\uD83D\uDE22") || key.text.equals("\uD83D\uDE0D") ||
                key.text.equals("\uD83D\uDE18") || key.text.equals("\uD83E\uDD23")) {
            tvThree.setText(key.text);
            visibleTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowWhite(popupWindow, context);
        }
        // keyboard 2 blue
        else if (key.text.equals("ᐃ") || key.text.equals("ᐄ")) {
            tvOne.setText("ᐃ");
            tvTwo.setText("ᐄ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowBlue(popupWindow, context);
        } else if (key.text.equals("ᐱ") || key.text.equals("ᐲ")) {
            tvOne.setText("ᐱ");
            tvTwo.setText("ᐲ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowBlue(popupWindow, context);
        } else if (key.text.equals("ᑎ") || key.text.equals("ᑏ")) {
            tvOne.setText("ᑎ");
            tvTwo.setText("ᑏ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowBlue(popupWindow, context);
        } else if (key.text.equals("ᑭ") || key.text.equals("ᑮ")) {
            tvOne.setText("ᑭ");
            tvTwo.setText("ᑮ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowBlue(popupWindow, context);
        } else if (key.text.equals("ᒋ") || key.text.equals("ᒌ")) {
            tvOne.setText("ᒋ");
            tvTwo.setText("ᒌ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowBlue(popupWindow, context);
        } else if (key.text.equals("ᒥ") || key.text.equals("ᒦ")) {
            tvOne.setText("ᒥ");
            tvTwo.setText("ᒦ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowBlue(popupWindow, context);
        } else if (key.text.equals("ᓂ") || key.text.equals("ᓃ")) {
            tvOne.setText("ᓂ");
            tvTwo.setText("ᓃ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowBlue(popupWindow, context);
        } else if (key.text.equals("ᓯ") || key.text.equals("ᓰ")) {
            tvOne.setText("ᓯ");
            tvTwo.setText("ᓰ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowBlue(popupWindow, context);
        } else if (key.text.equals("ᓕ") || key.text.equals("ᓖ")) {
            tvOne.setText("ᓕ");
            tvTwo.setText("ᒌ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowBlue(popupWindow, context);
        } else if (key.text.equals("ᔨ") || key.text.equals("ᔩ")) {
            tvOne.setText("ᔨ");
            tvTwo.setText("ᔩ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowBlue(popupWindow, context);
        } else if (key.text.equals("ᕕ") || key.text.equals("ᕖ")) {
            tvOne.setText("ᕕ");
            tvTwo.setText("ᕖ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowBlue(popupWindow, context);
        } else if (key.text.equals("ᕆ") || key.text.equals("ᕇ")) {
            tvOne.setText("ᕆ");
            tvTwo.setText("ᕇ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowBlue(popupWindow, context);
        } else if (key.text.equals("ᕿ") || key.text.equals("ᖀ")) {
            tvOne.setText("ᕿ");
            tvTwo.setText("ᖀ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowBlue(popupWindow, context);
        } else if (key.text.equals("ᖏ")) {
            tvOne.setText("ᖏ");
            tvTwo.setText("");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowBlue(popupWindow, context);
            //key board 3 orange
        } else if (key.text.equals("ᐅ") || key.text.equals("ᐆ")) {
            tvOne.setText("ᐅ");
            tvTwo.setText("ᐆ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowOrange(popupWindow, context);
        } else if (key.text.equals("ᐳ") || key.text.equals("ᐴ")) {
            tvOne.setText("ᐳ");
            tvTwo.setText("ᐴ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowOrange(popupWindow, context);
        } else if (key.text.equals("ᑐ") || key.text.equals("ᑑ")) {
            tvOne.setText("ᑐ");
            tvTwo.setText("ᑑ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowOrange(popupWindow, context);
        } else if (key.text.equals("ᑯ") || key.text.equals("ᑰ")) {
            tvOne.setText("ᑯ");
            tvTwo.setText("ᑰ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowOrange(popupWindow, context);
        } else if (key.text.equals("ᒍ") || key.text.equals("ᒎ")) {
            tvOne.setText("ᒍ");
            tvTwo.setText("ᒎ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowOrange(popupWindow, context);
        } else if (key.text.equals("ᒧ") || key.text.equals("ᒨ")) {
            tvOne.setText("ᒧ");
            tvTwo.setText("ᒨ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowOrange(popupWindow, context);
        } else if (key.text.equals("ᓄ") || key.text.equals("ᓅ")) {
            tvOne.setText("ᓄ");
            tvTwo.setText("ᓅ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowOrange(popupWindow, context);
        } else if (key.text.equals("ᓱ") || key.text.equals("ᓲ")) {
            tvOne.setText("ᓱ");
            tvTwo.setText("ᓲ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowOrange(popupWindow, context);
        } else if (key.text.equals("ᓗ") || key.text.equals("ᓘ")) {
            tvOne.setText("ᓗ");
            tvTwo.setText("ᓘ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowOrange(popupWindow, context);
        } else if (key.text.equals("ᔪ") || key.text.equals("ᔫ")) {
            tvOne.setText("ᔪ");
            tvTwo.setText("ᔫ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowOrange(popupWindow, context);
        } else if (key.text.equals("ᕗ") || key.text.equals("ᕘ")) {
            tvOne.setText("ᕗ");
            tvTwo.setText("ᕘ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowOrange(popupWindow, context);
        } else if (key.text.equals("ᕈ") || key.text.equals("ᕉ")) {
            tvOne.setText("ᕈ");
            tvTwo.setText("ᕉ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowOrange(popupWindow, context);
        } else if (key.text.equals("ᖁ") || key.text.equals("ᖂ")) {
            tvOne.setText("ᖁ");
            tvTwo.setText("ᖂ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowOrange(popupWindow, context);
        } else if (key.text.equals("ᖑ") || key.text.equals("ᖒ")) {
            tvOne.setText("ᖑ");
            tvTwo.setText("ᖒ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowOrange(popupWindow, context);
        }
        // key board 4 green
        else if (key.text.equals("ᐊ") || key.text.equals("ᐋ")) {
            tvOne.setText("ᐊ");
            tvTwo.setText("ᐋ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowGreen(popupWindow, context);

        } else if (key.text.equals("ᑕ") || key.text.equals("ᑖ")) {
            tvOne.setText("ᑕ");
            tvTwo.setText("ᑖ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowGreen(popupWindow, context);
        } else if (key.text.equals("ᐸ") || key.text.equals("ᐹ")) {
            tvOne.setText("ᐸ");
            tvTwo.setText("ᐹ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowGreen(popupWindow, context);
        } else if (key.text.equals("ᑲ") || key.text.equals("ᑳ")) {
            tvOne.setText("ᑲ");
            tvTwo.setText("ᑳ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowGreen(popupWindow, context);
        } else if (key.text.equals("ᒐ") || key.text.equals("ᒑ")) {
            tvOne.setText("ᒐ");
            tvTwo.setText("ᒑ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowGreen(popupWindow, context);
        } else if (key.text.equals("ᒪ") || key.text.equals("ᒫ")) {
            tvOne.setText("ᒪ");
            tvTwo.setText("ᒫ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowGreen(popupWindow, context);
        } else if (key.text.equals("ᓇ") || key.text.equals("ᓈ")) {
            tvOne.setText("ᓇ");
            tvTwo.setText("ᓈ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowGreen(popupWindow, context);
        } else if (key.text.equals("ᓴ") || key.text.equals("ᓵ")) {
            tvOne.setText("ᓴ");
            tvTwo.setText("ᓵ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowGreen(popupWindow, context);
        } else if (key.text.equals("ᓚ") || key.text.equals("ᓛ")) {
            tvOne.setText("ᓚ");
            tvTwo.setText("ᓛ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowGreen(popupWindow, context);
        } else if (key.text.equals("ᔭ") || key.text.equals("ᔮ")) {
            tvOne.setText("ᔭ");
            tvTwo.setText("ᔮ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowGreen(popupWindow, context);
        } else if (key.text.equals("ᕙ") || key.text.equals("ᕚ")) {
            tvOne.setText("ᕙ");
            tvTwo.setText("ᕚ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowGreen(popupWindow, context);
        } else if (key.text.equals("ᕋ") || key.text.equals("ᕌ")) {
            tvOne.setText("ᕋ");
            tvTwo.setText("ᕌ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowGreen(popupWindow, context);
        } else if (key.text.equals("ᖃ") || key.text.equals("ᖄ")) {
            tvOne.setText("ᖃ");
            tvTwo.setText("ᖄ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowGreen(popupWindow, context);
        } else if (key.text.equals("ᖓ") || key.text.equals("ᖔ")) {
            tvOne.setText("ᖓ");
            tvTwo.setText("ᖔ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowGreen(popupWindow, context);
        } else if (key.text.equals("ᖠ") || key.text.equals("ᖡ")) {
            tvOne.setText("ᖠ");
            tvTwo.setText("ᖡ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowGreen(popupWindow, context);
        } else if (key.text.equals("ᖢ") || key.text.equals("ᖣ")) {
            tvOne.setText("ᖢ");
            tvTwo.setText("ᖣ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowGreen(popupWindow, context);
        } else if (key.text.equals("ᖤ") || key.text.equals("ᖥ")) {
            tvOne.setText("ᖤ");
            tvTwo.setText("ᖥ");
            goneTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowGreen(popupWindow, context);
        }
        // keyboard 5 yellow
        else if (key.text.equals("0") || key.text.equals("1") || key.text.equals("2") || key.text.equals("3")
                || key.text.equals("4") || key.text.equals("5") || key.text.equals("6") || key.text.equals("7")
                || key.text.equals("8") || key.text.equals("9") || key.text.equals("+") || key.text.equals("-")
                || key.text.equals("*") || key.text.equals("/") || key.text.equals("=") || key.text.equals("%")
                || key.text.equals("|") || key.text.equals("≠") || key.text.equals("≈") || key.text.equals("≤")
                || key.text.equals("≥") || key.text.equals("<") || key.text.equals(">") || key.text.equals("°")
                || key.text.equals("_") || key.text.equals("^") || key.text.equals("\\") || key.text.equals("√")
                || key.text.equals("π") || key.text.equals("@") || key.text.equals("[") || key.text.equals("]")
                || key.text.equals("(") || key.text.equals(")") || key.text.equals("«") || key.text.equals("»")
                || key.text.equals("&") || key.text.equals("{") || key.text.equals("}") || key.text.equals("#")
                || key.text.equals("cm") || key.text.equals("km") || key.text.equals("'") || key.text.equals("\"")
                || key.text.equals("m") || key.text.equals("g") || key.text.equals("x") || key.text.equals("y")
                || key.text.equals("z") || key.text.equals("•") || key.text.equals("$") || key.text.equals("¢")) {
            tvThree.setText(key.text);
            visibleTextViewThree(tvOne, tvTwo, tvThree);
            setBackGroundPopupWindowYellow(popupWindow, context);
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
        if (popupWindow.isShowing()) {
            popupWindow.dismiss();
        }
        popupWindow.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.background_popup_blue));
    }

    public static void setBackGroundPopupClickWindowBlue(PopupWindow popupWindow, Context context) {
        if (popupWindow.isShowing()) {
            popupWindow.dismiss();
        }
        popupWindow.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.background_popup_click_blue));
    }

    public static void setBackGroundPopupWindowBlack(PopupWindow popupWindow, Context context) {
        if (popupWindow.isShowing()) {
            popupWindow.dismiss();
        }
        popupWindow.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.background_popup_black));
    }

    public static void setBackGroundPopupClickWindowBlack(PopupWindow popupWindow, Context context) {
        if (popupWindow.isShowing()) {
            popupWindow.dismiss();
        }
        popupWindow.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.background_popup_click_black));
    }

    public static void setBackGroundPopupWindowYellow(PopupWindow popupWindow, Context context) {
        if (popupWindow.isShowing()) {
            popupWindow.dismiss();
        }
        popupWindow.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.background_popup_yellow));
    }

    public static void setBackGroundPopupClickWindowYellow(PopupWindow popupWindow, Context context) {
        if (popupWindow.isShowing()) {
            popupWindow.dismiss();
        }
        popupWindow.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.background_popup_click_yellow));
    }

    public static void setBackGroundPopupWindowGreen(PopupWindow popupWindow, Context context) {
        if (popupWindow.isShowing()) {
            popupWindow.dismiss();
        }
        popupWindow.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.background_popup_green));
    }

    public static void setBackGroundPopupClickWindowGreen(PopupWindow popupWindow, Context context) {
        if (popupWindow.isShowing()) {
            popupWindow.dismiss();
        }
        popupWindow.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.background_popup_click_green));
    }

    public static void setBackGroundPopupWindowOrange(PopupWindow popupWindow, Context context) {
        if (popupWindow.isShowing()) {
            popupWindow.dismiss();
        }
        popupWindow.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.background_popup_orange));
    }

    public static void setBackGroundPopupClickWindowOrange(PopupWindow popupWindow, Context context) {
        if (popupWindow.isShowing()) {
            popupWindow.dismiss();
        }
        popupWindow.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.background_popup_click_orange));
    }

    public static void setBackGroundPopupWindowWhite(PopupWindow popupWindow, Context context) {
        if (popupWindow.isShowing()) {
            popupWindow.dismiss();
        }
        popupWindow.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.background_popup_white));
    }

    public static void setBackGroundPopupClickWindowWhite(PopupWindow popupWindow, Context context) {
        if (popupWindow.isShowing()) {
            popupWindow.dismiss();
        }
        popupWindow.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.background_popup_click_white));
    }

    public static void showPopupClickDefault( View mInputView, PopupWindow popupWindow, Context context, Key key, TextView tvClick) {
            if (key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                    || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                    || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                    || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107) {
                tvClick.setText(key.text);
                tvClick.setTextColor(Color.WHITE);
                setBackGroundPopupClickWindowBlack(popupWindow, context);
                int width = context.getResources().getDimensionPixelSize(R.dimen.popup_click_width);
                int x = context.getResources().getDimensionPixelSize(R.dimen.popup_x);
                popupWindow.setWidth(width);
                popupWindow.setHeight(width);
                popupWindow.showAtLocation(mInputView, Gravity.NO_GRAVITY, (int) ((key.x)-x), (int) (key.y + (key.height / 2)*0.18));
            } else if (key.codes[0] == 122 || key.codes[0] == 120 || key.codes[0] == 99 ||
                    key.codes[0] == 118 || key.codes[0] == 98 || key.codes[0] == 110) {
                tvClick.setText(key.text);
                tvClick.setTextColor(Color.BLACK);
                setBackGroundPopupClickWindowWhite(popupWindow, context);
                int width = context.getResources().getDimensionPixelSize(R.dimen.popup_click_width);
                int x = context.getResources().getDimensionPixelSize(R.dimen.popup_x);
                popupWindow.setWidth(width);
                popupWindow.setHeight(width);
                popupWindow.showAtLocation(mInputView, Gravity.NO_GRAVITY, (int) ((key.x)-x), (int) (key.y + (key.height / 2)*0.18));
            }
    }

    public static void showPopupClickEmoji(View mInputView, PopupWindow popupWindow, Context context, Key key, TextView tvClick) {
        if (key.codes[0] != 1000 && key.codes[0] != 97 && key.codes[0] != -1
                && key.codes[0] != -5 && key.codes[0] != -3 && key.codes[0] != -2 && key.codes[0] != 32
                && key.codes[0] != 10 && key.codes[0] != -16 && key.codes[0] != -15) {
            tvClick.setText(key.text);
            tvClick.setTextColor(Color.BLACK);
            setBackGroundPopupClickWindowWhite(popupWindow, context);
            int width = context.getResources().getDimensionPixelSize(R.dimen.popup_click_width);
            int x = context.getResources().getDimensionPixelSize(R.dimen.popup_x);
            popupWindow.setWidth(width);
            popupWindow.setHeight(width);
            popupWindow.showAtLocation(mInputView, Gravity.NO_GRAVITY, (int) ((key.x)-x), (int) (key.y + (key.height / 2)*0.18));
        }
    }

    public static void showPopupClickTwoDot(View mInputView, PopupWindow popupWindow, Context context, Key key, TextView tvClick) {
        if (key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107
                || key.codes[0] == -18 || key.codes[0] == -19) {
            tvClick.setText(key.text);
            tvClick.setTextColor(Color.WHITE);
            setBackGroundPopupClickWindowBlack(popupWindow, context);
            int width = context.getResources().getDimensionPixelSize(R.dimen.popup_click_width);
            int x = context.getResources().getDimensionPixelSize(R.dimen.popup_x);
            popupWindow.setWidth(width);
            popupWindow.setHeight(width);
            popupWindow.showAtLocation(mInputView, Gravity.NO_GRAVITY, (int) ((key.x)-x), (int) (key.y + (key.height / 2)*0.18));

        } else if (key.codes[0] == 122 || key.codes[0] == 120 || key.codes[0] == 99 ||
                key.codes[0] == 118 || key.codes[0] == 98 || key.codes[0] == 110) {
            tvClick.setText(key.text);
            tvClick.setTextColor(Color.BLACK);
            setBackGroundPopupClickWindowWhite(popupWindow, context);
            int width = context.getResources().getDimensionPixelSize(R.dimen.popup_click_width);
            int x = context.getResources().getDimensionPixelSize(R.dimen.popup_x);
            popupWindow.setWidth(width);
            popupWindow.setHeight(width);
            popupWindow.showAtLocation(mInputView, Gravity.NO_GRAVITY, (int) ((key.x)-x), (int) (key.y + (key.height / 2)*0.18));

        }
    }

    public static void showPopupClickTwoQwerty( View mInputView, PopupWindow popupWindow, Context context, Key key, TextView tvClick) {
        if (key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107) {
            tvClick.setText(key.text);
            tvClick.setTextColor(Color.WHITE);
            setBackGroundPopupClickWindowBlue(popupWindow, context);
            int width = context.getResources().getDimensionPixelSize(R.dimen.popup_click_width);
            int x = context.getResources().getDimensionPixelSize(R.dimen.popup_x);
            popupWindow.setWidth(width);
            popupWindow.setHeight(width);
            popupWindow.showAtLocation(mInputView, Gravity.NO_GRAVITY, (int) ((key.x)-x), (int) (key.y + (key.height / 2)*0.18));

        } else if (key.codes[0] == 122 || key.codes[0] == 120 || key.codes[0] == 99 ||
                key.codes[0] == 118 || key.codes[0] == 98 || key.codes[0] == 110) {
            tvClick.setText(key.text);
            tvClick.setTextColor(Color.BLACK);
            setBackGroundPopupClickWindowWhite(popupWindow, context);
            int width = context.getResources().getDimensionPixelSize(R.dimen.popup_click_width);
            int x = context.getResources().getDimensionPixelSize(R.dimen.popup_x);
            popupWindow.setWidth(width);
            popupWindow.setHeight(width);
            popupWindow.showAtLocation(mInputView, Gravity.NO_GRAVITY, (int) ((key.x)-x), (int) (key.y + (key.height / 2)*0.18));

        }
    }

    public static void showPopupClickTwoSelectOneDot(View mInputView, PopupWindow popupWindow, Context context, Key key, TextView tvClick) {
        if (key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107) {
            tvClick.setText(key.text);
            tvClick.setTextColor(Color.WHITE);
            setBackGroundPopupClickWindowBlue(popupWindow, context);
            int width = context.getResources().getDimensionPixelSize(R.dimen.popup_click_width);
            int x = context.getResources().getDimensionPixelSize(R.dimen.popup_x);
            popupWindow.setWidth(width);
            popupWindow.setHeight(width);
            popupWindow.showAtLocation(mInputView, Gravity.NO_GRAVITY, (int) ((key.x)-x), (int) (key.y + (key.height / 2)*0.18));


        } else if (key.codes[0] == 122 || key.codes[0] == 120 || key.codes[0] == 99 ||
                key.codes[0] == 118 || key.codes[0] == 98 || key.codes[0] == 110) {
            tvClick.setText(key.text);
            tvClick.setTextColor(Color.BLACK);
            popupWindow.setWidth(160);
            popupWindow.setWidth(160);
            setBackGroundPopupClickWindowWhite(popupWindow, context);
            int width = context.getResources().getDimensionPixelSize(R.dimen.popup_click_width);
            int x = context.getResources().getDimensionPixelSize(R.dimen.popup_x);
            popupWindow.setWidth(width);
            popupWindow.setHeight(width);
            popupWindow.showAtLocation(mInputView, Gravity.NO_GRAVITY, (int) ((key.x)-x), (int) (key.y + (key.height / 2)*0.18));
        }
    }

    public static void showPopupClickThreeQwerty( View mInputView, PopupWindow popupWindow, Context context, Key key, TextView tvClick) {
        if (key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107) {
            tvClick.setText(key.text);
            tvClick.setTextColor(Color.WHITE);
            setBackGroundPopupClickWindowOrange(popupWindow, context);
            int width = context.getResources().getDimensionPixelSize(R.dimen.popup_click_width);
            int x = context.getResources().getDimensionPixelSize(R.dimen.popup_x);
            popupWindow.setWidth(width);
            popupWindow.setHeight(width);
            popupWindow.showAtLocation(mInputView, Gravity.NO_GRAVITY, (int) ((key.x)-x), (int) (key.y + (key.height / 2)*0.18));
        } else if (key.codes[0] == 122 || key.codes[0] == 120 || key.codes[0] == 99 ||
                key.codes[0] == 118 || key.codes[0] == 98 || key.codes[0] == 110) {
            tvClick.setText(key.text);
            tvClick.setTextColor(Color.BLACK);
            setBackGroundPopupClickWindowWhite(popupWindow, context);
            int width = context.getResources().getDimensionPixelSize(R.dimen.popup_click_width);
            int x = context.getResources().getDimensionPixelSize(R.dimen.popup_x);
            popupWindow.setWidth(width);
            popupWindow.setHeight(width);
            popupWindow.showAtLocation(mInputView, Gravity.NO_GRAVITY, (int) ((key.x)-x), (int) (key.y + (key.height / 2)*0.18));

        }
    }

    public static void showPopupClickThreeSelectOneDot(View mInputView, PopupWindow popupWindow, Context context, Key key, TextView tvClick) {
        if (key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107) {
            tvClick.setText(key.text);
            tvClick.setTextColor(Color.WHITE);
            setBackGroundPopupClickWindowOrange(popupWindow, context);
            int width = context.getResources().getDimensionPixelSize(R.dimen.popup_click_width);
            int x = context.getResources().getDimensionPixelSize(R.dimen.popup_x);
            popupWindow.setWidth(width);
            popupWindow.setHeight(width);
            popupWindow.showAtLocation(mInputView, Gravity.NO_GRAVITY, (int) ((key.x)-x), (int) (key.y + (key.height / 2)*0.18));

        } else if (key.codes[0] == 122 || key.codes[0] == 120 || key.codes[0] == 99 ||
                key.codes[0] == 118 || key.codes[0] == 98 || key.codes[0] == 110) {
            tvClick.setText(key.text);
            tvClick.setTextColor(Color.BLACK);
            setBackGroundPopupClickWindowWhite(popupWindow, context);
            int width = context.getResources().getDimensionPixelSize(R.dimen.popup_click_width);
            int x = context.getResources().getDimensionPixelSize(R.dimen.popup_x);
            popupWindow.setWidth(width);
            popupWindow.setHeight(width);
            popupWindow.showAtLocation(mInputView, Gravity.NO_GRAVITY, (int) ((key.x)-x), (int) (key.y + (key.height / 2)*0.18));

        }
    }

    public static void showPopupClickFourQwerty(View mInputView, PopupWindow popupWindow, Context context, Key key, TextView tvClick) {
        if (key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107
                || key.codes[0] == -18 || key.codes[0] == -19 || key.codes[0] == 118 || key.codes[0] == 98
                || key.codes[0] == 110) {
            tvClick.setText(key.text);
            tvClick.setTextColor(Color.WHITE);
            setBackGroundPopupClickWindowGreen(popupWindow, context);
            int width = context.getResources().getDimensionPixelSize(R.dimen.popup_click_width);
            int x = context.getResources().getDimensionPixelSize(R.dimen.popup_x);
            popupWindow.setWidth(width);
            popupWindow.setHeight(width);
            popupWindow.showAtLocation(mInputView, Gravity.NO_GRAVITY, (int) ((key.x)-x), (int) (key.y + (key.height / 2)*0.18));

        } else if (key.codes[0] == 122 || key.codes[0] == 120 || key.codes[0] == 99) {
            tvClick.setText(key.text);
            tvClick.setTextColor(Color.BLACK);
            setBackGroundPopupClickWindowWhite(popupWindow, context);
            int width = context.getResources().getDimensionPixelSize(R.dimen.popup_click_width);
            int x = context.getResources().getDimensionPixelSize(R.dimen.popup_x);
            popupWindow.setWidth(width);
            popupWindow.setHeight(width);
            popupWindow.showAtLocation(mInputView, Gravity.NO_GRAVITY, (int) ((key.x)-x), (int) (key.y + (key.height / 2)*0.18));
        }
    }

    public static void showPopupClickFourSelectOneDot( View mInputView, PopupWindow popupWindow, Context context, Key key, TextView tvClick) {
        if (key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107
                || key.codes[0] == -18 || key.codes[0] == -19 || key.codes[0] == 118 || key.codes[0] == 98
                || key.codes[0] == 110) {
            tvClick.setText(key.text);
            tvClick.setTextColor(Color.WHITE);
            setBackGroundPopupClickWindowGreen(popupWindow, context);
            int width = context.getResources().getDimensionPixelSize(R.dimen.popup_click_width);
            int x = context.getResources().getDimensionPixelSize(R.dimen.popup_x);
            popupWindow.setWidth(width);
            popupWindow.setHeight(width);
            popupWindow.showAtLocation(mInputView, Gravity.NO_GRAVITY, (int) ((key.x)-x), (int) (key.y + (key.height / 2)*0.18));

        } else if (key.codes[0] == 122 || key.codes[0] == 120 || key.codes[0] == 99) {
            tvClick.setText(key.text);
            tvClick.setTextColor(Color.BLACK);
            setBackGroundPopupClickWindowWhite(popupWindow, context);
            int width = context.getResources().getDimensionPixelSize(R.dimen.popup_click_width);
            int x = context.getResources().getDimensionPixelSize(R.dimen.popup_x);
            popupWindow.setWidth(width);
            popupWindow.setHeight(width);
            popupWindow.showAtLocation(mInputView, Gravity.NO_GRAVITY, (int) ((key.x)-x), (int) (key.y + (key.height / 2)*0.18));
        }

    }

    public static void showPopupClickQwertyNumber( View mInputView, PopupWindow popupWindow, Context context, Key key, TextView tvClick) {
        if (key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104) {
            tvClick.setText(key.text);
            tvClick.setTextColor(Color.WHITE);
            setBackGroundPopupClickWindowYellow(popupWindow, context);
            int width = context.getResources().getDimensionPixelSize(R.dimen.popup_click_width);
            int x = context.getResources().getDimensionPixelSize(R.dimen.popup_x);
            popupWindow.setWidth(width);
            popupWindow.setHeight(width);
            popupWindow.showAtLocation(mInputView, Gravity.NO_GRAVITY, (int) ((key.x)-x), (int) (key.y + (key.height / 2)*0.18));

        } else if (key.codes[0] == 122 || key.codes[0] == 120 || key.codes[0] == 99 ||
                key.codes[0] == 118 || key.codes[0] == 98 || key.codes[0] == 110) {
            tvClick.setText(key.text);
            tvClick.setTextColor(Color.BLACK);
            setBackGroundPopupClickWindowWhite(popupWindow, context);
            int width = context.getResources().getDimensionPixelSize(R.dimen.popup_click_width);
            int x = context.getResources().getDimensionPixelSize(R.dimen.popup_x);
            popupWindow.setWidth(width);
            popupWindow.setHeight(width);
            popupWindow.showAtLocation(mInputView, Gravity.NO_GRAVITY, (int) ((key.x)-x), (int) (key.y + (key.height / 2)*0.18));

        }
    }

    public static void showPopupClickQwertyNumberTwo(View mInputView, PopupWindow popupWindow, Context context, Key key, TextView tvClick) {
        if (key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107 ||
                key.codes[0] == 122 || key.codes[0] == 120 || key.codes[0] == 99 ||
                key.codes[0] == 118 || key.codes[0] == 98 || key.codes[0] == 110) {
            tvClick.setText(key.text);
            tvClick.setTextColor(Color.WHITE);
            setBackGroundPopupClickWindowYellow(popupWindow, context);
            int width = context.getResources().getDimensionPixelSize(R.dimen.popup_click_width);
            int x = context.getResources().getDimensionPixelSize(R.dimen.popup_x);
            popupWindow.setWidth(width);
            popupWindow.setHeight(width);
            popupWindow.showAtLocation(mInputView, Gravity.NO_GRAVITY, (int) ((key.x)-x), (int) (key.y + (key.height / 2)*0.18));
        }
    }

    public static void showPopupClickQwertyNumberThree( View mInputView, PopupWindow popupWindow, Context context, Key key, TextView tvClick) {
        if (key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107 ||
                key.codes[0] == 122 || key.codes[0] == 120 || key.codes[0] == 99 ||
                key.codes[0] == 118 || key.codes[0] == 98 || key.codes[0] == 110) {
            tvClick.setText(key.text);
            tvClick.setTextColor(Color.WHITE);
            setBackGroundPopupClickWindowYellow(popupWindow, context);
            int width = context.getResources().getDimensionPixelSize(R.dimen.popup_click_width);
            int x = context.getResources().getDimensionPixelSize(R.dimen.popup_x);
            popupWindow.setWidth(width);
            popupWindow.setHeight(width);
            popupWindow.showAtLocation(mInputView, Gravity.NO_GRAVITY, (int) ((key.x)-x), (int) (key.y + (key.height / 2)*0.18));        }
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
