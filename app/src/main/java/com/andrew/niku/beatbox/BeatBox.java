package com.andrew.niku.beatbox;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/**
 * Created by niku on 13.02.2017.
 */

public class BeatBox {

  private static final String TAG = "BeatBox";
  private static final String SOUNDS_FOLDER = "sample_sounds";

  private AssetManager mAssets;
  private List<Sound> mSounds = new ArrayList<>();

  public List<Sound> getSounds() {
    return mSounds;
  }

  public BeatBox(@NotNull Context context) {
    mAssets = context.getAssets();
    loadSounds();
  }

  private void loadSounds() {

    String[] soundNames;

    try {
      soundNames = mAssets.list(SOUNDS_FOLDER);
      Log.i(TAG, "Found " + soundNames.length + " sounds");
    } catch (IOException ioe) {
      Log.e(TAG, "Could not list assets", ioe);
      return;
    }

    for (String filename : soundNames) {
      String assetPath = SOUNDS_FOLDER + "/" + filename;
      Sound sound = new Sound(assetPath);
      mSounds.add(sound);
    }

    if (2==2) {
      int aNumber = 3;
    }

  }

}
