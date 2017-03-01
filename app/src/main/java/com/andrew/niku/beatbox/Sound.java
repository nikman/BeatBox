package com.andrew.niku.beatbox;

/**
 * Created by niku on 13.02.2017.
 */

public class Sound {

  private String mAssetPath;
  private String mName;

  public Sound(String assetPath) {
    mAssetPath = assetPath;
    String[] components = assetPath.split("/");
    if (components.length > 0) {
      String fileName = components[components.length - 1];
      mName = fileName.replace(".wav", "");
    } else {
      mName = "N/A";
    }
  }

  public String getAssetPath() {
    return mAssetPath;
  }

  public String getName() {
    return mName;
  }
}
