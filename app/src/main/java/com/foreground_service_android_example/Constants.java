package com.foreground_service_android_example;

/**
 * Created by Ramesh on 9/29/16.
 */

public class Constants {


    public static final class ACTION {
        public static final String MAIN_ACTION = "com.foreground_service_android_example.action.main";
        public static final String INIT_ACTION = "com.foreground_service_android_example.action.init";
        public static final String PREV_ACTION = "com.foreground_service_android_example.action.prev";
        public static final String PLAY_ACTION = "com.foreground_service_android_example.action.play";
        public static final String NEXT_ACTION = "com.foreground_service_android_example.action.next";
        public static final String STARTFOREGROUND_ACTION = "com.foreground_service_android_example.action.startforeground";
        public static final String STOPFOREGROUND_ACTION = "com.foreground_service_android_example.action.stopforeground";
    }

    public static final class NOTIFICATION_ID {
        public static final int FOREGROUND_SERVICE = 101;
    }
}
