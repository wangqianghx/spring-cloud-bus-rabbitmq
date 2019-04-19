package com.letters7.wuchen.springcloudbus;


import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 描述：去除PDF密码
 *
 * @author wangqiang at 2019/4/18 10:33
 * @version 1.0.0
 */
public class RemovePdfPwd {

    public static void main(String[] args){
//        String srcpath = "C:\\wq_work\\temp\\PDF\\[ENCRYPTED] attachments.pdf";
        String srcpath = "C:\\wq_work\\temp\\PDF\\[ENCRYPTED] attachments.pdf";
        String despath = "C:\\wq_work\\temp\\PDF\\[ENCRYPTED] attachments1.pdf";
//        String userPassWord = ;
        String ownerPassWord = "Abc@1234";

        try {
            PdfReader reader = new PdfReader(srcpath, ownerPassWord.getBytes());
            PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(despath));

            stamper.setEncryption(null, null, PdfWriter.ALLOW_MODIFY_CONTENTS, true);
            stamper.setEncryption(null, null, PdfWriter.ALLOW_COPY, true);



            stamper.close();
            reader.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        }

    }
}
