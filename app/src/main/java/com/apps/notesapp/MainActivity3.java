package com.apps.notesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import java.net.URLEncoder;

public class MainActivity3 extends AppCompatActivity {

    WebView pdfView;
    String fileUrl = "https://drive.google.com/file/d/1wGUtDlJw2r-6qNUytnvq7bA-N2d80UC0/view";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        getSupportActionBar().hide();

        String tech = getIntent().getExtras().getString("tech");
        String res = getIntent().getExtras().getString("res");

        switch (tech) {
            case "html":

                switch (res) {
                    case "notes":
                        fileUrl = "https://drive.google.com/drive/u/0/folders/1F_zMyeN14RZxp2lqUMVLaELi3HtXSNhP";
                        break;

                    case "books":
                        fileUrl = "https://drive.google.com/drive/u/0/folders/1F_zMyeN14RZxp2lqUMVLaELi3HtXSNhP";
                        break;

                    case "questions":
                        fileUrl = "https://drive.google.com/drive/u/0/folders/1F_zMyeN14RZxp2lqUMVLaELi3HtXSNhP";
                        break;

                    case "documentation":
                        fileUrl = "https://drive.google.com/drive/u/0/folders/1F_zMyeN14RZxp2lqUMVLaELi3HtXSNhP";
                        break;
                }

                break;

            case "css":

                switch (res) {
                    case "notes":
                        fileUrl = "https://drive.google.com/drive/u/0/folders/1F_zMyeN14RZxp2lqUMVLaELi3HtXSNhP";
                        break;

                    case "books":
                        fileUrl = "https://drive.google.com/drive/u/0/folders/1F_zMyeN14RZxp2lqUMVLaELi3HtXSNhP";
                        break;

                    case "questions":
                        fileUrl = "https://drive.google.com/drive/u/0/folders/1F_zMyeN14RZxp2lqUMVLaELi3HtXSNhP";
                        break;

                    case "documentation":
                        fileUrl = "https://drive.google.com/drive/u/0/folders/1F_zMyeN14RZxp2lqUMVLaELi3HtXSNhP";
                        break;
                }

                break;

            case "python":

                switch (res) {
                    case "notes":
                        fileUrl = "https://drive.google.com/drive/u/0/folders/1F_zMyeN14RZxp2lqUMVLaELi3HtXSNhP";
                        break;

                    case "books":
                        fileUrl = "https://drive.google.com/drive/u/0/folders/1F_zMyeN14RZxp2lqUMVLaELi3HtXSNhP";
                        break;

                    case "questions":
                        fileUrl = "https://drive.google.com/drive/u/0/folders/1F_zMyeN14RZxp2lqUMVLaELi3HtXSNhP";
                        break;

                    case "documentation":
                        fileUrl = "https://drive.google.com/drive/u/0/folders/1F_zMyeN14RZxp2lqUMVLaELi3HtXSNhP";
                        break;
                }

                break;

            case "java":

                switch (res) {
                    case "notes":
                        fileUrl = "https://drive.google.com/drive/u/0/folders/1F_zMyeN14RZxp2lqUMVLaELi3HtXSNhP";
                        break;

                    case "books":
                        fileUrl = "https://drive.google.com/drive/u/0/folders/1F_zMyeN14RZxp2lqUMVLaELi3HtXSNhP";
                        break;

                    case "questions":
                        fileUrl = "https://drive.google.com/drive/u/0/folders/1F_zMyeN14RZxp2lqUMVLaELi3HtXSNhP";
                        break;

                    case "documentation":
                        fileUrl = "https://drive.google.com/drive/u/0/folders/1F_zMyeN14RZxp2lqUMVLaELi3HtXSNhP";
                        break;
                }

                break;

            case "javascript":

                switch (res) {
                    case "notes":
                        fileUrl = "https://drive.google.com/drive/u/0/folders/1F_zMyeN14RZxp2lqUMVLaELi3HtXSNhP";
                        break;

                    case "books":
                        fileUrl = "https://drive.google.com/drive/u/0/folders/1F_zMyeN14RZxp2lqUMVLaELi3HtXSNhP";
                        break;

                    case "questions":
                        fileUrl = "https://drive.google.com/drive/u/0/folders/1F_zMyeN14RZxp2lqUMVLaELi3HtXSNhP";
                        break;

                    case "documentation":
                        fileUrl = "https://drive.google.com/drive/u/0/folders/1F_zMyeN14RZxp2lqUMVLaELi3HtXSNhP";
                        break;
                }

                break;

            case "c++":

                switch (res) {
                    case "notes":
                        fileUrl = "https://drive.google.com/drive/u/0/folders/1F_zMyeN14RZxp2lqUMVLaELi3HtXSNhP";
                        break;

                    case "books":
                        fileUrl = "https://drive.google.com/drive/u/0/folders/1F_zMyeN14RZxp2lqUMVLaELi3HtXSNhP";
                        break;

                    case "questions":
                        fileUrl = "https://drive.google.com/drive/u/0/folders/1F_zMyeN14RZxp2lqUMVLaELi3HtXSNhP";
                        break;

                    case "documentation":
                        fileUrl = "https://drive.google.com/drive/u/0/folders/1F_zMyeN14RZxp2lqUMVLaELi3HtXSNhP";
                        break;
                }

                break;

            case "php":

                switch (res) {
                    case "notes":
                        fileUrl = "https://drive.google.com/drive/u/0/folders/1F_zMyeN14RZxp2lqUMVLaELi3HtXSNhP";
                        break;

                    case "books":
                        fileUrl = "https://drive.google.com/drive/u/0/folders/1F_zMyeN14RZxp2lqUMVLaELi3HtXSNhP";
                        break;

                    case "questions":
                        fileUrl = "https://drive.google.com/drive/u/0/folders/1F_zMyeN14RZxp2lqUMVLaELi3HtXSNhP";
                        break;

                    case "documentation":
                        fileUrl = "https://drive.google.com/drive/u/0/folders/1F_zMyeN14RZxp2lqUMVLaELi3HtXSNhP";
                        break;
                }

                break;

            case "kotlin":

                switch (res) {
                    case "notes":
                        fileUrl = "https://drive.google.com/drive/u/0/folders/1F_zMyeN14RZxp2lqUMVLaELi3HtXSNhP";
                        break;

                    case "books":
                        fileUrl = "https://drive.google.com/drive/u/0/folders/1F_zMyeN14RZxp2lqUMVLaELi3HtXSNhP";
                        break;

                    case "questions":
                        fileUrl = "https://drive.google.com/drive/u/0/folders/1F_zMyeN14RZxp2lqUMVLaELi3HtXSNhP";
                        break;

                    case "documentation":
                        fileUrl = "https://drive.google.com/drive/u/0/folders/1F_zMyeN14RZxp2lqUMVLaELi3HtXSNhP";
                        break;
                }

                break;
        }


        pdfView = findViewById(R.id.viewPdf);
        pdfView.getSettings().setJavaScriptEnabled(true);
        String filename = res.toUpperCase();

        ProgressDialog pd = new ProgressDialog(this);
        pd.setTitle(filename);
        pd.setMessage("Opening....");
        pd.setCancelable(false);
        pd.show();

        pdfView.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                pd.dismiss();
            }
        });

        String url = "";
        try {
            url = URLEncoder.encode(fileUrl, "UTF-8");
        }catch (Exception e){}

        System.out.println(url);

        pdfView.loadUrl("http://docs.google.com/gview?embedded=true&url=" + url);
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}