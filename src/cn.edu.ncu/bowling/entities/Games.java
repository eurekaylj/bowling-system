package cn.edu.ncu.bowling.entities;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class Games {
    private int gameId;
    private int type;
    private Date time;
    private String position;
    private ArrayList<Integer> Side;  //??????
    private ArrayList<Integer> sideScore;
    private boolean status;


    public Games() {
        this.sideScore = new ArrayList<Integer>();
        this.Side = new ArrayList<Integer>();
    }

    public Games(int gameId,int type, String time, String position, ArrayList<Integer> side, ArrayList<Integer> sideScore, boolean status) throws ParseException {
        this.gameId = gameId;
        this.type = type;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        this.time = sdf.parse(time);
        this.position = position;
        Side = side;
        this.sideScore = sideScore;
        this.status = status;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(String time) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        this.time = sdf.parse(time);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public ArrayList<Integer> getSide() {
        return Side;
    }

    public void setSide(ArrayList<Integer> side) {
        Side = side;
    }

    public ArrayList<Integer> getSideScore() {
        return sideScore;
    }

    public void setSideScore(ArrayList<Integer> sideScore) {
        this.sideScore = sideScore;
    }

    public void setSideScore(int side, int score){this.sideScore.add(side,score);}

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "??????Ϣ" +
                " ???????ࣺ" + type +
                " ????ʱ?䣺" + time +
                " ?????ص㣺" + position + '\'' +
                " ????A??" + Side.get(0) + " ????B??" + Side.get(1) +
                " A?ӵ÷֣? " + sideScore.get(0) +" B?ӵ÷֣? " + sideScore.get(1) +
                String.format(" ????״̬??%s" , status ? "????":"δ????") ;
    }


}
