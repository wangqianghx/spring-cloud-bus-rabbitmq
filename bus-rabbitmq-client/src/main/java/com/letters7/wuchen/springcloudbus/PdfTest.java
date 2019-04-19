package com.letters7.wuchen.springcloudbus;

import com.spire.pdf.PdfDocument;
import com.spire.pdf.attachments.PdfAttachmentCollection;
import static java.lang.System.out;

/**
 * 描述：操作PDF
 *
 * @author gongzhijing at 2018/11/26 09:54
 * @version 1.0.0
 */
public class PdfTest {

    public static void main(String args[]) {
        try {
            String pdfpath = "C:\\wq_work\\temp\\PDF\\[ENCRYPTED] attachments.pdf";
            //实例化PdfDocument类的对象
            PdfDocument pdf = new PdfDocument();
            //加载需要添加附件的PDF文档
            pdf.loadFromFile(pdfpath, "Abc@1234");
            //获取文档中的第一个文件附件
            PdfAttachmentCollection fujian = pdf.getAttachments();
            out.println("附件1名称==="+fujian.get(0).getFileName());
            byte[]  str = fujian.get(0).getData();
            //获取该附件的信息
            out.println("附件1内容==="+new String(str));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
