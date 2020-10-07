package com.example.mivokapp;

public class Word {
   private String mivok;
    private String eng;
    private final int hasImage=-1;
    private int img=hasImage;
    private int voice;
    public Word(String mivok, String eng,int voice) {
        this.mivok = mivok;
        this.eng = eng;
        this.voice=voice;

    }

    public Word(String mivok, String eng,int img,int voice) {
        this.mivok = mivok;
        this.eng = eng;
        this.img=img;
        this.voice=voice;
    }

    public String getMivok() {
        return mivok;
    }


    public String getDefaultTranslation() {
        return eng;
    }

    public int getImg() {
        return img;
    }
    public boolean hasImage(){
        if(img==-1)
            return false;
        else
            return true;
    }

    public int getVoice() {
        return voice;
    }
}
