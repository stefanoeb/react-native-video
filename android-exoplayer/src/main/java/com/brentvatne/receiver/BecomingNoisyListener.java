package com.eightfit.receiver;

public interface BecomingNoisyListener {

    BecomingNoisyListener NO_OP = new BecomingNoisyListener() {
        @Override public void onAudioBecomingNoisy() {
            // NO_OP
        }
    };

    void onAudioBecomingNoisy();

}
