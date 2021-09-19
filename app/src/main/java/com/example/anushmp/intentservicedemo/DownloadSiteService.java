package com.example.anushmp.intentservicedemo;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;


public class DownloadSiteService extends IntentService {

    //Anush byte
    //intent service
    //wot
    //byte research
    //conor
    //lloyd
    //ms change things chrome.
    //vitamin toothbrush
    //job intent service
    //ms change things form stress
    //https://www.vogella.com/index.html

    public DownloadSiteService() {
        super("DownloadSiteService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        //File file = new file();

        /*
        *
        * FileInputStream
        *
        *
        *
        *
        * */


        downloadfile();



    }

    private void downloadfile() {


        try{

            //throwable object
            //my python notes project.
            //god mode
            //inner bitch work hard.



            //writing to a file on android device.

            File mydirectory = new File(getFilesDir() + File.separator + "vogella");


            if(!mydirectory.exists()){mydirectory.mkdir();}


            File file = new File(mydirectory,"vogella.html");

            if(!file.exists()){file.createNewFile();}


            URL vogellaurl = new URL("https://www.vogella.com/index.html");

            InputStream is = vogellaurl.openConnection().getInputStream();

            InputStreamReader isr = new InputStreamReader(is);

            FileOutputStream fos = new FileOutputStream(file,true);

            int incomingdata = isr.read();


            while(incomingdata!=-1){

                char currentchar = (char) incomingdata;

                fos.write(currentchar);

                incomingdata = isr.read();

            }


            //reading from a file on android device.

            FileInputStream fis = new FileInputStream(file);

            int filedata = fis.read();

            StringBuffer sbglobal = new StringBuffer();

            while(filedata != -1){

                char currentchar = (char) filedata;

                //StringBuffer sb = new StringBuffer();

                //sb.append(currentchar);

                sbglobal.append(currentchar);

                filedata = fis.read();



            }


            Log.d("anushfilewriter", sbglobal.toString());

        }catch (Exception e){

        }



    }


    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}