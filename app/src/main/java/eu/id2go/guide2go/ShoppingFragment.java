package eu.id2go.guide2go;

import android.support.v4.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShoppingFragment extends AbstractWordFragment {

    public ShoppingFragment() {
        // Required empty public constructor
    }

    // Create a list of words
    protected void addWord() {
//        words.add(new Word("one", "lutti", R.drawable.number_one, R.raw.number_one));
//        words.add(new Word("two", "otiiko", R.drawable.number_two, R.raw.number_two));
//        words.add(new Word("three", "tolookosu", R.drawable.number_three, R.raw.number_three));
//        words.add(new Word("four", "oyyisa", R.drawable.number_four, R.raw.number_four));
//        words.add(new Word("five", "massokka", R.drawable.number_five, R.raw.number_five));
//        words.add(new Word("six", "temmokka", R.drawable.number_six, R.raw.number_six));
//        words.add(new Word("seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
//        words.add(new Word("eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
//        words.add(new Word("nine", "wo’e", R.drawable.number_nine, R.raw.number_nine));
//        words.add(new Word("ten", "na’aacha", R.drawable.number_ten, R.raw.number_ten));

    }

    @Override
    protected int getFragmentId() {
        return R.layout.word_list;
    }

    @Override
    protected int getBackgroundColor() {
        return R.color.category_phrases;
    }


}

