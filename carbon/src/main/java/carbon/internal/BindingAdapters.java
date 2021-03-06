package carbon.internal;

import android.text.Html;

import androidx.databinding.BindingAdapter;
import carbon.widget.TextView;

public class BindingAdapters {
    private BindingAdapters() {
    }

    @BindingAdapter("carbon_htmlText")
    public static void setHtmlText(TextView textView, String html) {
        textView.setText(Html.fromHtml(html));
    }
}
