package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        Integer distanceUp = 0; //prev song
        Integer distanceDown = 0; //next song
        Integer min;
        for (int i = startIndex; i < this.playList.length; i++) {
            if (this.playList[i].equals(selection)) {
                break;
            } else {
                distanceDown++;
            }
            if (this.playList[(this.playList.length - 1) - i].equals(selection)) {
                break;
            } else {
                distanceUp++;
            }
        }
//        for (int i  = 0; i < this.playList.length; i++) {
//            if (!this.playList[i].equals(selection)) {
//                distanceDown++;
//            }
//        }
//        for (int j = 0; j < this.playList.length; j++) {
//            if (!this.playList[(this.playList.length - 1) - j].equals(selection)){
//                distanceUp++;
//            }
//        }
        if (distanceUp > distanceDown) {
            min = distanceDown;
        } else if (distanceUp < distanceDown && distanceUp != 0) {
            min = distanceUp;
        } else {
            min = distanceDown;
        }

        return min;
        //return null;
    }
}
