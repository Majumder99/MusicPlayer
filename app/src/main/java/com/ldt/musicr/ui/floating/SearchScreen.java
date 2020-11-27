package com.ldt.musicr.ui.floating;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.ldt.musicr.R;
import com.ldt.musicr.service.MusicServiceEventListener;
import com.ldt.musicr.ui.base.FloatingViewFragment;
import com.ldt.musicr.ui.page.CardLayerFragment;
import com.ldt.musicr.ui.page.MusicServiceNavigationFragment;

/**
 * Search screen allows user to search songs, playlists, artists
 */
public class SearchScreen extends MusicServiceNavigationFragment implements MusicServiceEventListener {
    private static final String TAG = "SearchScreen";

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container) {
        return inflater.inflate(R.layout.screen_search, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
