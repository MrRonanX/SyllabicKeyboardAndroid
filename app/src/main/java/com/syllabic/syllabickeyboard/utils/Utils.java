package com.syllabic.syllabickeyboard.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.inputmethodservice.Keyboard;

import com.syllabic.syllabickeyboard.R;

import android.inputmethodservice.Keyboard.Key;

public class Utils {

    public static void setBackGroundDefault(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 113 || key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107
                || key.codes[0] == -10 || key.codes[0] == -11) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == 97) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -1) {
            setColorButtonOrange(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -3) {
            setColorButtonGreen(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -2) {
            setColorButtonYellow(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint);
        }
    }

    public static void setBackGroundEmoji(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 1000 || key.codes[0] == -15 || key.codes[0] == -16) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == 97) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -1) {
            setColorButtonOrange(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -3) {
            setColorButtonGreen(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -2) {
            setColorButtonYellow(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint);
        }
    }

    public static void setBackGroundSelectTwoDot(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 1050 || key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107
                || key.codes[0] == -18 || key.codes[0] == -19) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == 97) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -1) {
            setColorButtonOrange(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -3) {
            setColorButtonGreen(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -2) {
            setColorButtonYellow(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint);
        }
    }

    public static void setBackGroundTwoQwerty(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 2000) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == 97 || key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107
                || key.codes[0] == -20 || key.codes[0] == -21) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -1) {
            setColorButtonOrange(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -3) {
            setColorButtonGreen(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -2) {
            setColorButtonYellow(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint);
        }
    }

    public static void setBackGroundTwoSelectOneDot(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 2050) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == 97 || key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107
                || key.codes[0] == -25 || key.codes[0] == -26) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -1) {
            setColorButtonOrange(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -3) {
            setColorButtonGreen(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -2) {
            setColorButtonYellow(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint);
        }
    }

    public static void setBackGroundThreeQwerty(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 3000) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == 97) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -1 || key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107
                || key.codes[0] == -30 || key.codes[0] == -31) {
            setColorButtonOrange(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -3) {
            setColorButtonGreen(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -2) {
            setColorButtonYellow(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint);
        }
    }

    public static void setBackGroundThreeSelectOneDot(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 3050) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == 97) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -1 || key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107
                || key.codes[0] == -35 || key.codes[0] == -36) {
            setColorButtonOrange(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -3) {
            setColorButtonGreen(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -2) {
            setColorButtonYellow(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint);
        }
    }

    public static void setBackGroundFourQwerty(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 4000) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == 97) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -1) {
            setColorButtonOrange(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -3 || key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
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
        } else {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint);
        }
    }

    public static void setBackGroundFourSelectOneDot(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 4050) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == 97) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -1) {
            setColorButtonOrange(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -3 || key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107
                || key.codes[0] == 118 || key.codes[0] == 98 || key.codes[0] == 110
                || key.codes[0] == -45 || key.codes[0] == -46) {
            setColorButtonGreen(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -2) {
            setColorButtonYellow(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint);
        }
    }

    public static void setBackGroundQwertyNumber(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 5000) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == 97) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -1) {
            setColorButtonOrange(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -3) {
            setColorButtonGreen(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -2 || key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107
                || key.codes[0] == -50 || key.codes[0] == -51) {
            setColorButtonYellow(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint);
        }
    }

    public static void setBackGroundQwertyNumberTwo(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 5000) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == 97) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -1) {
            setColorButtonOrange(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -3) {
            setColorButtonGreen(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -2 || key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107
                || key.codes[0] == 122 || key.codes[0] == 120 || key.codes[0] == 99 || key.codes[0] == 118
                || key.codes[0] == 98 || key.codes[0] == 110 || key.codes[0] == -52 || key.codes[0] == -53) {
            setColorButtonYellow(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else {
            setColorButtonWhite(key, canvas, context);
            setColorTextBlack(key, canvas, paint);
        }
    }

    public static void setBackGroundQwertyNumberThree(Key key, Canvas canvas, Paint paint, Context context) {
        if (key.codes[0] == 5000) {
            setColorButtonBlack(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == 97) {
            setColorButtonBlue(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -1) {
            setColorButtonOrange(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -3) {
            setColorButtonGreen(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
        } else if (key.codes[0] == -2 || key.codes[0] == 119 || key.codes[0] == 101 || key.codes[0] == 114
                || key.codes[0] == 116 || key.codes[0] == 121 || key.codes[0] == 117 || key.codes[0] == 111
                || key.codes[0] == 105 || key.codes[0] == 115 || key.codes[0] == 100 || key.codes[0] == 102
                || key.codes[0] == 103 || key.codes[0] == 104 || key.codes[0] == 106 || key.codes[0] == 107
                || key.codes[0] == 122 || key.codes[0] == 120 || key.codes[0] == 99 || key.codes[0] == 118
                || key.codes[0] == 98 || key.codes[0] == 110 || key.codes[0] == -54 || key.codes[0] == -55) {
            setColorButtonYellow(key, canvas, context);
            setColorTextWhite(key, canvas, paint);
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
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(50);
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
}
