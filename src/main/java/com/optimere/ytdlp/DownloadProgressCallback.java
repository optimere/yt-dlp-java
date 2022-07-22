package com.optimere.ytdlp;

public interface DownloadProgressCallback {
  void onProgressUpdate(float progress, long etaInSeconds);
}
