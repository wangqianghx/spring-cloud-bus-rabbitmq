//package com.letters7.wuchen.springcloudbus;
//
//import com.itextpdf.text.pdf.PdfReader;
//import com.itextpdf.text.pdf.RandomAccessFileOrArray;
//import com.itextpdf.text.pdf.parser.PdfReaderContentParser;
//import com.itextpdf.text.pdf.parser.SimpleTextExtractionStrategy;
//import com.itextpdf.text.pdf.parser.TextExtractionStrategy;
//
//import java.io.BufferedInputStream;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//
//import static java.lang.System.out;
//
///**
// * 描述：
// *
// * @author wangqiang at 2019/4/18 11:03
// * @version 1.0.0
// */
//public class GetPdfAttach {
//
//    public static void main(String[] args) {
//
//        try {
////            out.print(getPdfFileText("C:\\wq_work\\temp\\PDF\\[ENCRYPTED] attachments1.pdf"));
//            getPdfFileText("C:\\wq_work\\temp\\PDF\\[ENCRYPTED] attachments1.pdf");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static String getPdfFileText(String fileName) throws IOException {
//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileName) );
//        byte[] byteArray=new byte[1024];
//        int ch=0;
//        while((ch=bis.read(byteArray))!=-1){
//
//            String str = new String(byteArray,0,ch);
//            System.out.print(new String(str.getBytes("iso-8859-1")));
//        }
//        bis.close();
//
//
//        PdfReader reader = new PdfReader(fileName);
//        out.println("-------------------------");
////        out.println(reader.getNamedDestination());
////        out.println("-------------------------");
////        out.println(reader.getLinks(1));
//        PdfReaderContentParser parser = new PdfReaderContentParser(reader);
//        StringBuffer buff = new StringBuffer();
//        TextExtractionStrategy strategy;
//        for (int i = 1; i <= reader.getNumberOfPages(); i++) {
//            strategy = parser.processContent(i,
//                    new SimpleTextExtractionStrategy());
//            buff.append(strategy.getResultantText());
//        }
//        return buff.toString();
//    }
//
//}
