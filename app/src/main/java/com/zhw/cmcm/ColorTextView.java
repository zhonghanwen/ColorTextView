package com.zhw.cmcm;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatTextView;
import android.text.Html;
import android.text.TextUtils;
import android.util.AttributeSet;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class ColorTextView extends AppCompatTextView {

    private List<String> mColorTexts = new ArrayList<>();
    private List<String> mColors = new ArrayList<>();
    private int size;

    public ColorTextView(Context context) {
        super(context);
    }

    public ColorTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public ColorTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        TypedArray attrsArray = getContext().obtainStyledAttributes(attrs, R.styleable.ColorTextView, 0, 0);
        String colorTexts = attrsArray.getString(R.styleable.ColorTextView_color_texts);
        String colors = attrsArray.getString(R.styleable.ColorTextView_color_arrays);
        attrsArray.recycle();

        initData(colorTexts, colors);

        setHtmlText();
    }

    private void initData(String colorTexts, String colors) {
        try {
            if (!TextUtils.isEmpty(colorTexts)) {
                String[] texts = colorTexts.split("\\|");
                for (int i = 0; i < texts.length; i++) {
                    mColorTexts.add(texts[i]);
                }
            }

            if (!TextUtils.isEmpty(colors)) {
                String[] texts = colors.split("\\|");
                for (int i = 0; i < texts.length; i++) {
                    mColors.add(texts[i]);
                }
            }
            size = Math.min(mColors.size(), mColorTexts.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setHtmlText() {
        try {
            String text = getText().toString();
            if (!TextUtils.isEmpty(text)) {
                for (int i = 0; i < size; i++) {
                    text = text.replace(mColorTexts.get(i), color(mColors.get(i), mColorTexts.get(i)));
                }
            }
            if (!TextUtils.isEmpty(text)) {
                setText(Html.fromHtml(text));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public String color(String colorCode, String str) {
        return "<font color=\"" + colorCode + "\">" + str + "</font>";
    }


}
