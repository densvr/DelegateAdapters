package com.example.dumchev.delegateadapters.base;

import com.example.delegateadapter.delegate.diff.IComparableItem;
import com.example.dumchev.delegateadapters.R;
import com.example.dumchev.delegateadapters.base.model.CheckViewModel;
import com.example.dumchev.delegateadapters.base.model.ImageViewModel;
import com.example.dumchev.delegateadapters.base.model.TextViewModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author dumchev on 05.11.17.
 */
class MockDataFactory {

    private static final int SIZE = 20;

    static List<IComparableItem> prepareData() {
        ArrayList<IComparableItem> objects = new ArrayList<>(SIZE);
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            IComparableItem item;
            int type = random.nextInt(3);
            if (type == 0) {
                item = new TextViewModel("Title " + i, "Description " + i);
            } else if (type == 1) {
                item = new ImageViewModel("Title " + i, R.mipmap.ic_launcher_round);
            } else {
                item = new CheckViewModel("You still love this lib", true);
            }
            objects.add(item);
        }
        return objects;
    }
}
