package com.mysite.sbb.Util;

public class Ut {
    public static boolean empty(Object obj){
<<<<<<< HEAD

=======
>>>>>>> 3e6a9c7fc3922554322e263d994aa193ae4d452a
        if(obj==null){
            return true;
        }

<<<<<<< HEAD
        if(obj instanceof String ==false){
            return true;
        }

        String str = (String) obj;

=======
        if(!(obj instanceof String)){
            return true;
        }

        String str = (String)obj;
>>>>>>> 3e6a9c7fc3922554322e263d994aa193ae4d452a
        return str.trim().length()==0;
    }
}
