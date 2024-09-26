class Main {
  
  public static Time createTime(int hour, int minute, int second, boolean isAM){
    Time t = new Time();
    t.hour = hour;
    t.minute = minute;
    t.second = second;
    t.isAM = isAM;

    return t;
  }

  public static String timeToString(Time t){
    String str = "";
    if(t.hour < 10){
      str += "0" + t.hour + ":";
    }
    else{
      str += t.hour + ":";
    }
    if(t.minute < 10){
      str += "0" + t.minute + ":";
    }
    else{
      str += t.minute + ":";
    }
    if(t.second < 10){
      str += "0" + t.second + " ";
    }
    else{
      str += t.second + " ";
    }
    
    if(t.isAM == true){
      str += "AM";
    }
    else{
      str += "PM";
    }
    return str;
  }

  
  
  public static void test1(){
    Time test1 = new Time();
    Time test2 = new Time();
    test1 = createTime(11, 29, 00, true);
    test2 = createTime(12, 20, 00, false);

    System.out.println(timeToString(test1));
    System.out.println(timeToString(test2));
  }

  public static Time addSeconds(Time t, int sec){
    t.second += sec;
    if(t.second > 60){
      t.second -= 60;
      t.minute++;
    }
    if(t.minute > 60){
      t.minute -= 60;
      t.hour++;
    }
    return t;
  }

  public static boolean equals(Time t1, Time t2){
    if(t1.hour == t2.hour){
      if(t1.minute == t2.minute){
        if(t1.second == t2.second){
          if(t1.isAM == t2.isAM){
            return true;
          }
        }
      }
    }
    return false;
  }

  public static int secondsBetween(Time object1, Time object2) {
    int hour = object1.hour - object2.hour;
    int min = object1.minute - object2.minute;
    int sec = object2.second - object2.second;
    int temp = hour*3600 + min*60 + sec;
    return temp;
  }
  
  public static void main(String[] args){
    test1();
  }
}
