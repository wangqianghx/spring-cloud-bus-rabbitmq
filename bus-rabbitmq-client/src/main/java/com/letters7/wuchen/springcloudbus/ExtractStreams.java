//package com.letters7.wuchen.springcloudbus;
//
//import com.itextpdf.text.exceptions.UnsupportedPdfException;
//import com.itextpdf.text.pdf.PRStream;
//import com.itextpdf.text.pdf.PdfObject;
//import com.itextpdf.text.pdf.PdfReader;
//
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
///**
// * 描述：
// *
// * @author wangqiang at 2019/4/19 09:19
// * @version 1.0.0
// */
//public class ExtractStreams {
//    public static final String SRC = "C:\\wq_work\\temp\\PDF\\[ENCRYPTED] attachments.pdf";
//    public static final String DEST = "C:\\wq_work\\temp\\PDF\\[ENCRYPTED] attachments2.txt";
//
//    public static void main(String[] args) throws IOException {
//        File file = new File(DEST);
//        file.getParentFile().mkdirs();
//        new ExtractStreams().parse(SRC, DEST);
//    }
//
//    public void parse(String src, String dest) throws IOException {
//        PdfReader reader = new PdfReader(src,"Abc@1234".getBytes());
//        PdfObject obj;
//        for (int i = 1; i <= reader.getXrefSize(); i++) {
//            obj = reader.getPdfObject(i);
//            if (obj != null && obj.isStream()) {
//                PRStream stream = (PRStream)obj;
//                byte[] b;
//                try {
//                    b = PdfReader.getStreamBytes(stream);
//                }
//                catch(UnsupportedPdfException e) {
//                    b = PdfReader.getStreamBytesRaw(stream);
//                }
//                FileOutputStream fos = new FileOutputStream(String.format(dest, i));
//                fos.write(b);
//                fos.flush();
//                fos.close();
//            }
//        }
//    }
//}
