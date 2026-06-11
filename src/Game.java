import java.util.Timer;
import java.util.TimerTask;



public class Game {
    protected int upgrade1Cost;
    protected int upgrade2Cost;
    public int upgrade3Cost;
    public int upgrade4Cost;
    public int upgrade5Cost;
    public int upgrade6Cost;
    public int upgrade7Cost;
    protected int cookieCounter;
    private int cookiesPerClick;
    private int cookiesPerSecond;
    private int upgradeCount;

    public Game () {
        cookieCounter = 0;
        this.cookiesPerClick = 1;
        this.cookiesPerSecond = 0;
        this.upgrade1Cost = 5;
        this.upgrade2Cost = 25;
        this.upgrade3Cost = 30;
        this.upgrade4Cost = 45;
        this.upgrade5Cost = 50;
        this.upgrade6Cost = 70;
        this.upgrade7Cost = 80;



        upgradeCount = 0;

        Timer timer = new Timer();
        TimerTask slow = new TimerTask() {
            @Override
            public void run() {
                cookieCounter+=cookiesPerSecond;
            }
        };
        timer.schedule(slow, 0, 1000);



    }

    public void cookieClick() {
        cookieCounter+=cookiesPerClick;
    }

    public void upgradeButton1() {
        if (cookieCounter >= upgrade1Cost ) {
            cookiesPerClick++;
            cookieCounter -= upgrade1Cost;
            upgradeCount++;
            upgrade1Cost += upgradeCount;
        }
    }

    public void upgradeButton2() {
        if (cookieCounter >= upgrade2Cost ) {
            cookiesPerClick++;
            cookieCounter -= upgrade2Cost;
            upgradeCount++;
            upgrade2Cost += upgradeCount;
        }
    }
    public void upgradeButton3() {
        if (cookieCounter >= upgrade3Cost ) {
            cookiesPerClick++;
            cookieCounter -= upgrade3Cost;
            upgradeCount++;
            upgrade3Cost += upgradeCount;
        }
    }


    public void buyUpgrade1() {
    }

    public void buyUpgrade2() {
    }

    public void buyUpgrade3() {
    }

    public void buyUpgrade5() {
    }

    public void click() {
    }

    public void buyUpgrade6() {
    }

    public void buyUpgrade4() {
    }

    public void buyUpgrade7() {
    }
}




