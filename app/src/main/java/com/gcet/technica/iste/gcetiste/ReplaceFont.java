package com.gcet.technica.iste.gcetiste;

import android.content.Context;
import android.graphics.Typeface;

import java.lang.reflect.Field;

/**
 * Created by shiva on 9/17/2015.
 */
public class ReplaceFont {
    public static void replaceDefaultFont(Context context,String nameOftheDefaultFont,String nameOftheFontInAsset){
        Typeface customFontTypeFace = Typeface.createFromAsset(context.getAssets(),nameOftheFontInAsset);
        replaceFont(nameOftheDefaultFont,customFontTypeFace);
    }

    private static void replaceFont(String nameOftheDefaultFont, Typeface customFontTypeFace) {
        try {
            Field myField = Typeface.class.getDeclaredField(nameOftheDefaultFont);
            myField.setAccessible(true);
            myField.set(null,customFontTypeFace);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
